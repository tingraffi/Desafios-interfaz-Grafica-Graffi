/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Tarea; // Importamos nuestro Modelo
import Vista.VentanaTareas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.DefaultListModel; 
import javax.swing.JOptionPane;

public class ControladorTareas implements ActionListener {

    private VentanaTareas vista;
    
    // El "Modelo" de nuestra aplicación (la lista real de tareas)
    private ArrayList<Tarea> tareas; 
    
    // El "Modelo" que usa el componente JList para mostrarse
    // Debemos mantener ambos sincronizados.
    private DefaultListModel<Tarea> listModel;

    public ControladorTareas(VentanaTareas vista) {
        this.vista = vista;
        
        // Inicializamos nuestras listas
        this.tareas = new ArrayList<>();
        this.listModel = new DefaultListModel<>();
        
        // Le decimos a la JList de la Vista que use nuestro listModel
        this.vista.getLstTareas().setModel(listModel);
        
        // Conectamos los botones al controlador
        this.vista.getBtnAgregar().addActionListener(this);
        this.vista.getBtnCompletar().addActionListener(this);
    }
    
    public void iniciar() {
        vista.setTitle("Gestor de Tareas MVC");
        vista.setLocationRelativeTo(null);
        vista.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Averiguamos qué botón se presionó
        if (e.getSource() == vista.getBtnAgregar()) {
            agregarTarea();
        } else if (e.getSource() == vista.getBtnCompletar()) {
            completarTarea();
        }
    }
    
    private void agregarTarea() {
        // 1. Obtenemos el texto de la Vista
        String nombreTarea = vista.getTxtNuevaTarea().getText();
        
        // 2. Validamos que no esté vacío
        if (nombreTarea.trim().isEmpty()) {
            JOptionPane.showMessageDialog(vista, "El nombre de la tarea no puede estar vacío.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        // 3. Creamos el Modelo
        Tarea nuevaTarea = new Tarea(nombreTarea);
        
        // 4. Actualizamos ambas listas
        tareas.add(nuevaTarea);
        listModel.addElement(nuevaTarea); // Esto actualiza la JList visualmente
        
        // 5. Limpiamos la Vista
        vista.getTxtNuevaTarea().setText("");
    }
    
    private void completarTarea() {
        // 1. Obtenemos el ítem seleccionado de la Vista
        int indiceSeleccionado = vista.getLstTareas().getSelectedIndex();
        
        // 2. Validamos que haya algo seleccionado
        if (indiceSeleccionado == -1) {
            JOptionPane.showMessageDialog(vista, "Por favor, seleccione una tarea de la lista.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        // 3. Obtenemos el objeto Tarea
        Tarea tareaSeleccionada = listModel.getElementAt(indiceSeleccionado);
        
        // 4. Actualizamos el Modelo
        tareaSeleccionada.setCompletada(true);
        
        // 5. Forzamos a la JList a "redibujarse" para que llame a toString() de nuevo
        vista.getLstTareas().repaint();
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Conversor;
import Vista.VentanaConversor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class ControladorConversor implements ActionListener {

    private final Conversor modelo;
    private final VentanaConversor vista;

    public ControladorConversor(Conversor modelo, VentanaConversor vista) {
        this.modelo = modelo;
        this.vista = vista;
        
        // Ahora usamos el getter para acceder al botón y añadirle el listener
        this.vista.getBtnIniciarConversion().addActionListener(this);
    }
    
    public void iniciar() {
        vista.setTitle("Conversor de Temperatura MVC");
        vista.setLocationRelativeTo(null);
        vista.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            // Usamos los getters para obtener los valores y componentes
            double valor = Double.parseDouble(vista.getTxtIngreseNumero().getText());
            int seleccion = vista.getCmbSeleccionar().getSelectedIndex();
            double resultado = 0;

            if (seleccion == 0) { // Celsius a Fahrenheit
                resultado = modelo.celsiusAFahrenheit(valor);
            } else if (seleccion == 1) { // Fahrenheit a Celsius
                resultado = modelo.fahrenheitACelsius(valor);
            }

            // Usamos el getter para establecer el texto en el campo de resultado
            vista.getTxtMostrarResultado().setText(String.format("%.2f", resultado));

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(vista, "Error: Por favor, ingrese un número válido.", "Error de Entrada", JOptionPane.ERROR_MESSAGE);
        }
    }
}
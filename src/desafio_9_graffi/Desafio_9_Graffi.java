/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package desafio_9_graffi;

import java.awt.GridLayout; 
import javax.swing.JFrame;

/**
 *
 * @author Alumno
 */
public class Desafio_9_Graffi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        JFrame ventana = new JFrame("Ejercicios Varios");
        
        // --- CÓDIGO NUEVO ---
        // 1. Usamos un GridLayout de 0 filas, 1 columna.
        // Esto apilará todos los paneles verticalmente.
        ventana.setLayout(new GridLayout(0, 1));
        
        // 2. Creamos instancias de los CUATRO paneles
        Desafio_9 calculadoraPanel = new Desafio_9();
        Desafio_9_Fuente fuentePanel = new Desafio_9_Fuente();
        Desafio_9_Lenguajes lenguajesPanel = new Desafio_9_Lenguajes();
        Desafio_9_Edad edadPanel = new Desafio_9_Edad(); // <-- Panel nuevo
        
        // 3. Añadimos todos los paneles a la ventana
        ventana.add(calculadoraPanel);
        ventana.add(fuentePanel);
        ventana.add(lenguajesPanel);
        ventana.add(edadPanel); // <-- Panel nuevo
        // --------------------

        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.pack(); // Ajusta el tamaño de la ventana automáticamente
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
    }
    
}
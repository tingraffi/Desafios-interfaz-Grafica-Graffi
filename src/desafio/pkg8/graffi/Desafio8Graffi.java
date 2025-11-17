/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package desafio.pkg8.graffi;

import javax.swing.JFrame; // Importamos la ventana

/**
 *
 * @author Usuario
 */
public class Desafio8Graffi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // 1. Creamos una ventana real
        JFrame ventana = new JFrame("Desafío 8 - Registro de Usuarios");
        
        // 2. Creamos una instancia del panel
        PanelDesafio8 miPanel = new PanelDesafio8();
        
        // 3. Añadimos el panel a la ventana
        ventana.add(miPanel);
        
        // 4. Configuramos la ventana
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Que se cierre al tocar la X
        ventana.pack(); // Ajusta el tamaño de la ventana al panel
        ventana.setLocationRelativeTo(null); // La centra en la pantalla
        ventana.setVisible(true); // La hace visible
    }
}

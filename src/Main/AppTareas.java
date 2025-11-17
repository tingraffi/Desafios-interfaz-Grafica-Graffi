/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import Controlador.ControladorTareas;
import Vista.VentanaTareas;

public class AppTareas {

    public static void main(String[] args) {
        // 1. Crear la Vista
        VentanaTareas vista = new VentanaTareas();
        
        // 2. Crear el Controlador y pasarle la Vista
        ControladorTareas controlador = new ControladorTareas(vista);
        
        // 3. Iniciar la aplicación
        controlador.iniciar();
    }
}

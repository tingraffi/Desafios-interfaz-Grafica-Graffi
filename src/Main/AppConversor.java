/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import Controlador.ControladorConversor;
import Modelo.Conversor;
import Vista.VentanaConversor;

public class AppConversor {

    public static void main(String[] args) {
        // 1. Crear el Modelo
        Conversor modelo = new Conversor();
        
        // 2. Crear la Vista
        VentanaConversor vista = new VentanaConversor();
        
        // 3. Crear el Controlador y pasarle el Modelo y la Vista
        ControladorConversor controlador = new ControladorConversor(modelo, vista);
        
        // 4. Iniciar la aplicación
        controlador.iniciar();
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

public class Conversor {

    /**
     * Convierte un valor de grados Celsius a Fahrenheit.
     * @param celsius El valor en grados Celsius.
     * @return El valor equivalente en grados Fahrenheit.
     */
    public double celsiusAFahrenheit(double celsius) {
        // La fórmula es: (Celsius * 9/5) + 32
        // Usamos 9.0 y 5.0 para asegurar que la división sea con decimales.
        return (celsius * 9.0 / 5.0) + 32;
    }

    /**
     * Convierte un valor de grados Fahrenheit a Celsius.
     * @param fahrenheit El valor en grados Fahrenheit.
     * @return El valor equivalente en grados Celsius.
     */
    public double fahrenheitACelsius(double fahrenheit) {
        // La fórmula es: (Fahrenheit - 32) * 5/9
        return (fahrenheit - 32) * 5.0 / 9.0;
    }
}

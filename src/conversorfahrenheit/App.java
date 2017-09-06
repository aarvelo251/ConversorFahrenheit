/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversorfahrenheit;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class App {
    public static void main(String [] args){
        Scanner read = new Scanner(System.in);
        System.out.println("ingresa un valor en C°");
        float celsius = read.nextInt();
        
        ConversorFahrenheit obj = new ConversorFahrenheit();
        float resultado = obj.obtenerFahrenheit(celsius);
        System.out.println("resultado: " + resultado);
    }
    
}

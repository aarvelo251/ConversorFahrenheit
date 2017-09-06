/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversorfahrenheit;

public class ConversorFahrenheit {

    /**
     * @param args the command line arguments
     */
    
   public float obtenerFahrenheit(float C){    
       float result = 32 + (9*C/5); 
       return result;   
   }
    
    
}

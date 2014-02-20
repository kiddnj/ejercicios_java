/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package conversores.objetos;

/**
 *
 * @author fran
 */
public class Temperatura {

    public Temperatura() {}
    
    public double celsiusToFarenheit(double valor){
        return (valor - 32) * 5/9;
    }
    
    public double farenheitToCelsius(double valor){
        return (valor + 32) * 9/5;
    }
}

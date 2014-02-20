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
public class Finanzas {
    
    public final double TIPO_CONVERSION;

    public Finanzas() {
        this.TIPO_CONVERSION = 1.36;
    }

    public Finanzas(double valor) {
        this.TIPO_CONVERSION = valor;
    }
    
    public double dolaresToEuros(double dolar){
        return dolar / TIPO_CONVERSION;
    }
    
    public double eurosToDolars(double euro){
        return euro * TIPO_CONVERSION;
    }
}

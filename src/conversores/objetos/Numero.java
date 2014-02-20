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
public class Numero {
    
    private int numero;

    public Numero() {
        numero = 0;
    }

    public Numero(int numero) {
        this.numero = numero;
    }
    
    public int añadir(int valor){
        return numero + valor;
    }
    
    public int restar(int valor){
        return numero - valor;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    public int getDoble(){
        return numero * 2;
    }
    
    public int getTriple(){
        return numero * 3;
    }
}

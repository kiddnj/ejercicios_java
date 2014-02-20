/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dragones_y_mazmorras.datos;

/**
 *
 * @author fran
 */
public class Mago extends Personaje{
    private String poder;

    public Mago() {
        super();
    }

    public Mago(String poder, String nombre) {
        super(nombre, 100);
        this.poder = poder;
    }
    
    public String encantar(){
        super.consumirEnergia(2);
        return poder;
    }
}

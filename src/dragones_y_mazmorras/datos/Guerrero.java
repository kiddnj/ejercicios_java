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
public class Guerrero extends Personaje{

    private String arma;
    
    public Guerrero() {
        super();
    }

    public Guerrero(String arma, String nombre, int energia) {
        super(nombre, energia);
        this.arma = arma;
    }

    public String combatir(int energia){
        super.consumirEnergia(energia);
        return arma + " -> " + energia;
    }
}

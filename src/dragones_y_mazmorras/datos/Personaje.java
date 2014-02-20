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
public class Personaje {
    private String nombre;
    private int energia;

    public Personaje() {
    }

    public Personaje(String nombre, int energia) {
        this.nombre = nombre;
        this.energia = energia;
    }
    
    public void alimentarse(int energia){
        this.energia = this.energia + energia;
    }
    
    public void consumirEnergia(int energia){
        this.energia = this.energia - energia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package personas.datos;

/**
 *
 * @author fran
 */
public class Alumno extends Persona{
    private String carrera;
    
    public void matricularse(String carrera){
        this.carrera = carrera;
    }
}

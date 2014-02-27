/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package personas;

import personas.datos.Alumno;
import personas.datos.Persona;

/**
 *
 * @author fran
 */
public class Main {
    public static void main(String[] args){
        Persona a = new Persona();
        a.setDatos("1000-2", "Luis");
        
        Alumno b = new Alumno();
        b.setDatos("2000-2", "Pamela");
        b.matricularse("Industrial");
    }
}

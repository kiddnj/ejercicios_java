/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hashmaps.datos;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author fran
 */
public class Palabra {
    
    private final String nombre;
    private final ArrayList<String> definiciones;

    public Palabra(String nombre) {
        this.nombre = nombre;
        definiciones = new ArrayList();
    }
    
    public void addDef(String def){
        definiciones.add(def);
    }
    
    public void deleteDef(int index){
        definiciones.remove(index);
    }
    
    public void imprimirDef(){
        System.out.println(nombre);
        Iterator listaDef = definiciones.iterator();
        while(listaDef.hasNext()){
            String def = listaDef.next().toString();
            System.out.println("[" + definiciones.indexOf(def) + "] " + def);
        }
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hashmaps.datos;

import java.util.HashMap;
import java.util.Iterator;

/**
 *
 * @author fran
 */
public class Diccionario {
    
    private final HashMap<String,Palabra> diccionario;
    
    public Diccionario(){
        diccionario = new HashMap();
    }
    
    public void addPalabra(String palabra){
        diccionario.put(palabra, new Palabra(palabra));
    }
    
    public void addDefinicion(String palabra,String def){
        diccionario.get(palabra).addDef(def);
    }
    
    public void printDiccionario(){
        Iterator lista = diccionario.values().iterator();
        while(lista.hasNext()){
            Palabra p = (Palabra)lista.next();
            p.imprimirDef();
        }
    }
    
    public static void main(String[] args){
        Diccionario d = new Diccionario();
        d.addPalabra("Patata");
        d.addDefinicion("Patata", "Tuberculo");
        d.addDefinicion("Patata", "GLaDoS");
        d.printDiccionario();
    }
}

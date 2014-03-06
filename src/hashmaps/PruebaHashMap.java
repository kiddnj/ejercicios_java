/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hashmaps;

import java.util.HashMap;
import java.util.Iterator;

/**
 *
 * @author fran
 */
public class PruebaHashMap {
    
    
    public static void main(String[] args){
        HashMap<Integer,String> prueba = new HashMap();
        prueba.put(1,"100");
        prueba.put(2,"200");
        prueba.put(3,"300");
        prueba.put(4,"400");
        prueba.put(4,"400");
        prueba.get(1);
        
        Iterator listaValores = prueba.values().iterator();
        Iterator listaKeys = prueba.keySet().iterator();
        while(listaValores.hasNext()){
            String n = listaValores.next().toString();
            System.out.println(n);
        }
    }
}

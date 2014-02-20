/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package multimedia.controlador;

import multimedia.datos.Multimedia;

/**
 *
 * @author fran
 */
public class Estanteria {
    
    private final Multimedia[] MULTIMEDIA;

    public Estanteria(int tamaño) {
        MULTIMEDIA = new Multimedia[tamaño];
    }
    
    public int size(){
        int nObj = 0;
        for(Multimedia m:MULTIMEDIA){ //for(int i = 0;i < MULTIMEDIA.length;i++)
            if(m != null){
                nObj++;
            }
        }
        return nObj;
    }
    
    public boolean add(Multimedia m){
        int i = 0;boolean encontrado = false;
        while(i < MULTIMEDIA.length && !encontrado){
            if(MULTIMEDIA[i] == null){
                MULTIMEDIA[i] = m;
                encontrado = true;
            }else{
                i++;
            }
        }
        return encontrado;
    }
    
    public Multimedia get(int posicion){
        return MULTIMEDIA[posicion];
    }
}
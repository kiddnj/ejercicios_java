/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cliente;

/**
 *
 * @author fran
 */
public class Manejo_cliente {
    
    static Cliente c1,c2;
    
    public static void main(String[] args){
        c1 = new Cliente();
        int telefono = 123456789;
        c1.setTelefono(telefono);
        System.out.println(telefono);
        
        c1.setNombre("Pepito");
        c1.setApellidos("Jones");
        
        String[] array = new String[5];
        for(int i = 0;i < array.length;i++){
            array[i] = "Adios";
        }
        c1.rellenarTablero(array);
        for(String c:array){
            System.out.println(c);
        }
        c2 = new Cliente(101,"Carlos","Perez Ruiz","Astilleros 3","Valencia",46011,"Valencia",963689521,"15/08/80");
        
        String respuesta1 = c1.toString();
        String respuesta2 = c2.toString();
        
        System.out.println(respuesta1);
        System.out.println(respuesta2);
    }
    
}

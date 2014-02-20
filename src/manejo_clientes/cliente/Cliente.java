/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejo_clientes.cliente;

import manejo_clientes.datos.DatoCliente;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author fran
 */
public class Cliente {

    private ArrayList<DatoCliente> lista = new ArrayList();
    private DatoCliente cliente;

    public DatoCliente getCliente() {
        return cliente;
    }

    public void setCliente(String nombre, String apellido1, String apellido2, int dni) {
        this.cliente = new DatoCliente(nombre, apellido1, apellido2, dni);
    }

    public void setCliente(DatoCliente cliente) {
        this.cliente = cliente;
    }

    private int indice(int dni) {
        int i = 0;
        boolean encontrado = false;
        while (i < lista.size() && !encontrado) {
            if (lista.get(i).getDni() == dni) {
                encontrado = true;
            } else {
                i++;
            }
        }
        if (i == lista.size()) {
            return -1;
        } else {
            return i;
        }
    }

    public void añadirCliente(String nombre, String apellido1, String apellido2, int dni) {
        if(indice(dni) == -1){
           lista.add(new DatoCliente(nombre, apellido1, apellido2, dni)); 
        }else{
            new JOptionPane().showMessageDialog(null, "Error", "Error 2", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void modificarCliente(String nombre, String apellido1, String apellido2, int dni) {
        int indice = indice(dni);
        if (indice != -1) {
            lista.get(indice).setNombre(nombre);
            lista.get(indice).setApellido1(apellido1);
            lista.get(indice).setApellido2(apellido2);
        }else{
            new JOptionPane().showMessageDialog(null, "Error", "Error 2", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void eliminarCliente(int dni){
        int indice = indice(dni);
        if (indice != -1) {
            lista.remove(indice);
        }else{
            new JOptionPane().showMessageDialog(null, "Error", "Error 2", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public char letraDNI(int dni){
        return "TRWAGMYFPDXBNJZQVHLCKE".charAt(dni%23);
    }
    
    public DefaultListModel lista(){
        DefaultListModel<DatoCliente> dlm = new DefaultListModel();
        for(DatoCliente d:lista){
            dlm.addElement(d);
        }
        return dlm;
    }
    
    public DatoCliente clienteDeLista(Object o){
        if(o instanceof DatoCliente){
            return (DatoCliente)o;
        }else{
            return null;
        }
    }
    
    public Cliente(){}
}

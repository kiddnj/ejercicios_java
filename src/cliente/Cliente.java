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
public class Cliente {
    
    private String nombre,apellidos,direccion,poblacion,provincia,fNac;
    private int codCliente,cp,telefono;

    public Cliente() {
    }

    public Cliente(int codCliente,String nombre, String apellidos, String direccion, String poblacion, int cp, String provincia, int telefono,String fNac) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.poblacion = poblacion;
        this.provincia = provincia;
        this.fNac = fNac;
        this.codCliente = codCliente;
        this.cp = cp;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(String poblacion) {
        this.poblacion = poblacion;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getfNac() {
        return fNac;
    }

    public void setfNac(String fNac) {
        this.fNac = fNac;
    }

    public int getCodCliente() {
        return codCliente;
    }

    public void setCodCliente(int codCliente) {
        this.codCliente = codCliente;
    }

    public int getCp() {
        return cp;
    }

    public void setCp(int cp) {
        this.cp = cp;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
        telefono = 987654321;
    }
    
    public void rellenarTablero(String[] array){
        for(int i = 0;i < array.length;i++){
            array[i] = "Hola que tal";
        }
    }

    @Override
    public String toString() {
        String cadena = "Cliente " + nombre +": \n"
                + "Nombre: " + nombre + "\n"
                + "Apellidos: " + apellidos + "\n"
                + "Direccion " + direccion + "\n"
                + "Ciudad: " + poblacion + "\n"
                + "Codigo Postal: " + cp +"\n";
        return cadena;
    }
    
}

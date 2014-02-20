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
public class Cliente1 {
    
    private String nombre,apellidos,direccion,poblacion,provincia,fNac;
    private int codCliente,cp,telefono;

    public Cliente1() {
    }

    public Cliente1(String nombre, String apellidos, String direccion, String poblacion, String provincia, String fNac, int codCliente, int cp, int telefono) {
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
    }

    @Override
    public String toString() {
        return "Cliente1{" + "nombre=" + nombre + ", apellidos=" + apellidos + ""
                + ", direccion=" + direccion + ", poblacion=" + poblacion + ", provincia=" + provincia + ""
                + ", fNac=" + fNac + ", codCliente=" + codCliente + ", cp=" + cp + ", telefono=" + telefono + '}';
    }
    
    
}

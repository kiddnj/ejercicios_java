/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package banco;

/**
 *
 * @author fran
 */
public class Cuenta {
    
    private String nombre,cuenta;
    private double saldo,tipoDeInteres;
    private int transaccionesRealizadas;

    public Cuenta() {
    }

    public Cuenta(String nombre, String cuenta, double saldo, double tipoDeInteres, int transaccionesRealizadas) {
        this.nombre = nombre;
        this.cuenta = cuenta;
        this.saldo = saldo;
        this.tipoDeInteres = tipoDeInteres;
        this.transaccionesRealizadas = transaccionesRealizadas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getTipoDeInteres() {
        return tipoDeInteres;
    }

    public void setTipoDeInteres(double tipoDeInteres) {
        this.tipoDeInteres = tipoDeInteres;
    }

    public int getTransaccionesRealizadas() {
        return transaccionesRealizadas;
    }

    public void setTransaccionesRealizadas(int transaccionesRealizadas) {
        this.transaccionesRealizadas = transaccionesRealizadas;
    }
    
    public void ingreso(double cantidad){
        saldo = saldo + cantidad;
    }
    
    public void reintegro(double cantidad){
        saldo = saldo - cantidad;
    }
}

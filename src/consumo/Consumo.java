/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package consumo;

/**
 *
 * @author fran
 */
public class Consumo {
    
    private double kms,vMed,pGas; 

    public Consumo() {
    }

    public Consumo(double kms, double vMed, double pGas) {
        this.kms = kms;
        this.vMed = vMed;
        this.pGas = pGas;
    }

    public double getKms() {
        return kms;
    }

    public void setKms(double kms) {
        this.kms = kms;
    }

    public double getvMed() {
        return vMed;
    }

    public void setvMed(double vMed) {
        this.vMed = vMed;
    }

    public double getpGas() {
        return pGas;
    }

    public void setpGas(double pGas) {
        this.pGas = pGas;
    }
    
    public double getTiempo(){
        return kms / vMed;
    }
    
    public double consumoMedioLitros(double litrosConsumidos){
        return (litrosConsumidos / kms) * 100;
    }
    
    public double consumoMedioEuros(double litrosConsumidos){
        return consumoMedioLitros(litrosConsumidos) * pGas;
    }
}

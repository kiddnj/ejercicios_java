/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package circulo;

import java.util.Scanner;

/**
 *
 * @author fran
 */
public class main {
    
    static Circulo circulo;
    
    private static void menu(){
        System.out.println("Introduzca un valor para calcular (0 para salir del programa)");
        Scanner s = new Scanner(System.in);
        double valor = s.nextDouble();
        if(valor != 0){
            circulo.setRadio(valor);
            System.out.println("El valor del area del circulo con radio " + valor + " es: " + circulo.areaCirculo());
            System.out.println("El valor de la longitud de la circunferencia con radio " + valor + " es: " + circulo.longitudCircunferencia());
        }else{
            System.out.println("Adios");
            System.exit(0);
        }
    }
    
    public static void main(String[] args){
        circulo = new Circulo();
        System.out.println("Bienvenido a la calculadora de areas y longitudes de circulos");
        while(true){
            menu();
        }
    }
    
}

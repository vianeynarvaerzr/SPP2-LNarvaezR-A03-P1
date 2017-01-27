/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp2.lnarvaezr.a03;
import java.util.Scanner;
/**
 *
 * @author Vianey_Narváez
 */
public class SPP2LNarvaezRA03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    double radio, area, perimetro;
    final double pi = 3.1416;
    
    System.out.println("Introduce el radio del circulo");
    radio = teclado.nextDouble();
    
    perimetro = ((radio *2)* pi);
    area = pi * Math.pow (radio,2);
    
    System.out.println("El perimetro del circulo es "+perimetro);
    System.out.println("El area de un circulo es "+ area);
    
    }
    
}

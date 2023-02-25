/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_14;

/**
 *
 * @author Jhojan
 */
import java.util.Scanner;
import java.lang.Math;
public class Ejercicio_14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double A,A2,A3;
        Scanner Entrada = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        A = Entrada.nextDouble();
        A2 = Math.pow(A, 2);
        A3 = Math.pow(A,3);
        System.out.println("El cuadrado de " + A + " es igual a: " + A2);
        System.out.println("El cubo de " + A + " es igual a: " +A3);
    }
    
}

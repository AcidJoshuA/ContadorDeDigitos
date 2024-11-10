/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contadordedigitos;

import java.util.Scanner;

/**
 *
 * @author jcplo
 */
public class Contadordedigitos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.print("Ingresar un número: ");
    int numero = scanner.nextInt();
    int contadorDigitos = 0;
    if (numero == 0){
    contadorDigitos = 1;
    }else{
    while (numero != 0) {
    numero /= 10;
    contadorDigitos++;
    }
    }
    System.out.println("El número ingresado tiene " + contadorDigitos + " dígito(s).");
    }    
}

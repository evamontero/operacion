/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.operacion;

/**
 *
 * @author 2024-25DAM1
 */
import java.util.Scanner;
public class Operacion {

    public static void main(String[] args) {
        
         // estoy en eva
         // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese el primer número
        System.out.print("Ingresa el primer número: ");
        int numero1 = scanner.nextInt();

        // Solicitar al usuario que ingrese el segundo número
        System.out.print("Ingresa el segundo número: ");
        int numero2 = scanner.nextInt();

        // Realizar la suma
        int suma = numero1 + numero2;

        // Mostrar el resultado
        System.out.println("La suma de " + numero1 + " y " + numero2 + " es: " + suma);

        // Cerrar el scanner
        scanner.close();
    }
}

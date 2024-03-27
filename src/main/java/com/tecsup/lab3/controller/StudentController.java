package com.tecsup.lab3.controller;

import java.util.Scanner;

public class StudentController {
	public static void main(String[] args) {
	   System.out.println("Werner desde sprint-2");
        int numero1, numero2, suma;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduzca el primer número: ");
        numero1 = teclado.nextInt();

        System.out.print("Introduzca el segundo número: ");
        numero2 = teclado.nextInt();

        suma = numero1 + numero2;

        System.out.println("La suma de " + numero1 + " y " + numero2 + " es: " + suma);
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.calculadora;

import java.util.Scanner;

/**
 *
 * @author diego
 */
public class Calculadora {

    Scanner entrada = new Scanner(System.in);
    public String[][] historial = new String[33][20];
    public String[] estudiantes = new String[33];
    public int contador = 0;

    public void Menu() {
        System.out.println("");
        int opcion = 0;
        while (opcion != 3) {
            System.out.println("============ Menu ============");
            System.out.println("1. Operadores");
            System.out.println("2. Historial");
            System.out.println("3. Salir");
            System.out.print("Seleccionar opcion: ");

            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    MenuAritmetico();
                    break;
                case 2:
                    Historial();
                    break;
                case 3:
                    break;
                default:
                    System.err.println("ERROR: opcion no valida");
            }
        }
    }

    public void MenuAritmetico() {
        int opcion = 0;
        int contador_op = 0;

        while (opcion != 6) {
            System.out.println("\n============ Operadores Aritmeticos ============");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicacion");
            System.out.println("4. Division");
            System.out.println("5. Resto");
            System.out.println("6. Regresar");
            System.out.print("Ingresar una opcion: ");
            opcion = entrada.nextInt();

            double a;
            double b;
            String respuesta;

            switch (opcion) {
                case 1:
                    System.out.println("=========== Suma ===========");
                    System.out.print("Ingresar numero a: ");
                    a = entrada.nextDouble();
                    System.out.print("Ingresar numero b: ");
                    b = entrada.nextDouble();

                    respuesta = a + " + " + b + " = " + Suma(a, b);
                    System.out.println(respuesta);
                    historial[contador][contador_op] = respuesta;
                    contador_op++;
                    break;

                case 2:
                    System.out.println("=========== Resta ===========");
                    System.out.print("Ingresar numero a: ");
                    a = entrada.nextDouble();
                    System.out.print("Ingresar numero b: ");
                    b = entrada.nextDouble();

                    respuesta = a + " - " + b + " = " + Resta(a, b);
                    System.out.println(respuesta);
                    historial[contador][contador_op] = respuesta;
                    contador_op++;
                    break;

                case 3:
                    System.out.println("=========== Multiplicacion ===========");
                    System.out.print("Ingresar numero a: ");
                    a = entrada.nextDouble();
                    System.out.print("Ingresar numero b: ");
                    b = entrada.nextDouble();

                    respuesta = a + " * " + b + " = " + Multiplicacion(a, b);
                    System.out.println(respuesta);
                    historial[contador][contador_op] = respuesta;
                    contador_op++;
                    break;

                case 4:
                    System.out.println("=========== Division ===========");
                    System.out.print("Ingresar numero a: ");
                    a = entrada.nextDouble();
                    System.out.print("Ingresar numero b: ");
                    b = entrada.nextDouble();

                    respuesta = a + " / " + b + " = " + Division(a, b);
                    System.out.println(respuesta);
                    historial[contador][contador_op] = respuesta;
                    contador_op++;
                    break;
                case 5:
                    System.out.println("========== Modulo ==========");
                    System.out.print("Ingresar numero a: ");
                    a = entrada.nextDouble();
                    System.out.print("Ingresar numero b: ");
                    b = entrada.nextDouble();

                    respuesta = a + " % " + b + " = " + Resto(a, b);
                    System.out.println(respuesta);
                    historial[contador][contador_op] = respuesta;
                    contador_op++;
                    break;
                case 6:
                    System.out.print("Ingresar nombre del estudiante: ");
                    entrada = new Scanner(System.in);
                    String estudiante = entrada.nextLine();
                    estudiantes[contador] = estudiante;
                    contador++;
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        }
    }

    public double Suma(double a, double b) {
        return a + b;
    }

    public double Resta(double a, double b) {
        return a - b;
    }

    public double Multiplicacion(double a, double b) {
        return a * b;
    }

    public double Division(double a, double b) {
        if (b == 0) {
            System.out.println("Divisor no valido");
            return 0;
        }
        return a / b;
    }

    public double Resto(double a, double b) {
        if (b == 0) {
            System.out.println("Restor no valido");
            return 0;
        }
        return a % b;
    }

    public void Historial() {
        System.out.println("\n========== Historial ==========");
        for (int i = 0; i < 33; i++) {

            if (estudiantes[i] != null) {
                System.out.println((i + 1) + ". " + estudiantes[i] + ":");
                for (int j = 0; j < 20; j++) {
                    if (historial[i][j] != null) {
                        System.out.println("\t" + historial[i][j]);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.Menu();
    }
}

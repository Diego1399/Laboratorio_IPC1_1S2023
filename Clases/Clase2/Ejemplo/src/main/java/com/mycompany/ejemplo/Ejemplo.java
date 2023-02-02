/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ejemplo;

import java.util.Scanner;

/**
 *
 * @author diego
 */
public class Ejemplo {

    String[] lista_peliculas = new String[10];
    int contador = 0;
    Scanner entrada = new Scanner(System.in);

    public void Ingresar() {
        System.out.println("*** Opcion 1 ****");
        System.out.println("Ingresar el nombre de la pelicula");
        
        String nombre_pelicula = entrada.nextLine();
        boolean existe = false;
        
        for(int i = 0; i < lista_peliculas.length; i++) {
            if(lista_peliculas[i] != null) {
                if(lista_peliculas[i].equals(nombre_pelicula)){
                    existe = true;
                    System.err.println("ERROR: Nombre de la pelicula ya existe");
                    break;
                }
            }
        }
        
        if(!existe){
            lista_peliculas[contador] = nombre_pelicula;
            contador++;
        }
        
    }

    public void Mostrar() {
        for (int i = 0; i < lista_peliculas.length; i++) {
            if(lista_peliculas[i] == null) {
                System.out.println((i + 1) + ". ");
            } else {
                System.out.println((i + 1) + ". " + lista_peliculas[i]);
            }
        }
    }

    public void Menu() {

        String eleccion = "";

        while (!eleccion.equals("3")) {
            System.out.println("**** Menu Principal ****");
            System.out.println("Seleccione una opcion");
            System.out.println("1. Ingresar nombre de pelicula");
            System.out.println("2. Ver lista de peliculas");
            System.out.println("3. Salir");
            eleccion = entrada.nextLine();
            switch (eleccion) {
                case "1":
                    System.out.println("Opcion 1");
                    Ingresar();
                    break;
                case "2":
                    System.out.println("Opcion 2");
                    Mostrar();
                    break;
                case "3":
                    System.out.println("Opcion 3");
                    break;
                default:
                    System.err.println("ERROR: Opcion no valida");
            }
        }
    }

    public static void main(String[] args) {
        Ejemplo funciones = new Ejemplo();
        funciones.Menu();
    }
}

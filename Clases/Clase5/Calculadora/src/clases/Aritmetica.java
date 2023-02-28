/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author diego
 */
public class Aritmetica {
    
    public double suma(double a, double b){
        return a + b;
    }
    public double resta(double a, double b){
        return a - b;
    }
    public double multiplicacion(double a, double b){
        return a * b;
    }
    public double division(double a, double b){
        return a / b;
    }
    
    public double raiz(double a){
        return Math.sqrt(a);
    }
    
    public double potencia(double a, double b){
        double resultado = 1;
        
        for( int i = 1; i < b; i++) {
            resultado = resultado * a;
        }
        
        return resultado;
    }
    
    public double porcentaje(double a) {
        return a / 100;
    }
    
    public double negativo(double a){
        return a * -1;
    }
}

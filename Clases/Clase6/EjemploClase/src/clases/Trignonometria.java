/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author diego
 */
public class Trignonometria {
    
    public double seno(double a, int opcion) {
        if(opcion == 1) {
            return Math.sin((a * Math.PI) / 180);
        } else {
            return Math.sin(a);
        }
    }
    
    public double coseno(double a, int opcion){
        if(opcion == 1) {
            return Math.cos((a * Math.PI) / 180);
        } else {
            return Math.cos(a);
        }
    }
    
    public double tangente(double a, int opcion) {
        if(opcion == 1) {
            return Math.tan((a * 3.1416) / 180);
        } else {
            return Math.tan(a);
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vinos;

/**
 *
 * @author diego
 */
public class Vino {
    public String Sabor;
    
    public Vino() {
        this.Sabor = null;
    }
    
    public void MostrarSabor() {
        System.out.println("Soy de sabor " + this.Sabor);
    }
}

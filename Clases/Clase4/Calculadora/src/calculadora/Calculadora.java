/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora;

import Interaces.principal;
import clases.Lista;

/**
 *
 * @author diego
 */
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static Lista listaUsarios = new Lista();
    
    public static void main(String[] args) {
        // TODO code application logic here
        principal ventanaprincipal = new principal();
        ventanaprincipal.setVisible(true);
    }
    
}

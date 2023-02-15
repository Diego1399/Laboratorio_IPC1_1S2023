/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase3;

/**
 *
 * @author diego
 */
public class Clase3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Ordenes consulta1 = new Ordenes();
        consulta1.CrearOrdenes(1, 20);
        System.out.println("Vinos de tipo 1");
        consulta1.Consulta();
        
        Ordenes consulta2 = new Ordenes();
        consulta2.CrearOrdenes(2, 10);
        System.out.println("Vinos de tipo 2");
        consulta2.Consulta();
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplovinos;

/**
 *
 * @author diego
 */
public class EjemploVinos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        /*
        
        Uva nuevauva = new Verde();
        System.out.println(nuevauva.CrearVino().Sabor);
        
        nuevauva.CrearVino() == Vino nuevoVino = new Barroco()
         */
 /*
        Vino nuevoVino = new Vino();
        System.out.println(nuevoVino.Sabor); // null
        
        Vino nuevoVino = new Barroco();
        System.out.println(nuevoVino.Sabor); // Medio
        
        Vino nuevoVino = new Dulce();
        System.out.println(nuevoVino.Sabor); // Dulce
        
        Vino nuevoVino = new Tinto();
        System.out.println(nuevoVino.Sabor); // Muy Fuerte
        
        Vino nuevoVino = new Rojo();
        System.out.println(nuevoVino.Sabor); // Rojo
         */
        Ordenes c = new Ordenes();
        c.CrearOrden(1, 15);
        
        Ordenes c2 = new Ordenes();
        c2.CrearOrden(2, 30);
        
        Ordenes c3 = new Ordenes();
        c3.CrearOrden(3, 25);
        
        System.out.println("Vino Tipo 1");
        c.Consulta();
        System.out.println("Vino Tipo 2");
        c2.Consulta();
        System.out.println("Vino Tipo 3");
        c3.Consulta();
    }

}

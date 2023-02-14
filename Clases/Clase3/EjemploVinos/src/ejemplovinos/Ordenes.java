/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplovinos;

import vinos.Vino;
import uvas.*;

/**
 *
 * @author diego
 */
public class Ordenes {
    public Vino Almacen[];
    
    public Ordenes() {
        this.Almacen = new Vino[50];
    }
    
    public void CrearOrden(int tipo, int cantidad){
        for (int i = 0; i < cantidad; i++) {
            switch (tipo) {
                case 1:
                    Uva nuevaRoja = new Roja();
                    Almacen[i] = nuevaRoja.CrearVino();
                    break;
                case 2:
                    Uva nuevaVerde = new Verde();
                    Almacen[i] = nuevaVerde.CrearVino();
                    break;
                case 3:
                    Uva nuevaPinhon = new Pinhon();
                    Almacen[i] = nuevaPinhon.CrearVino();
                    break;
                default:
                    throw new AssertionError();
            }
        }
    }
    
    public void Consulta(){
        for (Vino vino : Almacen) {
            if(vino != null) vino.MostrarSabor();
        }
    }
}

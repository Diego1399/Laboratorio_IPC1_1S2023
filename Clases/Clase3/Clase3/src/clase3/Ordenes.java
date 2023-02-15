/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase3;

/**
 *
 * @author diego
 */
public class Ordenes {
    
    public Vino almacen[];
    
    public Ordenes() {
        this.almacen = new Vino[50];
    }
    
    public void CrearOrdenes(int tipo, int cantidad){
        for (int i = 0; i < cantidad; i++) {
            switch (tipo) {
                case 1:
                    Uva nuevaVerde = new Verde();
                    almacen[i] = nuevaVerde.CrearVino();
                    break;
                case 2:
                    Uva nuevaRoja = new Roja();
                    almacen[i] = nuevaRoja.CrearVino();
                    break;
                default:
                    throw new AssertionError();
            }
        }
    }
    
    public void Consulta() {
        for (int i = 0; i < this.almacen.length; i++) {
            if(this.almacen[i] != null) {
                this.almacen[i].MostrarSabor();
            }
        }
    }
}

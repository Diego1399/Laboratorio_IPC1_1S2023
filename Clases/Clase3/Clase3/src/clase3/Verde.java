/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase3;

/**
 *
 * @author diego
 */
public class Verde extends Uva{

    @Override
    public Vino CrearVino() {
        Vino nuevo = new Barroco();
        return nuevo;
    }
    
}

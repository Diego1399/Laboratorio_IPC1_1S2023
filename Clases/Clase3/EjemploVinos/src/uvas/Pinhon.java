/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uvas;

import vinos.Dulce;
import vinos.Vino;
import uvas.Uva;

/**
 *
 * @author diego
 */
public class Pinhon extends Uva {

    @Override
    public Vino CrearVino() {
        Vino nuevoVino = new Dulce();
        return nuevoVino;
    }
}

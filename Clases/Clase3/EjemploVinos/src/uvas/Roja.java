/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uvas;

import vinos.Tinto;
import vinos.Vino;

/**
 *
 * @author diego
 */
public class Roja extends Uva{
    
    @Override
    public Vino CrearVino(){
        Vino nuevoVino = new Tinto();
        return nuevoVino;
    }
}

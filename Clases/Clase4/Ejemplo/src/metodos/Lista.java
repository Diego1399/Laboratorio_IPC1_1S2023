/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metodos;

import java.util.ArrayList;

/**
 *
 * @author diego
 */
public class Lista {
    private ArrayList<Usuario> lista;

    public Lista() {
        lista = new ArrayList<>();
    }
    
    
    public void guardar(Usuario nuevo){
        lista.add(nuevo);
    }
    
    public ArrayList getLista(){
        return lista;
    }
    
    public boolean revisar(Usuario ingresado){
        
        boolean permitido = false;
        System.out.println("Revisar");
        for (Usuario usuario : lista) {
            if(ingresado.name.equalsIgnoreCase(usuario.name) &&
                           ingresado.pass.equals(usuario.pass)){
                permitido = true;
                break;
            }
        }
        return permitido;
    }
    
    public void mostrar(){
        System.out.println("Usuarios registrados");
        for (Usuario object : lista) {
            System.out.println("Name: " + object.name + " Password: " + object.pass );
        }
    }
}

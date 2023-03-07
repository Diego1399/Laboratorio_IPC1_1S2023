/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.util.ArrayList;

/**
 *
 * @author diego
 */
public class Lista {
    ArrayList<Usuario> listaUsuarios = new ArrayList<Usuario>();
    public Lista() {
        this.listaUsuarios = new ArrayList<>();
    }
    
    public void guardar(Usuario nuevo){
        listaUsuarios.add(nuevo);
    }
    
    public boolean revisar(Usuario ingresado){
        boolean permitir = false;
        for (Usuario user : listaUsuarios) {
            if(ingresado.Name.equalsIgnoreCase(user.Name) &&
                           ingresado.Pass.equals(user.Pass)){
                permitir = true;
                break;
            }
        }
        
        return permitir;
    }
    
    public void mostrar(){
        System.out.println("Usuarios Almacenados");
        
        for (Usuario personas : listaUsuarios) {
            System.out.println(personas.Name + " " + personas.Pass);
        }
        
        /*
        for (int i = 0; i < listaUsuarios.size(); i++) {
            Usuario user = listaUsuarios.get(i);
            System.out.println(user.Name + " " + user.Pass);              
        }
        */
    }

    public ArrayList<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public Usuario devolverUsuario(Usuario ingresado) {
        for (Usuario usuario : listaUsuarios) {
            if (revisar(ingresado)) {
                return usuario;
            } 
        }
        
        return null;
    }
    
}

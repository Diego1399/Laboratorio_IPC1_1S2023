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
    private ArrayList<Usuario> listaUsuarios = new ArrayList<Usuario>();
    
    
    public Lista() {
        this.listaUsuarios = new ArrayList<>();
    }
    
    
    public void guardar(Usuario nuevo){
        this.listaUsuarios.add(nuevo);
    }
    
    public boolean revisar(Usuario ingresado){
        boolean permitir = false;
        for (Usuario user : this.listaUsuarios) {
            if(ingresado.Name.equalsIgnoreCase(user.Name) &&
                           ingresado.Pass.equals(user.Pass)){
                permitir = true;
                break;
            }
        }
        
        return permitir;
    }
    
    public Usuario devolverUusario(Usuario ingresado){
        for (Usuario user : this.listaUsuarios) {
            if(ingresado.Name.equalsIgnoreCase(user.Name) &&
                           ingresado.Pass.equals(user.Pass)){
                return user;
            }
        }
        
        return null;
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

    public void setListaUsuarios(ArrayList<Usuario> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }
    
}

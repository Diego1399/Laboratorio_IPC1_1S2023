/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author diego
 */
public class Usuario {
    public String Name;
    public String Pass;
    private boolean esAdmin;

    public Usuario(String Name, String Pass) {
        this.Name = Name;
        this.Pass = Pass;
    }

    public String getName() {
        return Name;
    }

    public String getPass() {
        return Pass;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setPass(String Pass) {
        this.Pass = Pass;
    }

    public boolean getEsAdmin() {
        return esAdmin;
    }

    public void setEsAdmin(boolean esAdmin) {
        this.esAdmin = esAdmin;
    }
}

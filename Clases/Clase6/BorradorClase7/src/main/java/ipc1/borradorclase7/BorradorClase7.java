/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ipc1.borradorclase7;

/**
 *
 * @author josed
 */
public class BorradorClase7 {

    public static void main(String[] args) {
        Usuario usuario = new Usuario("jose", "1234", "12/12/2000");
        AppState.usuarios.add(usuario);
        LoginFrame loginFrame = new LoginFrame();

    }
}

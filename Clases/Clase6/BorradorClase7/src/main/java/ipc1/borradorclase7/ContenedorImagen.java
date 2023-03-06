package ipc1.borradorclase7;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.ImageIcon;

/**
 *
 * @author josed
 */

public class ContenedorImagen {
    String nombre;
    ImageIcon imagen;
    String fecha;
    
    public ContenedorImagen(String nombre, ImageIcon imagen) {
        this.nombre = nombre;
        this.imagen = imagen;
        
        LocalDate fechaActual = LocalDate.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        this.fecha = fechaActual.format(formato);
    }
}

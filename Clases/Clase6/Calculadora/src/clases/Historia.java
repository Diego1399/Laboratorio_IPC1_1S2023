/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Date;

/**
 *
 * @author diego
 */
public class Historia {

    private String ruta = "C:\\Users\\diego\\OneDrive\\Documentos\\Ingenieria en Ciencias y Sistemas\\2023\\Primer Semestre\\Laboratorio_IPC1\\Clases\\Clase5\\Calculadora\\historial.html";
    private String contenido = "";

    public Historia() {
    }

    public String getRuta() {
        return ruta;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido += contenido + "\n";
    }

    public void crearArchivo() {
        /*
        <html>
        <head>
        <title>Mi primera pagina</title>
        </head>
        <body>
        Hola mundo
        </body>
        </html>
         */
        
        String body = this.getContenido().replace("\n", "<br>");

        String html = "<html>"
                       + "<head>"
                       + "<title>Historial de Operaciones</title>"
                       + "</head>"
                       + "<body>"
                       + body
                       + "</body>"
                       + "</hmtl>";
        
        File file = new File(getRuta());
        
        try {

            if (!file.exists()) {
                file.createNewFile();
            }

            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);

            bw.write(html);
            bw.close();
            

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}

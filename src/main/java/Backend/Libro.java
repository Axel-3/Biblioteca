/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend;
import java.io.*;
/**
 *
 * @author Gutierrez Murillo Axel
 */
public class Libro implements Serializable {
    public String nombre,Autor,Generos;
    public int año,paginas,cantidad;
    public Libro(String nombre, String Autor, String Generos, int  paginas, int año,int cantidad){
        this.nombre=nombre;
        this.Autor=Autor;
        this.año=año;
        this.Generos=Generos;
        this.paginas=paginas;
        this.cantidad=cantidad;
    }
    public boolean buscador(String nombre){
        if(nombre.isEmpty() || nombre.length()>this.nombre.length())
            return false;
        for(int i=0; i<nombre.length(); ++i)
            if( nombre.charAt(i) != this.nombre.charAt(i) )
                return false;
        return true;
    }
    public String toString() {
        return "Titulo: "+nombre+
               "\nAutor: "+Autor+
               "\nAño de publicacion: "+año+
               "\nGeneros: "+Generos+
               "\nPaginas: "+paginas+
               "\nCantidad: "+cantidad;
    }
}

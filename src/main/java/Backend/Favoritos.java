/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend;
import java.io.*;
import java.util.*;
/**
 *
 * @author Gutierrez Murillo Axel
 */
public class Favoritos implements Serializable {
    public String usuario;
    static ArrayList<Libro> favs = new ArrayList();
    public Favoritos(String usuario){
     this.usuario=usuario;
    }
    public void añadir(Libro libro_fav){
        favs.add(libro_fav);
    }
    @Override
    public String toString(){
        String mostrar="";
        for(int i=0;i<favs.size();i++){
            mostrar+=favs.get(i).toString();
        }
        return mostrar;
    }
}

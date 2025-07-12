/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend;
import Interfaces.*;
import java.util.*;
import java.io.*;
import javax.swing.*;
/**
 *
 * @author Gutierrez Murillo Axel
 */
public class Pedi {
    metodos_prestamo implementacion;
    public boolean pedido=false;
    private ArrayList<Libro> libro = new ArrayList();
    private Libro libro_p;
    private int indice;
    public Pedi(metodos_prestamo implementacion,ArrayList<Libro> libro,Libro libro_p, int indice){
        this.implementacion=implementacion;
        this.libro=libro;
        this.libro_p=libro_p;
        this.indice=indice;
    }
    public boolean pedir(){
        pedido=implementacion.pedir(libro,libro_p,indice);
        return pedido;
    }
    
}

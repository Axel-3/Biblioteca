package Backend;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.io.*;
import Interfaces.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Gutierrez Murillo Axel
 */
public class Es_numero extends Thread{
   static public boolean entro=false;
   @Override
   public void run(){
       String año,paginas,cantidad;
       Administrador admin= new Administrador();
       año=admin.año;
       cantidad=admin.cantidad;
       paginas=admin.paginas;
       if(paginas.matches("[0-9+]")){
           entro=false;
       }else{
           entro=true;
           
       }
       if(cantidad.matches("[0-9]+")){
           entro=false;
       }else{
           entro=true;
           
       }
       if(año.matches("[0-9]+")){
           entro=false;
       }else{
           entro=true;
           
       }
   }
}

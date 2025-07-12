/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend;

import javax.swing.JOptionPane;
import Interfaces.*;

/**
 *
 * @author Gutierrez Murillo Axel
 */
public class ValidarInfo {
    InicioSesion login = new InicioSesion();
    InicioPremium login2 = new InicioPremium();
    InicioAdmin login3 = new InicioAdmin();
    String res;
    
    //Para usuarios normales
    public boolean InfoUsuario(String usuarios [],String[] contraseñas, String user, String pdw, int intentos){
        boolean encontrado = false;
        
        for(int i=0; i<usuarios.length; i++){
            
            if(usuarios[i].equalsIgnoreCase(user) && contraseñas[i].equalsIgnoreCase(pdw)){
                res = "Bienvenido " + user;
                encontrado=true;
                JOptionPane.showMessageDialog(null, res, "Inicio de sesión", JOptionPane.INFORMATION_MESSAGE);
                intentos=0;
                login.setIntentos(intentos);
                break;
            }
        }
        //Evaluamos el numero de intentos
        if(encontrado==false){
            res = "Clave y/o usuarios erroneos " + intentos + " intentos fallidos";
            JOptionPane.showMessageDialog(null, res, "Inicio de sesión", JOptionPane.ERROR_MESSAGE);
        }
        
        if(intentos>4){
            JOptionPane.showMessageDialog(null, "Limite de intentos alanzados", "Inicio de sesión", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
        return encontrado;
    }
    
    //Para usuarios premium
    public boolean InfoUsuarioPremium(String usuarios [],String[] contraseñas, String user, String pdw, int intentos){
        boolean encontrado2 = false;
        
        for(int i=0; i<usuarios.length; i++){
            
            if(usuarios[i].equalsIgnoreCase(user) && contraseñas[i].equalsIgnoreCase(pdw)){
                res = "Bienvenido " + user;
                encontrado2=true;
                JOptionPane.showMessageDialog(null, res, "Inicio de sesión", JOptionPane.INFORMATION_MESSAGE);
                intentos=0;
                login2.setIntentos(intentos);
                break;
            }
        }
        //Evaluamos el numero de intentos
        if(encontrado2==false){
            res = "Clave y/o usuarios erroneos " + intentos + " intentos fallidos";
            JOptionPane.showMessageDialog(null, res, "Inicio de sesión", JOptionPane.ERROR_MESSAGE);
        }
        
        if(intentos>4){
            JOptionPane.showMessageDialog(null, "Limite de intentos alanzados", "Inicio de sesión", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
        return encontrado2;
    }

    //Para los admin
    public boolean InfoUsuarioAdmin(String usuarios [],String[] contraseñas, String user, String pdw, int intentos){
        boolean encontrado3 = false;
        
        for(int i=0; i<usuarios.length; i++){
            
            if(usuarios[i].equalsIgnoreCase(user) && contraseñas[i].equalsIgnoreCase(pdw)){
                res = "Bienvenido " + user;
                encontrado3=true;
                JOptionPane.showMessageDialog(null, res, "Inicio de sesión", JOptionPane.INFORMATION_MESSAGE);
                intentos=0;
                login3.setIntentos(intentos);
                break;
            }
        }
        //Evaluamos el numero de intentos
        if(encontrado3==false){
            res = "Clave y/o usuarios erroneos " + intentos + " intentos fallidos";
            JOptionPane.showMessageDialog(null, res, "Inicio de sesión", JOptionPane.ERROR_MESSAGE);
        }
        
        if(intentos>2){
            JOptionPane.showMessageDialog(null, "Limite de intentos alanzados", "Inicio de sesión", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
        return encontrado3;
    }    
}

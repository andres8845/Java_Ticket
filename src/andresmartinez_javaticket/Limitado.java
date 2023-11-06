/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package andresmartinez_javaticket;

/**
 *
 * @author andre
 */
public class Limitado extends Usuarios{
    
    public Limitado(String nombre,String contra){
        super(nombre,contra);
    }
    
    public int buscar(String usuario,int acumulador){
        if(acumulador<Usuarios.usernames.size()){
            if(Usuarios.usernames.get(acumulador).getUsuario().equals(usuario)){
                return acumulador;
            }
            return buscar(usuario,acumulador+1);
        }
        return -1;
    }
    
    public boolean verificar(String nombre, String contra,int acumulador){
        int posicion=buscar(nombre,0);
        if(posicion!=-1 && acumulador<Usuarios.usernames.size()){
            if(Usuarios.usernames.get(posicion).getContra().equals(contra) && Usuarios.usernames.get(posicion).getUsuario().equals(nombre)){
                return true;
            }
            return verificar(nombre,contra,acumulador+1);
        }
        return false;
    }
}

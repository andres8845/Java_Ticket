package andresmartinez_javaticket;

import java.util.ArrayList;

public abstract class Usuarios {
    String nombreCompleto,usuario, contra, acceso;
    int edad;
    
    public static ArrayList<Usuarios> usernames=new ArrayList<>();
    

    public Usuarios(String usuario, String contra) {
        this.usuario = usuario;
        this.contra = contra;
    }
    
    public void setUsuario(String usuario){
        this.usuario=usuario;
    }
    
    public String getUsuario() {
        return usuario;
    }

    public void setContra(String contra){
        this.contra=contra;
    }
    
    public String getContra() {
        return contra;
    }
    
    public void setAcceso(String acceso){
        this.acceso=acceso;
    }
    
    public String getAcceso(){
        return acceso;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
      
    abstract int buscar(String usuario,int acumulador);
    
    abstract boolean verificar(String nombre, String contra,int acumulador);
    
}

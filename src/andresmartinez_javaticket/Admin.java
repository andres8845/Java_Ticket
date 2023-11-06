package andresmartinez_javaticket;

public class Admin extends Usuarios{
    
    public Admin(String nombre,String contra){
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

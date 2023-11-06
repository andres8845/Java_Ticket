/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package andresmartinez_javaticket;

/**
 *
 * @author andre
 */
import java.util.ArrayList;
import java.util.Calendar;
public class deportes extends Eventos{
    TipoDeporte tipoDeporte;
    String Team1="",Team2="";
    
    public static ArrayList<String[]> teams1=new ArrayList<>();
    public static ArrayList<String[]> teams2=new ArrayList<>();
    
   public deportes(String creador,String estado,int codigo, String titulo,String descripcion, String tipoEvento,double monto,String team, String team2,TipoDeporte TP ,Calendar fecha,int cantPersonas){
        super(creador,estado,codigo,titulo,descripcion,tipoEvento,monto,fecha,cantPersonas);
        tipoDeporte=TP;
        Team1=team;
        Team2=team2;
    }
    
    public enum TipoDeporte{
        futbol,tenis,rugby,baseball
    }
    
    public static Eventos buscar(int codigo){
        for(Eventos event: events){
            if(event!= null && event.getCodigo() == codigo){
                return event;
            }
        }
        return null;
    }

    public TipoDeporte getTipoDeporte() {
        return tipoDeporte;
    }

    public String getTeam1() {
        return Team1;
    }

    public void setTeam1(String Team1) {
        this.Team1 = Team1;
    }

    public String getTeam2() {
        return Team2;
    }

    public void setTeam2(String Team2) {
        this.Team2 = Team2;
    }
            
    
}

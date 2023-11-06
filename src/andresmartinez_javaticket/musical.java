/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package andresmartinez_javaticket;

import java.util.Calendar;
import java.util.ArrayList;
/**
 *
 * @author andre
 */
public class musical extends Eventos{
    GeneroMusical tipoMusica;

    public static ArrayList<String[]> banda=new ArrayList<>();
     
    public musical(GeneroMusical tipoMusica,String creador,String estado, int codigo, String titulo, String descripcion, String tipoEvento, double monto, Calendar fecha, int cantiPersonas) {
        super(creador,estado,codigo, titulo, descripcion, tipoEvento, monto, fecha, cantiPersonas);
        this.tipoMusica = tipoMusica;
    }
    
    public enum GeneroMusical{
        pop,rock,rap,clasica,reggaeton,otro;
    }
    
    public static Eventos buscar(int codigo){
        for(Eventos event: events){
            if(event!= null && event.getCodigo() == codigo){
                return event;
            }
        }
        return null;
    }

    public GeneroMusical getTipoMusica() {
        return tipoMusica;
    }

   
     
     
}

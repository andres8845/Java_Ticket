/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package andresmartinez_javaticket;

import java.util.ArrayList;
import java.util.Calendar;

/**
 *
 * @author andre
 */
public class religioso extends Eventos{

     public static ArrayList<Integer> converted=new ArrayList<>();
     
    public religioso(String creador,String estado,int codigo, String titulo, String descripcion, String tipoEvento, double monto, Calendar fecha, int cantiPersonas) {
        super(creador,estado,codigo, titulo, descripcion, tipoEvento, monto, fecha, cantiPersonas);
    }
    
    public static Eventos buscar(int codigo){
        for(Eventos event: events){
            if(event!= null && event.getCodigo() == codigo){
                return event;
            }
        }
        return null;
    }
    
}

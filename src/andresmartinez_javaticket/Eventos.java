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
public class Eventos {
    
    int codigo,cantPersonas;
    String titulo,descripcion,tipoEvento,creador,estado;
    Calendar fecha;
    double monto;
    
    public static ArrayList<Eventos> events=new ArrayList<>();

    public Eventos(String creador,String estado,int codigo, String titulo, String descripcion, String tipoEvento, double monto, Calendar fecha,int cantiPersonas) {
        this.creador=creador;
        this.fecha=fecha;
        this.estado=estado;
        this.codigo = codigo;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.tipoEvento = tipoEvento;
        this.monto = monto;
        cantPersonas=cantiPersonas;
    }
    
    
   public static Eventos buscar(int codigo, int indice) {
        if (indice < events.size()) {
            Eventos event = events.get(indice);
            if (event != null && event.getCodigo() == codigo) {
                return event;
            }
            return buscar(codigo, indice + 1);
        }
        return null;
    }
   
    public static int posicion(int codigo,int indice){
        if(indice<events.size()){
            if(events.get(indice).getCodigo()==codigo){
                return indice;
            }
            return posicion(codigo,indice+1);
        }
        return -1;
    }
   
   public void agregarEvento(Eventos evento){
        events.add(evento);
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCantPersonas() {
        return cantPersonas;
    }

    public void setCantPersonas(int cantPersonas) {
        this.cantPersonas = cantPersonas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTipoEvento() {
        return tipoEvento;
    }

    public void setTipoEvento(String tipoEvento) {
        this.tipoEvento = tipoEvento;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Calendar getFecha() {
        return fecha;
    }

    public void setFecha(Calendar fecha) {
        this.fecha = fecha;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public static ArrayList<Eventos> getEvents() {
        return events;
    }

    public static void setEvents(ArrayList<Eventos> events) {
        Eventos.events = events;
    }
    
   
}

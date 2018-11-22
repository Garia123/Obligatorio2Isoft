/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import com.toedter.calendar.JDateChooser;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author uuu
 */
public class Agenda implements Comparable {
   private String evento;
   private String tipoEvento;
   private Familia familiar;
   private Perro perro;
   private String descripcion;
   Date fecha;
   String hora;
   SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
   SimpleDateFormat formatoHora = new SimpleDateFormat("hh:mm");
  
   public String getFecha(){
       return formatoFecha.format(fecha);
   }
   public void setFecha(Date fecha){
       this.fecha = fecha;
   }
   public String getHora(){
       return hora;
   }
   public void setHora(String hora){
       this.hora = hora;
   }
    
   public String getDescripcion() {
      return descripcion;
   }
  
   public void setDescripcion(String descripcion) {
      this.descripcion = descripcion;
   }
   
   public String getEvento() {
      return evento;
   }
   
   public void setEvento(String evento) {
      this.evento = evento;
   }
   public String getTipoEvento() {
      return tipoEvento;
   }
   public void setTipoEvento(String tipoEvento) {
      this.tipoEvento = tipoEvento;
   }
   public Familia getFamilia() {
      return familiar;
   }
   public void setFamilia(Familia familiar) {
      this.familiar =familiar;
   }
   public Perro getPerro() {
      return perro;
   }
   public void setPerro(Perro perro) {
      this.perro = perro;
   }
   public Agenda(){
       this.setTipoEvento(" ");
       this.setEvento(" ");
       this.setDescripcion(" ");
       this.setPerro(null);
       this.setFamilia(null);
       this.setFecha(null);
   }
  
 
   public Agenda(Familia familiar, Perro perro, String tipoEvento, String evento,String descripcion, Date fecha){
       this.setTipoEvento(tipoEvento);
       this.setEvento(evento);
       this.setFamilia(familiar);
       this.setPerro(perro);
       this.setDescripcion(descripcion);
       this.setFecha(fecha);
   }
    @Override
    public String toString(){
       return this.getEvento()+" - " + this.getFecha();
    }

    @Override
    public int compareTo(Object t) {
        String [] fecha1 = this.getFecha().split("/");
      String [] fecha2= ((Agenda)t).getFecha().split("/");
      int retorno = Integer.parseInt(fecha1[2])-Integer.parseInt(fecha2[2]);
      if(retorno == 0){
          retorno = Integer.parseInt(fecha1[1])-Integer.parseInt(fecha2[1]);
          if(retorno == 0){
              retorno = Integer.parseInt(fecha1[0])-Integer.parseInt(fecha2[0]);
          }
      }
      return retorno;
    }

   

}

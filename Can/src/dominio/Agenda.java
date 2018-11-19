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
public class Agenda {
   private String evento;
   private String tipoEvento;
   private Familia familiar;
   private Perro perro;
   private String descripcion;
   JDateChooser fecha;
   SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
   
  public String getDate(JDateChooser fecha){
      if(fecha.getDate() != null){
          return formato.format(fecha.getDate());
      }else{
          return null;
      }
  }
  public Date setDate(String fecha) {
      SimpleDateFormat formato_del_Texto = new SimpleDateFormat("dd-MM-yyyy");
      Date fechaE = null;
      try{
          fechaE = formato_del_Texto.parse(fecha);
          return fechaE;
      }catch(ParseException ex){
          return null;
      }
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
   }
   public Agenda(Familia familiar, Perro perro, String tipoEvento, String evento,String descripcion){
       this.setTipoEvento(tipoEvento);
       this.setEvento(evento);
       this.setFamilia(familiar);
       this.setPerro(perro);
       this.setDescripcion(" ");
   }
    @Override
    public String toString(){
       return this.getEvento();
    }

}

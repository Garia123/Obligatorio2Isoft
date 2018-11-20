/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package VentanaPrincipal;
package dominio;

import interfaz.VentanaPrincipal;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author uuu
 */
public class Sistema {
    public ArrayList<Perro> listaDePerros;
    public ArrayList<Familia> listaFamilia;
    public ArrayList<Agenda> listaAgenda;

    public Sistema(){
        listaDePerros = new ArrayList<>();
        listaFamilia = new ArrayList<>();
        listaAgenda = new ArrayList<>();
    }
    public void agregarAgenda(Agenda unaAgenda){
        this.listaAgenda.add(unaAgenda);
    }
    public void agregarPerro(Perro unPerro){
        this.listaDePerros.add(unPerro);
    }
    public void agregarFamiliar(Familia unFamiliar){
        this.listaFamilia.add(unFamiliar);
    }
     public boolean existePerro(String unTexto, JFrame VentanaPrincipal){ 
        boolean perroDisponible = false; 
        Perro pAux = new Perro(); 
        pAux.setNombre(unTexto); 
        int pos=listaDePerros.indexOf(pAux); 
        if(pos==-1){ 
            perroDisponible=true; 
        } 
        else{ 
            JOptionPane.showMessageDialog(VentanaPrincipal,"Ya existe el perro ingresado","Error",JOptionPane.ERROR_MESSAGE);
        } 
        return perroDisponible; 
    }
     public boolean existeFamiliar(String unTexto, JFrame VentanaPrincipal){
         boolean familiarDisponible = false;
         Familia familiar = new Familia();
         familiar.setNombreFamiliar(unTexto);
         int pos = listaFamilia.indexOf(familiar);
         if(pos == -1){
             familiarDisponible = true;
         }else{
             JOptionPane.showMessageDialog(VentanaPrincipal,"Ya existe el familiar ingresado","Error",JOptionPane.ERROR_MESSAGE);
         }
         return familiarDisponible;
     }
    public boolean controlRango(JFrame VentanaPrincipal, String num, String msjRango, String msjCaracter) {
       float valor = -1;
       boolean Ok = false;
       try {
           valor = Float.parseFloat(num);
           if (valor >= 1 && valor <= 50) {
               Ok = true;
           } 
           else {
              JOptionPane.showMessageDialog(VentanaPrincipal, msjRango, "ERROR", JOptionPane.WARNING_MESSAGE);
              valor = -1;
           }
        } 
       catch (Exception e) {
           JOptionPane.showMessageDialog(VentanaPrincipal, msjCaracter, "ERROR", JOptionPane.WARNING_MESSAGE);
        }
       return Ok;
    }
    public Perro darPerro(String nombre){
        Perro p = new Perro();
        p.setNombre(nombre);
        if(this.listaDePerros.contains(p)){
            p = listaDePerros.get(listaDePerros.indexOf(p));
        }
        return p;
        
    }
        public ArrayList<Agenda> ordenarPorFecha(){
        Collections.sort(this.listaAgenda);
        return this.listaAgenda;
    }
}

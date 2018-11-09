/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package VentanaPrincipal;
package dominio;

import interfaz.VentanaPrincipal;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author uuu
 */
public class Sistema {
    public ArrayList<Perro> listaDePerros;


    public Sistema(){
        listaDePerros = new ArrayList<>();
    }
    public void agregarPerro(Perro unPerro){
        this.listaDePerros.add(unPerro);
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
     
    public boolean controlRango(JFrame VentanaPrincipal, String num) {
       float valor = -1;
       boolean Ok = false;
       try {
           valor = Float.parseFloat(num);
           if (valor >= 1 && valor <= 50) {
               Ok = true;
           } 
           else {
              JOptionPane.showMessageDialog(VentanaPrincipal, "La edad ingresada no es valida.", "ERROR", JOptionPane.WARNING_MESSAGE);
              valor = -1;
           }
        } 
       catch (Exception e) {
           JOptionPane.showMessageDialog(VentanaPrincipal, "Debe ingresar la edad solo con caracteres numéricos.", "ERROR", JOptionPane.WARNING_MESSAGE);
        }
       return Ok;
    }
    

  

   
}

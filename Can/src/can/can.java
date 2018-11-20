/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package can;

import dominio.*;
import interfaz.*;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 *
 *
 */
public class can {
    public static void main(String[] args) {
        Sistema unSistema = new Sistema();
        VentanaPrincipal ventana = new VentanaPrincipal(unSistema);
        ventana.setVisible(true);
        Date date = new Date();
        System.out.println(date);
        SimpleDateFormat sdf = new SimpleDateFormat();
        String s = sdf.format(date);
        System.out.println(s);
        
    }
}

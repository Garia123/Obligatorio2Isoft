package dominio;

//Importar en la ventana de donde se guardan cambios -- import Interfaz.ventanaMenu;
import java.io.*;
import javax.swing.*;

public class ArchivoGrabacion {
   BufferedWriter out;
   public ArchivoGrabacion(String nombre, JFrame vent){
       try{
           out = new BufferedWriter(new FileWriter(nombre));
       }catch(IOException e){
          JOptionPane.showMessageDialog(vent, "No se puede crear el archivo", "ERROR", JOptionPane.ERROR_MESSAGE);
       }
   }
    public boolean grabarLinea (String texto, JFrame vent){
        boolean ok = true;
       try{
            out.write(texto);
            out.newLine();
        }catch(IOException e){
            JOptionPane.showMessageDialog(vent, "Error al grabar linea", "ERROR", JOptionPane.ERROR_MESSAGE);
            ok = false;
        }
        return ok;
    }
    
    public boolean cerrar(){
        boolean ok = true;
        try{
            out.flush();
            out.close();
        }catch(IOException e){
            ok = false;
        }
        return ok;
    }
}

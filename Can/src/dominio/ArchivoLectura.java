package dominio;

//Imposta en la ventana de inicio -- import Interfaz.ventanaMenu;
import java.io.*;
import javax.swing.*;
import javax.swing.JOptionPane;

public class ArchivoLectura {

    private BufferedReader in;
    private String linea;

    public ArchivoLectura(String nombre, JFrame vent) {
        try {
            in = new BufferedReader(new FileReader(nombre));
        } catch (FileNotFoundException e) {
            ArchivoGrabacion out = new ArchivoGrabacion("AppCan.txt", vent);
            out.cerrar();
        }
    }

    public boolean hayMasLineas() {
        try {
            linea = in.readLine();
        } 
        catch (IOException e) {
            linea = null;
        }
        catch (NullPointerException e){
            linea = null;
        }
        return linea != null;
    }

    public String linea() {
        return linea;
    }

    public boolean cerrar() {
        boolean ok = true;
        try {
            in.close();
        } catch (IOException e) {
            ok = false;
        }
        catch (NullPointerException e){
            ok = false;
        }
        return ok;
    }

}

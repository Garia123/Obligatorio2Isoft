package dominio;

import java.util.Objects;
import javax.swing.JFileChooser;
import javax.swing.JLabel;

public class Familia {
    
    //Atributo
    private String nombreFamiliar;
    private String emailFamiliar;
    //Gets & Sets
    public String getNombreFamiliar() {
        return nombreFamiliar;
    }

    public void setNombreFamiliar(String nombreFamiliar) {
        this.nombreFamiliar = nombreFamiliar;
    }
    
    public String getEmailFamiliar(){
        return emailFamiliar;
    }
    
    public void setEmailFamiliar(String emailFamiliar){
        this.emailFamiliar = emailFamiliar;
    }

   public Familia() {
        this.setNombreFamiliar(" ");
        this.setEmailFamiliar(" ");
    }

    public Familia(String nombreFamiliar, String emailFamiliar) {
        this.setNombreFamiliar(nombreFamiliar);
        this.setEmailFamiliar(emailFamiliar);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    //Criterio de comparacion a definir
    @Override
    public boolean equals(Object obj) {
        return this.getNombreFamiliar().equalsIgnoreCase(((Familia)obj).getNombreFamiliar());
    }

    @Override
    public String toString() {
        return this.getNombreFamiliar();
    }
    
    
    
}

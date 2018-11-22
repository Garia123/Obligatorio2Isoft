package dominio;

import java.util.Objects;
import javax.swing.JFileChooser;
import javax.swing.JLabel;

public class Perro {
    
    //Atributo
    private String nombre;
    private float altura;
    private float peso;
    private String comentario;
    private String imagen;

    //Gets & Sets
    public String getImagen(){
        return imagen;
    }
    public void setImagen(String img){
        this.imagen = img;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public Perro() {
        this.setNombre(" ");
        this.setAltura(0);
        this.setPeso(0);
        this.setComentario(" ");
    }

    public Perro(String nombre, float altura, float peso, String comentario, JLabel img) {
        this.setNombre(nombre);
        this.setAltura(altura);
        this.setPeso(peso);
        this.setComentario(comentario);
        this.setImagen(img);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    //Criterio de comparacion a definir
    @Override
    public boolean equals(Object obj) {
        return this.getNombre().equalsIgnoreCase(((Perro)obj).getNombre());
    }

    @Override
    public String toString() {
        return this.getNombre();
    }
    
    
    
}

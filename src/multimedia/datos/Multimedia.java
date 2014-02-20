/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package multimedia.datos;

/**
 *
 * @author fran
 */
public class Multimedia {
    
    private String titulo, autor;
    private int duracion;
    
    public Multimedia(){}

    public Multimedia(String titulo, String autor, int duracion) {
        this.titulo = titulo;
        this.autor = autor;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public boolean equals(Multimedia obj) {
        return this.autor.equals(obj.getAutor()) && this.titulo.equals(obj.getTitulo());
    }

    @Override
    public String toString() {
        return "titulo=" + titulo + ", autor=" + autor + ", duracion=" + duracion + "";
    }
    
}

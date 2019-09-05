/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libreria;

import archivosSerializados.Equipo;
import java.io.Serializable;

/**
 *
 * @author ISTLOJA V
 */
public class Libro implements Serializable {
    private String NombreLibro;
    private int numeroPaginas;
    private String tipodeLibro;
    private int añodePublicacion;
    private Autor autor;

    public Libro(String NombreLibro, int numeroPaginas, String tipodeLibro, int añodePublicacion, Autor autor) {
        this.NombreLibro = NombreLibro;
        this.numeroPaginas = numeroPaginas;
        this.tipodeLibro = tipodeLibro;
        this.añodePublicacion = añodePublicacion;
        this.autor = autor;
    }

    public Libro() {
    }

    public String getNombreLibro() {
        return NombreLibro;
    }

    public void setNombreLibro(String NombreLibro) {
        this.NombreLibro = NombreLibro;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public String getTipodeLibro() {
        return tipodeLibro;
    }

    public void setTipodeLibro(String tipodeLibro) {
        this.tipodeLibro = tipodeLibro;
    }

    public int getAñodePublicacion() {
        return añodePublicacion;
    }

    public void setAñodePublicacion(int añodePublicacion) {
        this.añodePublicacion = añodePublicacion;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }
  
 
}

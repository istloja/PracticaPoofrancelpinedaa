/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libreria;

import java.io.Serializable;

/**
 *
 * @author ISTLOJA V
 */
public class Autor implements Serializable{
    private String Nombre;
    private String Apellidos;
    private String Pais;
    private int Edad;
    private int LibrosPublicados;

    public Autor(String Nombre, String Apellidos, String Pais, int Edad, int LibrosPublicados) {
        this.Nombre = Nombre;
        this.Apellidos = Apellidos;
        this.Pais = Pais;
        this.Edad = Edad;
        this.LibrosPublicados = LibrosPublicados;
    }

    public Autor() {
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public String getPais() {
        return Pais;
    }

    public void setPais(String Pais) {
        this.Pais = Pais;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public int getLibrosPublicados() {
        return LibrosPublicados;
    }

    public void setLibrosPublicados(int LibrosPublicados) {
        this.LibrosPublicados = LibrosPublicados;
    }
    
}

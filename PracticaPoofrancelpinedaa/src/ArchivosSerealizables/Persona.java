/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArchivosSerealizables;

import java.io.Serializable;

/**
 *
 * @author ISTLOJA V
 */
public class Persona implements Serializable {
    private String nombre;
    private String apellido;
    private int edad;
    private String telefono;
    private Mascota mascota;

    public Persona(String nombre, String apellido, int edad, String telefono, Mascota mascota) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.telefono = telefono;
        this.mascota = mascota;
    }

    public Persona() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }

    public static void main(String[] args) {
    
        Persona objeto=new Persona("fabio","pineda",22,"2222",new Mascota("rex",5,4));
        Persona objetos=new  Persona ("oscar","granda",28,"555",new Mascota("kissa",4,5));
        System.out.println("la persona se llama"+objeto.getNombre()+"y su mascota es"+objeto.getMascota().getNombre());
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArchivosSerealizables;

/**
 *
 * @author ISTLOJA V
 */
public class Equipo {
    private String nombre;
    private int numerodeTitulos;
    private String ciudad;

    public Equipo(String nombre, int numerodeTitulos, String ciudad) {
        this.nombre = nombre;
        this.numerodeTitulos = numerodeTitulos;
        this.ciudad = ciudad;
    }

    public Equipo() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumerodeTitulos() {
        return numerodeTitulos;
    }

    public void setNumerodeTitulos(int numerodeTitulos) {
        this.numerodeTitulos = numerodeTitulos;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    
}

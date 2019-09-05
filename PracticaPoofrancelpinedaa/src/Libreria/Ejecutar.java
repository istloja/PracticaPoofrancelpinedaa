/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libreria;

import archivosSerializados.Jugador;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ISTLOJA V
 */
public class Ejecutar {

    public void escribirObjeto(String direccion, Libro l) {
        try {
            ObjectOutputStream escritor = new ObjectOutputStream(new FileOutputStream(direccion));
            escritor.writeObject(l);
            escritor.close();
        } catch (Exception e) {
            System.out.println("se produjo un error" + e);

        }

    }

    public void leerLista(String direccion) {
        try {
            ObjectInputStream lector = new ObjectInputStream(new FileInputStream(direccion));
            Object auxiliar = lector.readObject();
            while (auxiliar != null) {
                Libro l = (Libro) auxiliar;
                System.out.println(l.getAutor().getNombre() + "su edad es:" + l.getAutor());
                auxiliar = lector.readObject();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void leerArchivos(String direccion) {
        try {
            ObjectInputStream lector = new ObjectInputStream(new FileInputStream(direccion));
            Object Auxiliar = lector.readObject();
            Libro l = (Libro) Auxiliar;
            System.out.println(l.getAutor().getNombre() + " su edad es " + l.getAutor().getPais());
        } catch (Exception e) {
            System.out.println(e);

        }
    }

    public void escribirlista(String direccion, List<Libro> lista) {
        try {
            ObjectOutputStream escritor = new ObjectOutputStream(new FileOutputStream(direccion));
            for (Libro libro : lista) {
                escritor.writeObject(libro);
            }
            escritor.close();
        } catch (Exception e) {
            System.out.println("se ha producido un error" + e);
        }
    }

    public List<Libro> leerLibro(String url) {

        List<Libro> lista = new ArrayList<>();
        try {
            ObjectInputStream lector = new ObjectInputStream(new FileInputStream(url));
            Object Auxiliar = lector.readObject();
            while (Auxiliar != null) {
                Libro l = (Libro) Auxiliar;
                lista.add(l);
                Auxiliar = lector.readObject();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return lista;

    }

    public int elLibroMasantiguo(List<Libro> lista) {
        int elLibroMasantiguo = lista.get(0).getAñodePublicacion();
        for (Libro libro : lista) {
            System.out.println("El valor mayor es:" + elLibroMasantiguo + "el libro mas antiguo es:" + libro.getAñodePublicacion());
            if (libro.getAñodePublicacion() < elLibroMasantiguo) {
                elLibroMasantiguo = libro.getAñodePublicacion();
            }
        }
        return elLibroMasantiguo;

    }
    public String libroActualizado(List<Libro> lista){
           
    }
    public static void main(String[] args) {
        Ejecutar objeto = new Ejecutar();

        Libro l1 = new Libro("Lo que el viento se llevó", 55, "cuentos", 1936, new Autor("Edward", "lnae", "Noruega", 39, 29));
        Libro l2 = new Libro("Gerra y paz", 60, "literatura", 1869, new Autor("Leon", "Nolvo", "Rusia", 40, 39));
        Libro l3 = new Libro("Orgullo y perjuicio", 132, "novela", 1813, new Autor("Jane", "Austen", "EE.UU", 40, 20));
        Libro l4 = new Libro("El lobo estepario ", 49, "obra", 1927, new Autor("Hermann", "Hesse", "Aleman", 33, 49));
        Libro l5 = new Libro("Ulises", 38, "libro", 1822, new Autor("James", "joyce", "Irlandia", 41, 17));

        List<Libro> lista = new ArrayList<>();

        lista.add(l1);
        lista.add(l2);
        lista.add(l3);
        lista.add(l4);
        lista.add(l5);

        int a = lista.size();

        objeto.escribirObjeto("C:\\Users\\ISTLOJA V\\Desktop\\Libro.txt", l5);
//           objeto.leerLista("C:\\Users\\ISTLOJA V\\Desktop\\Libro.txt");
//           objeto.leerArchivos("C:\\Users\\ISTLOJA V\\Desktop\\Libro.txt");
//           objeto.escribirlista("C:\\Users\\ISTLOJA V\\Desktop\\Libro.txt", lista);
        List<Libro> l = objeto.leerLibro("C:\\Users\\ISTLOJA V\\Desktop\\Libro.txt");

        System.out.println("el libro mas antiguo es " + objeto.elLibroMasantiguo(l));
    }
}

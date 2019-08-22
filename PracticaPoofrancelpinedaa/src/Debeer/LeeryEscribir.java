/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Debeer;

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
    public class LeeryEscribir {

    public List<Estudiante> leerPersonas(String url) {

            List<Estudiante> Lista = new ArrayList<Estudiante>();
            try {
                ObjectInputStream lector = new ObjectInputStream(new FileInputStream(url));
                Object auxiliar = lector.readObject();
                while (auxiliar != null) {
                    Estudiante p1 = (Estudiante) auxiliar;
                    Lista.add(p1);
                    auxiliar = lector.readObject();
                }

            } catch (Exception e) {//
                System.out.println("error"+e);
            }


        return Lista;

    }

    public void leerLista(String variable) {
        try {
            ObjectInputStream lector = new ObjectInputStream(new FileInputStream(variable));
            Object auxiliar = lector.readObject();
            while (auxiliar != null) {
                Estudiante p1 = (Estudiante) auxiliar;// cambio de objeto a persona
                System.out.println("su direccion "+p1.getDireccion());
                auxiliar = lector.readObject();
            }

        } catch (Exception e) {
            System.out.println("error" + e);
        }

    }

    public void escribirObjeto(String direccion, Estudiante p1) {

        try {
            ObjectOutputStream escritorio = new ObjectOutputStream(new FileOutputStream(direccion));
            escritorio.writeObject(p1);                                                                  // input para leer Output para escribir en el objeto
            escritorio.close();
        } catch (Exception e) {
            System.out.println("se produjo un error en " + e);
        }
    }

    public void leerArchivo(String direccion) {
        try {
            ObjectInputStream lector = new ObjectInputStream(new FileInputStream(direccion));
            Object auxiliar = lector.readObject();
            Estudiante p1 = (Estudiante) auxiliar;
            System.out.println("leer direccion");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void escribirLista(String direccion, List<Estudiante> lista) {
        try {
            ObjectOutputStream escritorio = new ObjectOutputStream(new FileOutputStream(direccion));
            for (Estudiante estudiante : lista) {//POR CADA VEZ Q rrecorro la lista creo un objeto de la clase persdona
                escritorio.writeObject(estudiante);
            }
            escritorio.close();
        } catch (Exception e) {
            System.out.println("error" + e);

        }
    }

    public static void main(String[] args) {
        LeeryEscribir objeto = new LeeryEscribir();
        Estudiante p2=new Estudiante ("celio","alvarado",22,"quito",new Materia
        (" Ingles ",2,"oscar",new Carrera("Contabilidad2",5,2)));
        Estudiante p3=new Estudiante (" juan "," quiros ",23,"Pedrejal",new Materia
        (" fisica ",2,"jhon",new Carrera("Contabilidad3",5,2)));
           Estudiante p4=new Estudiante ("  luis "," poma ",24,"vilca",new Materia
        (" ciencias naturales ",2,"jhon",new Carrera("Contabilidad3",5,2)));
              Estudiante p5=new Estudiante (" David "," Flores ",27,"santana",new Materia
        (" matematicas ",2,"jhon",new Carrera("Contabilidad3",5,2)));
                Estudiante p6=new Estudiante (" javier "," Avendaño ",12,"el verjel",new Materia
        (" quimica ",2,"jhon",new Carrera("Contabilidad3",5,2)));
                  Estudiante p7=new Estudiante (" Gustavo "," Ruiz ",18,"",new Materia
        (" lengua y literatura ",2,"jhon",new Carrera("contabilidad3",5,2)));
                    Estudiante p8=new Estudiante (" ricardo "," poma ",29," retorno ",new Materia
        (" biologia ",2,"jhon",new Carrera("Contabilidad3 ",5,2)));
                      Estudiante p9=new Estudiante (" Josue "," Urguiles ",31,"El porvenir ",new Materia
        (" computacion ",2,"jhon",new Carrera("Contabilidad3",5,2)));
                        Estudiante p10=new Estudiante (" Rafael "," Castro ",20," Belen",new Materia
        (" quimica ",2,"jhon",new Carrera("Contabilidad3 ",5,2)));
                          Estudiante p11=new Estudiante (" rolando "," Gonzalez ",19," santa cruz ",new Materia
        (" Matematicas3 ",2,"jhon",new Carrera("Contabilidad3",5,2)));



        List<Estudiante> Lista = new ArrayList<>();

        Lista.add(p2);
        Lista.add(p3);
        Lista.add(p4);
       Lista.add(p5);
       Lista.add(p6);
         Lista.add(p7);
        Lista.add(p8);
        Lista.add(p9);
       Lista.add(p10);
       Lista.add(p11);
        int a = Lista.size();// numero de listas
        System.out.println(" numero de listas"+a);
     for (Estudiante estudiante : Lista) {// imporimo los nombres de la lista
       //  Estudiante p1=new Estudiante ("Vicente","Luzuriaga",22,"El Sauce",new Materia
       // ("Matematicas",2,"jhon",new Carrera("Contabilidad",5,2)));

          System.out.println(estudiante.getMateria().getNombre()+"Nombre "+estudiante.getNombre()+" Apellido "+ estudiante.getApellido()+" edad "+ estudiante.getEdad()+" Direccion "+estudiante.getDireccion()+" Materia"+" Creditos "+estudiante.getMateria().getCreditos()+" Docente "+estudiante.getMateria().getDocente()+" Carrera "+estudiante.getMateria().getCarrera().getNombre()
                  +" Ciclos "+estudiante.getMateria().getCarrera().getNumerCiclos()+"  Numero de creditos"+estudiante.getMateria().getCarrera().getNumeroCreditos());
                     
//        }
//        System.out.println(Lista.size());
       objeto.escribirLista("‪‪C:\\Users\\ISTLOJA V\\Desktop\\ejenplo.txt", Lista);

      // objeto.escribirObjeto("C:\\Users\\USUARIO\\Desktop\\ejemplo.txt", p2);
        //objeto.leerArchivo("C:\\Users\\ist loja\\Desktop\\\\ejemplo.txt");
        //objeto.leerLista("C:\\Users\\USUARIO\\Desktop\\ejemplo.txt");
      //  List<Estudiante> b=objeto.leerPersonas("C:\\Users\\USUARIO\\Desktop\\ejemplo.txt");
        //for (Estudiante estudiante : b) {
           // System.out.println("edades "+ p2.getNombre());

        }

    }
}

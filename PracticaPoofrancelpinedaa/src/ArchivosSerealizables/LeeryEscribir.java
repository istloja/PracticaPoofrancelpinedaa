/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArchivosSerealizables;

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
     public void leerArchivos(String direccion) {
        try{
        ObjectInputStream lector=new ObjectInputStream(new FileInputStream(direccion));
        Object Auxiliar =lector.readObject();
        Jugador p1 =(Jugador) Auxiliar;
            System.out.println(p1.getJugador().getNombre()+" su edad es "+p1.getJugador().getEdad());
    }
        catch (Exception e){
            System.out.println(e);
            
        }
    }
     public void escribirObjeto(String direccion,Jugador p1){
        try{
        ObjectOutputStream escritor=new  ObjectOutputStream( new FileOutputStream(direccion));
        escritor.writeObject(p1);
        escritor.close();
        }
        catch(Exception e){ 
            System.out.println("se produjo un error"+e);
            
        }
         
       }
       public void escribirlista(String direccion, List<Jugador> lista){
        try{
        ObjectOutputStream escritor=new  ObjectOutputStream( new FileOutputStream(direccion));
            for (Jugador jugador : lista) {
                escritor.writeObject(jugador);
            }
 escritor.close();
        }catch (Exception e){
            System.out.println("se ha producido un error"+e);
        }
    }
     public static void main(String[] args) {
         LeeryEscribir objeto=new LeeryEscribir();
jugador j1 = new jugador("Cristiano","Ronaldo",33,520,2005 , new Equipo("Juventus",20,"Turin"));
Jugador j2 = new jugador("Lionel","messi",31,600,2007 , new Equipo("Barcelona",230,"Barcelona"));
Jugador j3 = new jugador("Neymar","Jr",28,200,2011 , new Equipo("PSG",10,"Paris"));
Jugador j4 = new jugador("Eden","Hazard",27,1598,2010 , new Equipo("REAL MADRID",40,"Madrid"));
List<Jugador> Lj= new ArrayList<>();
Lj.add(j1);
Lj.add(j2);
Lj.add(j3);
Lj.add(j4);
  
int a= Lj.size();
         System.out.println(a);
         objeto.EscribirLista("‪C:\\Users\\ISTLOJA V\\Desktop\\ejenplo.txt", Lj);

         int EdadMinima;
         
        
    }    
    

  public int edadMayor(List<jugador> Lista){
int edadmayor=Lista.getClass(0).getEdad();
for (Jugador jugador :Lista);
      System.out.println("el valor mayor es"+edadmayor+"la edad del objeto es"+jugador.getEdad());
      if (jugador.getEdad()> edadmayor){
          edadmayor =jugador.getEdad();
          
         
  return edadmayor;

}
  }
}
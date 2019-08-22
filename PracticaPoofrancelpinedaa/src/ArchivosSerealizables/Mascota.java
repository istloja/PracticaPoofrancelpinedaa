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
public class Mascota {
   private String nombre;
   private int edad;
   private int NumerodePatas;

    public Mascota() {
    }

    public Mascota(String nombre, int edad, int NumerodePatas) {
        this.nombre = nombre;
        this.edad = edad;
        this.NumerodePatas = NumerodePatas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getNumerodePatas() {
        return NumerodePatas;
    }

    public void setNumerodePatas(int NumerodePatas) {
        this.NumerodePatas = NumerodePatas;
    }
    public static void main(String[] args) {
       
       Mascota objeto=new Mascota ();   
        objeto.setNombre("rex");
        objeto.setEdad(2);
        objeto.setNumerodePatas(4);
        System.out.println(objeto.getNombre());
        System.out.println(objeto.getEdad());
        System.out.println(objeto.getNumerodePatas());
        
        
}
}
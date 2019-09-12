/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BasedeDatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author ISTLOJA V
 */
public class ConexionBasica {

    private void leer(String usuario, String clave) {
        try {
            DriverManager.registerDriver(new org.gjt.mm.mysql.Driver());
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/persona?characterEncoding=latin1", usuario, clave);
            System.out.println(conexion.getCatalog());
            Statement variable = conexion.createStatement();
            ResultSet result = variable.executeQuery("select * from persona");
            while(result.next()){
                System.out.println(result.getString("nombre")+result.getString("apellido"));  
            }
        } catch (Exception e) {
            System.out.println("hubo error" + e);
        }

    }

    public static void main(String[] args) {
        ConexionBasica objeto = new ConexionBasica();
        objeto.leer("Francel", "1234");
    }
}

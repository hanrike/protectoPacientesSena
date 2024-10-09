package vista;

//importamos las librerias requeridas para realizar la conexion de la base de datos
import java.sql.Connection;
import java.sql.DriverManager;

//Creamos la clase o nombre del archivo que se llama en este caso Conexion
public class Conexion {
    private static Connection conn; //Creamos la variable de tipo connection
    
    //Creamos el metodo que nos va a establecer la conexion
    public static Connection getConexion(){ //este metodo devuelve un objeto de tipo connection
        try{ //Aqui controlamos cualquier excepcion que pueda ocurrir en el establecimiento de la base de datos
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/dbcitas","root","root");
        }catch (Exception e){
            System.out.println(e.toString());
            conn=null;
        }
        return conn;
    }
}
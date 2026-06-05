
package conexiones;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.Connection;

public class conexion_tabla {
    conexion_postgresql con=new conexion_postgresql();
    
    public void insertar(){
        try{
            Connection conexion = con.conectar();
            java.sql.Statement st = conexion.createStatement();
            /**String sql="insert into productos(id_producto, categoria_productos, nombre_productos, precio_productos, descripcion_productos)" values=();**/
        }
        catch (Exception e){}
    }
    
}


package conexiones;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class conexion_postgresql {
    Connection con = null;
    String url = "jdbc:postgresql://192.168.0.125:5432/sistema_inventario";
    String usu = "manu";
    String contra = "0011";
    
    public Connection conectar(){
        try{
           Class.forName("org.posgresql.Driver");
           DriverManager.getConnection(url,usu,contra);
           
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,"Error de conexion");
        }
    return con;
    }

 
}

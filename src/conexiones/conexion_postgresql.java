
package conexiones;
import java.sql.DriverManager;
import java.sql.Connection;
import javax.swing.JOptionPane;

public class conexion_postgresql {
    Connection con = null ;
    String url = "jdbc:postgresql://100.69.35.56:5432/sistema_inventario";
    String usuario = "manu";
    String contra = "0011";
    
    public Connection conectar(){
        try{
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection(url,usuario,contra);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error"+e, "Error", JOptionPane.ERROR_MESSAGE);
        }return con;
    
    }

}


package controladores;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import conexiones.conexion_postgresql;
import java.sql.SQLException;

public class dao_usuarios {
    conexion_postgresql conexion  = new conexion_postgresql();
    public boolean validacionUsuario(String usuario, String contra){
        String sql= "select * from usuarios where nombre_usuario = ? and contra_usuario = ?";
        try{
            Connection con = conexion.conectar();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, usuario);
            ps.setString(2, contra);
            
            ResultSet rs = ps.executeQuery();
            boolean existe = rs.next();
            
            rs.close();
            ps.close();
            con.close();
            
            return existe;
        }catch (Exception e){
            System.out.println(e.getMessage());
            return false;

        }
    }

}

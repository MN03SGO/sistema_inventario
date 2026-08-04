
package controladores;
import constructores.Categorias;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import conexiones.conexion_postgresql;
import java.sql.SQLException;
import java.sql.Connection;

import conexiones.conexion_postgresql;

public class dao_categoria {
    conexion_postgresql conexion = new conexion_postgresql();
    
    public boolean insertar_categoria(Categorias c){
       String sql = "insert into categoria(nombre_categoria, descripcion, estado) values (?,?,?)";
       try{
          Connection con = conexion.conectar();
          PreparedStatement ps = con.prepareStatement(sql);
          ps.setString(1, c.getNombre_categoria());
          ps.setString(2, c.getDescripcion());
          ps.setBoolean(3, c.isEstado());
          
          int filas = ps.executeUpdate();
          
          ps.close();
          con.close();
          
          
          return filas > 0 ;
       }catch(Exception e){
           e.printStackTrace();
           return false;
       }
    }
    
}

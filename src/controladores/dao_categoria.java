package controladores;

import constructores.Categorias;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import conexiones.conexion_postgresql;
import java.sql.SQLException;
import java.sql.Connection;

import conexiones.conexion_postgresql;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class dao_categoria {

    conexion_postgresql conexion = new conexion_postgresql();

    public boolean insertar_categoria(Categorias c) {
        String sql = "insert into categorias(nombre_categoria, estado) values (?,?)";
        try {
            Connection con = conexion.conectar();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, c.getNombre_categoria());
            ps.setBoolean(2, c.isEstado());

            int filas = ps.executeUpdate();

            ps.close();
            con.close();

            return filas > 0;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public List <Categorias> Listar(){
        List <Categorias> lista = new ArrayList<>();
        String sql = "Select * from categorias";
        //String sql = "select id_categoria, nombre_categoria, estado from categorias";
        
        try{
            Connection con = conexion.conectar();
            PreparedStatement  ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                Categorias c = new Categorias ();
                c.setId_categoria(rs.getInt("id_categoria"));
                c.setNombre_categoria(rs.getString("nombre_categoria"));
                c.setEstado(rs.getBoolean("estado"));

                lista.add(c) ;
            }
            rs.close();
            ps.close();
            con.close();  
        }catch(SQLException e){
            e.printStackTrace();
        }
        return lista;
        
    
    }
    
    //public boolean editar(){
      //  String sql = "insert into categorias(catego  ";
    
    
    
    
    


}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aprendiendojdbc;


import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author faibe
 */
public class AprendiendoJDBC {

    /**
     * @param args the command line arguments
     * @throws java.sql.SQLException
     */
    public static void main(String[] args) throws SQLException {
        Connection conexion = null;
        String url = "jdbc:mysql://localhost:3306/reto4?serverTimezone=UTC";
        String user = "root";
        String password = "fozuda2219";
        
        try{
            conexion  = DriverManager.getConnection(url, user, password);
            
            if(conexion != null){
                System.out.println("Conectado");
            }
            }catch (SQLException ex){
                ex.printStackTrace();
            }
        
//        INSERT
//        String sql = "INSERT INTO director (dir_nombre, dir_apellido, dir_nacionalidad) VALUES (?, ?, ?)";
//        PreparedStatement statement = conexion.prepareStatement(sql);
//        statement.setString(1, "Faiber");
//        statement.setString(2, "Barragan");
//        statement.setString(3, "Colombiana");
//        
//        int filasInsertadas =  statement.executeUpdate();
//        if (filasInsertadas > 0){
//            System.out.println("Inserción éxitosa");
//        }
        
//        QUERY
//        String sql = "SELECT * FROM director";
//        Statement statement = conexion.createStatement();
//        ResultSet result =  statement.executeQuery(sql);
//
//        int count = 0;
//
//        while (result.next()){
//            int id  = result.getInt(1);
//            String nombre = result.getString(2);
//            String apellido = result.getString(3);
//            String nacionalidad = result.getString(3);
//            System.out.println("Id: " + id + " nombre: "+nombre + " apellido: " + apellido +" Nacionalidad: "+nacionalidad);
//        }

        
//       String sql = "UPDATE director SET dir_nacionalidad=? WHERE dir_id=?";
//       PreparedStatement statement = conexion.prepareStatement(sql);
//       statement.setString(1, "EEUU");
//       statement.setInt(2, 6);
//       
//       int filasActualizadas = statement.executeUpdate();
//       if (filasActualizadas > 0){
//           System.out.println("El registro fue actualizado exitosamente");
//           
//       }

//        String sql = "DELETE FROM director WHERE dir_id=?";
//        PreparedStatement statement = conexion.prepareStatement(sql);
//        statement.setInt(1, 6);
//        int rowsDeleted = statement.executeUpdate();
//        if (rowsDeleted > 0) {
//            System.out.println("Borrado exitoso!");
//        }
       
        String sql2 = "SELECT * FROM director";
        PreparedStatement statement1 = conexion.prepareStatement(sql2);
        ResultSet result =  statement1.executeQuery(sql2);

        int count = 0;

        while (result.next()){
            int id  = result.getInt(1);
            String nombre = result.getString(2);
            String apellido = result.getString(3);
            String nacionalidad = result.getString(4);
            System.out.println("Id: " + id + " nombre: "+nombre + " apellido: " + apellido +" Nacionalidad: "+nacionalidad);
        }
        conexion.close();
       
       
       
        
    }
    
}

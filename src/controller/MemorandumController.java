/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Conexion;

/**
 * @Fecha: Martes 16 de Julio del 2024
 * @author Vite
 * @Descripción: Controlador del CRUD para los Memos
 */
public class MemorandumController {
    public Date fecha;
    public String memo, destino, asunto, departamento,autor;  
    private Conexion conn;
    private Connection connection;
    public PreparedStatement st;
    public ResultSet rs;
    
    public MemorandumController() {
        conn = new Conexion();
        connection = conn.establecerconexion();
    }
    
    public void Registro(Date fechaOrig, String memorando, String dirigido,String asunto,String area,String elabora){
        try {
            // Formatear la fecha
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String fecha = sdf.format(fechaOrig);

            String sql = "INSERT INTO memorandum (fecha, numMemo, nomDestino, asunto, departamento, autor) VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement guardar = connection.prepareStatement(sql);
            guardar.setString(1, fecha);
            guardar.setString(2, memorando);
            guardar.setString(3, dirigido);
            guardar.setString(4, asunto);
            guardar.setString(5, area);
            guardar.setString(6, elabora);
            guardar.executeUpdate();

            JOptionPane.showMessageDialog(null, "Datos guardados correctamente");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Datos no guardados correctamente: " + e.getMessage());
        }

    }
    public DefaultTableModel Mostrar(DefaultTableModel model){
        try{
        String sql = "select * from memorandum";
        st = connection.prepareStatement(sql);
        rs = st.executeQuery();
        String [] memos = new String [7];
        
        while (rs.next()){
            memos[0] = Integer.toString(rs.getInt("id"));
            memos[1] = rs.getString("fecha");
            memos[2] = rs.getString("numMemo");
            memos[3] = rs.getString("nomDestino");
            memos[4] = rs.getString("asunto");
            memos[5] = rs.getString("departamento");
            memos[6] = rs.getString("autor");
            
            model.addRow(memos);
        }
        }catch(SQLException e){
            System.out.println(e);
        } finally {
            // Cerrar recursos
            try {
                if (rs != null) rs.close();
                if (st != null) st.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                e.getMessage();
            }
        }
        return model;
    }
    
    
    public void Actualizar(Date fechaOrig, String memorando, String dirigido,String asunto,String area,String elabora){
        
    }
    public void Eliminar(String memorando){
        
    }
}

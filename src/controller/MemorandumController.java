/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import model.Conexion;

/**
 * @Fecha: Martes 16 de Julio del 2024
 * @author Vite
 * @Descripción: Controlador del CRUD para los Memos
 */
public class MemorandumController {
    public Date fecha;
    public String memo, destino, asunto, departamento,autor;
    public ArrayList registro;    
    private Conexion conn;
    private Connection connection;
    
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
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Datos no guardados correctamente: " + e.getMessage());
        }

    }
    public ArrayList Mostrar(){
        return registro;
    }
    public void Actualizar(Date fechaOrig, String memorando, String dirigido,String asunto,String area,String elabora){
        
    }
    public void Eliminar(String memorando){
        
    }
}

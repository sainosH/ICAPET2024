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

    private Connection connection;
    public MemorandumController() {
        this.connection = Conexion.establecerconexion();
    }

   public void Registro(Date fechaOrig, String memorando, String dirigido, String asunto, String area, String elabora) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String fecha = sdf.format(fechaOrig);

        String sql = "INSERT INTO memorandum (fecha, numMemo, nomDestino, asunto, departamento, autor) VALUES (?, ?, ?, ?, ?, ?)";
        try (PreparedStatement guardar = connection.prepareStatement(sql)) {
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

    public void Eliminar(int id) {
        String sql = "DELETE FROM memorandum WHERE id = ?";
        try (PreparedStatement eliminar = connection.prepareStatement(sql)) {
            eliminar.setInt(1, id);
            eliminar.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro eliminado correctamente");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo eliminar el registro: " + e.getMessage());
        }
    }

    public DefaultTableModel Mostrar(DefaultTableModel model) {
        String sql = "SELECT * FROM memorandum";
        try (PreparedStatement st = connection.prepareStatement(sql); ResultSet rs = st.executeQuery()) {
            model.setRowCount(0);
            String[] memos = new String[7];
            while (rs.next()) {
                memos[0] = Integer.toString(rs.getInt("id"));
                memos[1] = rs.getString("fecha");
                memos[2] = rs.getString("numMemo");
                memos[3] = rs.getString("nomDestino");
                memos[4] = rs.getString("asunto");
                memos[5] = rs.getString("departamento");
                memos[6] = rs.getString("autor");
                model.addRow(memos);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return model;
    }
   public void Actualizar(int id, Date fechaOrig, String memorando, String dirigido, String asunto, String area, String elabora) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String fecha = sdf.format(fechaOrig);

        String sql = "UPDATE memorandum SET fecha = ?, numMemo = ?, nomDestino = ?, asunto = ?, departamento = ?, autor = ? WHERE id = ?";
        try (PreparedStatement actualizar = connection.prepareStatement(sql)) {
            actualizar.setString(1, fecha);
            actualizar.setString(2, memorando);
            actualizar.setString(3, dirigido);
            actualizar.setString(4, asunto);
            actualizar.setString(5, area);
            actualizar.setString(6, elabora);
            actualizar.setInt(7, id);
            actualizar.executeUpdate();
            JOptionPane.showMessageDialog(null, "Datos actualizados correctamente");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Datos no actualizados correctamente: " + e.getMessage());
        }
    }
}
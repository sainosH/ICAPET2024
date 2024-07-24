package controller;

import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Conexion;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;
import java.io.FileOutputStream;
import java.io.IOException;

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

    public void Registro(Date fechaOrig, String memorando, String dirigido,
            String asunto, String area, String elabora, String observaciones) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String fecha = sdf.format(fechaOrig);

        String sql = "INSERT INTO memorandum (fecha, numMemo, nomDestino,"
                + " asunto, departamento, autor, observaciones) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement guardar = connection.prepareStatement(sql)) {
            guardar.setString(1, fecha);
            guardar.setString(2, memorando);
            guardar.setString(3, dirigido);
            guardar.setString(4, asunto);
            guardar.setString(5, area);
            guardar.setString(6, elabora);
            guardar.setString(7, observaciones);
            guardar.executeUpdate();
            JOptionPane.showMessageDialog(null, "Datos guardados correctamente");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Datos NO guardados correctamente, intente de nuevo.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void Eliminar(int id) {
        String sql = "DELETE FROM memorandum WHERE id = ?";
        try (PreparedStatement eliminar = connection.prepareStatement(sql)) {
            eliminar.setInt(1, id);
            eliminar.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro eliminado correctamente");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo eliminar el registro.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public DefaultTableModel Mostrar(DefaultTableModel model) {
        String sql = "SELECT * FROM memorandum";
        try (PreparedStatement st = connection.prepareStatement(sql); ResultSet rs = st.executeQuery()) {
            model.setRowCount(0);
            String[] memos = new String[8];
            while (rs.next()) {
                memos[0] = Integer.toString(rs.getInt("id"));
                memos[1] = rs.getString("fecha");
                memos[2] = rs.getString("numMemo");
                memos[3] = rs.getString("nomDestino");
                memos[4] = rs.getString("asunto");
                memos[5] = rs.getString("departamento");
                memos[6] = rs.getString("autor");
                memos[7] = rs.getString("observaciones");
                model.addRow(memos);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "Datos NO mostrados correctamente, reinicie la app.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        return model;
    }

    public void Actualizar(int id, Date fechaOrig, String memorando,
            String dirigido, String asunto, String area, String elabora,
            String observaciones) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String fecha = sdf.format(fechaOrig);

        String sql = "UPDATE memorandum SET fecha = ?, numMemo = ?, nomDestino ="
                + " ?, asunto = ?, departamento = ?, autor = ?, observaciones = "
                + "? WHERE id = ?";
        try (PreparedStatement actualizar = connection.prepareStatement(sql)) {
            actualizar.setString(1, fecha);
            actualizar.setString(2, memorando);
            actualizar.setString(3, dirigido);
            actualizar.setString(4, asunto);
            actualizar.setString(5, area);
            actualizar.setString(6, elabora);
            actualizar.setString(7, observaciones);
            actualizar.setInt(8, id);
            actualizar.executeUpdate();
            JOptionPane.showMessageDialog(null, "Datos actualizados correctamente");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Datos NO actualizados correctamente, intente de nuevo.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void generarDocumentoWord(String filePath, int id, String fecha,
            String numMemo, String dirigido, String asunto, String departamento,
            String elaborado, String observaciones) {
        XWPFDocument document = new XWPFDocument();
        XWPFParagraph paragraph = document.createParagraph();
        XWPFRun run = paragraph.createRun();

        run.setText("ID: " + id);
        run.addBreak();
        run.setText("Fecha: " + fecha);
        run.addBreak();
        run.setText("Número de Memorándum: " + numMemo);
        run.addBreak();
        run.setText("Dirigido a: " + dirigido);
        run.addBreak();
        run.setText("Asunto: " + asunto);
        run.addBreak();
        run.setText("Departamento: " + departamento);
        run.addBreak();
        run.setText("Elaborado por: " + elaborado);
        run.addBreak();
        run.setText("Observaciones: " + observaciones);

        // Guardar el documento en la ruta especificada
        try (FileOutputStream out = new FileOutputStream(filePath)) {
            document.write(out);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

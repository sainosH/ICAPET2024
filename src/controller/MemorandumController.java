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
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import org.apache.poi.xwpf.usermodel.ParagraphAlignment;

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
            JOptionPane.showMessageDialog(null, "Datos NO guardados correctamente,"
                    + " intente de nuevo.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void Eliminar(int id) {
        String sql = "DELETE FROM memorandum WHERE id = ?";
        try (PreparedStatement eliminar = connection.prepareStatement(sql)) {
            eliminar.setInt(1, id);
            eliminar.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro eliminado correctamente");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo eliminar el registro.",
                    "Error", JOptionPane.ERROR_MESSAGE);
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
            JOptionPane.showMessageDialog(null, "Datos NO mostrados correctamente,"
                    + " reinicie la app.", "Error", JOptionPane.ERROR_MESSAGE);
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
            JOptionPane.showMessageDialog(null, "Datos NO actualizados correctamente, "
                    + "intente de nuevo.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void generarDocumentoWord(String filePath, LocalDate fecha,
            String numMemo, String dirigido, String asunto, String departamento) {
        XWPFDocument document = new XWPFDocument();

        XWPFParagraph paragraph2 = document.createParagraph();
        paragraph2.setAlignment(ParagraphAlignment.CENTER);
        XWPFRun run6 = paragraph2.createRun();

        run6.setBold(true);
        run6.setText(" \"2024, BICENTENARIO DE LA INTEGRACION DE OAXACA A LA REPUBLICA MEXICANA\" ");
        
        run6.addBreak();

        XWPFParagraph paragraph1 = document.createParagraph();
        paragraph1.setAlignment(ParagraphAlignment.RIGHT);
        XWPFRun run1 = paragraph1.createRun();
        XWPFRun run2 = paragraph1.createRun();
        XWPFRun run3 = paragraph1.createRun();
        XWPFRun run4 = paragraph1.createRun();
        XWPFRun run5 = paragraph1.createRun();

        run1.setBold(true);
        run1.setText("ORIGEN: ");
        run2.setBold(false);
        run2.setText("UDC 189 MIAHUATLÁN DE PORFIRIO DÍAZ");
        run2.addBreak();
        run3.setBold(true);
        run3.setText("MEMORÁNDUM NO: " + numMemo.split("/")[1] + "/"
                + numMemo.split("/")[2] + "/20" + numMemo.split("/")[3]);
        run3.addBreak();
        run3.setText("ASUNTO: ");
        run4.setBold(false);
        run4.setText(asunto.toUpperCase());
        run4.addBreak();
        run4.addBreak();
        run5.setBold(true);
        run5.setText("Miahuatlán de Porfirio Díaz, Oax. "
                + fecha.format(DateTimeFormatter.ofPattern("dd 'de' MMMM 'de' yyyy",
                        new Locale("es", "ES"))));
        run5.addBreak();

        XWPFParagraph paragraph = document.createParagraph();
        XWPFRun run = paragraph.createRun();
        run.setBold(true);
        run.setText(dirigido.toUpperCase());
        run.addBreak();
        run.setText(departamento.toUpperCase());
        run.addBreak();

        // Guardar el documento en la ruta especificada
        try (FileOutputStream out = new FileOutputStream(filePath)) {
            document.write(out);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public ArrayList<String> RellenarCombo() {
        Set<String>destinos = new HashSet<>();
        String sql = "SELECT nomDestino FROM memorandum";
        try (PreparedStatement st = connection.prepareStatement(sql); ResultSet rs = st.executeQuery()) {
            String memos;
            while (rs.next()) {
                memos = rs.getString("nomDestino");
                destinos.add(memos);
            }
            //Agregar validación para no repetir registros
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "Datos NO mostrados correctamente,"
                    + " reinicie la app.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        return new ArrayList<>(destinos);
    }
}

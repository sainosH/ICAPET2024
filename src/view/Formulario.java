package view;

import java.util.Date;
import javax.swing.JOptionPane;
import controller.MemorandumController;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JTextField;
import java.text.SimpleDateFormat;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author Sainos
 */
public class Formulario extends javax.swing.JFrame {

    private MemorandumController memoController;
    public int id;

    public Formulario() {
        initComponents();
        setLocationRelativeTo(null);
        memoController = new MemorandumController();
        //setExtendedState(JFrame.MAXIMIZED_BOTH);

        // Cargar la imagen y establecerla en jLabel1
        ImageIcon icon = new ImageIcon(getClass().getResource("/icapet/memorandum/Log.png"));
        jLabel2.setIcon(icon);

        // Cambiar el color de fondo del panel
        jPanel1.setBackground(Color.decode("#5C152B")); // Cambia el valor hexadecimal al color deseado

        // Cambiar el color de fondo del panel
        jPanel2.setBackground(Color.decode("#FFFFFF")); // Cambia el valor hexadecimal al color deseado

    }
    
    //icon jframe
    @Override
    public Image getIconImage() {
        // Usa una ruta relativa para cargar el ícono
        Image icono = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/icapet/memorandum/logoGobierno2.png"));
        return icono;
    }

    public void prepararParaCrear() {
        btnGuardar.setEnabled(true);
        btnActualizar.setEnabled(false);
    }

    public void prepararParaActualizar() {
        btnGuardar.setEnabled(false);
        btnActualizar.setEnabled(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        btnActualizar = new javax.swing.JButton();
        jblFecha = new javax.swing.JLabel();
        jblMemorandum = new javax.swing.JLabel();
        jblDirigido = new javax.swing.JLabel();
        jblDepartamento = new javax.swing.JLabel();
        jblElaborado = new javax.swing.JLabel();
        jblAsunto = new javax.swing.JLabel();
        txtDirigido = new javax.swing.JTextField();
        jcbDepartamento = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtObservaciones = new javax.swing.JTextArea();
        jDate = new com.toedter.calendar.JDateChooser();
        jTextField1 = new javax.swing.JTextField();
        jSpinner1 = new javax.swing.JSpinner();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        txtElaborado = new javax.swing.JTextField();
        jblObservaciones = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAsunto = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());

        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        btnActualizar.setBackground(new java.awt.Color(93, 82, 39));
        btnActualizar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnActualizar.setForeground(new java.awt.Color(0, 153, 0));
        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icapet/memorandum/act.png"))); // NOI18N
        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        jblFecha.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jblFecha.setForeground(new java.awt.Color(255, 255, 255));
        jblFecha.setText("Fecha");

        jblMemorandum.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jblMemorandum.setForeground(new java.awt.Color(255, 255, 255));
        jblMemorandum.setText("Memorándum");

        jblDirigido.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jblDirigido.setForeground(new java.awt.Color(255, 255, 255));
        jblDirigido.setText("Dirigido a ");

        jblDepartamento.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jblDepartamento.setForeground(new java.awt.Color(255, 255, 255));
        jblDepartamento.setText("Área o Departamento");

        jblElaborado.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jblElaborado.setForeground(new java.awt.Color(255, 255, 255));
        jblElaborado.setText("Elaboró");

        jblAsunto.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jblAsunto.setForeground(new java.awt.Color(255, 255, 255));
        jblAsunto.setText("Asunto");

        txtDirigido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDirigidoActionPerformed(evt);
            }
        });

        jcbDepartamento.setEditable(true);
        jcbDepartamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "RH", "DTA", "INCAPET", "OK" }));
        jcbDepartamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbDepartamentoActionPerformed(evt);
            }
        });

        txtObservaciones.setColumns(20);
        txtObservaciones.setRows(5);
        jScrollPane1.setViewportView(txtObservaciones);

        jTextField1.setEditable(false);
        jTextField1.setText("MEMO/UDC189/");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jSpinner1.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        btnGuardar.setBackground(new java.awt.Color(93, 82, 39));
        btnGuardar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icapet/memorandum/gua.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnCancelar.setBackground(new java.awt.Color(93, 82, 39));
        btnCancelar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 0, 0));
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icapet/memorandum/cerrar.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        txtElaborado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtElaboradoActionPerformed(evt);
            }
        });

        jblObservaciones.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jblObservaciones.setForeground(new java.awt.Color(255, 255, 255));
        jblObservaciones.setText("Observaciones");

        txtAsunto.setColumns(20);
        txtAsunto.setRows(5);
        jScrollPane2.setViewportView(txtAsunto);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jblFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jblMemorandum, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jblDirigido, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jblAsunto, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jblDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jblElaborado, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jblObservaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(80, 80, 80)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addGap(242, 242, 242))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(241, 241, 241))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtElaborado, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jcbDepartamento, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(50, 50, 50))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtDirigido, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(49, 49, 49)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jblFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDate, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jblMemorandum, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jblDirigido, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDirigido, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jblAsunto, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jblDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcbDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtElaborado, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jblElaborado, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(btnActualizar)
                        .addGap(78, 78, 78)
                        .addComponent(btnGuardar)
                        .addGap(77, 77, 77)
                        .addComponent(btnCancelar)))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jblObservaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(94, Short.MAX_VALUE))
        );

        jPanel2.setForeground(new java.awt.Color(93, 20, 43));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(93, 20, 43));
        jLabel1.setText("PRODUCTIVIDAD PARA EL DESARROLLO DE TRABAJO");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(191, 142, 89));
        jLabel3.setText("INSTITUTO DE CAPACITACION Y PRODUCTIVIDAD PARA TRABAJO");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 769, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap(157, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 769, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(57, 57, 57))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(32, 32, 32)
                    .addComponent(jLabel1)
                    .addContainerGap(81, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtElaboradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtElaboradoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtElaboradoActionPerformed

    private void jcbDepartamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbDepartamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbDepartamentoActionPerformed

    private void txtDirigidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDirigidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDirigidoActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        // TODO add your handling code here:
        try {
            String nombre = txtElaborado.getText();
            String dirigido = txtDirigido.getText();
            String asunto = txtAsunto.getText();
            String departamento = jcbDepartamento.getSelectedItem().toString();
            String observaciones = txtObservaciones.getText();

            // Obtener la fecha
            Date date = jDate.getDate();
            SimpleDateFormat sdfYear = new SimpleDateFormat("yy"); // Formato para obtener los últimos dos dígitos del año
            String shortYear = sdfYear.format(date);
            String numMemo = jTextField1.getText() + jSpinner1.getValue().toString() + "/" + shortYear;

            // Llamar al método Registro del controlador
            memoController.Actualizar(id, date, numMemo, dirigido, asunto, departamento, nombre, observaciones);
            //JOptionPane.showMessageDialog(null, "Datos actualizados correctamente");

            // Regresar a la pantalla de registros
            volverARegistros();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Datos no guardados correctamente: " + e.getMessage());
        }

    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        try {
            String nombre = txtElaborado.getText();
            String dirigido = txtDirigido.getText();
            String asunto = txtAsunto.getText();
            String departamento = jcbDepartamento.getSelectedItem().toString(); 
            String observaciones = txtObservaciones.getText();
            

            // Obtener la fecha
            Date date = jDate.getDate();
            SimpleDateFormat sdfYear = new SimpleDateFormat("yy"); // Formato para obtener los últimos dos dígitos del año
            String shortYear = sdfYear.format(date);
            String numMemo = jTextField1.getText() + jSpinner1.getValue().toString() + "/" + shortYear;

            // Llamar al método Registro del controlador
            memoController.Registro(date, numMemo, dirigido, asunto, departamento, nombre, observaciones);
            //JOptionPane.showMessageDialog(null, "Datos guardados correctamente");

            // Regresar a la pantalla de registros
            volverARegistros();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Datos no actualizados correctamente: " + e.getMessage());
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        volverARegistros();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void volverARegistros() {
        Registros registros = new Registros();
        registros.setVisible(true);
        this.dispose();
    }

    public void configurarParaNuevoRegistro() {
        btnActualizar.setEnabled(false);
        btnGuardar.setEnabled(true);
    }

    public void configurarParaEdicion() {
        btnActualizar.setEnabled(true);
        btnGuardar.setEnabled(false);
    }

    public void rellenarCampos(int idr, Date fecha, String numMemo, String dirigido, String asunto, String departamento, String elaborado, String observaciones) {
        id = idr;
        jDate.setDate(fecha);
        jTextField1.setText(numMemo.split("/")[0] + "/" + numMemo.split("/")[1] + "/"); // Asumiendo que numMemo tiene el formato "MEMO/UDC189/<numero>/<año>"
        jSpinner1.setValue(Integer.parseInt(numMemo.split("/")[2]));
        txtDirigido.setText(dirigido);
        txtAsunto.setText(asunto);
        jcbDepartamento.setSelectedItem(departamento);
        txtElaborado.setText(elaborado);
        txtObservaciones.setText(observaciones);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Formulario.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Formulario.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Formulario.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Formulario.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Formulario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private com.toedter.calendar.JDateChooser jDate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel jblAsunto;
    private javax.swing.JLabel jblDepartamento;
    private javax.swing.JLabel jblDirigido;
    private javax.swing.JLabel jblElaborado;
    private javax.swing.JLabel jblFecha;
    private javax.swing.JLabel jblMemorandum;
    private javax.swing.JLabel jblObservaciones;
    private javax.swing.JComboBox<String> jcbDepartamento;
    private javax.swing.JTextArea txtAsunto;
    private javax.swing.JTextField txtDirigido;
    private javax.swing.JTextField txtElaborado;
    private javax.swing.JTextArea txtObservaciones;
    // End of variables declaration//GEN-END:variables
}

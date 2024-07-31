package view;

import controller.MemorandumController;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableRowSorter;
import java.io.File;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Sainos & Vite
 */
public class Registros extends javax.swing.JFrame {

    private MemorandumController memoController;
    private Formulario form;
    // Definir el TableRowSorter
    private TableRowSorter<DefaultTableModel> rowSorter;

    public Registros() {
        initComponents();
        setLocationRelativeTo(null);
        pack();

        // Hacer que el frame se ajuste al tamaño de la pantalla
        setExtendedState(JFrame.MAXIMIZED_BOTH);

        // Configurar el tamaño fijo de la ventana
        //setSize(1400, 850); // Ajusta estas dimensiones a tus necesidades [691, 404] [1513, 927]
        setResizable(false);
        memoController = new MemorandumController();
        form = new Formulario();
        jTable1.setFont(new Font("Nunito", Font.PLAIN, 14)); // Cambia el tamaño según necesites
        jTable1.setRowHeight(25); // Ajustar la altura de las filas para acomodar el nuevo tamaño de fuente

        cargarDatos();
        // Cargar la imagen y establecerla en jLabel1
        ImageIcon icon = new ImageIcon(getClass()
                .getResource("/icapet/memorandum/Log.png"));
        jLabel1.setIcon(icon);
        // Cambiar el color de fondo del panel
        jPanel1.setBackground(Color.decode("#5C152B"));
        // Cambiar el color de fondo del panel
        jPanel2.setBackground(Color.decode("#FFFFFF"));

        ArrayList<String> departamento = memoController.RellenarCombo("departamento");
        for (String x : departamento) {
            jcbFiltro.addItem(x);
        }

        ArrayList<String> año = memoController.RellenarCombo("fecha");
        // Invertir la lista
        Collections.reverse(año);
        for (String x : año) {
            jcbAño.addItem(x);
        }
    }

    //icon jframe
    @Override
    public Image getIconImage() {
        // Usa una ruta relativa para cargar el ícono
        Image icono = Toolkit.getDefaultToolkit().getImage(getClass()
                .getResource("/icapet/memorandum/logoGobierno2.png"));
        return icono;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        EditarRegistro = new javax.swing.JButton();
        CrearRegistro = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btnWord = new javax.swing.JButton();
        jcbFiltro = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jcbAño = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtFiltro = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());

        jPanel1.setForeground(new java.awt.Color(0, 0, 0));

        jTable1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTable1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTable1.setForeground(new java.awt.Color(0, 0, 0));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Fecha", "# Memorandum", "Dirigido A", "Asunto", "Área/Departamento", "Elaboró", "Observaciones"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.getTableHeader().setReorderingAllowed(false);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setMinWidth(40);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(40);
            jTable1.getColumnModel().getColumn(0).setMaxWidth(40);
            jTable1.getColumnModel().getColumn(1).setMinWidth(90);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(90);
            jTable1.getColumnModel().getColumn(1).setMaxWidth(90);
            jTable1.getColumnModel().getColumn(2).setMinWidth(170);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(170);
            jTable1.getColumnModel().getColumn(2).setMaxWidth(170);
            jTable1.getColumnModel().getColumn(3).setMinWidth(260);
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(260);
            jTable1.getColumnModel().getColumn(3).setMaxWidth(260);
            jTable1.getColumnModel().getColumn(4).setMinWidth(170);
            jTable1.getColumnModel().getColumn(4).setPreferredWidth(170);
            jTable1.getColumnModel().getColumn(4).setMaxWidth(170);
            jTable1.getColumnModel().getColumn(5).setMinWidth(190);
            jTable1.getColumnModel().getColumn(5).setPreferredWidth(190);
            jTable1.getColumnModel().getColumn(5).setMaxWidth(190);
            jTable1.getColumnModel().getColumn(6).setMinWidth(110);
            jTable1.getColumnModel().getColumn(6).setPreferredWidth(110);
            jTable1.getColumnModel().getColumn(6).setMaxWidth(110);
            jTable1.getColumnModel().getColumn(7).setMinWidth(230);
            jTable1.getColumnModel().getColumn(7).setPreferredWidth(230);
            jTable1.getColumnModel().getColumn(7).setMaxWidth(230);
        }

        EditarRegistro.setBackground(new java.awt.Color(230, 212, 191));
        EditarRegistro.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        EditarRegistro.setForeground(new java.awt.Color(0, 153, 0));
        EditarRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icapet/memorandum/edi.png"))); // NOI18N
        EditarRegistro.setText("Editar     ");
        EditarRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarRegistroActionPerformed(evt);
            }
        });

        CrearRegistro.setBackground(new java.awt.Color(230, 212, 191));
        CrearRegistro.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        CrearRegistro.setForeground(new java.awt.Color(0, 102, 255));
        CrearRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icapet/memorandum/nuevo.png"))); // NOI18N
        CrearRegistro.setText("Nuevo    ");
        CrearRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrearRegistroActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(230, 212, 191));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 0, 0));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icapet/memorandum/eli.png"))); // NOI18N
        jButton1.setText("Eliminar   ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(230, 212, 191));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icapet/memorandum/cerrar.png"))); // NOI18N
        jButton2.setText("Cerrar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        btnWord.setBackground(new java.awt.Color(230, 212, 191));
        btnWord.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnWord.setForeground(new java.awt.Color(0, 0, 0));
        btnWord.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icapet/memorandum/word.png"))); // NOI18N
        btnWord.setText("Word");
        btnWord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWordActionPerformed(evt);
            }
        });

        jcbFiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Filtrar por año");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Filtrar por área/departamento");

        jcbAño.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1218, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(CrearRegistro)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(EditarRegistro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jcbFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jcbAño, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnWord, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)))
                .addContainerGap(287, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CrearRegistro)
                            .addComponent(jButton1)
                            .addComponent(EditarRegistro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(jcbFiltro))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton2)
                                    .addComponent(btnWord))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(4, 4, 4)
                                    .addComponent(jcbAño, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icapet/memorandum/bus.png"))); // NOI18N
        jLabel2.setText("Buscar");

        txtFiltro.setBackground(new java.awt.Color(153, 153, 153));
        txtFiltro.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtFiltro.setForeground(new java.awt.Color(0, 0, 0));
        txtFiltro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFiltroKeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(93, 20, 43));
        jLabel4.setText("PRODUCTIVIDAD PARA EL DESARROLLO DE TRABAJO");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(191, 142, 89));
        jLabel3.setText("INSTITUTO DE CAPACITACION Y PRODUCTIVIDAD PARA TRABAJO");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 769, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 769, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CrearRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrearRegistroActionPerformed
        //Formulario form = new Formulario();
        form.configurarParaNuevoRegistro(); // Configurar para nuevo registro
        form.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_CrearRegistroActionPerformed

    private void EditarRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarRegistroActionPerformed
        int selectedRow = jTable1.getSelectedRow();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            if (selectedRow >= 0) {
                // Obtén los datos de la fila seleccionada
                int idr = Integer.parseInt((String) jTable1.getValueAt(selectedRow, 0));
                String fecha = (String) jTable1.getValueAt(selectedRow, 1);
                Date fech = sdf.parse(fecha);
                String numMemo = (String) jTable1.getValueAt(selectedRow, 2);
                String dirigido = (String) jTable1.getValueAt(selectedRow, 3);
                String asunto = (String) jTable1.getValueAt(selectedRow, 4);
                String departamento = (String) jTable1.getValueAt(selectedRow, 5);
                String elaborado = (String) jTable1.getValueAt(selectedRow, 6);
                String observaciones = (String) jTable1.getValueAt(selectedRow, 7);
                // Crea una instancia del formulario y establece los datos
                form.rellenarCampos(idr, fech, numMemo, dirigido, asunto,
                        departamento, elaborado, observaciones);
                // Configurar para edición
                form.configurarParaEdicion();
                // Muestra el formulario
                form.setVisible(true);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Selecciona una fila para "
                        + "editar", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            e.getMessage();
        }
    }//GEN-LAST:event_EditarRegistroActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int fila = jTable1.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "No se ha seleccionado "
                    + "un registro", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            int id = Integer.parseInt(jTable1.getValueAt(fila, 0).toString());
            memoController.Eliminar(id);
            cargarDatos();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // Opciones personalizadas
        String[] options = {"Sí", "No"};
        // Mostrar un JOptionPane de confirmación
        int respuesta = JOptionPane.showOptionDialog(
                null,
                "¿Estás seguro de que deseas cerrar la aplicación?",
                "Confirmar cierre",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                options,
                options[0]
        );

        // Verificar la respuesta del usuario
        if (respuesta == JOptionPane.YES_OPTION) {
            // Cerrar la aplicación
            System.exit(0);
        }
    }//GEN-LAST:event_jButton2ActionPerformed


    private void txtFiltroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFiltroKeyTyped

    }//GEN-LAST:event_txtFiltroKeyTyped

    private void btnWordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWordActionPerformed
        int selectedRow = jTable1.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "No se ha seleccionado "
                    + "un registro", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        try {
            // Obtener los datos de la fila seleccionada
            LocalDate fecha = LocalDate.parse(jTable1.getValueAt(selectedRow, 1).toString());
            String numMemo = jTable1.getValueAt(selectedRow, 2).toString();
            String dirigido = jTable1.getValueAt(selectedRow, 3).toString();
            String asunto = jTable1.getValueAt(selectedRow, 4).toString();
            String departamento = jTable1.getValueAt(selectedRow, 5).toString();

            // Crear el JFileChooser para seleccionar la ubicación de guardado
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setDialogTitle("Guardar como");
            fileChooser.setFileFilter(new FileNameExtensionFilter("Documentos de Word (*.docx)", "docx"));
            int userSelection = fileChooser.showSaveDialog(this);
            if (userSelection == JFileChooser.APPROVE_OPTION) {
                File fileToSave = fileChooser.getSelectedFile();
                String filePath = fileToSave.getAbsolutePath();
                // Asegurar que el archivo tenga la extensión .docx
                if (!filePath.toLowerCase().endsWith(".docx")) {
                    filePath += ".docx";
                }
                // Llamar al método del controlador para generar el documento Word
                memoController.generarDocumentoWord(filePath, fecha, numMemo,
                        dirigido, asunto, departamento);
                // Confirmar al usuario que el archivo se ha guardado
                JOptionPane.showMessageDialog(this, "Documento Word guardado"
                        + " correctamente en: " + filePath);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al generar el documento"
                    + " Word: ", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btnWordActionPerformed

    private void cargarDatos() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        // Limpiar la tabla no se puedo eliminar el registro.
        model.setRowCount(0);
        memoController.Mostrar(model);
        /* Asegurarse de que el TableRowSorter se inicializa después de que
        se hayan cargado los datos.*/
        configurarFiltro();
        configurarFiltrojcb();
    }

    private void configurarFiltro() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        rowSorter = new TableRowSorter<>(model);
        jTable1.setRowSorter(rowSorter);
        txtFiltro.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent evt) {
                String text = txtFiltro.getText();
                if (text.trim().length() == 0) {
                    rowSorter.setRowFilter(null);
                } else {
                    rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + text));
                }
            }
        });
    }

    private void configurarFiltrojcb() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        rowSorter = new TableRowSorter<>(model);
        jTable1.setRowSorter(rowSorter);
        jcbFiltro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                String filtrado = jcbFiltro.getSelectedItem().toString();
                if (filtrado.trim().isEmpty()) {
                    rowSorter.setRowFilter(null);
                } else {
                    rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + filtrado));
                }
            }
        });
        jcbAño.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                String filtrado = jcbAño.getSelectedItem().toString();
                if (filtrado.trim().isEmpty()) {
                    rowSorter.setRowFilter(null);
                } else {
                    rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + filtrado));
                }
            }
        });
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Registros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registros().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CrearRegistro;
    private javax.swing.JButton EditarRegistro;
    private javax.swing.JButton btnWord;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JComboBox<String> jcbAño;
    private javax.swing.JComboBox<String> jcbFiltro;
    private javax.swing.JTextField txtFiltro;
    // End of variables declaration//GEN-END:variables
}

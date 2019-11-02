package vista;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import services.Archivo;

public class app extends javax.swing.JFrame {

    File archivo;
    File archivoTemporal;
    ProcessBuilder pb;

    public app() {
        initComponents();
        jfchooser.setDialogTitle("Seleccione un bat");
        FileFilter filtroBat = new FileNameExtensionFilter("Bacheros", "bat");
        jfchooser.setFileFilter(filtroBat);
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        inptTextoBat = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        outptBat = new javax.swing.JTextArea();
        jfchooser = new javax.swing.JFileChooser();
        btnGuardarBat = new javax.swing.JButton();
        btnCorrerBat = new javax.swing.JButton();
        outptNombreArchivo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnExportar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bits");
        setResizable(false);

        inptTextoBat.setColumns(20);
        inptTextoBat.setLineWrap(true);
        inptTextoBat.setRows(5);
        jScrollPane2.setViewportView(inptTextoBat);

        outptBat.setEditable(false);
        outptBat.setColumns(20);
        outptBat.setLineWrap(true);
        outptBat.setRows(5);
        jScrollPane1.setViewportView(outptBat);

        jfchooser.setAcceptAllFileFilterUsed(false);
        jfchooser.setDragEnabled(true);
        jfchooser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jfchooserActionPerformed(evt);
            }
        });

        btnGuardarBat.setText("Guardar");
        btnGuardarBat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarBatActionPerformed(evt);
            }
        });

        btnCorrerBat.setText("Ejecutar");
        btnCorrerBat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCorrerBatActionPerformed(evt);
            }
        });

        outptNombreArchivo.setEditable(false);
        outptNombreArchivo.setText("Ningún bat seleccionado");

        jLabel1.setText("Archivo");

        btnExportar.setText("Exportar");
        btnExportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(outptNombreArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCorrerBat, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnGuardarBat, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 448, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jfchooser, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExportar)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(outptNombreArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCorrerBat)
                            .addComponent(btnGuardarBat))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jfchooser, javax.swing.GroupLayout.PREFERRED_SIZE, 276, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnExportar))))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarBatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarBatActionPerformed
        try {
            if (archivo != null) {
                salvarArchivo();
                repaint();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnGuardarBatActionPerformed

    public void salvarArchivo() throws Exception {
        try {
            Archivo.salvarArchivo(archivo, inptTextoBat.getText());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void btnCorrerBatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCorrerBatActionPerformed
        if (archivoTemporal != null) {
            try {
                repaint();
                Archivo.leerEntradas(archivoTemporal, inptTextoBat.getText());
//                salvarArchivo();

                pb = new ProcessBuilder(archivoTemporal.getAbsolutePath());
                Process process = pb.start();
                BufferedReader reader = new BufferedReader(
                        new InputStreamReader(process.getInputStream()));

                outptBat.setText(null);
                repaint();

                String linea;
                while ((linea = reader.readLine()) != null) {
                    outptBat.append(linea + "\n");
                }
                repaint();

                process.destroy();
                reader.close();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        repaint();

    }//GEN-LAST:event_btnCorrerBatActionPerformed

    private void jfchooserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jfchooserActionPerformed

        archivo = jfchooser.getSelectedFile();

        if (archivo != null) {
            try {
                archivoTemporal = File.createTempFile(archivo.getName(), ".bat");
                outptNombreArchivo.setText(archivo.getName());
                inptTextoBat.setText(null);
                repaint();
                for (String linea : Files.readAllLines(archivo.toPath())) {
                    inptTextoBat.append(linea + "\n");
                }
                repaint();

            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }//GEN-LAST:event_jfchooserActionPerformed

    private void btnExportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportarActionPerformed
        try {
            JFileChooser jfchExportar = new JFileChooser(archivo);
            jfchExportar.setFileFilter(new FileNameExtensionFilter("Texto plano", "txt"));
            int estado = jfchExportar.showSaveDialog(jPanel1);
            if (estado == JFileChooser.APPROVE_OPTION) {
                Archivo.salvarArchivo(jfchExportar.getSelectedFile(), outptBat.getText());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnExportarActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(app.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>
        java.awt.EventQueue.invokeLater(() -> {
            new app().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCorrerBat;
    private javax.swing.JButton btnExportar;
    private javax.swing.JButton btnGuardarBat;
    private javax.swing.JTextArea inptTextoBat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JFileChooser jfchooser;
    private javax.swing.JTextArea outptBat;
    private javax.swing.JTextField outptNombreArchivo;
    // End of variables declaration//GEN-END:variables
}

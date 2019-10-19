package vista;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;

public class app extends javax.swing.JFrame {
    
    File archivo;
    JFileChooser jfchooser;
    ProcessBuilder pb;
    
    public app() {
        initComponents();
        jfchooser = new JFileChooser();
        jfchooser.setDialogTitle("Seleccione un bat");
        FileFilter filtroBat = new FileNameExtensionFilter("Bacheros", "bat");
        jfchooser.setFileFilter(filtroBat);
        this.setLocationRelativeTo(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        outptBat = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        inptTextoBat = new javax.swing.JTextArea();
        btnSeleccionarBat = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        outptNombreArchivo = new javax.swing.JTextField();
        btnGuardarBat = new javax.swing.JButton();
        btnCorrerBat = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bits");
        setResizable(false);

        outptBat.setEditable(false);
        outptBat.setColumns(20);
        outptBat.setRows(5);
        jScrollPane1.setViewportView(outptBat);

        inptTextoBat.setColumns(20);
        inptTextoBat.setRows(5);
        jScrollPane2.setViewportView(inptTextoBat);

        btnSeleccionarBat.setText("Abrir");
        btnSeleccionarBat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarBatActionPerformed(evt);
            }
        });

        jLabel1.setText("Archivo");

        outptNombreArchivo.setEditable(false);
        outptNombreArchivo.setText("Ningún bat seleccionado");

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCorrerBat, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                    .addComponent(btnGuardarBat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(btnSeleccionarBat)
                .addGap(124, 124, 124)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(outptNombreArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(283, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(24, 24, 24)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(326, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSeleccionarBat, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(outptNombreArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnCorrerBat)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnGuardarBat)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(75, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(7, 7, 7)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSeleccionarBatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarBatActionPerformed
        
        jfchooser.showOpenDialog(this);
        
        archivo = jfchooser.getSelectedFile();
        if (archivo != null) {
            try {
                outptNombreArchivo.setText(archivo.getName());
                
                String lineasBat = "";
                
                for (String linea : Files.readAllLines(archivo.toPath())) {
                    lineasBat += linea + "\n";
                }
                inptTextoBat.setText(lineasBat);
                repaint();
                
            } catch (Exception e) {
                e.printStackTrace();
            }
            
        }

    }//GEN-LAST:event_btnSeleccionarBatActionPerformed

    private void btnGuardarBatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarBatActionPerformed
        try {
            if (archivo != null) {
                salvarArchivo();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnGuardarBatActionPerformed
    
    public void salvarArchivo() throws Exception {
        try {
            repaint();
            BufferedWriter writer = Files
                    .newBufferedWriter(
                            archivo.toPath(),
                            StandardOpenOption.WRITE
                    );
            writer.write(inptTextoBat.getText());
            writer.flush();
            writer.close();
            repaint();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    

    private void btnCorrerBatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCorrerBatActionPerformed
        if (archivo != null) {
            try {
                salvarArchivo();
                outptBat.setText("");
                repaint();
                
                pb = new ProcessBuilder(archivo.getAbsolutePath());
                Process process = pb.start();
                
                BufferedReader reader = new BufferedReader(
                        new InputStreamReader(process.getInputStream()));
                
                String linea;
                while ((linea = reader.readLine()) != null) {
                    outptBat.setText(outptBat.getText() + "\n" + linea);
                }
                
                process.destroy();
                reader.close();
                
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        repaint();

    }//GEN-LAST:event_btnCorrerBatActionPerformed
    
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
    private javax.swing.JButton btnGuardarBat;
    private javax.swing.JToggleButton btnSeleccionarBat;
    private javax.swing.JTextArea inptTextoBat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea outptBat;
    private javax.swing.JTextField outptNombreArchivo;
    // End of variables declaration//GEN-END:variables
}

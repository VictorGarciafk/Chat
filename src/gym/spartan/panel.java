package gym.spartan;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
public class panel extends javax.swing.JFrame {
    
    public panel() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        txtNombre = new java.awt.TextField();
        label1 = new java.awt.Label();
        label5 = new java.awt.Label();
        txtEmail = new java.awt.TextField();
        label6 = new java.awt.Label();
        label8 = new java.awt.Label();
        BuEnviar = new javax.swing.JButton();
        txtContraseña = new javax.swing.JPasswordField();
        txtConfContraseña = new javax.swing.JPasswordField();
        jPanel2 = new javax.swing.JPanel();
        label14 = new java.awt.Label();
        txtCorreoExistente = new java.awt.TextField();
        label15 = new java.awt.Label();
        txtContraseñaExistente = new javax.swing.JPasswordField();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBounds(new java.awt.Rectangle(300, 0, 0, 0));
        setUndecorated(true);
        setSize(new java.awt.Dimension(750, 730));

        jTabbedPane1.setToolTipText("");
        jTabbedPane1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTabbedPane1.setName(""); // NOI18N

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtNombre.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 46, 287, -1));

        label1.setFont(new java.awt.Font("DialogInput", 1, 16)); // NOI18N
        label1.setText("Nombre:");
        jPanel1.add(label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 100, -1));

        label5.setFont(new java.awt.Font("DialogInput", 1, 16)); // NOI18N
        label5.setText("Alias:");
        jPanel1.add(label5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 130, -1));

        txtEmail.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        jPanel1.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 287, -1));

        label6.setFont(new java.awt.Font("DialogInput", 1, 16)); // NOI18N
        label6.setText("Contraseña:");
        jPanel1.add(label6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 114, -1));

        label8.setFont(new java.awt.Font("DialogInput", 1, 16)); // NOI18N
        label8.setText("Confirmar Contraseña:");
        jPanel1.add(label8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, -1));

        BuEnviar.setFont(new java.awt.Font("DialogInput", 1, 16)); // NOI18N
        BuEnviar.setText("Enviar");
        BuEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuEnviarActionPerformed(evt);
            }
        });
        jPanel1.add(BuEnviar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 50, 250, 75));

        txtContraseña.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        txtContraseña.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel1.add(txtContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 287, -1));

        txtConfContraseña.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        txtConfContraseña.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel1.add(txtConfContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 287, -1));

        jTabbedPane1.addTab("SIGN IN", jPanel1);

        jPanel2.setLayout(null);

        label14.setFont(new java.awt.Font("DialogInput", 1, 16)); // NOI18N
        label14.setText("Alias:");
        jPanel2.add(label14);
        label14.setBounds(320, 20, 130, 26);

        txtCorreoExistente.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        txtCorreoExistente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoExistenteActionPerformed(evt);
            }
        });
        jPanel2.add(txtCorreoExistente);
        txtCorreoExistente.setBounds(220, 60, 260, 24);

        label15.setFont(new java.awt.Font("DialogInput", 1, 16)); // NOI18N
        label15.setText("Contraseña");
        jPanel2.add(label15);
        label15.setBounds(310, 90, 114, 26);

        txtContraseñaExistente.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        txtContraseñaExistente.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel2.add(txtContraseñaExistente);
        txtContraseñaExistente.setBounds(220, 130, 260, 24);

        jButton2.setFont(new java.awt.Font("DialogInput", 1, 16)); // NOI18N
        jButton2.setText("SEND");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);
        jButton2.setBounds(220, 250, 260, 75);

        jTabbedPane1.addTab("LOG IN", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCorreoExistenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoExistenteActionPerformed

    }//GEN-LAST:event_txtCorreoExistenteActionPerformed

    private void BuEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuEnviarActionPerformed
        String nombre = txtNombre.getText();
        String email = txtEmail.getText();
        String contraseña = txtContraseña.getText();
        String confContraseña = txtConfContraseña.getText();
        if (nombre.equals("") ||  email.equals("") || contraseña.equals("") || confContraseña.equals("")) {
            ImageIcon Icon = new ImageIcon(panel.class.getResource("campos.gif"));
            JOptionPane.showMessageDialog(null, "YOU MUST FILL ALL THE FIELDS", "ERROR!",JOptionPane.ERROR_MESSAGE, Icon);          
        } else if (contraseña.equals(confContraseña)) {
            Archivos.guardarArchivosTxT(nombre, email, contraseña);
            
        } else {
            ImageIcon Icon = new ImageIcon(panel.class.getResource("coinciden.gif"));
            JOptionPane.showMessageDialog(null, "PASSWORDS DO NOT MATCH", "ERROR!", JOptionPane.ERROR_MESSAGE, Icon);
        }
    }//GEN-LAST:event_BuEnviarActionPerformed

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        char c = evt.getKeyChar();
        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z') && (c < ' ' || c > ' ')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String correo = txtCorreoExistente.getText();
        String contraseña = txtContraseñaExistente.getText();
        Archivos a = new Archivos();
        boolean verificar = a.leerCorreoYContraseña(contraseña, correo);
        if (verificar == true) {
            ImageIcon icon = new ImageIcon(panel.class.getResource("bienvenido.gif"));
            JOptionPane.showMessageDialog(null, "🏋 W E L C O M E! 🏋", "WELCOME! ",JOptionPane.ERROR_MESSAGE,icon);
            Cliente3 cliente = new Cliente3();
            cliente.CorrerCliente();
            close();
        } else {
            ImageIcon icon = new ImageIcon(panel.class.getResource("mal.gif"));
            JOptionPane.showMessageDialog(null, "☹ SOMETHING WENT WRONG, TRY AGAIN ☹", "ERROR!", JOptionPane.ERROR_MESSAGE, icon);
        }
    }//GEN-LAST:event_jButton2ActionPerformed
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new panel().setVisible(true);
                
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BuEnviar;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private java.awt.Label label1;
    private java.awt.Label label14;
    private java.awt.Label label15;
    private java.awt.Label label5;
    private java.awt.Label label6;
    private java.awt.Label label8;
    private javax.swing.JPasswordField txtConfContraseña;
    private javax.swing.JPasswordField txtContraseña;
    private javax.swing.JPasswordField txtContraseñaExistente;
    private java.awt.TextField txtCorreoExistente;
    private java.awt.TextField txtEmail;
    private java.awt.TextField txtNombre;
    // End of variables declaration//GEN-END:variables
    private void close() {
        WindowEvent winClosingEvent = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
    }
}
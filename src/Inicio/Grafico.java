
package Inicio;

import conexionsql.CConexion;
import javax.swing.JOptionPane;



public class Grafico extends javax.swing.JFrame {

    private MantenimientoRegistro mantenimientoRegistro;
    private MantenimientoLogin mantenimientoLogin;

    public Grafico() {
        initComponents();


        mantenimientoRegistro = new MantenimientoRegistro();
        mantenimientoLogin = new MantenimientoLogin(mantenimientoRegistro.getListaUsuarios());

        setLocationRelativeTo(null); 

        // Cargar la imagen con opacidad usando tu clase imagen
    



    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        jLabel3 = new javax.swing.JLabel();
        btnIniciar = new javax.swing.JButton();
        txtPass = new javax.swing.JPasswordField();
        txtDni = new javax.swing.JTextField();
        lblContraseña = new javax.swing.JLabel();
        lblDNI = new javax.swing.JLabel();
        lbltitle = new javax.swing.JLabel();
        btnRegistrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Inicio/LOGO SIN FONDO-fotor-bg-remover-2023061317137.png"))); // NOI18N
        escritorio.add(jLabel3);
        jLabel3.setBounds(20, 400, 580, 270);

        btnIniciar.setBackground(new java.awt.Color(255, 153, 153));
        btnIniciar.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        btnIniciar.setText("INICIAR");
        btnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarActionPerformed(evt);
            }
        });
        escritorio.add(btnIniciar);
        btnIniciar.setBounds(40, 350, 170, 50);

        txtPass.setBackground(new java.awt.Color(204, 204, 204));
        txtPass.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtPass.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txtPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPassActionPerformed(evt);
            }
        });
        escritorio.add(txtPass);
        txtPass.setBounds(40, 290, 560, 30);

        txtDni.setBackground(new java.awt.Color(204, 204, 204));
        txtDni.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtDni.setToolTipText("");
        txtDni.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txtDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDniActionPerformed(evt);
            }
        });
        escritorio.add(txtDni);
        txtDni.setBounds(40, 190, 560, 30);

        lblContraseña.setBackground(new java.awt.Color(204, 204, 204));
        lblContraseña.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 20)); // NOI18N
        lblContraseña.setForeground(new java.awt.Color(51, 51, 51));
        lblContraseña.setText("CONTRASEÑA:");
        escritorio.add(lblContraseña);
        lblContraseña.setBounds(40, 240, 140, 27);

        lblDNI.setBackground(new java.awt.Color(204, 255, 204));
        lblDNI.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 20)); // NOI18N
        lblDNI.setText("DNI:");
        escritorio.add(lblDNI);
        lblDNI.setBounds(40, 140, 50, 27);

        lbltitle.setFont(new java.awt.Font("Calibri", 1, 38)); // NOI18N
        lbltitle.setText("INICIAR SESIÓN");
        escritorio.add(lbltitle);
        lbltitle.setBounds(40, 90, 300, 50);

        btnRegistrar.setBackground(new java.awt.Color(255, 153, 153));
        btnRegistrar.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnRegistrar.setText("REGISTRAR");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        escritorio.add(btnRegistrar);
        btnRegistrar.setBounds(600, 0, 130, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Inicio/pink-city-axrrwccug0bw0o72 (1).png"))); // NOI18N
        escritorio.add(jLabel1);
        jLabel1.setBounds(740, 0, 460, 710);

        getContentPane().add(escritorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 1180, 710));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDniActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        frmRegistro fromR=new frmRegistro();
        escritorio.add(fromR);
        fromR.setVisible(true);    
// TODO add your handling code here:
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void txtPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPassActionPerformed

    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarActionPerformed
    String dni = txtDni.getText().trim();
    String contraseña = new String(txtPass.getPassword()).trim();
    FrmSesion fromR=new FrmSesion();
        escritorio.add(fromR);
        fromR.setVisible(true);

    if (dni.isEmpty() || contraseña.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Complete todos los campos");
        return;
    }

    //Usuario usuario = mantenimientoLogin.validarLogin(dni, contraseña);
        CConexion validarusuario=new CConexion();
        boolean usuario = validarusuario.verificarUsuario(dni, contraseña);

    if (usuario == true) {
        JOptionPane.showMessageDialog(this, "Bienvenido");
        this.dispose(); // cierra ventana login
        // Aquí puedes abrir el formulario principal del sistema
    } else {
        JOptionPane.showMessageDialog(this, "Usuario no registrado. Por favor, regístrese.");
    }        
    }//GEN-LAST:event_btnIniciarActionPerformed

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
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Grafico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Grafico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Grafico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Grafico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Grafico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIniciar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblContraseña;
    private javax.swing.JLabel lblDNI;
    private javax.swing.JLabel lbltitle;
    private javax.swing.JTextField txtDni;
    private javax.swing.JPasswordField txtPass;
    // End of variables declaration//GEN-END:variables
 

}

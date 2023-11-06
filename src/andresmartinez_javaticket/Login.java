package andresmartinez_javaticket;
import javax.swing.JOptionPane;
public final class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    public static String logged="";
    public static String contraLogged="";
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        LabelNombre = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        LabelNombre1 = new javax.swing.JLabel();
        contra = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Inicio de Sesion");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 21, 179, 46));

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LabelNombre.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 24)); // NOI18N
        LabelNombre.setForeground(new java.awt.Color(0, 0, 0));
        LabelNombre.setText("Contraseña");
        jPanel1.add(LabelNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 130, 30));

        nombre.setBackground(new java.awt.Color(255, 255, 255));
        nombre.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        nombre.setForeground(new java.awt.Color(0, 0, 0));
        nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreActionPerformed(evt);
            }
        });
        jPanel1.add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 170, 30));

        LabelNombre1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 24)); // NOI18N
        LabelNombre1.setForeground(new java.awt.Color(0, 0, 0));
        LabelNombre1.setText("Nombre");
        jPanel1.add(LabelNombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 100, 30));

        contra.setBackground(new java.awt.Color(255, 255, 255));
        contra.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        contra.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(contra, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, 170, 30));

        jButton1.setBackground(new java.awt.Color(0, 102, 102));
        jButton1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(153, 255, 255));
        jButton1.setText("Ingresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, 110, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(nada.contadorGlobal==0){
            Usuarios user=new Admin("admin","supersecreto");
            Usuarios.usernames.add(user);
            user.setAcceso("admin");
            user.setEdad(0);
            user.setNombreCompleto("UsuarioDefault");
            nada.contadorGlobal++;
            if(user.verificar(nombre.getText(), contra.getText(), 0)){
                logged=nombre.getText();
                contraLogged=contra.getText();
                MenuPrincipal menu= new MenuPrincipal();
                menu.setVisible(true);
                menu.setLocationRelativeTo(null);
                this.setVisible(false);
                nada.contadorGlobal++;
            }
            nada.contadorGlobal++;
            
        }else{
            Usuarios user=new Admin(nombre.getText(),contra.getText());
            if(nombre.getText().isEmpty() || contra.getText().isEmpty()){
                JOptionPane.showMessageDialog(this, "Favor llenar todas las casillas!");
            }else if(user.verificar(nombre.getText(), contra.getText(), 0)){
                logged=nombre.getText();
                contraLogged=contra.getText();
                MenuPrincipal menu= new MenuPrincipal();
                menu.setVisible(true);
                menu.setLocationRelativeTo(null);
                this.setVisible(false);
            }else{
            JOptionPane.showMessageDialog(this, "Usuario o contraseña incorrectos!");
            }
        }
         
        
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreActionPerformed
    }//GEN-LAST:event_nombreActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelNombre;
    private javax.swing.JLabel LabelNombre1;
    private javax.swing.JTextField contra;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nombre;
    // End of variables declaration//GEN-END:variables
}

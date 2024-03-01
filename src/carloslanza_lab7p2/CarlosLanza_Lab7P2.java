package carloslanza_lab7p2;

public class CarlosLanza_Lab7P2 extends javax.swing.JFrame {

    /**
     * Creates new form CarlosLanza_Lab7P2
     */
    public CarlosLanza_Lab7P2() {
        initComponents();
        cmd.setLocationRelativeTo(null);
        cmd.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cmd = new javax.swing.JDialog();
        bg_cmd = new javax.swing.JPanel();
        user_txt = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        user_TA = new javax.swing.JTextArea();

        cmd.setMaximumSize(new java.awt.Dimension(650, 400));
        cmd.setMinimumSize(new java.awt.Dimension(650, 400));

        bg_cmd.setBackground(new java.awt.Color(0, 0, 0));

        user_txt.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        user_txt.setForeground(new java.awt.Color(0, 204, 0));
        user_txt.setText("$master:");

        jScrollPane1.setBackground(new java.awt.Color(0, 0, 0));
        jScrollPane1.setBorder(null);

        user_TA.setBackground(new java.awt.Color(0, 0, 0));
        user_TA.setColumns(20);
        user_TA.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        user_TA.setForeground(new java.awt.Color(0, 204, 0));
        user_TA.setRows(5);
        user_TA.setBorder(null);
        user_TA.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jScrollPane1.setViewportView(user_TA);

        javax.swing.GroupLayout bg_cmdLayout = new javax.swing.GroupLayout(bg_cmd);
        bg_cmd.setLayout(bg_cmdLayout);
        bg_cmdLayout.setHorizontalGroup(
            bg_cmdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bg_cmdLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(user_txt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 552, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        bg_cmdLayout.setVerticalGroup(
            bg_cmdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bg_cmdLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(bg_cmdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(user_txt))
                .addContainerGap(306, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout cmdLayout = new javax.swing.GroupLayout(cmd.getContentPane());
        cmd.getContentPane().setLayout(cmdLayout);
        cmdLayout.setHorizontalGroup(
            cmdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg_cmd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        cmdLayout.setVerticalGroup(
            cmdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg_cmd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(CarlosLanza_Lab7P2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CarlosLanza_Lab7P2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CarlosLanza_Lab7P2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CarlosLanza_Lab7P2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CarlosLanza_Lab7P2().setVisible(true);
            }
        });
    }
    
    private void cargarTabla(String cmd) {
        String[] comandos = cmd.split(" ");
        if (comandos[0].equals("./load")) {
            
        } else {
            user_TA.setText("");
        }
    }
    
    private void ingresarProductos(String cmd) {
        String[] comandos = cmd.split(" ");
        if (comandos[0].equals("./create")) {
            
        } else {
            user_TA.setText("");
        }
    }
    
    private void limpiarTabla(String cmd) {
        if (cmd.equals("./clear")) {
            
        } else {
            user_TA.setText(" ");
        }
    }
    
    private void cargarArboles(String cmd) {
        if (cmd.equals("./refresh")) {
            
        } else {
            user_TA.setText(" ");
        }
    }
    
    public static boolean validarName(String name) {
        name = name.toUpperCase();
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) >= 65 && name.charAt(i) <= 90 || name.charAt(i) == 32) {
                return true;
            }
        }
        return false;
    }
    
    public static boolean validarCategory(int category) {
        return category >= 0 && category < 10;
    }
    
    public static boolean validarTresPosiciones(int aisle) {
        return aisle > 99 && aisle < 1000;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg_cmd;
    private javax.swing.JDialog cmd;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea user_TA;
    private javax.swing.JLabel user_txt;
    // End of variables declaration//GEN-END:variables
}
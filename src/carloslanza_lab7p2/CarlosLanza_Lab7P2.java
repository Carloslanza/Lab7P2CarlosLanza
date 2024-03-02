package carloslanza_lab7p2;

import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

public class CarlosLanza_Lab7P2 extends javax.swing.JFrame {

    /**
     * Creates new form CarlosLanza_Lab7P2
     */
    public CarlosLanza_Lab7P2() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pp_arbol = new javax.swing.JPopupMenu();
        loadFile_ppItem = new javax.swing.JMenuItem();
        refreshTrees_ppItem = new javax.swing.JMenuItem();
        pp_tabla = new javax.swing.JPopupMenu();
        clearTable_ppItem = new javax.swing.JMenuItem();
        cmd_tf = new javax.swing.JTextField();
        btn_enter = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btn_agregarRow = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        file_jmenu = new javax.swing.JMenu();
        newFile_menuItem = new javax.swing.JMenuItem();
        importFile_menuItem = new javax.swing.JMenuItem();
        window_jmenu = new javax.swing.JMenu();
        clear_jmenu = new javax.swing.JMenu();
        clearCMD_menuItem = new javax.swing.JMenuItem();
        clearTable_menuItem = new javax.swing.JMenuItem();
        refreshTree_menuItem = new javax.swing.JMenuItem();
        help_jmenu = new javax.swing.JMenu();
        productStruc_menuItem = new javax.swing.JMenuItem();
        commands_menuItem = new javax.swing.JMenuItem();

        loadFile_ppItem.setText("Load File");
        loadFile_ppItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadFile_ppItemActionPerformed(evt);
            }
        });
        pp_arbol.add(loadFile_ppItem);

        refreshTrees_ppItem.setText("Refresh Trees");
        refreshTrees_ppItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshTrees_ppItemActionPerformed(evt);
            }
        });
        pp_arbol.add(refreshTrees_ppItem);

        clearTable_ppItem.setText("Clear Table");
        clearTable_ppItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearTable_ppItemActionPerformed(evt);
            }
        });
        pp_tabla.add(clearTable_ppItem);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn_enter.setText("Enter");
        btn_enter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_enterMouseClicked(evt);
            }
        });

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("CSVs");
        jTree1.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jTree1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTree1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTree1);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null}
            },
            new String [] {
                "id", "name", "category", "price", "aisle", "bin"
            }
        ));
        jTable1.setShowVerticalLines(true);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        btn_agregarRow.setText("Agregar fila");
        btn_agregarRow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_agregarRowMouseClicked(evt);
            }
        });

        file_jmenu.setText("File");

        newFile_menuItem.setText("New File");
        newFile_menuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newFile_menuItemActionPerformed(evt);
            }
        });
        file_jmenu.add(newFile_menuItem);

        importFile_menuItem.setText("Import File");
        importFile_menuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                importFile_menuItemActionPerformed(evt);
            }
        });
        file_jmenu.add(importFile_menuItem);

        jMenuBar1.add(file_jmenu);

        window_jmenu.setText("Window");

        clear_jmenu.setText("Clear");

        clearCMD_menuItem.setText("Clear Command Line");
        clearCMD_menuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearCMD_menuItemActionPerformed(evt);
            }
        });
        clear_jmenu.add(clearCMD_menuItem);

        clearTable_menuItem.setText("Clear Table");
        clearTable_menuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearTable_menuItemActionPerformed(evt);
            }
        });
        clear_jmenu.add(clearTable_menuItem);

        window_jmenu.add(clear_jmenu);

        refreshTree_menuItem.setText("Refresh Tree");
        refreshTree_menuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshTree_menuItemActionPerformed(evt);
            }
        });
        window_jmenu.add(refreshTree_menuItem);

        jMenuBar1.add(window_jmenu);

        help_jmenu.setText("Help");

        productStruc_menuItem.setText("Product Structure");
        productStruc_menuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productStruc_menuItemActionPerformed(evt);
            }
        });
        help_jmenu.add(productStruc_menuItem);

        commands_menuItem.setText("Commands");
        commands_menuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                commands_menuItemActionPerformed(evt);
            }
        });
        help_jmenu.add(commands_menuItem);

        jMenuBar1.add(help_jmenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btn_agregarRow))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cmd_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 549, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_enter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_enter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(1, 1, 1))
                    .addComponent(cmd_tf, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_agregarRow)))
                .addGap(11, 11, 11))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_enterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_enterMouseClicked
        String cmd = cmd_tf.getText();
        String[] comandos = cmd.split(" ");
        
        try {
            switch (comandos[0]) {
                case "./load":
                    cargarTabla(comandos[1]);
                    break;
                case "./create":
                    if (comandos.length == 3) {
                        if (comandos[2].equals("-single")) {
                            ingresarProductos(comandos[1]);
                        }
                    } else {
                        JOptionPane.showMessageDialog(this, "¡Comando incompleto!");
                    }
                    break;
                case "./clear":
                    limpiarTabla();
                    break;
                case "./refresh":
                    cargarArboles();
                    break;
                default: {
                    JOptionPane.showMessageDialog(this, "Comando inválido");
                }
            }
        } catch(IOException e) {}
        
        cmd_tf.setText("");
    }//GEN-LAST:event_btn_enterMouseClicked

    private void jTree1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTree1MouseClicked
        if (evt.isMetaDown()) {
           pp_arbol.show(jTree1, evt.getX(), evt.getY());
        } else {
            int row = jTree1.getClosestRowForLocation(evt.getX(), evt.getY());
            jTree1.setSelectionRow(row);
            
            DefaultMutableTreeNode node = 
                    (DefaultMutableTreeNode)jTree1.getSelectionPath().getLastPathComponent();
            
            
            String path = "";
            for (AdministrarProductos csv : csvs) {
                if(csv.getArchivoNombre().equals(node.getUserObject())) {
                    path = csv.getArchivoNombre();
                }
            }
            try {
                cargarTabla(path);
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, "¡No se encontró el archivo!");
            }
            
        }
    }//GEN-LAST:event_jTree1MouseClicked

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        if (evt.isMetaDown()) {
            pp_tabla.show(jTable1, evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void commands_menuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_commands_menuItemActionPerformed
        String help = """
                      COMANDOS:
                      cargar archivo -> ./load {nombre}.txt
                      crear archivo -> ./create {nombre}.txt -single
                      limpiar tabla -> ./clear
                      cargar arbol -> ./refresh
                      """;
        JOptionPane.showMessageDialog(this, help);
    }//GEN-LAST:event_commands_menuItemActionPerformed

    private void productStruc_menuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productStruc_menuItemActionPerformed
        String help = """
                   (1) id = identificador
                   (2) name = nombre del producto
                   (3) category = categoría del producto (0-9)
                   (4) price = precio
                   (5) aisle = numero de pasillo
                   (6) bin = indica en que estante se encuentra el producto
                   """;
        JOptionPane.showMessageDialog(this, help);
    }//GEN-LAST:event_productStruc_menuItemActionPerformed

    private void clearCMD_menuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearCMD_menuItemActionPerformed
        cmd_tf.setText("");
    }//GEN-LAST:event_clearCMD_menuItemActionPerformed

    private void clearTable_menuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearTable_menuItemActionPerformed
        limpiarTabla();
    }//GEN-LAST:event_clearTable_menuItemActionPerformed

    private void refreshTree_menuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshTree_menuItemActionPerformed
        cargarArboles();
    }//GEN-LAST:event_refreshTree_menuItemActionPerformed

    private void newFile_menuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newFile_menuItemActionPerformed
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        try {
            if (model.getRowCount() > 0) {
               String nombre = JOptionPane.showInputDialog(this, "Ingrese el nombre del archivo: ");
               ingresarProductos(nombre);
            } else {
                JOptionPane.showMessageDialog(this, "¡La tabla está vacía!");
            }
        } catch (IOException ex) {}
    }//GEN-LAST:event_newFile_menuItemActionPerformed

    private void importFile_menuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_importFile_menuItemActionPerformed
        String texto = JOptionPane.showInputDialog(this, "Ingrese el archivo a importar: ");
            try {
                cargarTabla(texto + ".txt");
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, "¡No se encontró el archivo!");
            }
    }//GEN-LAST:event_importFile_menuItemActionPerformed

    private void clearTable_ppItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearTable_ppItemActionPerformed
        limpiarTabla();
    }//GEN-LAST:event_clearTable_ppItemActionPerformed

    private void refreshTrees_ppItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshTrees_ppItemActionPerformed
        cargarArboles();
    }//GEN-LAST:event_refreshTrees_ppItemActionPerformed

    private void loadFile_ppItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadFile_ppItemActionPerformed
        DefaultMutableTreeNode node = 
                (DefaultMutableTreeNode)jTree1.getSelectionPath().getLastPathComponent();
            
        if (node.getUserObject() instanceof AdministrarProductos csv) {
            try {
                ingresarProductos(csv.getArchivoNombre());
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, "¡No se encontró el archivo!");
            }
        }
    }//GEN-LAST:event_loadFile_ppItemActionPerformed

    private void btn_agregarRowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_agregarRowMouseClicked
        DefaultTableModel modelo = (DefaultTableModel)jTable1.getModel();
        Object[] rowData = {"","","","","",""};
        modelo.addRow(rowData);
        
        jTable1.setModel(modelo);
    }//GEN-LAST:event_btn_agregarRowMouseClicked

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
    
    private void cargarTabla(String file) throws IOException {
        AdministrarProductos adminProductos = new AdministrarProductos(file);
        adminProductos.cargarArchivo();
        
        ArrayList<Producto> productos = adminProductos.getProductos();
        
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        
        model.setRowCount(0);
        for (int i = 0; i < productos.size(); i++) {
            Producto producto = productos.get(i);
            Object[] rowData = {
                producto.getId(),
                producto.getName(),
                producto.getCategory(),
                producto.getPrice(),
                producto.getAisle(),
                producto.getBin()
            };
            model.addRow(rowData);
        }
        
        jTable1.setModel(model);
        csvs.add(adminProductos);
    }

    
    private void ingresarProductos(String nombre) throws IOException {
        ArrayList<Producto> productos = new ArrayList<>();
        AdministrarProductos adminProductos = new AdministrarProductos(nombre);
        
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        for (int i = 0; i < model.getRowCount(); i++) {
            Object[] rowData = new Object[6];
            for (int j = 0; j < model.getColumnCount(); j++) {
                rowData[j] = model.getValueAt(i, j);
            }
            Producto producto = validarProducto(rowData);
            if (producto != null) {
                productos.add(producto);
            }
        }
        
        if (!productos.isEmpty()) {
            adminProductos.setProductos(productos);
            adminProductos.escribirArchivo();

            csvs.add(adminProductos);

            JOptionPane.showMessageDialog(this, "¡Se ha guardado exitosamente!");
        } else {
            throw new IOException();
        }
    }
    
    private void limpiarTabla() {
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        model.setRowCount(0);
        Object[] rowData = {"","","","","",""};
        model.addRow(rowData);
        
        jTable1.setModel(model);
    }
    
    private void cargarArboles() {
        DefaultTreeModel modelo = (DefaultTreeModel)jTree1.getModel();
        DefaultMutableTreeNode raiz = (DefaultMutableTreeNode)modelo.getRoot();
        raiz.removeAllChildren();
        
        for (AdministrarProductos csv : csvs) {
            DefaultMutableTreeNode nodo = new DefaultMutableTreeNode(
                    csv.getArchivoNombre()
            );
            raiz.add(nodo);
        }
        
        modelo.reload();
    }
    
    public Producto validarProducto(Object[] atributos) {
        try {
            int id = Integer.parseInt((String)atributos[0]);
            String name = (String)atributos[1];
            int category = Integer.parseInt((String)atributos[2]);
            double price = Double.parseDouble((String)atributos[3]);
            int aisle = Integer.parseInt((String)atributos[4]);
            int bin = Integer.parseInt((String)atributos[5]);
            
            if (validarName(name) && validarCategory(category) && validarTresPosiciones(aisle)
                && validarTresPosiciones(bin) && price >= 0 && id > 0) {
                return new Producto(id, name, category, price, aisle, bin);
            } else {
                throw new Exception();
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "¡Hay un error en la tabla no se puede ingresar productos!");
        }
        
        return null;
    }
    
    public boolean validarName(String name) {
        name = name.toUpperCase();
        for (int i = 0; i < name.length(); i++) {
            if (!(name.charAt(i) >= 65 && name.charAt(i) <= 90 || name.charAt(i) == 32)) {
                return false;
            }
        }
        return true;
    }
    
    public boolean validarCategory(int category) {
        return category >= 0 && category < 10;
    }
    
    public boolean validarTresPosiciones(int numero) {
        return numero > 99 && numero < 1000;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_agregarRow;
    private javax.swing.JButton btn_enter;
    private javax.swing.JMenuItem clearCMD_menuItem;
    private javax.swing.JMenuItem clearTable_menuItem;
    private javax.swing.JMenuItem clearTable_ppItem;
    private javax.swing.JMenu clear_jmenu;
    private javax.swing.JTextField cmd_tf;
    private javax.swing.JMenuItem commands_menuItem;
    private javax.swing.JMenu file_jmenu;
    private javax.swing.JMenu help_jmenu;
    private javax.swing.JMenuItem importFile_menuItem;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTree jTree1;
    private javax.swing.JMenuItem loadFile_ppItem;
    private javax.swing.JMenuItem newFile_menuItem;
    private javax.swing.JPopupMenu pp_arbol;
    private javax.swing.JPopupMenu pp_tabla;
    private javax.swing.JMenuItem productStruc_menuItem;
    private javax.swing.JMenuItem refreshTree_menuItem;
    private javax.swing.JMenuItem refreshTrees_ppItem;
    private javax.swing.JMenu window_jmenu;
    // End of variables declaration//GEN-END:variables

    private static ArrayList<AdministrarProductos> csvs = new ArrayList<>();
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames;

import Classes.Ciudad;
import Classes.Pedidos;
import Methods.Arbol;
import Methods.Hashtable;
import Methods.Metodos;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Sebas
 */
public class Consults extends javax.swing.JFrame {

    Arbol arbol = Arbol.getInstance();
    Metodos met = Metodos.getInstance();
    Hashtable hash = Hashtable.getInstance();

    /**
     * Creates new form Consults
     */
    public Consults() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jPanel4 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        printDistancy = new javax.swing.JButton();
        printShortRuteTime = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        printProfundidadGrafo = new javax.swing.JButton();
        printAmplitudGrafo = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        printHashTable = new javax.swing.JButton();
        printTreeInOrden = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnBefore = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setViewportView(jList1);

        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel3.setText("Ruta de entrega");

        printDistancy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/distance.png"))); // NOI18N
        printDistancy.setText("Distancia");
        printDistancy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printDistancyActionPerformed(evt);
            }
        });

        printShortRuteTime.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/clock.png"))); // NOI18N
        printShortRuteTime.setText("Tiempo");
        printShortRuteTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printShortRuteTimeActionPerformed(evt);
            }
        });

        jLabel6.setText("Pedido ID");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(66, 66, 66))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(printDistancy)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(printShortRuteTime))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(13, 13, 13)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(printDistancy)
                    .addComponent(printShortRuteTime))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setText("Grafo");

        printProfundidadGrafo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/depth.png"))); // NOI18N
        printProfundidadGrafo.setText("Profundidad");
        printProfundidadGrafo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printProfundidadGrafoActionPerformed(evt);
            }
        });

        printAmplitudGrafo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/amplitude.png"))); // NOI18N
        printAmplitudGrafo.setText("Amplitud");
        printAmplitudGrafo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printAmplitudGrafoActionPerformed(evt);
            }
        });

        jLabel4.setText("Ciudad");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(printProfundidadGrafo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(printAmplitudGrafo))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(printProfundidadGrafo)
                    .addComponent(printAmplitudGrafo))
                .addContainerGap())
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        printHashTable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/hash.png"))); // NOI18N
        printHashTable.setText("Tabla hash");
        printHashTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printHashTableActionPerformed(evt);
            }
        });

        printTreeInOrden.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/tree.png"))); // NOI18N
        printTreeInOrden.setText("Árbol");
        printTreeInOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printTreeInOrdenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(printHashTable)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(printTreeInOrden)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(printHashTable)
                    .addComponent(printTreeInOrden))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jLabel1.setText("Consultas");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(jLabel1))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        btnBefore.setText("Atrás");
        btnBefore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBeforeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(btnBefore)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBefore)
                        .addGap(11, 11, 11))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 518, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBeforeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBeforeActionPerformed
        // TODO add your handling code here:
        MainFrame fr = new MainFrame();
        fr.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnBeforeActionPerformed

    private void printTreeInOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printTreeInOrdenActionPerformed
        // TODO add your handling code here:
        arbol.LISTMODEL.clear();
        arbol.LISTMODEL.addElement("                           PEDIDOS REGISTRADOS EN EL SISTEMA");
        arbol.imprimir(arbol.raiz);
        jList1.setModel(arbol.LISTMODEL);

    }//GEN-LAST:event_printTreeInOrdenActionPerformed

    private void printHashTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printHashTableActionPerformed
        // TODO add your handling code here:
        hash.LISTMODEL2.clear();;
        hash.print();
        jList1.setModel(hash.LISTMODEL2);
    }//GEN-LAST:event_printHashTableActionPerformed

    private void printProfundidadGrafoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printProfundidadGrafoActionPerformed
        // TODO add your handling code here:
        met.LISTMODEL.clear();
        met.quitarMarca();
        met.profundidad(met.buscar(jComboBox1.getSelectedItem().toString()));
        jList1.setModel(met.LISTMODEL);
    }//GEN-LAST:event_printProfundidadGrafoActionPerformed

    private void printAmplitudGrafoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printAmplitudGrafoActionPerformed
        // TODO add your handling code here:
        met.listModel.clear();
        met.quitarMarca();
        System.out.println(jComboBox1.getName());
        met.amplitud(met.buscar(jComboBox1.getSelectedItem().toString()));
        jList1.setModel(met.listModel);
    }//GEN-LAST:event_printAmplitudGrafoActionPerformed

    private void printDistancyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printDistancyActionPerformed
        // TODO add your handling code here:
        DefaultListModel<String> listModel = new DefaultListModel<>();
        met.rc = "";
        met.minRC = 0;
        met.velocidad = 0;
        met.existe = false;
        try {
            if (jTextField1.getText() != null) {
                arbol.variable=null;
                arbol.buscar(Integer.parseInt(jTextField1.getText()), arbol.raiz);
                if (arbol.variable != null) {
                    Pedidos pedido = arbol.variable;
                    met.rutaCortaDistancia(met.buscar(pedido.origen), met.buscar(pedido.destino), "", 0, 0, pedido);
                    if (met.existe) {
                        listModel.addElement("Ruta: " + met.rc);
                        listModel.addElement("Con una distancia mínima de: " + met.minRC + "km");
                        double cant = (met.minRC / met.velocidad) * 60;
                        listModel.addElement("Y con un tiempo de: " + cant + " mins");
                    }
                    jList1.setModel(listModel);
                } else {
                    JOptionPane.showMessageDialog(null, "Pedido no encontrado");
                }
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Favor ingresar un ID válido");
        }
    }//GEN-LAST:event_printDistancyActionPerformed

    private void printShortRuteTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printShortRuteTimeActionPerformed
        // TODO add your handling code here:
        DefaultListModel<String> listModel = new DefaultListModel<>();
        met.rc = "";
        met.minRC = 0;
        met.velocidad = 0;
        met.mintime=0;
        met.existe = false;
        try {
            if (jTextField1.getText() != null) {
                arbol.variable=null;
                arbol.buscar(Integer.parseInt(jTextField1.getText()), arbol.raiz);
                if (arbol.variable != null) {
                    Pedidos pedido = arbol.variable;
                    met.rutaCortaTiempo(met.buscar(pedido.origen), met.buscar(pedido.destino), "", 0, 0, pedido);
                    if (met.existe) {
                        listModel.addElement("Ruta: " + met.rc);
                        listModel.addElement("Con un tiempo mínimo de: " + met.mintime + " mins");
                        listModel.addElement("Y con una distancia de: " + met.minRC + "km");
                    }
                    jList1.setModel(listModel);
                } else {
                    JOptionPane.showMessageDialog(null, "Pedido no encontrado");
                }
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Favor ingresar un ID válido");
        }
    }//GEN-LAST:event_printShortRuteTimeActionPerformed

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
            java.util.logging.Logger.getLogger(Consults.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Consults.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Consults.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Consults.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Consults().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBefore;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton printAmplitudGrafo;
    private javax.swing.JButton printDistancy;
    private javax.swing.JButton printHashTable;
    private javax.swing.JButton printProfundidadGrafo;
    private javax.swing.JButton printShortRuteTime;
    private javax.swing.JButton printTreeInOrden;
    // End of variables declaration//GEN-END:variables

    public void llenarCombobox() {
        jComboBox1.removeAllItems();
        Ciudad aux = met.grafo;
        while (aux != null) {
            jComboBox1.addItem(aux.nombre);
            aux = aux.sigV;
        }
    }
}

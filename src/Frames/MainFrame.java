/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames;

import Classes.Ciudad;
import Methods.Metodos;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author Sebas
 */
public class MainFrame extends javax.swing.JFrame {

    private CanvasController canvas;
    Metodos met = Metodos.getInstance();
    /**
     * 
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
        
        
        
        int height = this.canvasContainer.getHeight();
        int width = this.canvasContainer.getWidth();
        this.canvas = new CanvasController(width, height);
        
        this.canvas.addMouseListener(new java.awt.event.MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {
                canvas.mouseClicked(e);
            }

            @Override
            public void mousePressed(MouseEvent e) {
                canvas.mousePressed(e);
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                canvas.mouseReleased(e);
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                canvas.mouseEntered(e);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                canvas.mouseExited(e);
            }

        });
        this.canvasContainer.add(this.canvas);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        canvas1 = new java.awt.Canvas();
        canvasContainer = new javax.swing.JPanel();
        btnAddCity = new javax.swing.JButton();
        btnAddPath = new javax.swing.JButton();
        btnAddOrder = new javax.swing.JButton();
        btnAddUser = new javax.swing.JButton();
        btnConsult = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout canvasContainerLayout = new javax.swing.GroupLayout(canvasContainer);
        canvasContainer.setLayout(canvasContainerLayout);
        canvasContainerLayout.setHorizontalGroup(
            canvasContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 738, Short.MAX_VALUE)
        );
        canvasContainerLayout.setVerticalGroup(
            canvasContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        btnAddCity.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/city.png"))); // NOI18N
        btnAddCity.setText("Gestionar Ciudad");
        btnAddCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddCityaddVertex(evt);
            }
        });

        btnAddPath.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/road.png"))); // NOI18N
        btnAddPath.setText("Gestionar Camino");
        btnAddPath.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddPathaddArc(evt);
            }
        });

        btnAddOrder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/order.png"))); // NOI18N
        btnAddOrder.setText("Gestionar Pedido");
        btnAddOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddOrderActionPerformed(evt);
            }
        });

        btnAddUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/driver.png"))); // NOI18N
        btnAddUser.setText("Gestionar Usuario");
        btnAddUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddUserActionPerformed(evt);
            }
        });

        btnConsult.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Consult.png"))); // NOI18N
        btnConsult.setText("Consultas");
        btnConsult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(canvasContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(canvas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAddCity)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAddPath)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAddOrder)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAddUser)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnConsult)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(269, 269, 269)
                .addComponent(canvas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(256, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddPath)
                    .addComponent(btnAddCity)
                    .addComponent(btnAddOrder)
                    .addComponent(btnAddUser)
                    .addComponent(btnConsult))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(canvasContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddCityaddVertex(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCityaddVertex
        Ciudades fr = new Ciudades();
        fr.llenarCombobox();
        fr.setVisible(true);
        dispose();
        //this.canvas.setTempName(name);
    }//GEN-LAST:event_btnAddCityaddVertex

    private void btnAddPathaddArc(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddPathaddArc
        Caminos fr = new Caminos();
        fr.llenarCombobox();
        fr.setVisible(true);
        dispose();
        //met.insertarArco(origen, destino, distancia, pasoVehiculosPesados, velMax, peso);

    }//GEN-LAST:event_btnAddPathaddArc

    private void btnAddOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddOrderActionPerformed
        // TODO add your handling code here:
        pedidos fr = new pedidos();//Crear el FramePedido XD
        fr.setVisible(true);//Muestre el FramePedido
        dispose();//Eliminar el Frame actual
    }//GEN-LAST:event_btnAddOrderActionPerformed

    private void btnAddUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddUserActionPerformed
        // TODO add your handling code here:
        UsersFrame fr = new UsersFrame();
        fr.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnAddUserActionPerformed

    private void btnConsultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultActionPerformed
        // TODO add your handling code here:
        Consults fr = new Consults();
        fr.llenarCombobox();
        fr.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnConsultActionPerformed

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddCity;
    private javax.swing.JButton btnAddOrder;
    private javax.swing.JButton btnAddPath;
    private javax.swing.JButton btnAddUser;
    private javax.swing.JButton btnConsult;
    private java.awt.Canvas canvas1;
    private javax.swing.JPanel canvasContainer;
    // End of variables declaration//GEN-END:variables
}

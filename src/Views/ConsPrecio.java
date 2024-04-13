/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import Entidades.Producto;
import java.awt.event.KeyEvent;
import java.util.TreeSet;
import java.util.Vector;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author carba
 */
public class ConsPrecio extends javax.swing.JInternalFrame {

    private TreeSet<Producto> productos;
    private DefaultTableModel modelo = new DefaultTableModel();

    public ConsPrecio(TreeSet<Producto> productos) {
        initComponents();
        this.productos = productos;
        armarCabecera();
    }

    private void armarCabecera() {
        modelo.addColumn("Codigo");
        modelo.addColumn("Descripcion");
        modelo.addColumn("Precio");
        modelo.addColumn("Stock");
        jtTable.setModel(modelo);
    }

    public void borrarFilasTabla() {
        int filas = modelo.getRowCount() - 1;
        for (int i = filas; i >= 0; i--) {
            modelo.removeRow(i);
        }
    }

    /**
     * Creates new form ConsRubro
     */


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtTable = new javax.swing.JTable();
        jtPrecioMin = new javax.swing.JTextField();
        jtPrecioMax = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Listado de Productos por Precio");

        jLabel2.setText("Entre $:");

        jtTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Codigo", "Descripcion", "Precio", "Stock"
            }
        ));
        jScrollPane1.setViewportView(jtTable);

        jtPrecioMax.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtPrecioMaxKeyReleased(evt);
            }
        });

        jLabel3.setText("y");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtPrecioMin, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jtPrecioMax, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 105, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtPrecioMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtPrecioMax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(43, 43, 43)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtPrecioMaxKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtPrecioMaxKeyReleased
        double precioMin = Double.parseDouble(jtPrecioMin.getText());
        double precioMax = Double.parseDouble(jtPrecioMax.getText());

        for (Producto producto : productos) {
            if (precioMin < producto.getPrecio() && precioMax >= producto.getPrecio()) {

                Vector renglon = new Vector<>();
                renglon.add(producto.getCodigo());
                renglon.add(producto.getDescripcion());
                renglon.add(producto.getPrecio());
                renglon.add(producto.getStock());
                modelo.addRow(renglon);
            }
        }
    }//GEN-LAST:event_jtPrecioMaxKeyReleased

      
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jtPrecioMax;
    private javax.swing.JTextField jtPrecioMin;
    private javax.swing.JTable jtTable;
    // End of variables declaration//GEN-END:variables
}

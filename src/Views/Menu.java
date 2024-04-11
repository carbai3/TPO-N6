/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Views;

import Entidades.Producto;
import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.Image;
import java.util.HashSet;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author virfe
 */
public class Menu extends javax.swing.JFrame {
 private HashSet<Producto> productos = new HashSet<>();
 
    public Menu() {
        initComponents();
        
        // Establecer el tamaño de la ventana
        setSize(1280, 720); // Tamaño personalizado
        // Crear un JPanel personalizado para el fondo


      
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        Escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItemProducto = new javax.swing.JMenuItem();
        jmConsRub = new javax.swing.JMenu();
        jmConsRubro = new javax.swing.JMenuItem();
        jmConsNombre = new javax.swing.JMenuItem();
        jmConsPrecio = new javax.swing.JMenuItem();

        jScrollPane1.setViewportView(jEditorPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout EscritorioLayout = new javax.swing.GroupLayout(Escritorio);
        Escritorio.setLayout(EscritorioLayout);
        EscritorioLayout.setHorizontalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        EscritorioLayout.setVerticalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 277, Short.MAX_VALUE)
        );

        jMenu1.setText("Administración");

        jMenuItemProducto.setText("Productos");
        jMenuItemProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemProductoActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemProducto);

        jMenuBar1.add(jMenu1);

        jmConsRub.setText("Consultas");

        jmConsRubro.setText("Por Rubro");
        jmConsRubro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmConsRubroActionPerformed(evt);
            }
        });
        jmConsRub.add(jmConsRubro);

        jmConsNombre.setText("Por Nombre");
        jmConsNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmConsNombreActionPerformed(evt);
            }
        });
        jmConsRub.add(jmConsNombre);

        jmConsPrecio.setText("Por Precio");
        jmConsPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmConsPrecioActionPerformed(evt);
            }
        });
        jmConsRub.add(jmConsPrecio);

        jMenuBar1.add(jmConsRub);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Escritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemProductoActionPerformed
        Escritorio.removeAll();
        Escritorio.repaint();
        GestionDeProductos gp = new GestionDeProductos(productos);
        gp.setVisible(true);
        gp.setLocation(200, 100);
        Escritorio.add(gp);
        Escritorio.moveToFront(gp);
    }//GEN-LAST:event_jMenuItemProductoActionPerformed

    private void jmConsRubroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmConsRubroActionPerformed
        Escritorio.removeAll();
        Escritorio.repaint();
        ConsRubro cr = new ConsRubro();
        cr.setVisible(true);
        cr.setLocation(200, 100);
        Escritorio.add(cr);
        Escritorio.moveToFront(cr);
    }//GEN-LAST:event_jmConsRubroActionPerformed

    private void jmConsNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmConsNombreActionPerformed
        Escritorio.removeAll();
        Escritorio.repaint();
        ConsNombre cn = new ConsNombre();
        cn.setVisible(true);
        cn.setLocation(200, 100);
        Escritorio.add(cn);
        Escritorio.moveToFront(cn);
    }//GEN-LAST:event_jmConsNombreActionPerformed

    private void jmConsPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmConsPrecioActionPerformed
        Escritorio.removeAll();
        Escritorio.repaint();
        ConsPrecio cp = new ConsPrecio();
        cp.setVisible(true);
        cp.setLocation(200, 100);
        Escritorio.add(cp);
        Escritorio.moveToFront(cp);
    }//GEN-LAST:event_jmConsPrecioActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane Escritorio;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItemProducto;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem jmConsNombre;
    private javax.swing.JMenuItem jmConsPrecio;
    private javax.swing.JMenu jmConsRub;
    private javax.swing.JMenuItem jmConsRubro;
    // End of variables declaration//GEN-END:variables
}

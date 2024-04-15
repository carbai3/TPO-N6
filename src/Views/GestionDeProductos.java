/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Views;

import Entidades.Producto;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author virfe
 */
public class GestionDeProductos extends javax.swing.JInternalFrame {

    private TreeSet<Producto> productos;

    /**
     * Creates new form GestionDeProductos
     */
    public GestionDeProductos(TreeSet<Producto> productos) {
        initComponents();
        this.productos = productos;
        configurarBotones();
    }

    @SuppressWarnings(value = "unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jbNuevo = new javax.swing.JButton();
        jbGuardar = new javax.swing.JButton();
        jbEliminar = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jtCodigo = new javax.swing.JTextField();
        jbBuscar = new javax.swing.JButton();
        jtDescripcion = new javax.swing.JTextField();
        jtPrecio = new javax.swing.JTextField();
        jtStock = new javax.swing.JTextField();
        jcRubro = new javax.swing.JComboBox<>();
        jbEditar = new javax.swing.JButton();

        setTitle("Gestión de Productos");

        jLabel1.setText("Código");

        jLabel2.setText("Descripción");

        jLabel3.setText("Precio");

        jLabel4.setText("Rubro");

        jLabel5.setText("Strock");

        jbNuevo.setText("Nuevo");
        jbNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevoActionPerformed(evt);
            }
        });

        jbGuardar.setText("Guardar");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });

        jbEliminar.setText("Eliminar");
        jbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarActionPerformed(evt);
            }
        });

        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        jbBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Views/Image20240409175658.png"))); // NOI18N
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        jcRubro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Comestibles", "Limpieza", "Perfumeria" }));

        jbEditar.setText("Editar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jtCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                                        .addComponent(jtPrecio)
                                        .addComponent(jtStock))
                                    .addComponent(jtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                                .addComponent(jbBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jcRubro, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbNuevo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbEditar)
                        .addGap(12, 12, 12)
                        .addComponent(jbEliminar)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(62, 62, 62))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbSalir)
                .addGap(21, 21, 21))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jbBuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jcRubro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jtStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbNuevo)
                    .addComponent(jbGuardar)
                    .addComponent(jbEliminar)
                    .addComponent(jbEditar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbSalir)
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
private void configurarBotones() {
//    jbGuardar.setEnabled(false);
        jbEditar.setEnabled(false);
        jbEliminar.setEnabled(false);
    }

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
        int codigo;
        String descripcion;
        double precio;
        int stock;
        String rubro;
        //Evaluo si estan vacios antes de guardar y si los valores son correctos
        if (jtCodigo.getText().isEmpty() || jtDescripcion.getText().isEmpty()
                || jtPrecio.getText().isEmpty() || jtStock.getText().isEmpty()) {

            JOptionPane.showMessageDialog(this, "Hay campos sin completar");
            return;
        }
        if (validaEntero(jtCodigo.getText())) {
            codigo = Integer.parseInt(jtCodigo.getText());
        } else {
            JOptionPane.showMessageDialog(this, "Ingresar un nro ");
            jtCodigo.requestFocus();
            return;
        }

        if (validaEntero(jtStock.getText())) {
            stock = Integer.parseInt(jtStock.getText());
        } else {

            JOptionPane.showMessageDialog(this, "Ingresar un nro entero");
            jtStock.requestFocus();
            return;
        }

        if (validaReal(jtPrecio.getText())) {
            precio = Double.parseDouble(jtPrecio.getText());
        } else {

            JOptionPane.showMessageDialog(this, "Ingresar un nro real");
            jtPrecio.requestFocus();
            return;
        }

        if (!jtDescripcion.getText().isEmpty()) {

            descripcion = jtDescripcion.getText();
        } else {
            JOptionPane.showMessageDialog(this, "Ingresar una descripcion");
            jtDescripcion.requestFocus();
            return;
        }

        rubro = (String) jcRubro.getSelectedItem();

        Producto prod = new Producto(codigo, descripcion, precio, stock, rubro);

        if (productos.add(prod)) {
            JOptionPane.showMessageDialog(this, "Producto Guardado");
            limpiarCampos();
        } else {
            JOptionPane.showMessageDialog(this, "Producto existente con ese codigo");
        }
    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
//     
        dispose();

    }//GEN-LAST:event_jbSalirActionPerformed

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed

        String codigoTexto = jtCodigo.getText(); // Obtener el texto del JTextField
        try {// Habilitar o deshabilitar los botones según si se ingresó un valor en el campo de búsqueda
            if (!codigoTexto.isEmpty() && validaEntero(jtCodigo.getText())) { //validamos con lo Pattern y Machern
                boolean productoEncontrado = false;
                int codigoABuscar = Integer.parseInt(codigoTexto); // Convertir el texto a un número entero

                for (Producto producto : productos) {
                    if (producto.getCodigo() == codigoABuscar) {
                        productoEncontrado = true;
                        break;
                    }
                }

                jbEditar.setEnabled(productoEncontrado);
                jbEliminar.setEnabled(productoEncontrado);
            } else {
                jbEditar.setEnabled(false);
                jbEliminar.setEnabled(false);
            }

            String descripcion;
            double precio;
            int stock;
            String rubro;

            int codigoABuscar = Integer.parseInt(codigoTexto); // Convertir el texto a un número entero

            Producto productoEncontrado = null;

            for (Producto producto : productos) {
                if (producto.getCodigo() == codigoABuscar) {
                    productoEncontrado = producto;
                    break;
                }
            }

            if (productoEncontrado != null) {
                descripcion = productoEncontrado.getDescripcion();
                jtDescripcion.setText(descripcion);

                precio = productoEncontrado.getPrecio();//valor en double
                String precioEncontrado = String.valueOf(precio); //lo paso a String para setearlo en Jtext
                jtPrecio.setText(precioEncontrado);

                stock = productoEncontrado.getStock();
                String stockEncontrado = String.valueOf(stock);
                jtStock.setText(stockEncontrado);
                
                rubro = productoEncontrado.getRubro();
                String rubroEncontrado = String.valueOf(rubro);
                jcRubro.setSelectedItem(rubroEncontrado);

                JOptionPane.showMessageDialog(null, "Producto encontrado: ");
            } else {
                JOptionPane.showMessageDialog(null, "Producto no encontrado con el código: " + codigoTexto);
            }

        } catch (NumberFormatException e) {
      
            JOptionPane.showMessageDialog(null, "Campo vacío o valor inválido. Ingrese un número válido.");
        }


    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed
        String codigoTexto = jtCodigo.getText(); // Obtener el texto del JTextField
        int codigoAEliminar = Integer.parseInt(codigoTexto); // Convertir el texto a un número entero
        for (Producto producto : productos) {
            if (producto.getCodigo() == codigoAEliminar) {
                productos.remove(producto);
                JOptionPane.showMessageDialog(null, "Producto eliminado");
                limpiarCampos();
                break; // Importante salir del bucle una vez se elimine el producto

            }
        }
    }//GEN-LAST:event_jbEliminarActionPerformed

    private void jbNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevoActionPerformed
        // Habilitar el botón Guardar al presionar Nuevo y completar todos los campos
        jbGuardar.setEnabled(true);
        // Limpiar los campos para ingresar nuevos datos
        limpiarCampos();
    }//GEN-LAST:event_jbNuevoActionPerformed
    private boolean validaEntero(String nro) {

        Pattern patron = Pattern.compile("^[0-9]+$");
        Matcher m = patron.matcher(nro);
        return m.matches();
    }

    private boolean validaReal(String nro) {
        Pattern patron = Pattern.compile("^-?\\d+(\\.\\d{1,2})?$");
        Matcher m = patron.matcher(nro);
        return m.matches();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbEditar;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbNuevo;
    private javax.swing.JButton jbSalir;
    private javax.swing.JComboBox<String> jcRubro;
    private javax.swing.JTextField jtCodigo;
    private javax.swing.JTextField jtDescripcion;
    private javax.swing.JTextField jtPrecio;
    private javax.swing.JTextField jtStock;
    // End of variables declaration//GEN-END:variables

    private void limpiarCampos() {
        jtCodigo.setText("");
        jtDescripcion.setText("");
        jtStock.setText("");
        jtPrecio.setText("");
        jcRubro.setSelectedIndex(0);

    }

}

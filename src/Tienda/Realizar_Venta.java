/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tienda;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Anita
 */
public class Realizar_Venta extends javax.swing.JInternalFrame {

    Calendar cal = Calendar.getInstance();
    FondoPanel fondo = new FondoPanel();
    DefaultTableModel modeloVentas;
    ArrayList<Productos> carrito = new ArrayList<>();
    double total, cambio;

    /**
     * Creates new form Realizar_Venta
     */
    public Realizar_Venta() {
        this.setContentPane(fondo);
        initComponents();
        modeloVentas = (DefaultTableModel) tb_Ventas1.getModel();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        tb_Ventas = new javax.swing.JTable();
        Ven_lb_total = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        Ven_tx_id = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        tb_Ventas1 = new javax.swing.JTable();
        Ven_lb_total1 = new javax.swing.JLabel();
        ven_btn_ven = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Ven_lb_cambio = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Ven_lb_recibido = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        tb_Ventas.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tb_Ventas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Clave", "Articulo", "Precio", "Piezas", "Subtotal"
            }
        ));
        tb_Ventas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tb_VentasMousePressed(evt);
            }
        });
        tb_Ventas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tb_VentasKeyPressed(evt);
            }
        });
        jScrollPane3.setViewportView(tb_Ventas);

        Ven_lb_total.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        Ven_lb_total.setText("$0");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn_guardar.jpg"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jLabel7.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Realizar Venta");

        Ven_tx_id.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        Ven_tx_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ven_tx_idActionPerformed(evt);
            }
        });
        Ven_tx_id.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Ven_tx_idKeyPressed(evt);
            }
        });

        tb_Ventas1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tb_Ventas1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Clave", "Nombre", "Precio", "Piezas", "Subtotal"
            }
        ));
        tb_Ventas1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tb_Ventas1MousePressed(evt);
            }
        });
        tb_Ventas1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tb_Ventas1KeyPressed(evt);
            }
        });
        jScrollPane4.setViewportView(tb_Ventas1);

        Ven_lb_total1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        Ven_lb_total1.setForeground(new java.awt.Color(255, 255, 255));
        Ven_lb_total1.setText("0");

        ven_btn_ven.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/vender.jpg"))); // NOI18N
        ven_btn_ven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ven_btn_venActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("$");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Cambio:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Total:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("$");

        Ven_lb_cambio.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Ven_lb_cambio.setForeground(new java.awt.Color(255, 255, 255));
        Ven_lb_cambio.setText("0");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Recibido:");

        Ven_lb_recibido.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Ven_lb_recibido.setForeground(new java.awt.Color(255, 255, 255));
        Ven_lb_recibido.setText("0");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("$");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Clave del Producto:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 499, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Ven_tx_id, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(103, 103, 103)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Ven_lb_total1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Ven_lb_recibido))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(jLabel4)
                                .addGap(5, 5, 5)
                                .addComponent(Ven_lb_cambio))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel2))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ven_btn_ven, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Ven_tx_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(Ven_lb_total1)
                            .addComponent(jLabel3))
                        .addGap(29, 29, 29)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(Ven_lb_recibido))
                        .addGap(33, 33, 33)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(Ven_lb_cambio))
                        .addGap(38, 38, 38)
                        .addComponent(ven_btn_ven, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Ven_tx_idKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Ven_tx_idKeyPressed

        if (!Ven_tx_id.getText().isEmpty()) {
            if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
                String cla = Ven_tx_id.getText();
                Productos p = buscarProducto(cla);
                if (!p.clave.equals("000")) {
                    carrito.add(p);
                    cargarVentaModelo();
                }
            }
        }
    }//GEN-LAST:event_Ven_tx_idKeyPressed

    private void tb_VentasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_VentasMousePressed
 
    }//GEN-LAST:event_tb_VentasMousePressed

    private void tb_VentasKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tb_VentasKeyPressed

    }//GEN-LAST:event_tb_VentasKeyPressed

    private void tb_Ventas1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_Ventas1MousePressed
        // Dar clic en un producto de la tabla
        int reg = tb_Ventas1.getSelectedRow();
        int pza = Integer.parseInt(JOptionPane.showInputDialog(this,
                "¿Cuantas piezas llevas? ",
                "Piezas", 1, null, null, 1) + "");
        if (carrito.get(reg).exis >= pza) {
            Productos p = carrito.get(reg);
            p.pza = pza;
            p.sub = p.precio * pza;
            carrito.set(reg, p);
            cargarVentaModelo();
        } else {
            JOptionPane.showMessageDialog(null, "PIEZAS INSUFICIENTES");
        }
    }//GEN-LAST:event_tb_Ventas1MousePressed

    private void tb_Ventas1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tb_Ventas1KeyPressed

    }//GEN-LAST:event_tb_Ventas1KeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

    }//GEN-LAST:event_jButton1ActionPerformed

    private void ven_btn_venActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ven_btn_venActionPerformed
        // Boton de pagar
        //Validar si tenemos productos cargados en la tabla de ventas
                if (modeloVentas.getRowCount() > 0) {
            float pago = Float.parseFloat(JOptionPane.showInputDialog(
                    this, "Cantidad recibida", "PAGANDO", 1, null, null, 0) + "");
            
            if (pago >= total) {
                realizarVenta();
                JOptionPane.showMessageDialog(null, "VENTA REALIZADA");
                cambio = pago-total;
                Ven_lb_cambio.setText(cambio + "");
                Ven_lb_recibido.setText(pago + "");
            } else {
                JOptionPane.showMessageDialog(this, "CANTIDAD INSUFICIENTE");
            }
        }

    }//GEN-LAST:event_ven_btn_venActionPerformed

    private void Ven_tx_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ven_tx_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Ven_tx_idActionPerformed
    private void realizarVenta() {
        try {
            int claVen = guardaVenta();
            guardaDetalleVenta(claVen);
            actualizaExistencias();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error (realizaVenta): " + ex.getMessage());
        }
    }

    private void actualizaExistencias() {
        Conexion bd = new Conexion();
        bd.conectar();
        try {
            //Existencias clave_prod - exis_prod
            for (int i = 0; i < carrito.size(); i++) {
                //Sentencia
                String sql = "UPDATE existencias SET exis_prod=? WHERE id_producto=?";
                PreparedStatement sent = bd.miConexion.prepareStatement(sql);
                //Pasamos los parametros
                sent.setInt(1, carrito.get(i).exis - carrito.get(i).pza);
                sent.setString(2, carrito.get(i).clave);
                sent.execute();
                sent.close();
                //Actualizar el modelo de existencias
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error (existencias): " + ex.getMessage());
        }
    }

    private void guardaDetalleVenta(int clave) {
        Conexion bd = new Conexion();
        bd.conectar();
        try {
            //clave_det - clave_ven - prod - pieza - subt
            for (int i = 0; i < carrito.size(); i++) {
                //Sentencia
                String sql = "INSERT INTO detalle_venta VALUES (0,?,?,?,?)";
                PreparedStatement sent = bd.miConexion.prepareStatement(sql);
                sent.setInt(1, clave);
                sent.setString(2, carrito.get(i).clave);
                sent.setInt(3, carrito.get(i).pza);
                sent.setFloat(4, carrito.get(i).sub);
                sent.execute();
                sent.close();
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error (detalleVenta): " + ex.getMessage());
        }
    }

    private int guardaVenta() {
        Conexion bd = new Conexion();
        bd.conectar();
        int clave = 0;
        try {
            String fecha = cal.get(cal.DATE) + "-" + (cal.get(cal.MONTH) + 1) + "-" + cal.get(cal.YEAR);
            String hora = cal.get(cal.HOUR_OF_DAY) + ":" + cal.get(cal.MINUTE) + ":" + cal.get(cal.SECOND);
            //Vamos a contar las piezas
            int pza = 0;
            for (int i = 0; i < carrito.size(); i++) {
                pza += carrito.get(i).pza;
            }
            //clave - fecha - total - piezas            
            //Preparar nuestra sentencia
            String sqlVenta = "INSERT INTO venta VALUES (0,?,?,?,?)";
            PreparedStatement sentencia = bd.miConexion.prepareStatement(sqlVenta);
            sentencia.setString(1, fecha);
            sentencia.setString(2, hora);
            sentencia.setFloat(3, (float) total);
            sentencia.setInt(4, pza);
            sentencia.execute();
            sentencia.close();
            //Creamos una consulta para obtener la ultima clave guardada
            String query = "SELECT MAX(clave_ven) from venta";
            //Estructurar la sentencia
            bd.miSentencia = bd.miConexion.createStatement();
            bd.miResultado = bd.miSentencia.executeQuery(query);
            //Obtenemos el valor
            if (bd.miResultado.next()) {
                clave = bd.miResultado.getInt(1);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error (guardaVenta): " + ex.getMessage());
        }
        return clave;
    }

    private void cargarVentaModelo() {
        modeloVentas.setRowCount(0);
        total = 0;
        for (int i = 0; i < carrito.size(); i++) {
            Object[] oVenta = new Object[]{
                carrito.get(i).clave,
                carrito.get(i).nombre,
                carrito.get(i).precio,
                carrito.get(i).pza,
                carrito.get(i).sub
            };
            modeloVentas.addRow(oVenta);
            total = total + carrito.get(i).sub;
        }
        Ven_lb_total1.setText(total + "");
    }
    private Productos buscarProducto(String cla) {
        Conexion bd = new Conexion();
        bd.conectar();
        Productos prod = new Productos();
        try {
            //Consulta a la tabla
            String sql = "SELECT p.id_producto, p.nombre, p.precio, e.exis_prod "
                    + " FROM producto p, existencias e "
                    + "WHERE p.id_producto = e.id_producto AND "
                    + "p.id_producto='" + cla + "'";
            bd.miSentencia = bd.miConexion.createStatement();
            bd.miResultado = bd.miSentencia.executeQuery(sql);
            //Vamos a obtener el resultado
            if (bd.miResultado.next()) {
                prod.clave = bd.miResultado.getString(1);
                prod.nombre = bd.miResultado.getString(2);
                prod.precio = bd.miResultado.getFloat(3);
                prod.exis = bd.miResultado.getInt(4);
                prod.pza = 1;
                prod.sub = prod.precio;
            }
        } catch (Exception ex) {

        }
        return prod;
    }
//
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Ven_lb_cambio;
    private javax.swing.JLabel Ven_lb_recibido;
    private javax.swing.JLabel Ven_lb_total;
    private javax.swing.JLabel Ven_lb_total1;
    private javax.swing.JTextField Ven_tx_id;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable tb_Ventas;
    private javax.swing.JTable tb_Ventas1;
    private javax.swing.JButton ven_btn_ven;
    // End of variables declaration//GEN-END:variables
class FondoPanel extends JPanel {

        private Image imagen;

        @Override
        public void paint(Graphics g) {
            imagen = new ImageIcon(getClass().getResource("/Imagenes/fondo_ven.jpg")).getImage();

            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);

            setOpaque(false);

            super.paint(g);
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto_de_venta;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;
import static javax.swing.JOptionPane.PLAIN_MESSAGE;
import static javax.swing.JOptionPane.WARNING_MESSAGE;
import javax.swing.Timer;
import javax.swing.UIManager;
import javax.swing.plaf.FontUIResource;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Caro
 */
public class FramePV extends javax.swing.JFrame {

    Conexion poss = new Conexion();
    Connection conn = poss.conexion();
    boolean masCantidad = false;

    public FramePV() {
        initComponents();
        setExtendedState(FramePV.MAXIMIZED_BOTH);
        borrar.setBackground(new java.awt.Color(60, 92, 108));
        vender.setBackground(new java.awt.Color(60, 92, 108));

        Date date = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/YYYY");
        setMonth(formato.format(date));
        Timer time = new Timer(100, new FramePV.horas());
        time.start();
        setTableModel();
        textoAdv.setVisible(false);
        textoAdv2.setVisible(false);
        jPanel1.setFocusable(true);
//        getCodes();
    }

//    public void getCodes() {
//        String query = "SELECT codigo FROM Productos";
//        try {
//            Statement st = conn.createStatement();
//            ResultSet rs = st.executeQuery(query);
//            while(rs.next()) {
//                System.out.println(rs.getString(1));
//            }
//        } catch (SQLException e) {
//        }
//    }
    public void setMonth(String fechaC) {
        String[] dato = fechaC.split("/");
        String dia = dato[0];
        String year = dato[2];
        String mes = "";
        switch (dato[1]) {
            case "01":
                mes = "Enero";
                break;

            case "02":
                mes = "Febrero";
                break;

            case "03":
                mes = "Marzo";
                break;

            case "04":
                mes = "Abril";
                break;

            case "05":
                mes = "Mayo";
                break;

            case "06":
                mes = "Junio";
                break;

            case "07":
                mes = "Julio";
                break;

            case "08":
                mes = "Agosto";
                break;

            case "09":
                mes = "Septiembre";
                break;

            case "10":
                mes = "Octubre";
                break;

            case "11":
                mes = "Noviembre";
                break;

            case "12":
                mes = "Diciembre";
                break;
        }
        fecha.setText(dia + "/" + mes + "/" + year);
    }

    class horas implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            Date hours = new Date();
            String pmAm = "hh:mm:ss a";
            SimpleDateFormat format = new SimpleDateFormat(pmAm);
            Calendar hoy = Calendar.getInstance();
            hora.setText(String.format(format.format(hours), hoy));
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        vayuda = new javax.swing.JDialog();
        bayuda = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        fecha = new javax.swing.JLabel();
        hora = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaVenta = new javax.swing.JTable();
        textoVenta = new javax.swing.JTextField();
        salir = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        eTotal = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        borrar = new javax.swing.JButton();
        vender = new javax.swing.JButton();
        ayuda = new javax.swing.JButton();
        textoAdv = new javax.swing.JLabel();
        textoAdv2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        vayuda.setLocationByPlatform(true);
        vayuda.setMaximumSize(new java.awt.Dimension(885, 735));
        vayuda.setMinimumSize(new java.awt.Dimension(885, 735));
        vayuda.setModal(true);
        vayuda.setPreferredSize(new java.awt.Dimension(885, 735));
        vayuda.setResizable(false);
        vayuda.getContentPane().setLayout(null);

        bayuda.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        bayuda.setText("Aceptar");
        bayuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bayudaActionPerformed(evt);
            }
        });
        vayuda.getContentPane().add(bayuda);
        bayuda.setBounds(370, 630, 100, 40);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ayuda.png"))); // NOI18N
        jLabel7.setName(""); // NOI18N
        vayuda.getContentPane().add(jLabel7);
        jLabel7.setBounds(0, 0, 870, 700);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setExtendedState(MAXIMIZED_BOTH);
        setUndecorated(true);
        setResizable(false);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });
        getContentPane().setLayout(null);

        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });
        jPanel1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPanel1KeyPressed(evt);
            }
        });
        jPanel1.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(27, 58, 68));
        jLabel3.setText("Punto de Venta - Tiendita GOR2");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(390, 40, 580, 40);

        fecha.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        fecha.setForeground(new java.awt.Color(51, 51, 51));
        fecha.setText("fecha");
        jPanel1.add(fecha);
        fecha.setBounds(120, 30, 180, 30);

        hora.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        hora.setForeground(new java.awt.Color(51, 51, 51));
        hora.setText("hora");
        jPanel1.add(hora);
        hora.setBounds(120, 50, 210, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/rsz_dateicon.png"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(30, 20, 80, 70);

        tablaVenta.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        tablaVenta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Precio", "Nombre", "Cantidad", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaVenta);
        if (tablaVenta.getColumnModel().getColumnCount() > 0) {
            tablaVenta.getColumnModel().getColumn(0).setResizable(false);
            tablaVenta.getColumnModel().getColumn(1).setResizable(false);
            tablaVenta.getColumnModel().getColumn(2).setResizable(false);
            tablaVenta.getColumnModel().getColumn(3).setResizable(false);
        }

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(50, 120, 980, 430);

        textoVenta.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        textoVenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textoVentaMouseClicked(evt);
            }
        });
        textoVenta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textoVentaKeyPressed(evt);
            }
        });
        jPanel1.add(textoVenta);
        textoVenta.setBounds(120, 590, 910, 60);

        salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/rsz_close.png"))); // NOI18N
        salir.setMaximumSize(new java.awt.Dimension(40, 40));
        salir.setMinimumSize(new java.awt.Dimension(40, 40));
        salir.setPreferredSize(new java.awt.Dimension(40, 40));
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        jPanel1.add(salir);
        salir.setBounds(1270, 0, 30, 30);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/rsz_carrito.png"))); // NOI18N
        jPanel1.add(jLabel4);
        jLabel4.setBounds(50, 590, 60, 60);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/rsz_1moneyicon.png"))); // NOI18N
        jPanel1.add(jLabel6);
        jLabel6.setBounds(1080, 360, 60, 60);

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 51)));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("TOTAL =");

        eTotal.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        eTotal.setForeground(new java.awt.Color(255, 255, 255));
        eTotal.setText("0.0");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(78, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eTotal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(eTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(1070, 340, 200, 100);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/rsz_tiendita_gor2.png"))); // NOI18N
        jPanel1.add(jLabel8);
        jLabel8.setBounds(1050, 30, 130, 123);

        borrar.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        borrar.setForeground(new java.awt.Color(255, 255, 255));
        borrar.setText("Borrar");
        borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarActionPerformed(evt);
            }
        });
        jPanel1.add(borrar);
        borrar.setBounds(1110, 250, 130, 50);

        vender.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        vender.setForeground(new java.awt.Color(255, 255, 255));
        vender.setText("Terminar la Venta");
        vender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                venderActionPerformed(evt);
            }
        });
        jPanel1.add(vender);
        vender.setBounds(1080, 480, 180, 50);

        ayuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/rsz_signo.jpg"))); // NOI18N
        ayuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ayudaActionPerformed(evt);
            }
        });
        jPanel1.add(ayuda);
        ayuda.setBounds(1240, 0, 30, 30);

        textoAdv.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        textoAdv.setForeground(new java.awt.Color(255, 51, 51));
        textoAdv.setText("NO SE ENCONTRO PRODUCTO");
        jPanel1.add(textoAdv);
        textoAdv.setBounds(1040, 590, 250, 50);

        textoAdv2.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        textoAdv2.setForeground(new java.awt.Color(255, 51, 51));
        textoAdv2.setText("VERIFIQUE EL CODIGO");
        jPanel1.add(textoAdv2);
        textoAdv2.setBounds(1070, 630, 190, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(40, 30, 1300, 700);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fondo3 (2).jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1370, 770);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void setTableModel() {
        DefaultTableModel modelo = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int filas, int columnas) {
                if (columnas == 9) {
                    return true;
                } else {
                    return false;
                }
            }
        };
        modelo.addColumn("Nombre");
        modelo.addColumn("Cantidad");
        modelo.addColumn("Precio");
        modelo.addColumn("Total");

        tablaVenta.setModel(modelo);
    }

    public void checkPurchase(String codigo, String cantidad) {
        String query = "SELECT precio, nombre FROM Productos WHERE codigo = '" + codigo + "'";
        double precio = 0;
        String nombre = "";
        DefaultTableModel modelo = (DefaultTableModel) tablaVenta.getModel();
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                precio = rs.getInt(1);
                nombre = rs.getString(2);
            }

            if (nombre.length() == 0) {
                textoAdv.setVisible(true);
                textoAdv2.setVisible(true);
            } else {
                textoAdv.setVisible(false);
                textoAdv2.setVisible(false);
                textoVenta.setText("");
                if (isExist(nombre)) {
                    int row = getRowDuplicated(nombre);
                    String cant = tablaVenta.getValueAt(row, 1).toString();
                    int c = Integer.parseInt(cant) + Integer.parseInt(cantidad);
                    cantidad = String.valueOf(c);
                    double total = precio * Integer.parseInt(cantidad);
                    modelo.setValueAt(cantidad, row, 1);
                    modelo.setValueAt(total, row, 3);
                } else {
                    double total = precio * Integer.parseInt(cantidad);
                    Object[] row = {nombre, cantidad, precio, total};
                    modelo.addRow(row);
                }
                total();
            }
        } catch (SQLException ex) {
            System.out.println("Error");
        }
    }

    public void total() {
        int filas = tablaVenta.getRowCount();
        double total = 0;
        for (int i = 0; i < filas; i++) {
            String tot = tablaVenta.getValueAt(i, 3).toString();
            total += Double.parseDouble(tot);
        }
        eTotal.setText("" + total);
    }

    public boolean isExist(String nombre) {
        boolean existe = false;
        int rows = tablaVenta.getRowCount();
        if (rows > 0) {
            for (int i = 0; i < rows; i++) {
                String nom = tablaVenta.getValueAt(i, 0).toString();
                if (nom.equals(nombre)) {
                    existe = true;
                    break;
                } else {
                    existe = false;
                }
            }
        }
        return existe;
    }

    public int getRowDuplicated(String nombre) {
        int row = -1;
        int rows = tablaVenta.getRowCount();
        if (rows > 0) {
            for (int i = 0; i < rows; i++) {
                String nom = tablaVenta.getValueAt(i, 0).toString();
                if (nom.equals(nombre)) {
                    row = i;
                    break;
                } else {

                }
            }
        }
        return row;
    }

    public String getCode(String cadena) {
        String datos[] = cadena.split("\\*");
        String code = "";
        if (datos.length == 2) {
            if (datos[0].length() == 13) {
                code = datos[0];
            } else {
                code = datos[1];
            }
        } else if (datos.length > 2) {
            code = "";
        } else if (datos.length < 2) {
            code = cadena;
        }
        return code;
    }

    public String getQuantity(String cadena) {
        String quantity = "";
        String datos[] = cadena.split("\\*");
        if (datos.length == 2) {
            if (datos[0].length() == 13) {
                quantity = datos[1];
            } else {
                quantity = datos[0];
            }
        } else if (datos.length > 2) {
            JOptionPane.showMessageDialog(null, "VERIFIQUE LA SINTAXIS DE LA COMPRA.\nPUEDE CONSULTAR LA GUIA DE USO.", "ERROR EN LA VENTA", ERROR_MESSAGE);
            quantity = "0";
        } else if (datos.length < 2) {
            quantity = "1";
        }
        return quantity;
    }

    private void textoVentaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textoVentaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            String venta = textoVenta.getText();
            String codigo = getCode(venta);
            String cantidad = getQuantity(venta);
            checkPurchase(codigo, cantidad);
        }
    }//GEN-LAST:event_textoVentaKeyPressed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        // TODO add your handling code here:
        UIManager.put("OptionPane.messageFont", new FontUIResource(new Font(
                "Arial", Font.BOLD, 14)));

        int opcion = JOptionPane.showConfirmDialog(
                rootPane, "¿Desea realmente salir del sistema?",
                "Salir del sistema", JOptionPane.YES_NO_OPTION
        );

        if (opcion == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_salirActionPerformed

    public void borrar() {
        if (tablaVenta.getSelectionModel().isSelectionEmpty()) {
            JOptionPane.showMessageDialog(null, "Seleccione una producto para eliminar", "ATENCIÓN", WARNING_MESSAGE);
        } else {
            DefaultTableModel model = (DefaultTableModel) tablaVenta.getModel();
            int selectedRow = tablaVenta.getSelectedRow();
            model.removeRow(selectedRow);
            total();
        }
    }

    private void borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarActionPerformed
        borrar();
    }//GEN-LAST:event_borrarActionPerformed

    public void venta() {
        if (tablaVenta.getRowCount() > 0) {
            ImageIcon icon = new ImageIcon(getClass().getResource("/images/rsz_pulgar2.png"));
            JOptionPane.showMessageDialog(null, "Venta registrada con éxito!", "VENTA COMPLETADA", INFORMATION_MESSAGE, icon);
            setTableModel();
            textoVenta.setText("");
            eTotal.setText("");
            textoAdv.setVisible(false);
            textoAdv2.setVisible(false);
        } else {
            JOptionPane.showMessageDialog(null, "No hay productos marcados para vender.", "AVISO", WARNING_MESSAGE);
        }
    }

    private void venderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_venderActionPerformed
        venta();
//        FramePV v = new FramePV();
//        v.setVisible(true);
//        this.dispose();
    }//GEN-LAST:event_venderActionPerformed

    private void ayudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ayudaActionPerformed
//        guia v = new guia();
        vayuda.setLocationRelativeTo(null);
        vayuda.setVisible(true);

    }//GEN-LAST:event_ayudaActionPerformed

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed

    }//GEN-LAST:event_formKeyPressed

    private void jPanel1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPanel1KeyPressed
        switch (evt.getKeyCode()) {
            case KeyEvent.VK_P:
                venta();
                break;
            case KeyEvent.VK_ESCAPE:
                borrarUltimo();
                break;
            case KeyEvent.VK_B:
                borrar();
                break;
            default:
                break;
        }
    }//GEN-LAST:event_jPanel1KeyPressed

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        jPanel1.setFocusable(true);
        textoVenta.setFocusable(false);
    }//GEN-LAST:event_jPanel1MouseClicked

    private void textoVentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textoVentaMouseClicked
        jPanel1.setFocusable(false);
        textoVenta.setFocusable(true);
    }//GEN-LAST:event_textoVentaMouseClicked

    private void bayudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bayudaActionPerformed
        // TODO add your handling code here:
        vayuda.hide();
    }//GEN-LAST:event_bayudaActionPerformed

    public void borrarUltimo() {
        int rows = tablaVenta.getRowCount();
        if (rows > 0) {
            DefaultTableModel model = (DefaultTableModel) tablaVenta.getModel();
            model.removeRow(rows - 1);
            total();
        } else {

        }
    }

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
            java.util.logging.Logger.getLogger(FramePV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FramePV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FramePV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FramePV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FramePV().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ayuda;
    private javax.swing.JButton bayuda;
    private javax.swing.JButton borrar;
    private javax.swing.JLabel eTotal;
    private javax.swing.JLabel fecha;
    private javax.swing.JLabel hora;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton salir;
    private javax.swing.JTable tablaVenta;
    private javax.swing.JLabel textoAdv;
    private javax.swing.JLabel textoAdv2;
    private javax.swing.JTextField textoVenta;
    private javax.swing.JDialog vayuda;
    private javax.swing.JButton vender;
    // End of variables declaration//GEN-END:variables
}

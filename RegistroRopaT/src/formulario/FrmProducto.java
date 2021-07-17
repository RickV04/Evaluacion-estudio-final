
package formulario;

import Dao.Conexion;
import Dao.TblProducto;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import modelo.Producto;


public class FrmProducto extends javax.swing.JFrame {
    
     int fila = 0;  
     List<Producto> productos =new ArrayList();
     DefaultTableModel tbl = new DefaultTableModel();
     TableRowSorter<DefaultTableModel> trsFiltro;
     ButtonGroup btnGr;
     
     
    public FrmProducto() {
        this.trsFiltro = null;
        initComponents();
        mostrarTabla();
        lbCant.setText(""+productos.size());
       this.txtCodigo.setText(""+(productos.size()+1));
        btnGr = new ButtonGroup();
        btnGr.add(rbHombre);
        btnGr.add(rbMujer);
    }
    
    public FrmProducto(List<Producto> list) {
        this.trsFiltro = null;
        initComponents();
        productos = list;
        mostrarTabla();
        lbCant.setText(""+productos.size());
        this.txtCodigo.setText(""+(productos.size()+1));
        btnGr = new ButtonGroup();
        btnGr.add(rbHombre);
        btnGr.add(rbMujer);
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        btnEditar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txtClasificacion = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtExistencia = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        rbHombre = new javax.swing.JRadioButton();
        rbMujer = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        txtMarca = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtProducto = new javax.swing.JTextField();
        txtTalla = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        btnAnterior = new javax.swing.JButton();
        btnSeguiente = new javax.swing.JButton();
        lbCant = new javax.swing.JLabel();
        rbEliminado = new javax.swing.JRadioButton();
        rbEditado = new javax.swing.JRadioButton();
        rbNuevo = new javax.swing.JRadioButton();
        rbOriginal = new javax.swing.JRadioButton();
        btnVolver = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtValor = new javax.swing.JTextField();
        cbbuscar = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TblProducto = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setBackground(new java.awt.Color(153, 0, 0));

        jPanel1.setBackground(new java.awt.Color(153, 0, 0));
        jPanel1.setMaximumSize(new java.awt.Dimension(327, 3277));

        btnEditar.setBackground(new java.awt.Color(153, 0, 0));
        btnEditar.setForeground(new java.awt.Color(255, 255, 255));
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnAgregar.setBackground(new java.awt.Color(153, 0, 0));
        btnAgregar.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(153, 0, 0));
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnLimpiar.setBackground(new java.awt.Color(153, 0, 0));
        btnLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnActualizar.setBackground(new java.awt.Color(153, 0, 0));
        btnActualizar.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        jPanel5.setBackground(new java.awt.Color(102, 0, 0));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registro de datos", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel5.setForeground(new java.awt.Color(102, 0, 0));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Clasificacion:");

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Existencia:");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Sexo:");

        rbHombre.setBackground(new java.awt.Color(153, 0, 0));
        rbHombre.setForeground(new java.awt.Color(255, 255, 255));
        rbHombre.setText("Hombre");

        rbMujer.setBackground(new java.awt.Color(153, 0, 0));
        rbMujer.setForeground(new java.awt.Color(255, 255, 255));
        rbMujer.setText("Mujer");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Marca:");

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Precio:");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Producto:");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Talla:");

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Codigo:");

        btnAnterior.setBackground(new java.awt.Color(204, 0, 0));
        btnAnterior.setForeground(new java.awt.Color(255, 255, 255));
        btnAnterior.setText("<<");
        btnAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnteriorActionPerformed(evt);
            }
        });

        btnSeguiente.setBackground(new java.awt.Color(204, 0, 0));
        btnSeguiente.setForeground(new java.awt.Color(255, 255, 255));
        btnSeguiente.setText(">>");
        btnSeguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeguienteActionPerformed(evt);
            }
        });

        lbCant.setForeground(new java.awt.Color(255, 255, 255));
        lbCant.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbCant.setText("0");

        rbEliminado.setBackground(new java.awt.Color(204, 0, 0));
        buttonGroup1.add(rbEliminado);
        rbEliminado.setForeground(new java.awt.Color(255, 255, 255));
        rbEliminado.setText("Eliminar");

        rbEditado.setBackground(new java.awt.Color(204, 0, 0));
        buttonGroup1.add(rbEditado);
        rbEditado.setForeground(new java.awt.Color(255, 255, 255));
        rbEditado.setText("Editado");

        rbNuevo.setBackground(new java.awt.Color(204, 0, 0));
        buttonGroup1.add(rbNuevo);
        rbNuevo.setForeground(new java.awt.Color(255, 255, 255));
        rbNuevo.setText("Nuevo ");

        rbOriginal.setBackground(new java.awt.Color(204, 0, 0));
        buttonGroup1.add(rbOriginal);
        rbOriginal.setForeground(new java.awt.Color(255, 255, 255));
        rbOriginal.setText("Original");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel1)
                        .addComponent(jLabel2)
                        .addComponent(jLabel3)
                        .addComponent(jLabel7))
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtProducto, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                            .addComponent(txtCodigo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMarca)
                            .addComponent(txtClasificacion))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(rbOriginal)
                                .addGap(18, 18, 18)
                                .addComponent(rbNuevo))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(rbHombre)
                                .addGap(18, 18, 18)
                                .addComponent(rbMujer, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtExistencia, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTalla, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(btnAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lbCant, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnSeguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                        .addComponent(rbEditado)
                        .addGap(34, 34, 34)
                        .addComponent(rbEliminado)
                        .addGap(108, 108, 108))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(txtTalla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6))
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtExistencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10)))
                .addGap(26, 26, 26)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtClasificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(rbHombre)
                            .addComponent(rbMujer)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAnterior)
                            .addComponent(lbCant)
                            .addComponent(btnSeguiente))))
                .addGap(54, 54, 54)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbEliminado)
                    .addComponent(rbEditado)
                    .addComponent(rbNuevo)
                    .addComponent(rbOriginal))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        btnVolver.setBackground(new java.awt.Color(255, 0, 0));
        btnVolver.setForeground(new java.awt.Color(255, 255, 255));
        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnVolver)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnActualizar)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar)
                    .addComponent(btnEditar)
                    .addComponent(btnEliminar)
                    .addComponent(btnLimpiar)
                    .addComponent(btnActualizar))
                .addGap(18, 18, 18)
                .addComponent(btnVolver)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Datos", jPanel1);

        jPanel2.setBackground(new java.awt.Color(153, 0, 0));

        jPanel3.setBackground(new java.awt.Color(153, 0, 0));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Seccion De Busqueda", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Busca por:");

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Registro a buscar:");

        txtValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorActionPerformed(evt);
            }
        });
        txtValor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtValorKeyTyped(evt);
            }
        });

        cbbuscar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Codigo", "Producto", "Marca", "Talla", "Sexo", "Precio", "Existencia", "Clasificacion" }));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtValor)
                    .addComponent(cbbuscar, 0, 254, Short.MAX_VALUE))
                .addContainerGap(202, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(cbbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(153, 0, 0));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registro Almacenados", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14), new java.awt.Color(255, 255, 255))); // NOI18N

        TblProducto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        TblProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TblProductoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TblProducto);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(65, 65, 65))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Registro", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 619, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jTabbedPane1.getAccessibleContext().setAccessibleName("Datos");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void seleccionarEstado(int estado)
    {
    
                  switch(estado){
            case 0:
                rbNuevo.setSelected(true);
                break;
            case 1:
                rbOriginal.setSelected(true);
                break;
            case 2:
                rbEditado.setSelected(true);
                break;
            case 3:
                rbEliminado.setSelected(true);
                break;
        }
    
    
    
    }
     
    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        Producto pro = new Producto();
        pro.setCodigo(Integer.parseInt(this.txtCodigo.getText()));
        pro.setProducto(this.txtProducto.getText());
        pro.setMarca(this.txtMarca.getText());
        pro.setTalla(this.txtTalla.getText());
        String sexo1 = "M";
        String sexo2 = "F";
        
        if(this.rbHombre.isSelected() == true)
        {
        
        
            pro.setSexo(sexo1);
            
        
        
        }
        else if(this.rbMujer.isSelected() == true)
        {
        
        
        
           pro.setSexo(sexo2);
        
        
        }else
        {
        
             pro.setSexo(sexo1);
        }
        
        pro.setPrecio(Float.parseFloat(this.txtPrecio.getText()));
        pro.setExistencias(Integer.parseInt(this.txtExistencia.getText()));
        pro.setClasificacion(Integer.parseInt(this.txtClasificacion.getText()));
        pro.setEstado(0);   
        productos.add(pro);
        lbCant.setText(""+productos.size());
       
        JOptionPane.showMessageDialog(this,"Registro guardado de manera temporal");
        this.mostrarTabla();
        
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
           TblProducto tblpro = new TblProducto();
           tblpro.setProductos(productos);
           tblpro.actualizar();
           this.mostrarTabla();
            
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        productos.get(fila).setProducto(this.txtProducto.getText());
        productos.get(fila).setMarca(this.txtMarca.getText());
        productos.get(fila).setTalla(this.txtTalla.getText());
        String sexom = "M";
        String sexof = "F";
        if (this.rbHombre.isSelected() == true ) {
            
           productos.get(fila).setSexo(sexom);
        }
        else if(this.rbMujer.isSelected() == true)
        {
        
            productos.get(fila).setSexo(sexof);
        
        }
        else
        {
        
         productos.get(fila).setSexo(sexom);
        
        }

        
        
        
        
        
        productos.get(fila).setPrecio(Float.parseFloat(this.txtPrecio.getText()));
        productos.get(fila).setExistencias(Integer.parseInt(this.txtExistencia.getText()));
        productos.get(fila).setClasificacion(Integer.parseInt(this.txtClasificacion.getText()));
        productos.get(fila).setEstado(2);
        lbCant.setText(""+productos.size());
        JOptionPane.showMessageDialog(this,"Registro guardado temporalmente");
       
        
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        productos.get(fila).setEstado(3);
        limpiar();
        lbCant.setText(""+productos.size());
        
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnSeguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeguienteActionPerformed
        if(fila == productos.size()-1){
            fila = 0;
        }else{
            fila++;
        }
        this.txtCodigo.setText(""+productos.get(fila).getCodigo());
        this.txtProducto.setText(productos.get(fila).getProducto());
        this.txtMarca.setText(productos.get(fila).getMarca());
        this.txtTalla.setText(productos.get(fila).getTalla());
        if(productos.get(fila).getSexo().equals("M") )
        {
        
           
           rbHombre.setSelected(true);
        }
        else if(productos.get(fila).getSexo().equals("F"))
        {
            
             rbMujer.setSelected(true);
        
        }
        else
        {
        
             
               rbHombre.setSelected(true);
        
        }
        this.txtPrecio.setText(Float.toString(productos.get(fila).getPrecio()));
        this.txtExistencia.setText(Integer.toString(productos.get(fila).getExistencias()));
        this.txtClasificacion.setText(Integer.toString(productos.get(fila).getClasificacion()));
        int estado = productos.get(fila).getEstado();
        seleccionarEstado(estado);
    }//GEN-LAST:event_btnSeguienteActionPerformed

    private void btnAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnteriorActionPerformed
        
        if (fila ==0){
            fila = productos.size()-1;
        }else{
            fila--;
        } 
        this.txtCodigo.setText(""+productos.get(fila).getCodigo());
        this.txtProducto.setText(productos.get(fila).getProducto());
        this.txtMarca.setText(productos.get(fila).getMarca());
        this.txtTalla.setText(productos.get(fila).getTalla());
          if(productos.get(fila).getSexo().equals("M") )
        {
        
           
           rbHombre.setSelected(true);
        }
        else if(productos.get(fila).getSexo().equals("F"))
        {
            
             rbMujer.setSelected(true);
        
        }
        else
        {
        
             
               rbHombre.setSelected(true);
        
        }
        this.txtPrecio.setText(Float.toString(productos.get(fila).getPrecio()));
        this.txtExistencia.setText(Integer.toString(productos.get(fila).getExistencias()));
        this.txtClasificacion.setText(Integer.toString(productos.get(fila).getClasificacion()));
        int estado = productos.get(fila).getEstado();
        seleccionarEstado(estado);
        
    }//GEN-LAST:event_btnAnteriorActionPerformed

    private void txtValorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtValorKeyTyped
         txtValor.addKeyListener(new KeyAdapter() {
             
             public void keyReleased(final KeyEvent e){
                String cadena = (txtValor.getText());
                txtValor.setText(cadena);
                Filtro();
             }
             
             
         });
         trsFiltro = new TableRowSorter(TblProducto.getModel());
         TblProducto.setRowSorter(trsFiltro);
         
         
    }//GEN-LAST:event_txtValorKeyTyped

    private void TblProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TblProductoMouseClicked
        fila = TblProducto.getSelectedRow();
        irARegistro(fila);
        jTabbedPane1.setSelectedIndex(0);
    }//GEN-LAST:event_TblProductoMouseClicked

    private void txtValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValorActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        FrmPrincipal frm = new FrmPrincipal();
        frm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    public void Filtro()
    {
          int columna = this.cbbuscar.getSelectedIndex();
          System.out.println(columna + " " + txtValor.getText());
          trsFiltro.setRowFilter(RowFilter.regexFilter("(?i)"+txtValor.getText(), columna));
    
    
    
    }
    
    public void limpiar()
    {
    
          this.txtCodigo.setText("");
        this.txtProducto.setText("");
        this.txtMarca.setText("");
        this.txtTalla.setText("");       
        this.txtPrecio.setText("");
        this.txtClasificacion.setText("");
        this.txtExistencia.setText("");
        btnGr.clearSelection();
    
    
    
    }
    
     private void mostrarTabla()
     {
         if(tbl.getRowCount()>0){
            tbl.setRowCount(0);
         }
           String titulos[] = {"Codigo", "Producto","Marca","Talla", "Sexo" , "Precio","Existencia","Clasificacion","Estado"};
           tbl.setColumnIdentifiers(titulos);
           this.TblProducto.setModel(tbl);
           
           for (Producto pro : productos )
           {
             
              Object[] datos = new Object[9]; 
              datos[0] = pro.getCodigo();
              datos[1] = pro.getProducto();
              datos[2]=  pro.getMarca();
              datos[3] = pro.getTalla();
              datos[4] = pro.getSexo();
              datos[5] = pro.getPrecio();
              datos[6] = pro.getExistencias();
              datos[7] = pro.getClasificacion();
              datos[8] = pro.getEstado();
              tbl.addRow(datos);
    
     
     }
           
     }
    
     private void irARegistro(int fila)
     {
        if((fila <0)&&(fila>productos.size()-1))
        {
        
           JOptionPane.showMessageDialog(this, "Verifique que el dato no sea menor  a 1, ni mayor que "+ productos.size());
        
        
        }
        this.txtCodigo.setText(""+productos.get(fila).getCodigo());
        this.txtProducto.setText(productos.get(fila).getProducto());
        this.txtMarca.setText(productos.get(fila).getMarca());
        this.txtTalla.setText(productos.get(fila).getTalla());
        this.txtPrecio.setText(Float.toString(productos.get(fila).getPrecio()));
        this.txtExistencia.setText(Integer.toString(productos.get(fila).getExistencias()));
        this.txtClasificacion.setText(Integer.toString(productos.get(fila).getClasificacion()));
        
        this.rbHombre.setText(productos.get(fila).getSexo());
        this.rbMujer.setText(productos.get(fila).getSexo());
        int estado = productos.get(fila).getEstado();
        seleccionarEstado(estado);
     
     
     }
    
    
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
            java.util.logging.Logger.getLogger(FrmProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmProducto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TblProducto;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnAnterior;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnSeguiente;
    private javax.swing.JButton btnVolver;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbbuscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lbCant;
    private javax.swing.JRadioButton rbEditado;
    private javax.swing.JRadioButton rbEliminado;
    private javax.swing.JRadioButton rbHombre;
    private javax.swing.JRadioButton rbMujer;
    private javax.swing.JRadioButton rbNuevo;
    private javax.swing.JRadioButton rbOriginal;
    private javax.swing.JTextField txtClasificacion;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtExistencia;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtProducto;
    private javax.swing.JTextField txtTalla;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}

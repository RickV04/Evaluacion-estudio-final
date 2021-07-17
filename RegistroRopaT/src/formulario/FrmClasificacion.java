
package formulario;

import Dao.TblClasificacion;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import modelo.Clasificacion;


public class FrmClasificacion extends javax.swing.JFrame {
   
    int fila = 0;
    List<Clasificacion> clasificacion =new ArrayList();
    DefaultTableModel tbl = new DefaultTableModel();
    TableRowSorter<DefaultTableModel> trsFiltro;
    
    
    public FrmClasificacion() {
        this.trsFiltro = null; 
        initComponents();
        mostrarTabla();
        lbCant.setText(""+clasificacion.size());
        this.txtCodigo.setText(""+(clasificacion.size()+1));
    }
    
    public FrmClasificacion( List<Clasificacion> list)
    {
         this.trsFiltro = null;
         initComponents(); 
         clasificacion = list;
         mostrarTabla();
         lbCant.setText(""+clasificacion.size());
         this.txtCodigo.setText(""+(clasificacion.size()+1));
    
    
    
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        txtClasificacion = new javax.swing.JTextField();
        txtCodigo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnLimipiar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnAnterior = new javax.swing.JButton();
        lbCant = new javax.swing.JLabel();
        btnSiguiente = new javax.swing.JButton();
        rbOriginal = new javax.swing.JRadioButton();
        rbNuevo = new javax.swing.JRadioButton();
        rbEditado = new javax.swing.JRadioButton();
        rbEliminado = new javax.swing.JRadioButton();
        btnVolver = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cbBuscar = new javax.swing.JComboBox<>();
        txtValor = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TblClasificacion = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 0, 0));

        jPanel3.setBackground(new java.awt.Color(102, 0, 0));

        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setText("Codigo:");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Clasificacion:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txtClasificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 195, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtClasificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(31, 31, 31))
        );

        btnAgregar.setBackground(new java.awt.Color(153, 0, 0));
        btnAgregar.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnEditar.setBackground(new java.awt.Color(153, 0, 0));
        btnEditar.setForeground(new java.awt.Color(255, 255, 255));
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
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

        btnLimipiar.setBackground(new java.awt.Color(153, 0, 0));
        btnLimipiar.setForeground(new java.awt.Color(255, 255, 255));
        btnLimipiar.setText("Limpiar");
        btnLimipiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimipiarActionPerformed(evt);
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

        btnAnterior.setBackground(new java.awt.Color(153, 0, 0));
        btnAnterior.setForeground(new java.awt.Color(255, 255, 255));
        btnAnterior.setText("<<");
        btnAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnteriorActionPerformed(evt);
            }
        });

        lbCant.setForeground(new java.awt.Color(255, 255, 255));
        lbCant.setText("0");

        btnSiguiente.setBackground(new java.awt.Color(153, 0, 0));
        btnSiguiente.setForeground(new java.awt.Color(255, 255, 255));
        btnSiguiente.setText(">>");
        btnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteActionPerformed(evt);
            }
        });

        rbOriginal.setBackground(new java.awt.Color(204, 0, 0));
        buttonGroup1.add(rbOriginal);
        rbOriginal.setForeground(new java.awt.Color(255, 255, 255));
        rbOriginal.setText("Original");

        rbNuevo.setBackground(new java.awt.Color(204, 0, 0));
        buttonGroup1.add(rbNuevo);
        rbNuevo.setForeground(new java.awt.Color(255, 255, 255));
        rbNuevo.setText("Nuevo");

        rbEditado.setBackground(new java.awt.Color(204, 0, 0));
        buttonGroup1.add(rbEditado);
        rbEditado.setForeground(new java.awt.Color(255, 255, 255));
        rbEditado.setText("Editado");

        rbEliminado.setBackground(new java.awt.Color(204, 0, 0));
        buttonGroup1.add(rbEliminado);
        rbEliminado.setForeground(new java.awt.Color(255, 255, 255));
        rbEliminado.setText("Eliminado");

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
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnAgregar)
                        .addGap(18, 18, 18)
                        .addComponent(btnEditar)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminar)
                        .addGap(18, 18, 18)
                        .addComponent(btnLimipiar)
                        .addGap(18, 18, 18)
                        .addComponent(btnActualizar)
                        .addGap(18, 18, 18)
                        .addComponent(btnAnterior)
                        .addGap(18, 18, 18)
                        .addComponent(lbCant)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                        .addComponent(btnSiguiente)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnVolver)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(rbOriginal)
                        .addGap(18, 18, 18)
                        .addComponent(rbNuevo)
                        .addGap(18, 18, 18)
                        .addComponent(rbEditado)))
                .addGap(18, 18, 18)
                .addComponent(rbEliminado)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar)
                    .addComponent(btnEditar)
                    .addComponent(btnEliminar)
                    .addComponent(btnLimipiar)
                    .addComponent(btnActualizar)
                    .addComponent(btnSiguiente)
                    .addComponent(btnAnterior)
                    .addComponent(lbCant))
                .addGap(57, 57, 57)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbOriginal)
                    .addComponent(rbNuevo)
                    .addComponent(rbEditado)
                    .addComponent(rbEliminado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(btnVolver)
                .addGap(23, 23, 23))
        );

        jTabbedPane1.addTab("Datos", jPanel1);

        jPanel4.setBackground(new java.awt.Color(153, 0, 0));

        jPanel5.setBackground(new java.awt.Color(102, 0, 0));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Seccion de Busqueda", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Buscar por:");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Registro a buscar:");

        cbBuscar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Codigo", "Tipo" }));

        txtValor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtValorKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cbBuscar, 0, 260, Short.MAX_VALUE)
                    .addComponent(txtValor))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );

        jPanel6.setBackground(new java.awt.Color(102, 0, 0));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registros Almacenados", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 255, 255))); // NOI18N

        TblClasificacion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        TblClasificacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TblClasificacionMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TblClasificacion);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 549, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Registros", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void seleccionarEstado(int estado){
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
         Clasificacion clas = new Clasificacion();
         
         clas.setCodigo(Integer.parseInt(this.txtCodigo.getText()));
         clas.setTipo(this.txtClasificacion.getText());
         clas.setEstado(0);
         clasificacion.add(clas);
         lbCant.setText(""+clasificacion.size());
         
         JOptionPane.showMessageDialog(this,"Registro guardado de manera temporal");
         mostrarTabla();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void txtValorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtValorKeyTyped
        txtValor.addKeyListener(new KeyAdapter() {
             
             public void keyReleased(final KeyEvent e){
                String cadena = (txtValor.getText());
                txtValor.setText(cadena);
                Filtro();
             }
             
             
         });
        
         trsFiltro = new TableRowSorter(TblClasificacion.getModel());
         TblClasificacion.setRowSorter(trsFiltro);
    }//GEN-LAST:event_txtValorKeyTyped

    private void TblClasificacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TblClasificacionMouseClicked
        fila = TblClasificacion.getSelectedRow();
        irARegistro(fila);
        jTabbedPane1.setSelectedIndex(0);
    }//GEN-LAST:event_TblClasificacionMouseClicked

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        TblClasificacion tblcla = new TblClasificacion();
        tblcla.setClasificacion(clasificacion);
        tblcla.actualizar();
        this.mostrarTabla();
        
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        clasificacion.get(fila).setCodigo(Integer.parseInt(this.txtCodigo.getText()));
        clasificacion.get(fila).setTipo(this.txtClasificacion.getText());
        clasificacion.get(fila).setEstado(2);
        lbCant.setText(""+clasificacion.size());
        JOptionPane.showMessageDialog(this,"Registro guardado temporalmente");
       
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
         clasificacion.get(fila).setEstado(3);
        limpiar();
        lbCant.setText(""+clasificacion.size());
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnLimipiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimipiarActionPerformed
        limpiar();
    }//GEN-LAST:event_btnLimipiarActionPerformed

    private void btnAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnteriorActionPerformed
        if (fila ==0){
            fila = clasificacion.size()-1;
        }else{
            fila--;
        }
        
         this.txtCodigo.setText(""+clasificacion.get(fila).getCodigo());
        this.txtClasificacion.setText(clasificacion.get(fila).getTipo());
        int estado = clasificacion.get(fila).getEstado();
        seleccionarEstado(estado);
    }//GEN-LAST:event_btnAnteriorActionPerformed

    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed
        if(fila == clasificacion.size()-1){
            fila = 0;
        }else{
            fila++;
        }
         this.txtCodigo.setText(""+clasificacion.get(fila).getCodigo());
         this.txtClasificacion.setText(clasificacion.get(fila).getTipo());
          int estado = clasificacion.get(fila).getEstado();
        seleccionarEstado(estado);
    }//GEN-LAST:event_btnSiguienteActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        FrmPrincipal frm = new FrmPrincipal();
        frm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    
    
     private void mostrarTabla()
     {
              if(tbl.getRowCount()>0){
            tbl.setRowCount(0);
         }
         
         
           String titulos[] = {"Codigo", "Tipo","Estado"};
           tbl.setColumnIdentifiers(titulos);
           this.TblClasificacion.setModel(tbl);
           
           for (Clasificacion cla : clasificacion )
           {
             
              Object[] datos = new Object[3]; 
              datos[0] = cla.getCodigo();
              datos[1] = cla.getTipo();
              datos[2]=  cla.getEstado();
              tbl.addRow(datos);
    
     
     }
           
     }
     
     public void Filtro()
     {
          int columna = this.cbBuscar.getSelectedIndex();
          System.out.println(columna + " " + txtValor.getText());
          trsFiltro.setRowFilter(RowFilter.regexFilter("(?i)"+txtValor.getText(), columna));
     
     }
     
     private void irARegistro(int fila)
     {
         
         if((fila <0)&&(fila>clasificacion.size()-1))
        {
           JOptionPane.showMessageDialog(this, "Verifique que el dato no sea menor  a 1, ni mayor que "+ clasificacion.size());
        
        }
         
         this.txtCodigo.setText(""+clasificacion.get(fila).getCodigo());
        this.txtClasificacion.setText(clasificacion.get(fila).getTipo());
        int estado = clasificacion.get(fila).getEstado();
        seleccionarEstado(estado);
     
     }
     
      public void limpiar()
      {      
          this.txtCodigo.setText("");
          this.txtClasificacion.setText(""); 
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
            java.util.logging.Logger.getLogger(FrmClasificacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmClasificacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmClasificacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmClasificacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmClasificacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TblClasificacion;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnAnterior;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLimipiar;
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JButton btnVolver;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbBuscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lbCant;
    private javax.swing.JRadioButton rbEditado;
    private javax.swing.JRadioButton rbEliminado;
    private javax.swing.JRadioButton rbNuevo;
    private javax.swing.JRadioButton rbOriginal;
    private javax.swing.JTextField txtClasificacion;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}

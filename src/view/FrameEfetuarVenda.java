/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.AutorController;
import controller.DiscoController;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Autor;
import model.Disco;

/**
 *
 * @author Duda
 */
public class FrameEfetuarVenda extends javax.swing.JDialog {

    String idAutor;
    ResultSet rs;
    String nome;
    String origem;

    /**
     * Creates new form FrameCadastroDisco
     */
    public FrameEfetuarVenda(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        grupoDisponivel = new javax.swing.ButtonGroup();
        lojaPUEntityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("lojaPU").createEntityManager();
        vendaQuery = java.beans.Beans.isDesignTime() ? null : lojaPUEntityManager.createQuery("SELECT v FROM Venda v");
        vendaList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : vendaQuery.getResultList();
        vendaQuery1 = java.beans.Beans.isDesignTime() ? null : lojaPUEntityManager.createQuery("SELECT v FROM Venda v");
        vendaList1 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : vendaQuery1.getResultList();
        clienteQuery = java.beans.Beans.isDesignTime() ? null : lojaPUEntityManager.createQuery("SELECT c FROM Cliente c");
        clienteList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : clienteQuery.getResultList();
        panelDadosVenda = new javax.swing.JPanel();
        panelDisco = new javax.swing.JPanel();
        lbNomeDisco = new javax.swing.JLabel();
        tfNomeAutor = new javax.swing.JTextField();
        lbAnoLancamentoDisco = new javax.swing.JLabel();
        tfOrigemAutor = new javax.swing.JTextField();
        btBuscarDisco = new javax.swing.JButton();
        tfIdAutor = new javax.swing.JTextField();
        lbIdAutor = new javax.swing.JLabel();
        panelDisco1 = new javax.swing.JPanel();
        btBuscarCliente = new javax.swing.JButton();
        tfIdCliente = new javax.swing.JTextField();
        lbIdCliente = new javax.swing.JLabel();
        lbCPFCliente = new javax.swing.JLabel();
        tfCPFCliente = new javax.swing.JTextField();
        panelBotoesAutor = new javax.swing.JPanel();
        btVoltarDisco = new javax.swing.JButton();
        btLimparDisco = new javax.swing.JButton();
        btSalvarDisco = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panelDadosVenda.setBackground(new java.awt.Color(255, 255, 255));
        panelDadosVenda.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "Efetuar Venda", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        panelDisco.setBackground(new java.awt.Color(255, 255, 255));
        panelDisco.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Dados do Disco", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        lbNomeDisco.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbNomeDisco.setText("Nome: ");

        lbAnoLancamentoDisco.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbAnoLancamentoDisco.setText("Autor: ");

        btBuscarDisco.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btBuscarDisco.setText("Buscar Disco");
        btBuscarDisco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarDiscoActionPerformed(evt);
            }
        });

        tfIdAutor.setEnabled(false);

        lbIdAutor.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbIdAutor.setText("Id: ");

        javax.swing.GroupLayout panelDiscoLayout = new javax.swing.GroupLayout(panelDisco);
        panelDisco.setLayout(panelDiscoLayout);
        panelDiscoLayout.setHorizontalGroup(
            panelDiscoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDiscoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDiscoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDiscoLayout.createSequentialGroup()
                        .addGroup(panelDiscoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbAnoLancamentoDisco)
                            .addComponent(lbNomeDisco))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelDiscoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfOrigemAutor)
                            .addComponent(tfNomeAutor)))
                    .addGroup(panelDiscoLayout.createSequentialGroup()
                        .addComponent(lbIdAutor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfIdAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btBuscarDisco, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        panelDiscoLayout.setVerticalGroup(
            panelDiscoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDiscoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDiscoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNomeDisco)
                    .addComponent(tfNomeAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelDiscoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbAnoLancamentoDisco)
                    .addComponent(tfOrigemAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelDiscoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbIdAutor)
                    .addComponent(tfIdAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btBuscarDisco))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelDisco1.setBackground(new java.awt.Color(255, 255, 255));
        panelDisco1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Dados do Cliente", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        btBuscarCliente.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btBuscarCliente.setText("Buscar Cliente");
        btBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarClienteActionPerformed(evt);
            }
        });

        tfIdCliente.setEnabled(false);

        lbIdCliente.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbIdCliente.setText("Id: ");

        lbCPFCliente.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbCPFCliente.setText("CPF do Cliente: ");

        javax.swing.GroupLayout panelDisco1Layout = new javax.swing.GroupLayout(panelDisco1);
        panelDisco1.setLayout(panelDisco1Layout);
        panelDisco1Layout.setHorizontalGroup(
            panelDisco1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDisco1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDisco1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelDisco1Layout.createSequentialGroup()
                        .addComponent(lbIdCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lbCPFCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelDisco1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btBuscarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                    .addComponent(tfCPFCliente))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelDisco1Layout.setVerticalGroup(
            panelDisco1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDisco1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDisco1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfCPFCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbCPFCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelDisco1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbIdCliente)
                    .addComponent(tfIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btBuscarCliente))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelDadosVendaLayout = new javax.swing.GroupLayout(panelDadosVenda);
        panelDadosVenda.setLayout(panelDadosVendaLayout);
        panelDadosVendaLayout.setHorizontalGroup(
            panelDadosVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDadosVendaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDadosVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelDisco1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelDisco, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelDadosVendaLayout.setVerticalGroup(
            panelDadosVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDadosVendaLayout.createSequentialGroup()
                .addComponent(panelDisco1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelDisco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelBotoesAutor.setBackground(new java.awt.Color(255, 255, 255));
        panelBotoesAutor.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), new java.awt.Color(102, 102, 102)));

        btVoltarDisco.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btVoltarDisco.setText("Voltar");
        btVoltarDisco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarDiscoActionPerformed(evt);
            }
        });

        btLimparDisco.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btLimparDisco.setText("Limpar");
        btLimparDisco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparDiscoActionPerformed(evt);
            }
        });

        btSalvarDisco.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btSalvarDisco.setText("Salvar");
        btSalvarDisco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarDiscoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBotoesAutorLayout = new javax.swing.GroupLayout(panelBotoesAutor);
        panelBotoesAutor.setLayout(panelBotoesAutorLayout);
        panelBotoesAutorLayout.setHorizontalGroup(
            panelBotoesAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBotoesAutorLayout.createSequentialGroup()
                .addContainerGap(167, Short.MAX_VALUE)
                .addComponent(btSalvarDisco, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btLimparDisco, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btVoltarDisco, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelBotoesAutorLayout.setVerticalGroup(
            panelBotoesAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBotoesAutorLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(panelBotoesAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btVoltarDisco)
                    .addComponent(btLimparDisco)
                    .addComponent(btSalvarDisco))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.darkGray, java.awt.Color.lightGray), "Vendas", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Black", 0, 12))); // NOI18N

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, vendaList1, jTable1);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${id}"));
        columnBinding.setColumnName("Id");
        columnBinding.setColumnClass(Long.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${qtdeVendida}"));
        columnBinding.setColumnName("Qtde Vendida");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${valorTotal}"));
        columnBinding.setColumnName("Valor Total");
        columnBinding.setColumnClass(Float.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${dataVenda}"));
        columnBinding.setColumnName("Data Venda");
        columnBinding.setColumnClass(java.util.Date.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();

        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 527, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 452, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(panelBotoesAutor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelDadosVenda, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelDadosVenda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelBotoesAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btVoltarDiscoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarDiscoActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btVoltarDiscoActionPerformed

    private void btLimparDiscoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparDiscoActionPerformed
        // TODO add your handling code here:
//        tfCPFCliente.setText("");
//        tfGeneroMusical.setText("");
//        tfAnoLancamentoDisco.setText("");
//        tfPrecoDisco.setText("");
//        tfQtdeDiscoDisponivel.setText("");
//        tfIdAutor.setText("");
//        rbDisponivelSim.setSelected(true);
//        tfNomeAutor.setText("");
//        tfOrigemAutor.setText("");
//        grupoDisponivel.clearSelection();
    }//GEN-LAST:event_btLimparDiscoActionPerformed

    private void btSalvarDiscoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarDiscoActionPerformed
        // TODO add your handling code here:
//        DiscoController cDisco = new DiscoController();
//        Disco disco = new Disco();
//        Autor autor = new Autor();
//        int autorId = Integer.parseInt(tfIdAutor.getText());
//        String nomeDisco = tfCPFCliente.getText();
//        String genero = tfGeneroMusical.getText();
//        boolean disponivel = rbDisponivelSim.isSelected();
//        Integer ano = Integer.parseInt(tfAnoLancamentoDisco.getText());
//        Integer qtde = Integer.parseInt(tfQtdeDiscoDisponivel.getText());
//        Float preco = Float.parseFloat(tfPrecoDisco.getText());
//
//        if (nomeDisco == "" || genero == "" || ano == null || qtde == null || preco == null) {
//            JOptionPane.showMessageDialog(this, "Todos os campos deverão ser preenchidos corretamente!");
//        } else {
//        try {
//            autor.setId(autorId);
//            disco.setAutor(autor);
//            disco.setNome(nomeDisco);
//            disco.setGenero(genero);
//            disco.setDisponivel(disponivel);
//            disco.setAnoLancamento(ano);
//            disco.setQtdeDisponivel(qtde);
//            disco.setPreco(preco);
//
//        } catch (NumberFormatException n) {
//            JOptionPane.showMessageDialog(this, "Digite apenas números!");
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(this, "Erro!");
//        }
//        try {
//            cDisco.criarDisco(disco);
//            btLimparDiscoActionPerformed(evt);
//        } catch (SQLException | ClassNotFoundException ex) {
//            Logger.getLogger(FrameEfetuarVenda.class.getName()).log(Level.SEVERE, null, ex);
//        }
        //  }
        
        //  }
        //  }
        
        //  }
    }//GEN-LAST:event_btSalvarDiscoActionPerformed

    private void btBuscarDiscoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarDiscoActionPerformed
        // TODO add your handling code here:
        AutorController cAutor = new AutorController();
        nome = tfNomeAutor.getText();
        origem = tfOrigemAutor.getText();
        try {
            rs = cAutor.buscarAutor(nome, origem);
            idAutor = rs.getString("id");
            tfIdAutor.setText(idAutor);
        } catch (SQLException ex) {
            //Logger.getLogger(FrameCadastroDisco.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Não foi possível localizar o autor!");
        } catch (ClassNotFoundException ex) {
            //Logger.getLogger(FrameCadastroDisco.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Erro!");
        }

    }//GEN-LAST:event_btBuscarDiscoActionPerformed

    private void btBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btBuscarClienteActionPerformed

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
            java.util.logging.Logger.getLogger(FrameEfetuarVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameEfetuarVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameEfetuarVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameEfetuarVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FrameEfetuarVenda dialog = new FrameEfetuarVenda(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBuscarCliente;
    private javax.swing.JButton btBuscarDisco;
    private javax.swing.JButton btLimparDisco;
    private javax.swing.JButton btSalvarDisco;
    private javax.swing.JButton btVoltarDisco;
    private java.util.List<view.Cliente> clienteList;
    private javax.persistence.Query clienteQuery;
    private javax.swing.ButtonGroup grupoDisponivel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lbAnoLancamentoDisco;
    private javax.swing.JLabel lbCPFCliente;
    private javax.swing.JLabel lbIdAutor;
    private javax.swing.JLabel lbIdCliente;
    private javax.swing.JLabel lbNomeDisco;
    private javax.persistence.EntityManager lojaPUEntityManager;
    private javax.swing.JPanel panelBotoesAutor;
    private javax.swing.JPanel panelDadosVenda;
    private javax.swing.JPanel panelDisco;
    private javax.swing.JPanel panelDisco1;
    private javax.swing.JTextField tfCPFCliente;
    private javax.swing.JTextField tfIdAutor;
    private javax.swing.JTextField tfIdCliente;
    private javax.swing.JTextField tfNomeAutor;
    private javax.swing.JTextField tfOrigemAutor;
    private java.util.List<view.Venda> vendaList;
    private java.util.List<view.Venda> vendaList1;
    private javax.persistence.Query vendaQuery;
    private javax.persistence.Query vendaQuery1;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}

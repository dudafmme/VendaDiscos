/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.AutorController;
import controller.ClienteController;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Autor;

/**
 *
 * @author Duda
 */
public class FrameCadastroAutor extends javax.swing.JDialog {

    AutorController cAutor;
    Autor autor;
    ResultSet rs;
    /**
     * Creates new form CadastroAutor
     */
    public FrameCadastroAutor(java.awt.Frame parent, boolean modal) {
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

        grupoBanda = new javax.swing.ButtonGroup();
        panelDadosAutor = new javax.swing.JPanel();
        lbAutorNome = new javax.swing.JLabel();
        tfAutorNome = new javax.swing.JTextField();
        lbAutorOrigem = new javax.swing.JLabel();
        tfAutorOrigem = new javax.swing.JTextField();
        lbAutorBanda = new javax.swing.JLabel();
        rbAutorBandaSim = new javax.swing.JRadioButton();
        rbAutorBandaNao = new javax.swing.JRadioButton();
        panelBotoesAutor = new javax.swing.JPanel();
        btAutorVoltar = new javax.swing.JButton();
        btAutorLimpar = new javax.swing.JButton();
        btAutorSalvar = new javax.swing.JButton();
        btAutorBuscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panelDadosAutor.setBackground(new java.awt.Color(255, 255, 255));
        panelDadosAutor.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "Dados do Autor", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        lbAutorNome.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbAutorNome.setText("Nome: ");

        lbAutorOrigem.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbAutorOrigem.setText("Origem: ");

        lbAutorBanda.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbAutorBanda.setText("O Autor é uma banda ou um grupo musical? ");

        rbAutorBandaSim.setBackground(new java.awt.Color(255, 255, 255));
        grupoBanda.add(rbAutorBandaSim);
        rbAutorBandaSim.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        rbAutorBandaSim.setText("Sim");

        rbAutorBandaNao.setBackground(new java.awt.Color(255, 255, 255));
        grupoBanda.add(rbAutorBandaNao);
        rbAutorBandaNao.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        rbAutorBandaNao.setText("Não");

        javax.swing.GroupLayout panelDadosAutorLayout = new javax.swing.GroupLayout(panelDadosAutor);
        panelDadosAutor.setLayout(panelDadosAutorLayout);
        panelDadosAutorLayout.setHorizontalGroup(
            panelDadosAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDadosAutorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDadosAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDadosAutorLayout.createSequentialGroup()
                        .addGroup(panelDadosAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbAutorNome)
                            .addComponent(lbAutorOrigem))
                        .addGap(20, 20, 20)
                        .addGroup(panelDadosAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelDadosAutorLayout.createSequentialGroup()
                                .addComponent(tfAutorOrigem, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                                .addGap(209, 209, 209))
                            .addComponent(tfAutorNome)))
                    .addGroup(panelDadosAutorLayout.createSequentialGroup()
                        .addGroup(panelDadosAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelDadosAutorLayout.createSequentialGroup()
                                .addComponent(rbAutorBandaSim)
                                .addGap(18, 18, 18)
                                .addComponent(rbAutorBandaNao))
                            .addComponent(lbAutorBanda))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelDadosAutorLayout.setVerticalGroup(
            panelDadosAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDadosAutorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDadosAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tfAutorNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbAutorNome))
                .addGap(18, 18, 18)
                .addGroup(panelDadosAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbAutorOrigem)
                    .addComponent(tfAutorOrigem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lbAutorBanda)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelDadosAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbAutorBandaSim)
                    .addComponent(rbAutorBandaNao))
                .addContainerGap(66, Short.MAX_VALUE))
        );

        panelBotoesAutor.setBackground(new java.awt.Color(255, 255, 255));
        panelBotoesAutor.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), new java.awt.Color(102, 102, 102)));

        btAutorVoltar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btAutorVoltar.setText("Voltar");
        btAutorVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAutorVoltarActionPerformed(evt);
            }
        });

        btAutorLimpar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btAutorLimpar.setText("Limpar");
        btAutorLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAutorLimparActionPerformed(evt);
            }
        });

        btAutorSalvar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btAutorSalvar.setText("Salvar");
        btAutorSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAutorSalvarActionPerformed(evt);
            }
        });

        btAutorBuscar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btAutorBuscar.setText("Buscar");
        btAutorBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAutorBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBotoesAutorLayout = new javax.swing.GroupLayout(panelBotoesAutor);
        panelBotoesAutor.setLayout(panelBotoesAutorLayout);
        panelBotoesAutorLayout.setHorizontalGroup(
            panelBotoesAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBotoesAutorLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btAutorBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btAutorSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btAutorLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btAutorVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelBotoesAutorLayout.setVerticalGroup(
            panelBotoesAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBotoesAutorLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(panelBotoesAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btAutorVoltar)
                    .addComponent(btAutorLimpar)
                    .addComponent(btAutorSalvar)
                    .addComponent(btAutorBuscar))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBotoesAutor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelDadosAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelDadosAutor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelBotoesAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btAutorVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAutorVoltarActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btAutorVoltarActionPerformed

    private void btAutorLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAutorLimparActionPerformed
        // TODO add your handling code here:
        tfAutorNome.setText("");
        tfAutorOrigem.setText("");
        grupoBanda.clearSelection();
        btAutorSalvar.setVisible(true);
    }//GEN-LAST:event_btAutorLimparActionPerformed

    private void btAutorSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAutorSalvarActionPerformed
        // TODO add your handling code here:
        cAutor = new AutorController();
        autor = new Autor();
        autor.setNome(tfAutorNome.getText());
        autor.setOrigem(tfAutorOrigem.getText());
        autor.setBanda(rbAutorBandaSim.isSelected());
 
        try {
            cAutor.criarAutor(autor);
            btAutorLimparActionPerformed(evt);
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(FrameCadastroAutor.class.getName()).log(Level.SEVERE, null, ex);
        }
        
         
    }//GEN-LAST:event_btAutorSalvarActionPerformed

    private void btAutorBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAutorBuscarActionPerformed
        // TODO add your handling code here:
        cAutor = new AutorController();
        autor = new Autor();
        String nome = tfAutorNome.getText();
        try {
            rs = cAutor.buscarAutorPorNome(nome);
            tfAutorOrigem.setText(rs.getString("origem"));
            rbAutorBandaSim.setSelected(rs.getBoolean("banda"));
            rbAutorBandaNao.setSelected(!rs.getBoolean("banda"));
            btAutorSalvar.setVisible(false);
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(FrameCadastroAutor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btAutorBuscarActionPerformed

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
            java.util.logging.Logger.getLogger(FrameCadastroAutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameCadastroAutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameCadastroAutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameCadastroAutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FrameCadastroAutor dialog = new FrameCadastroAutor(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btAutorBuscar;
    private javax.swing.JButton btAutorLimpar;
    private javax.swing.JButton btAutorSalvar;
    private javax.swing.JButton btAutorVoltar;
    private javax.swing.ButtonGroup grupoBanda;
    private javax.swing.JLabel lbAutorBanda;
    private javax.swing.JLabel lbAutorNome;
    private javax.swing.JLabel lbAutorOrigem;
    private javax.swing.JPanel panelBotoesAutor;
    private javax.swing.JPanel panelDadosAutor;
    private javax.swing.JRadioButton rbAutorBandaNao;
    private javax.swing.JRadioButton rbAutorBandaSim;
    private javax.swing.JTextField tfAutorNome;
    private javax.swing.JTextField tfAutorOrigem;
    // End of variables declaration//GEN-END:variables
}

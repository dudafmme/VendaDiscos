/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import dao.ConnectionFactory;
import java.awt.Color;
import java.awt.Image;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Duda
 */
public class FrameInicial extends javax.swing.JFrame {

    static boolean escolhaFrame;

    /**
     * Creates new form FrameInicial
     */
    public FrameInicial() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
    }
//    private Image icone() {
//        return new javax.swing.ImageIcon(getClass().getResource("imagens/disco.png")).getImage();
//    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbFotoInicial = new javax.swing.JLabel();
        jMenuBar = new javax.swing.JMenuBar();
        jMenuClientes = new javax.swing.JMenu();
        jMenuClientesCadastrar = new javax.swing.JMenuItem();
        jMenuClientesBuscarAlterar = new javax.swing.JMenuItem();
        jMenuClientesListar = new javax.swing.JMenuItem();
        jMenuAutores = new javax.swing.JMenu();
        jMenuAutoresCadastrar = new javax.swing.JMenuItem();
        jMenuAutoresBuscarAlterar = new javax.swing.JMenuItem();
        jMenuAutoresListar = new javax.swing.JMenuItem();
        jMenuDiscos = new javax.swing.JMenu();
        jMenuDiscosCadastrar = new javax.swing.JMenuItem();
        jMenuDiscosBuscarAlterar = new javax.swing.JMenuItem();
        jMenuDiscosListar = new javax.swing.JMenuItem();
        jMenuVendas = new javax.swing.JMenu();
        jMenuVendasEfetuar = new javax.swing.JMenuItem();
        jMenuVendasConsultarEstornar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema Para Vendas De Discos");

        lbFotoInicial.setBackground(new java.awt.Color(0, 0, 0));
        lbFotoInicial.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbFotoInicial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/discos.png"))); // NOI18N
        lbFotoInicial.setOpaque(true);

        jMenuClientes.setBackground(new java.awt.Color(0, 0, 0));
        jMenuClientes.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jMenuClientes.setText("  Clientes  ");
        jMenuClientes.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jMenuClientesCadastrar.setBackground(new java.awt.Color(0, 0, 0));
        jMenuClientesCadastrar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuClientesCadastrar.setText("  Cadastrar  ");
        jMenuClientesCadastrar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jMenuClientesCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuClientesCadastrarActionPerformed(evt);
            }
        });
        jMenuClientes.add(jMenuClientesCadastrar);

        jMenuClientesBuscarAlterar.setBackground(new java.awt.Color(0, 0, 0));
        jMenuClientesBuscarAlterar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuClientesBuscarAlterar.setText("  Buscar / Alterar");
        jMenuClientesBuscarAlterar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jMenuClientesBuscarAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuClientesBuscarAlterarActionPerformed(evt);
            }
        });
        jMenuClientes.add(jMenuClientesBuscarAlterar);

        jMenuClientesListar.setBackground(new java.awt.Color(0, 0, 0));
        jMenuClientesListar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuClientesListar.setText("  Listar  ");
        jMenuClientesListar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jMenuClientesListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuClientesListarActionPerformed(evt);
            }
        });
        jMenuClientes.add(jMenuClientesListar);

        jMenuBar.add(jMenuClientes);

        jMenuAutores.setBackground(new java.awt.Color(0, 0, 0));
        jMenuAutores.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jMenuAutores.setText("  Autores  ");
        jMenuAutores.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jMenuAutoresCadastrar.setBackground(new java.awt.Color(0, 0, 0));
        jMenuAutoresCadastrar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuAutoresCadastrar.setText("  Cadastrar  ");
        jMenuAutoresCadastrar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.white, java.awt.Color.darkGray, java.awt.Color.lightGray));
        jMenuAutoresCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuAutoresCadastrarActionPerformed(evt);
            }
        });
        jMenuAutores.add(jMenuAutoresCadastrar);

        jMenuAutoresBuscarAlterar.setBackground(new java.awt.Color(0, 0, 0));
        jMenuAutoresBuscarAlterar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuAutoresBuscarAlterar.setText("  Buscar / Alterar");
        jMenuAutoresBuscarAlterar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jMenuAutoresBuscarAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuAutoresBuscarAlterarActionPerformed(evt);
            }
        });
        jMenuAutores.add(jMenuAutoresBuscarAlterar);

        jMenuAutoresListar.setBackground(new java.awt.Color(0, 0, 0));
        jMenuAutoresListar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuAutoresListar.setText("  Listar  ");
        jMenuAutoresListar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jMenuAutoresListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuAutoresListarActionPerformed(evt);
            }
        });
        jMenuAutores.add(jMenuAutoresListar);

        jMenuBar.add(jMenuAutores);

        jMenuDiscos.setBackground(new java.awt.Color(0, 0, 0));
        jMenuDiscos.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jMenuDiscos.setText("  Discos  ");
        jMenuDiscos.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jMenuDiscosCadastrar.setBackground(new java.awt.Color(0, 0, 0));
        jMenuDiscosCadastrar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuDiscosCadastrar.setText("  Cadastrar  ");
        jMenuDiscosCadastrar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jMenuDiscosCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuDiscosCadastrarActionPerformed(evt);
            }
        });
        jMenuDiscos.add(jMenuDiscosCadastrar);

        jMenuDiscosBuscarAlterar.setBackground(new java.awt.Color(0, 0, 0));
        jMenuDiscosBuscarAlterar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuDiscosBuscarAlterar.setText("  Buscar / Alterar");
        jMenuDiscosBuscarAlterar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jMenuDiscosBuscarAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuDiscosBuscarAlterarActionPerformed(evt);
            }
        });
        jMenuDiscos.add(jMenuDiscosBuscarAlterar);

        jMenuDiscosListar.setBackground(new java.awt.Color(0, 0, 0));
        jMenuDiscosListar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuDiscosListar.setText("  Listar  ");
        jMenuDiscosListar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jMenuDiscosListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuDiscosListarActionPerformed(evt);
            }
        });
        jMenuDiscos.add(jMenuDiscosListar);

        jMenuBar.add(jMenuDiscos);

        jMenuVendas.setBackground(new java.awt.Color(0, 0, 0));
        jMenuVendas.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jMenuVendas.setText("  Vendas  ");
        jMenuVendas.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jMenuVendasEfetuar.setBackground(new java.awt.Color(0, 0, 0));
        jMenuVendasEfetuar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuVendasEfetuar.setText("  Efetuar  ");
        jMenuVendasEfetuar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jMenuVendasEfetuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuVendasEfetuarActionPerformed(evt);
            }
        });
        jMenuVendas.add(jMenuVendasEfetuar);

        jMenuVendasConsultarEstornar.setBackground(new java.awt.Color(0, 0, 0));
        jMenuVendasConsultarEstornar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuVendasConsultarEstornar.setText("  Consultar / Estornar  ");
        jMenuVendasConsultarEstornar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jMenuVendasConsultarEstornar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuVendasConsultarEstornarActionPerformed(evt);
            }
        });
        jMenuVendas.add(jMenuVendasConsultarEstornar);

        jMenuBar.add(jMenuVendas);

        setJMenuBar(jMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbFotoInicial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbFotoInicial, javax.swing.GroupLayout.DEFAULT_SIZE, 906, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuAutoresCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuAutoresCadastrarActionPerformed
        // TODO add your handling code here:
        escolhaFrame = true;
        FrameCadastroAutor frameCadastroAutor = new FrameCadastroAutor(this, rootPaneCheckingEnabled);
        frameCadastroAutor.setVisible(true);
    }//GEN-LAST:event_jMenuAutoresCadastrarActionPerformed

    private void jMenuAutoresListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuAutoresListarActionPerformed
        try {
            // TODO add your handling code here:
            FrameAutoresList frameAutoresList = new FrameAutoresList(this, rootPaneCheckingEnabled);
            frameAutoresList.setVisible(true);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(FrameInicial.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jMenuAutoresListarActionPerformed

    private void jMenuClientesCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuClientesCadastrarActionPerformed
        // TODO add your handling code here:
        escolhaFrame = true;
        FrameCadastroCliente frameCadastroClientes = new FrameCadastroCliente(this, rootPaneCheckingEnabled);
        frameCadastroClientes.setVisible(true);

    }//GEN-LAST:event_jMenuClientesCadastrarActionPerformed

    private void jMenuClientesListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuClientesListarActionPerformed
        try {
            // TODO add your handling code here:
            FrameClientesList frameClienteList = new FrameClientesList(this, rootPaneCheckingEnabled);
            frameClienteList.setVisible(true);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(FrameInicial.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuClientesListarActionPerformed

    private void jMenuDiscosCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuDiscosCadastrarActionPerformed
        // TODO add your handling code here:
        escolhaFrame = true;
        FrameCadastroDisco frameCadastroDisco = new FrameCadastroDisco(this, rootPaneCheckingEnabled);
        frameCadastroDisco.setVisible(true);
    }//GEN-LAST:event_jMenuDiscosCadastrarActionPerformed

    private void jMenuDiscosListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuDiscosListarActionPerformed
        try {
            // TODO add your handling code here:
            FrameDiscosList frameDiscoList = new FrameDiscosList(this, rootPaneCheckingEnabled);
            frameDiscoList.setVisible(true);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FrameInicial.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(FrameInicial.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuDiscosListarActionPerformed

    private void jMenuVendasEfetuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuVendasEfetuarActionPerformed
        try {
            // TODO add your handling code here:
            escolhaFrame = true;
            FrameEfetuarVenda frameEfetuarVenda = new FrameEfetuarVenda(this, rootPaneCheckingEnabled);
            frameEfetuarVenda.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(FrameInicial.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FrameInicial.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuVendasEfetuarActionPerformed

    private void jMenuVendasConsultarEstornarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuVendasConsultarEstornarActionPerformed
        try {
            // TODO add your handling code here:
            escolhaFrame = false;
            FrameEfetuarVenda frameEfetuarVenda = new FrameEfetuarVenda(this, rootPaneCheckingEnabled);
            frameEfetuarVenda.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(FrameInicial.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FrameInicial.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuVendasConsultarEstornarActionPerformed

    private void jMenuClientesBuscarAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuClientesBuscarAlterarActionPerformed
        // TODO add your handling code here:
        escolhaFrame = false;
        FrameCadastroCliente frameCadastroCliente = new FrameCadastroCliente(this, rootPaneCheckingEnabled);
        frameCadastroCliente.setVisible(true);


    }//GEN-LAST:event_jMenuClientesBuscarAlterarActionPerformed

    private void jMenuAutoresBuscarAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuAutoresBuscarAlterarActionPerformed
        // TODO add your handling code here:
        escolhaFrame = false;
        FrameCadastroAutor frameCadastroAutor = new FrameCadastroAutor(this, rootPaneCheckingEnabled);
        frameCadastroAutor.setVisible(true);
    }//GEN-LAST:event_jMenuAutoresBuscarAlterarActionPerformed

    private void jMenuDiscosBuscarAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuDiscosBuscarAlterarActionPerformed
        // TODO add your handling code here:
        escolhaFrame = false;
        FrameCadastroDisco frameCadastroDisco = new FrameCadastroDisco(this, rootPaneCheckingEnabled);
        frameCadastroDisco.setVisible(true);
    }//GEN-LAST:event_jMenuDiscosBuscarAlterarActionPerformed

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
            java.util.logging.Logger.getLogger(FrameInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameInicial().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenuAutores;
    private javax.swing.JMenuItem jMenuAutoresBuscarAlterar;
    private javax.swing.JMenuItem jMenuAutoresCadastrar;
    private javax.swing.JMenuItem jMenuAutoresListar;
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JMenu jMenuClientes;
    private javax.swing.JMenuItem jMenuClientesBuscarAlterar;
    private javax.swing.JMenuItem jMenuClientesCadastrar;
    private javax.swing.JMenuItem jMenuClientesListar;
    private javax.swing.JMenu jMenuDiscos;
    private javax.swing.JMenuItem jMenuDiscosBuscarAlterar;
    private javax.swing.JMenuItem jMenuDiscosCadastrar;
    private javax.swing.JMenuItem jMenuDiscosListar;
    private javax.swing.JMenu jMenuVendas;
    private javax.swing.JMenuItem jMenuVendasConsultarEstornar;
    private javax.swing.JMenuItem jMenuVendasEfetuar;
    private javax.swing.JLabel lbFotoInicial;
    // End of variables declaration//GEN-END:variables
}

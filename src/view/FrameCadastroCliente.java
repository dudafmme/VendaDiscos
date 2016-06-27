/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.ClienteController;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Cliente;
import static view.FrameInicial.escolhaFrame;

/**
 *
 * @author Duda
 */
public class FrameCadastroCliente extends javax.swing.JDialog {

    String cpf;
    ResultSet rs;

    /**
     * Creates new form CadastroCliente
     */
    public FrameCadastroCliente(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        if (escolhaFrame == true) {
            btBuscarCliente.setVisible(false);
        } else {
            btClienteSalvar.setVisible(false);
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

        panelDadosCliente = new javax.swing.JPanel();
        lbClienteNome = new javax.swing.JLabel();
        tfClienteNome = new javax.swing.JTextField();
        lbClienteCpf = new javax.swing.JLabel();
        ftfClienteCPF = new javax.swing.JFormattedTextField();
        lbClienteIdade = new javax.swing.JLabel();
        tfClienteIdade = new javax.swing.JTextField();
        lbClienteTelefone = new javax.swing.JLabel();
        ftfClienteTelefone = new javax.swing.JFormattedTextField();
        jPanel1 = new javax.swing.JPanel();
        lbClienteCep = new javax.swing.JLabel();
        ftfClienteCep = new javax.swing.JFormattedTextField();
        lbClienteEnderecoLogradouro = new javax.swing.JLabel();
        tfClienteEnderecoLogradouro = new javax.swing.JTextField();
        lbClienteEnderecoNumero = new javax.swing.JLabel();
        tfClienteEnderecoNumero = new javax.swing.JTextField();
        tfClienteEnderecoComplemento = new javax.swing.JTextField();
        lbClienteEnderecoComplemento = new javax.swing.JLabel();
        lbClienteEnderecoBairro = new javax.swing.JLabel();
        tfClienteEnderecoBairro = new javax.swing.JTextField();
        lbClienteEnderecoCidade = new javax.swing.JLabel();
        tfClienteEnderecoCidade = new javax.swing.JTextField();
        lbClienteEnderecoUF = new javax.swing.JLabel();
        tfClienteEnderecoUF = new javax.swing.JTextField();
        panelBotoesCliente = new javax.swing.JPanel();
        btClienteVoltar = new javax.swing.JButton();
        btClienteLimpar = new javax.swing.JButton();
        btClienteSalvar = new javax.swing.JButton();
        btBuscarCliente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panelDadosCliente.setBackground(new java.awt.Color(255, 255, 255));
        panelDadosCliente.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "Dados do Cliente", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        lbClienteNome.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbClienteNome.setText("Nome: ");

        lbClienteCpf.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbClienteCpf.setText("CPF: ");

        try {
            ftfClienteCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ftfClienteCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ftfClienteCPFActionPerformed(evt);
            }
        });

        lbClienteIdade.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbClienteIdade.setText("Idade: ");

        lbClienteTelefone.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbClienteTelefone.setText("Telefone: ");

        try {
            ftfClienteTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.gray, java.awt.Color.gray), "Endereço", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        lbClienteCep.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbClienteCep.setText("CEP: ");

        try {
            ftfClienteCep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        lbClienteEnderecoLogradouro.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbClienteEnderecoLogradouro.setText("Logradouro: ");

        tfClienteEnderecoLogradouro.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        lbClienteEnderecoNumero.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbClienteEnderecoNumero.setText("Número: ");

        tfClienteEnderecoNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfClienteEnderecoNumeroActionPerformed(evt);
            }
        });

        lbClienteEnderecoComplemento.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbClienteEnderecoComplemento.setText("Complemento: ");

        lbClienteEnderecoBairro.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbClienteEnderecoBairro.setText("Bairro: ");

        tfClienteEnderecoBairro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfClienteEnderecoBairroActionPerformed(evt);
            }
        });

        lbClienteEnderecoCidade.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbClienteEnderecoCidade.setText("Cidade:");

        tfClienteEnderecoCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfClienteEnderecoCidadeActionPerformed(evt);
            }
        });

        lbClienteEnderecoUF.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbClienteEnderecoUF.setText("UF:");

        tfClienteEnderecoUF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfClienteEnderecoUFActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbClienteEnderecoBairro)
                    .addComponent(lbClienteEnderecoNumero)
                    .addComponent(lbClienteCep))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ftfClienteCep, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(tfClienteEnderecoBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(lbClienteEnderecoCidade)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tfClienteEnderecoCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(lbClienteEnderecoUF)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tfClienteEnderecoUF))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(tfClienteEnderecoNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lbClienteEnderecoComplemento)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tfClienteEnderecoComplemento))
                        .addComponent(tfClienteEnderecoLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(lbClienteEnderecoLogradouro)
                    .addContainerGap(449, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbClienteCep)
                    .addComponent(ftfClienteCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(tfClienteEnderecoLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbClienteEnderecoNumero)
                    .addComponent(tfClienteEnderecoNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbClienteEnderecoComplemento)
                    .addComponent(tfClienteEnderecoComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbClienteEnderecoBairro)
                    .addComponent(tfClienteEnderecoBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbClienteEnderecoCidade)
                    .addComponent(tfClienteEnderecoCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbClienteEnderecoUF)
                    .addComponent(tfClienteEnderecoUF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(53, 53, 53)
                    .addComponent(lbClienteEnderecoLogradouro)
                    .addContainerGap(83, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout panelDadosClienteLayout = new javax.swing.GroupLayout(panelDadosCliente);
        panelDadosCliente.setLayout(panelDadosClienteLayout);
        panelDadosClienteLayout.setHorizontalGroup(
            panelDadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDadosClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDadosClienteLayout.createSequentialGroup()
                        .addGroup(panelDadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lbClienteCpf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbClienteNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(20, 20, 20)
                        .addGroup(panelDadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelDadosClienteLayout.createSequentialGroup()
                                .addComponent(ftfClienteCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lbClienteIdade)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tfClienteIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(47, 47, 47)
                                .addComponent(lbClienteTelefone)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ftfClienteTelefone))
                            .addComponent(tfClienteNome)))
                    .addGroup(panelDadosClienteLayout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelDadosClienteLayout.setVerticalGroup(
            panelDadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDadosClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelDadosClienteLayout.createSequentialGroup()
                        .addGroup(panelDadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tfClienteNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbClienteNome))
                        .addGap(18, 18, 18)
                        .addGroup(panelDadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelDadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lbClienteCpf)
                                .addComponent(ftfClienteCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelDadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lbClienteTelefone)
                                .addComponent(ftfClienteTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(tfClienteIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbClienteIdade))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        panelBotoesCliente.setBackground(new java.awt.Color(255, 255, 255));
        panelBotoesCliente.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), new java.awt.Color(102, 102, 102)));

        btClienteVoltar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btClienteVoltar.setText("Voltar");
        btClienteVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btClienteVoltarActionPerformed(evt);
            }
        });

        btClienteLimpar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btClienteLimpar.setText("Limpar");
        btClienteLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btClienteLimparActionPerformed(evt);
            }
        });

        btClienteSalvar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btClienteSalvar.setText("Salvar");
        btClienteSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btClienteSalvarActionPerformed(evt);
            }
        });

        btBuscarCliente.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btBuscarCliente.setText("Buscar");
        btBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBotoesClienteLayout = new javax.swing.GroupLayout(panelBotoesCliente);
        panelBotoesCliente.setLayout(panelBotoesClienteLayout);
        panelBotoesClienteLayout.setHorizontalGroup(
            panelBotoesClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBotoesClienteLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btClienteSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btClienteLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btClienteVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelBotoesClienteLayout.setVerticalGroup(
            panelBotoesClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBotoesClienteLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(panelBotoesClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btClienteVoltar)
                    .addComponent(btClienteLimpar)
                    .addComponent(btClienteSalvar)
                    .addComponent(btBuscarCliente))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBotoesCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelDadosCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 548, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelDadosCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelBotoesCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfClienteEnderecoNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfClienteEnderecoNumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfClienteEnderecoNumeroActionPerformed

    private void tfClienteEnderecoBairroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfClienteEnderecoBairroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfClienteEnderecoBairroActionPerformed

    private void tfClienteEnderecoCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfClienteEnderecoCidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfClienteEnderecoCidadeActionPerformed

    private void tfClienteEnderecoUFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfClienteEnderecoUFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfClienteEnderecoUFActionPerformed

    private void btClienteVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btClienteVoltarActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btClienteVoltarActionPerformed

    private void btClienteLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btClienteLimparActionPerformed
        // TODO add your handling code here:
        tfClienteNome.setText("");
        tfClienteIdade.setText("");
        tfClienteEnderecoBairro.setText("");
        tfClienteEnderecoCidade.setText("");
        tfClienteEnderecoComplemento.setText("");
        tfClienteEnderecoLogradouro.setText("");
        tfClienteEnderecoNumero.setText("");
        tfClienteEnderecoUF.setText("");
        ftfClienteCPF.setText("");
        ftfClienteCep.setText("");
        ftfClienteTelefone.setText("");
        //btClienteSalvar.setVisible(true);
    }//GEN-LAST:event_btClienteLimparActionPerformed

    private void ftfClienteCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ftfClienteCPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ftfClienteCPFActionPerformed

    private void btClienteSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btClienteSalvarActionPerformed
        // TODO add your handling code here:
        Cliente cliente = new Cliente();
        ClienteController cCliente = new ClienteController();

        try {
            cliente.setNome(tfClienteNome.getText());
            cliente.setCpf(ftfClienteCPF.getText());
            cliente.setIdade(Integer.parseInt(tfClienteIdade.getText()));
            cliente.setTelefone(ftfClienteTelefone.getText());
            cliente.setCep(ftfClienteCep.getText());
            cliente.setLogradouro(tfClienteEnderecoLogradouro.getText());
            cliente.setNumero(Integer.parseInt(tfClienteEnderecoNumero.getText()));
            cliente.setBairro(tfClienteEnderecoBairro.getText());
            cliente.setCidade(tfClienteEnderecoCidade.getText());
            cliente.setUf(tfClienteEnderecoUF.getText());
            cliente.setComplemento(tfClienteEnderecoComplemento.getText());

        } catch (ArithmeticException a) {
            JOptionPane.showMessageDialog(this,
                    "Idade e número são campos numéricos, preencha-os corretamente!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro!");
        }

        try {
            cCliente.criarCliente(cliente);
            btClienteLimparActionPerformed(evt);
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(FrameCadastroCliente.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Erro!");
        }

    }//GEN-LAST:event_btClienteSalvarActionPerformed

    private void btBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarClienteActionPerformed
        // TODO add your handling code here:
        ClienteController cCliente = new ClienteController();
        cpf = ftfClienteCPF.getText();
        try {
            rs = cCliente.buscarCliente(cpf);
            tfClienteNome.setText(rs.getString("nome"));
            tfClienteIdade.setText(rs.getString("idade"));
            ftfClienteTelefone.setText(rs.getString("telefone"));
            ftfClienteCep.setText(rs.getString("cep"));
            tfClienteEnderecoUF.setText(rs.getString("uf"));
            tfClienteEnderecoNumero.setText(rs.getString("numero"));
            tfClienteEnderecoLogradouro.setText(rs.getString("logradouro"));
            tfClienteEnderecoComplemento.setText(rs.getString("complemento"));
            tfClienteEnderecoCidade.setText(rs.getString("cidade"));
            tfClienteEnderecoBairro.setText("bairro");
            //btClienteSalvar.setVisible(false);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(FrameEfetuarVenda.class.getName()).log(Level.SEVERE, null, ex);
        }
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
            java.util.logging.Logger.getLogger(FrameCadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameCadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameCadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameCadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FrameCadastroCliente dialog = new FrameCadastroCliente(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btClienteLimpar;
    private javax.swing.JButton btClienteSalvar;
    private javax.swing.JButton btClienteVoltar;
    private javax.swing.JFormattedTextField ftfClienteCPF;
    private javax.swing.JFormattedTextField ftfClienteCep;
    private javax.swing.JFormattedTextField ftfClienteTelefone;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbClienteCep;
    private javax.swing.JLabel lbClienteCpf;
    private javax.swing.JLabel lbClienteEnderecoBairro;
    private javax.swing.JLabel lbClienteEnderecoCidade;
    private javax.swing.JLabel lbClienteEnderecoComplemento;
    private javax.swing.JLabel lbClienteEnderecoLogradouro;
    private javax.swing.JLabel lbClienteEnderecoNumero;
    private javax.swing.JLabel lbClienteEnderecoUF;
    private javax.swing.JLabel lbClienteIdade;
    private javax.swing.JLabel lbClienteNome;
    private javax.swing.JLabel lbClienteTelefone;
    private javax.swing.JPanel panelBotoesCliente;
    private javax.swing.JPanel panelDadosCliente;
    private javax.swing.JTextField tfClienteEnderecoBairro;
    private javax.swing.JTextField tfClienteEnderecoCidade;
    private javax.swing.JTextField tfClienteEnderecoComplemento;
    private javax.swing.JTextField tfClienteEnderecoLogradouro;
    private javax.swing.JTextField tfClienteEnderecoNumero;
    private javax.swing.JTextField tfClienteEnderecoUF;
    private javax.swing.JTextField tfClienteIdade;
    private javax.swing.JTextField tfClienteNome;
    // End of variables declaration//GEN-END:variables
}

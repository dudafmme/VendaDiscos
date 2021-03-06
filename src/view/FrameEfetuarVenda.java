/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.AutorController;
import controller.ClienteController;
import controller.DiscoController;
import controller.VendaController;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Cliente;
import model.Disco;
import model.Venda;
import static view.FrameInicial.escolhaFrame;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Duda
 */
public class FrameEfetuarVenda extends javax.swing.JDialog {

    String nomeAutor;
    String idDisco;
    String nomeDisco;
    String precoDisco;
    String qtdeDisponivel;
    String cpf;
    String idCliente;
    String valorTotal;
    String qtdeVendidaDisco;
    String qtde;
    Connection conexao;
    PreparedStatement comando;
    ResultSet rs;
    VendaController cVenda;
    /**
     * Creates new form FrameVenda
     */
    public FrameEfetuarVenda(java.awt.Frame parent, boolean modal) throws SQLException, ClassNotFoundException {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        if (escolhaFrame == true) {
            btBuscarVenda.setVisible(false);
        } else {
            btSalvarVenda.setVisible(false);
        }
        updateTable();
    }
    private void updateTable() throws SQLException, ClassNotFoundException{
        cVenda = new VendaController();
        rs = cVenda.listarVendas();
        tableVendas.setModel(DbUtils.resultSetToTableModel(rs));
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelVendasList = new javax.swing.JPanel();
        panelDadosVenda = new javax.swing.JPanel();
        panelDadosDisco = new javax.swing.JPanel();
        lbNomeDisco = new javax.swing.JLabel();
        tfNomeDisco = new javax.swing.JTextField();
        lbAutor = new javax.swing.JLabel();
        tfAutor = new javax.swing.JTextField();
        btBuscarDisco = new javax.swing.JButton();
        tfIdDisco = new javax.swing.JTextField();
        lbIdDisco = new javax.swing.JLabel();
        lbValorDisco = new javax.swing.JLabel();
        tfValorDisco = new javax.swing.JTextField();
        lbQtdeDisponivelDisco = new javax.swing.JLabel();
        tfQtdeDisponivelDisco = new javax.swing.JTextField();
        panelDadosCliente = new javax.swing.JPanel();
        btBuscarCliente = new javax.swing.JButton();
        tfIdCliente = new javax.swing.JTextField();
        lbIdCliente = new javax.swing.JLabel();
        lbCPFCliente = new javax.swing.JLabel();
        tfCPFCliente = new javax.swing.JFormattedTextField();
        panelVendaDados = new javax.swing.JPanel();
        lbQuantidadeVendida = new javax.swing.JLabel();
        tfQtdeVendida = new javax.swing.JTextField();
        btCalcularVenda = new javax.swing.JButton();
        lbValorTotalVenda = new javax.swing.JLabel();
        tfValorTotalVenda = new javax.swing.JTextField();
        panelBotoesAutor = new javax.swing.JPanel();
        btVoltarVenda = new javax.swing.JButton();
        btLimparVenda = new javax.swing.JButton();
        btSalvarVenda = new javax.swing.JButton();
        btBuscarVenda = new javax.swing.JButton();
        panelVendasList1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableVendas = new javax.swing.JTable();

        panelVendasList.setBackground(new java.awt.Color(255, 255, 255));
        panelVendasList.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.darkGray, java.awt.Color.lightGray), "Vendas", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Black", 0, 12))); // NOI18N

        javax.swing.GroupLayout panelVendasListLayout = new javax.swing.GroupLayout(panelVendasList);
        panelVendasList.setLayout(panelVendasListLayout);
        panelVendasListLayout.setHorizontalGroup(
            panelVendasListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 601, Short.MAX_VALUE)
        );
        panelVendasListLayout.setVerticalGroup(
            panelVendasListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(250, 250, 250));

        panelDadosVenda.setBackground(new java.awt.Color(255, 255, 255));
        panelDadosVenda.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "Efetuar Venda", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        panelDadosDisco.setBackground(new java.awt.Color(255, 255, 255));
        panelDadosDisco.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Dados do Disco", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        lbNomeDisco.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbNomeDisco.setText("Nome: ");

        lbAutor.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbAutor.setText("Autor: ");

        btBuscarDisco.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btBuscarDisco.setText("Buscar Disco");
        btBuscarDisco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarDiscoActionPerformed(evt);
            }
        });

        tfIdDisco.setEnabled(false);

        lbIdDisco.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbIdDisco.setText("Id: ");

        lbValorDisco.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbValorDisco.setText("Valor: (R$)");

        tfValorDisco.setEnabled(false);

        lbQtdeDisponivelDisco.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbQtdeDisponivelDisco.setText("Qtde. Disp.: ");

        tfQtdeDisponivelDisco.setEnabled(false);

        javax.swing.GroupLayout panelDadosDiscoLayout = new javax.swing.GroupLayout(panelDadosDisco);
        panelDadosDisco.setLayout(panelDadosDiscoLayout);
        panelDadosDiscoLayout.setHorizontalGroup(
            panelDadosDiscoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDadosDiscoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDadosDiscoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDadosDiscoLayout.createSequentialGroup()
                        .addGroup(panelDadosDiscoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbAutor)
                            .addComponent(lbNomeDisco))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelDadosDiscoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfAutor)
                            .addComponent(tfNomeDisco)))
                    .addGroup(panelDadosDiscoLayout.createSequentialGroup()
                        .addComponent(lbIdDisco)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfIdDisco, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btBuscarDisco, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDadosDiscoLayout.createSequentialGroup()
                        .addComponent(lbValorDisco)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfValorDisco, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbQtdeDisponivelDisco)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfQtdeDisponivelDisco)))
                .addContainerGap())
        );
        panelDadosDiscoLayout.setVerticalGroup(
            panelDadosDiscoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDadosDiscoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDadosDiscoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNomeDisco)
                    .addComponent(tfNomeDisco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelDadosDiscoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbAutor)
                    .addComponent(tfAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelDadosDiscoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbValorDisco)
                    .addComponent(tfValorDisco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbQtdeDisponivelDisco)
                    .addComponent(tfQtdeDisponivelDisco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelDadosDiscoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbIdDisco)
                    .addComponent(tfIdDisco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btBuscarDisco))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelDadosCliente.setBackground(new java.awt.Color(255, 255, 255));
        panelDadosCliente.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Dados do Cliente", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

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

        try {
            tfCPFCliente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        tfCPFCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCPFClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelDadosClienteLayout = new javax.swing.GroupLayout(panelDadosCliente);
        panelDadosCliente.setLayout(panelDadosClienteLayout);
        panelDadosClienteLayout.setHorizontalGroup(
            panelDadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDadosClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelDadosClienteLayout.createSequentialGroup()
                        .addComponent(lbIdCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lbCPFCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelDadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btBuscarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                    .addComponent(tfCPFCliente))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelDadosClienteLayout.setVerticalGroup(
            panelDadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDadosClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCPFCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tfCPFCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelDadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbIdCliente)
                    .addComponent(tfIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btBuscarCliente))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelVendaDados.setBackground(new java.awt.Color(255, 255, 255));
        panelVendaDados.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        lbQuantidadeVendida.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbQuantidadeVendida.setText("Qtde. Vendida: ");

        btCalcularVenda.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btCalcularVenda.setText("Calcular Total");
        btCalcularVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCalcularVendaActionPerformed(evt);
            }
        });

        lbValorTotalVenda.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbValorTotalVenda.setText("Valor Total: (R$)");

        tfValorTotalVenda.setEnabled(false);

        javax.swing.GroupLayout panelVendaDadosLayout = new javax.swing.GroupLayout(panelVendaDados);
        panelVendaDados.setLayout(panelVendaDadosLayout);
        panelVendaDadosLayout.setHorizontalGroup(
            panelVendaDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelVendaDadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelVendaDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelVendaDadosLayout.createSequentialGroup()
                        .addGap(0, 114, Short.MAX_VALUE)
                        .addComponent(btCalcularVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelVendaDadosLayout.createSequentialGroup()
                        .addGroup(panelVendaDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbQuantidadeVendida)
                            .addComponent(lbValorTotalVenda))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelVendaDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfValorTotalVenda)
                            .addComponent(tfQtdeVendida))))
                .addContainerGap())
        );
        panelVendaDadosLayout.setVerticalGroup(
            panelVendaDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelVendaDadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelVendaDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbQuantidadeVendida)
                    .addComponent(tfQtdeVendida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelVendaDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbValorTotalVenda)
                    .addComponent(tfValorTotalVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btCalcularVenda)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelDadosVendaLayout = new javax.swing.GroupLayout(panelDadosVenda);
        panelDadosVenda.setLayout(panelDadosVendaLayout);
        panelDadosVendaLayout.setHorizontalGroup(
            panelDadosVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDadosVendaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDadosVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelDadosDisco, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelVendaDados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelDadosCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelDadosVendaLayout.setVerticalGroup(
            panelDadosVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDadosVendaLayout.createSequentialGroup()
                .addComponent(panelDadosCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelDadosDisco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelVendaDados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        panelBotoesAutor.setBackground(new java.awt.Color(255, 255, 255));
        panelBotoesAutor.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), new java.awt.Color(102, 102, 102)));

        btVoltarVenda.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btVoltarVenda.setText("Voltar");
        btVoltarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarVendaActionPerformed(evt);
            }
        });

        btLimparVenda.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btLimparVenda.setText("Limpar");
        btLimparVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparVendaActionPerformed(evt);
            }
        });

        btSalvarVenda.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btSalvarVenda.setText("Concluir");
        btSalvarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarVendaActionPerformed(evt);
            }
        });

        btBuscarVenda.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btBuscarVenda.setText("Buscar");
        btBuscarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarVendaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBotoesAutorLayout = new javax.swing.GroupLayout(panelBotoesAutor);
        panelBotoesAutor.setLayout(panelBotoesAutorLayout);
        panelBotoesAutorLayout.setHorizontalGroup(
            panelBotoesAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBotoesAutorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btSalvarVenda)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btBuscarVenda)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btLimparVenda)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btVoltarVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        panelBotoesAutorLayout.setVerticalGroup(
            panelBotoesAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBotoesAutorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBotoesAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btVoltarVenda)
                    .addComponent(btLimparVenda)
                    .addComponent(btSalvarVenda)
                    .addComponent(btBuscarVenda))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelVendasList1.setBackground(new java.awt.Color(255, 255, 255));
        panelVendasList1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.darkGray, java.awt.Color.lightGray), "Vendas", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Black", 0, 12))); // NOI18N

        tableVendas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tableVendas.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jScrollPane1.setViewportView(tableVendas);

        javax.swing.GroupLayout panelVendasList1Layout = new javax.swing.GroupLayout(panelVendasList1);
        panelVendasList1.setLayout(panelVendasList1Layout);
        panelVendasList1Layout.setHorizontalGroup(
            panelVendasList1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelVendasList1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 768, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelVendasList1Layout.setVerticalGroup(
            panelVendasList1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelVendasList1Layout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelDadosVenda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelBotoesAutor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelVendasList1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(1, 1, 1))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelDadosVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelBotoesAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(panelVendasList1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btBuscarDiscoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarDiscoActionPerformed
        // TODO add your handling code here:
        DiscoController cDisco = new DiscoController();
        nomeDisco = tfNomeDisco.getText();
        nomeAutor = tfAutor.getText();
        try {
            rs = cDisco.buscarDisco(nomeDisco, nomeAutor);
            idDisco = rs.getString(1);
            qtdeDisponivel = rs.getString(4);
            precoDisco = rs.getString(5);
            tfIdDisco.setText(idDisco);
            tfValorDisco.setText(precoDisco);
            tfQtdeDisponivelDisco.setText(qtdeDisponivel);
        } catch (SQLException ex) {
            //Logger.getLogger(FrameCadastroDisco.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Não foi possível localizar o disco!");
        } catch (ClassNotFoundException ex) {
            //Logger.getLogger(FrameCadastroDisco.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Erro!");
        }
    }//GEN-LAST:event_btBuscarDiscoActionPerformed

    private void btBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarClienteActionPerformed
        // TODO add your handling code here:

        ClienteController cCliente = new ClienteController();
        cpf = tfCPFCliente.getText();
        try {
            rs = cCliente.buscarCliente(cpf);
            idCliente = rs.getString("id");
            tfIdCliente.setText(idCliente);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(FrameEfetuarVenda.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btBuscarClienteActionPerformed

    private void btCalcularVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCalcularVendaActionPerformed
        // TODO add your handling code here:
        String qtdeDisp = tfQtdeDisponivelDisco.getText();
        qtdeVendidaDisco = tfQtdeVendida.getText();
        idDisco = tfIdDisco.getText();

        if (Integer.parseInt(qtdeVendidaDisco) > Integer.parseInt(qtdeDisp)) {
            JOptionPane.showMessageDialog(this, "Quantidade insuficiente no estoque! Diminua a quantidade de venda!");
        } else {
            VendaController cVenda = new VendaController();
            Float valorTotalVenda = Float.parseFloat(precoDisco) * Integer.parseInt(qtdeVendidaDisco);
            tfValorTotalVenda.setText(Float.toString(valorTotalVenda)); 
        }

    }//GEN-LAST:event_btCalcularVendaActionPerformed

    private void btVoltarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarVendaActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btVoltarVendaActionPerformed

    private void btLimparVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparVendaActionPerformed
        // TODO add your handling code here:
        tfIdCliente.setText("");
        tfCPFCliente.setText("");
        tfNomeDisco.setText("");
        tfAutor.setText("");
        tfValorDisco.setText("");
        tfQtdeDisponivelDisco.setText("");
        tfIdDisco.setText("");
        tfQtdeVendida.setText("");
        tfValorTotalVenda.setText("");
    }//GEN-LAST:event_btLimparVendaActionPerformed

    private void btSalvarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarVendaActionPerformed
        // TODO add your handling code here:

        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date();
        String dataAtual = dateFormat.format(date);

        VendaController cVenda = new VendaController();
        Venda venda = new Venda();
        Disco disco = new Disco();
        Cliente cliente = new Cliente();

        Long idCliente = Long.parseLong(tfIdCliente.getText());
        String cpf = tfCPFCliente.getText();
        String nomeDisco = tfNomeDisco.getText();
        String nomeAutor = tfAutor.getText();
        Float valor = Float.parseFloat(tfValorDisco.getText());
        int qtdeDisponivel = Integer.parseInt(tfQtdeDisponivelDisco.getText());
        Long discoID = Long.parseLong(tfIdDisco.getText());
        int qtdeVendida = Integer.parseInt(tfQtdeVendida.getText());
        Float valorTotalVenda = Float.parseFloat(tfValorTotalVenda.getText());

        cliente.setId(idCliente);
        disco.setId(discoID);
        disco.setPreco(valor);

        venda.setQtdeVenda(qtdeVendida);
        venda.setValorTotal(valorTotalVenda);
        venda.setDataVenda(nomeAutor);
        venda.setDataVenda(dataAtual);
        venda.setCliente(cliente);
        venda.setDisco(disco);

        qtde = Integer.toString(qtdeDisponivel - qtdeVendida);
        
        try {
            cVenda.efetuarVenda(venda);
            JOptionPane.showMessageDialog(this, "Quantidade em estoque: " + qtde);
            cVenda.atualizarEstoque(qtde, idDisco);
            updateTable();

            btLimparVendaActionPerformed(evt);
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(FrameEfetuarVenda.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btSalvarVendaActionPerformed

    private void tfCPFClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCPFClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCPFClienteActionPerformed

    private void btBuscarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarVendaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btBuscarVendaActionPerformed

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
                try {
                    FrameEfetuarVenda dialog = new FrameEfetuarVenda(new javax.swing.JFrame(), true);
                    dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                        @Override
                        public void windowClosing(java.awt.event.WindowEvent e) {
                            System.exit(0);
                        }
                    });
                    dialog.setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(FrameEfetuarVenda.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(FrameEfetuarVenda.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBuscarCliente;
    private javax.swing.JButton btBuscarDisco;
    private javax.swing.JButton btBuscarVenda;
    private javax.swing.JButton btCalcularVenda;
    private javax.swing.JButton btLimparVenda;
    private javax.swing.JButton btSalvarVenda;
    private javax.swing.JButton btVoltarVenda;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbAutor;
    private javax.swing.JLabel lbCPFCliente;
    private javax.swing.JLabel lbIdCliente;
    private javax.swing.JLabel lbIdDisco;
    private javax.swing.JLabel lbNomeDisco;
    private javax.swing.JLabel lbQtdeDisponivelDisco;
    private javax.swing.JLabel lbQuantidadeVendida;
    private javax.swing.JLabel lbValorDisco;
    private javax.swing.JLabel lbValorTotalVenda;
    private javax.swing.JPanel panelBotoesAutor;
    private javax.swing.JPanel panelDadosCliente;
    private javax.swing.JPanel panelDadosDisco;
    private javax.swing.JPanel panelDadosVenda;
    private javax.swing.JPanel panelVendaDados;
    private javax.swing.JPanel panelVendasList;
    private javax.swing.JPanel panelVendasList1;
    private javax.swing.JTable tableVendas;
    private javax.swing.JTextField tfAutor;
    private javax.swing.JFormattedTextField tfCPFCliente;
    private javax.swing.JTextField tfIdCliente;
    private javax.swing.JTextField tfIdDisco;
    private javax.swing.JTextField tfNomeDisco;
    private javax.swing.JTextField tfQtdeDisponivelDisco;
    private javax.swing.JTextField tfQtdeVendida;
    private javax.swing.JTextField tfValorDisco;
    private javax.swing.JTextField tfValorTotalVenda;
    // End of variables declaration//GEN-END:variables
}

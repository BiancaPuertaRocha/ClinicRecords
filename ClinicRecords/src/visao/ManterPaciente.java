/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import controle.ControlePaciente;
import modelo.Pessoa;
import java.text.ParseException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Bianca
 */
public class ManterPaciente extends javax.swing.JInternalFrame {

    private boolean novo = false;
    private int codigoEditar;
    private ControlePaciente controle;

    public ManterPaciente() {
        initComponents();
        controle = new ControlePaciente();
        painel.setEnabledAt(1, false);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        gerenteEntPaciente = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("ClinicRecordsPU").createEntityManager();
        consultaPaciente = java.beans.Beans.isDesignTime() ? null : gerenteEntPaciente.createQuery("select paciente from Pessoa paciente");
        listaPaciente = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : org.jdesktop.observablecollections.ObservableCollections.observableList(consultaPaciente.getResultList());
        painel = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaPaciente = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        botPesquisaPaciente = new javax.swing.JButton();
        botAtlteraPaciente = new javax.swing.JButton();
        botExcluirPaciente = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        botNovoPaciente = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtPesquisa = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        botFecharPesquisaPaciente = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        nomePac = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cidadePac = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        InscPac = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        ufPac = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        endPac = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        cartSusPac = new javax.swing.JTextField();
        rgPac = new javax.swing.JFormattedTextField();
        cpfPac = new javax.swing.JFormattedTextField();
        jLabel11 = new javax.swing.JLabel();
        emailPac = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        estPac = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        profPac = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        sexPac = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        paiPac = new javax.swing.JTextField();
        maePac = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        telPac = new javax.swing.JFormattedTextField();
        jLabel21 = new javax.swing.JLabel();
        bairroPac = new javax.swing.JTextField();
        dataPac = new com.toedter.calendar.JDateChooser();
        botCancelaPac = new javax.swing.JButton();
        botConfirmPac = new javax.swing.JButton();

        setClosable(true);

        jPanel1.setPreferredSize(new java.awt.Dimension(734, 534));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Resultados"));

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, listaPaciente, tabelaPaciente);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${nome}"));
        columnBinding.setColumnName("Nome");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${cartsus}"));
        columnBinding.setColumnName("Cartsus");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${telefone}"));
        columnBinding.setColumnName("Telefone");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        jScrollPane1.setViewportView(tabelaPaciente);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 321, Short.MAX_VALUE)
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Opções"));
        jPanel4.setLayout(new java.awt.GridLayout(1, 0));

        botPesquisaPaciente.setText("Pesquisar");
        botPesquisaPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botPesquisaPacienteActionPerformed(evt);
            }
        });
        jPanel4.add(botPesquisaPaciente);

        botAtlteraPaciente.setText("Alterar");
        botAtlteraPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botAtlteraPacienteActionPerformed(evt);
            }
        });
        jPanel4.add(botAtlteraPaciente);

        botExcluirPaciente.setText("Excluir");
        botExcluirPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botExcluirPacienteActionPerformed(evt);
            }
        });
        jPanel4.add(botExcluirPaciente);

        jButton3.setText("Gerar Prontuário");
        jPanel4.add(jButton3);

        botNovoPaciente.setText("Novo");
        botNovoPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botNovoPacienteActionPerformed(evt);
            }
        });
        jPanel4.add(botNovoPaciente);

        jLabel1.setText("Pesquisar Por Nome");

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel20.setText("Manter Paciente");

        botFecharPesquisaPaciente.setText("Fechar");
        botFecharPesquisaPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botFecharPesquisaPacienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(364, 364, 364)
                        .addComponent(jLabel20)))
                .addContainerGap(303, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(botFecharPesquisaPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 809, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botFecharPesquisaPaciente)
                .addGap(22, 22, 22))
        );

        painel.addTab("Pesquisa", jPanel1);

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Ficha de Cadastro de Pacientes"));

        jLabel3.setText("Nome");

        nomePac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomePacActionPerformed(evt);
            }
        });

        jLabel4.setText("Cidade");

        jLabel5.setText("Numero da Inscrição");

        jLabel6.setText("RG");

        InscPac.setEditable(false);
        InscPac.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        jLabel7.setText("CPF");

        jLabel8.setText("UF");

        ufPac.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AM", "AP", "BA", "CE", "DF", "ES", "GO", "MA", "MG", "MS", "MT", "PA", "PB", "PE", "PI", "PR", "RJ", "RN", "RO", "RR", "RS", "SC", "SE", "SP", "TO" }));

        jLabel9.setText("Endereço");

        endPac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                endPacActionPerformed(evt);
            }
        });

        jLabel10.setText("Cartão SUS");

        rgPac.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        jLabel11.setText("E-mail");

        jLabel12.setText("Telefone");

        jLabel13.setText("Estado Civil");

        estPac.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Solteiro(a)", "Casado(a)", "Viúvo(a)", "Divorciado(a)" }));

        jLabel14.setText("Profissão");

        jLabel15.setText("Sexo");

        sexPac.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Feminino", "Masculino", "Outro" }));

        jLabel17.setText("Nome do Pai");

        jLabel18.setText("Nome da Mãe");

        jLabel2.setText("Data de Nascimento");

        jLabel21.setText("Bairro");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addComponent(paiPac, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addComponent(maePac))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel21)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(rgPac)
                                            .addComponent(nomePac, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(21, 21, 21)
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel7)
                                            .addComponent(cpfPac)
                                            .addComponent(cidadePac)))
                                    .addComponent(endPac)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel13)
                                                    .addComponent(estPac, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(27, 27, 27)
                                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel14)
                                                    .addComponent(profPac, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel9)
                                            .addComponent(jLabel11))
                                        .addGap(25, 25, 25)
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(sexPac, 0, 132, Short.MAX_VALUE)
                                            .addGroup(jPanel5Layout.createSequentialGroup()
                                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel18)
                                                    .addComponent(jLabel15))
                                                .addGap(0, 0, Short.MAX_VALUE))))
                                    .addComponent(bairroPac)
                                    .addComponent(emailPac))
                                .addGap(65, 65, 65)))
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ufPac, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cartSusPac)
                            .addComponent(telPac)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel8)
                                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(InscPac, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel12))
                                .addGap(0, 62, Short.MAX_VALUE))
                            .addComponent(dataPac, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(82, 82, 82))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nomePac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cidadePac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dataPac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rgPac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cpfPac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(telPac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(endPac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bairroPac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel11)
                        .addGap(12, 12, 12)
                        .addComponent(emailPac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(estPac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(profPac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sexPac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel17))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(paiPac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(maePac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(126, 126, 126)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cartSusPac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(InscPac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ufPac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        botCancelaPac.setText("Cancelar");
        botCancelaPac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botCancelaPacActionPerformed(evt);
            }
        });

        botConfirmPac.setText("Confirmar");
        botConfirmPac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botConfirmPacActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(botConfirmPac)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botCancelaPac)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botConfirmPac)
                    .addComponent(botCancelaPac))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        painel.addTab("Cadastro", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painel)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painel)
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botFecharPesquisaPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botFecharPesquisaPacienteActionPerformed
        this.dispose();
    }//GEN-LAST:event_botFecharPesquisaPacienteActionPerformed

    private void nomePacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomePacActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomePacActionPerformed

    private void endPacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_endPacActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_endPacActionPerformed

    private void botCancelaPacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botCancelaPacActionPerformed
        painel.setEnabledAt(0, true);
        painel.setSelectedIndex(0);
        painel.setEnabledAt(1, false);
    }//GEN-LAST:event_botCancelaPacActionPerformed

    private void botNovoPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botNovoPacienteActionPerformed
        try {
            telPac.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###########")));
        } catch (ParseException ex) {
            Logger.getLogger(ManterPaciente.class.getName()).log(Level.SEVERE, null, ex);
        }
        cpfPac.setText("");
        rgPac.setText("");
        nomePac.setText("");
        cidadePac.setText("");
        endPac.setText("");
        emailPac.setText("");
        telPac.setText("");
        profPac.setText("");
        cartSusPac.setText("");
        maePac.setText("");
        paiPac.setText("");
        bairroPac.setText("");
        painel.setEnabledAt(1, true);
        painel.setSelectedIndex(1);
        painel.setEnabledAt(0, false);
        this.novo = true;
    }//GEN-LAST:event_botNovoPacienteActionPerformed

    private void botAtlteraPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botAtlteraPacienteActionPerformed
        this.novo = false;
        Pessoa pacienteSelected;
        int posicao;
        posicao = tabelaPaciente.getSelectedRow();
        if (posicao != -1) {

            pacienteSelected = listaPaciente.get(posicao);
            this.codigoEditar = pacienteSelected.getCodigo();
            
            int x = 0;
            for (int y = 0; y < ufPac.getItemCount(); y++) {
                if (ufPac.getItemAt(y).equals(pacienteSelected.getUf())) {
                    x = y;
                }
            }
            ufPac.setSelectedIndex(x);
            cpfPac.setText(pacienteSelected.getCpf());
            rgPac.setText(pacienteSelected.getRg());
            nomePac.setText(pacienteSelected.getNome());
            cidadePac.setText(pacienteSelected.getCidade());
            endPac.setText(pacienteSelected.getEndereco());
            emailPac.setText(pacienteSelected.getEmail());
            telPac.setText(pacienteSelected.getTelefone());
            dataPac.setDate(pacienteSelected.getDatanasc());
            profPac.setText(pacienteSelected.getProfissao());
            cartSusPac.setText(pacienteSelected.getCartsus());
            maePac.setText(pacienteSelected.getNomemae());
            paiPac.setText(pacienteSelected.getNomepai());
            bairroPac.setText(pacienteSelected.getBairro());
            InscPac.setText(Integer.toString(pacienteSelected.getCodigo()));
            
            int s=0;
            for (int y = 0; y < sexPac.getItemCount(); y++) {
                if (sexPac.getItemAt(y).equals(pacienteSelected.getSexo())) {
                    s = y;
                }
            }
            sexPac.setSelectedIndex(s);
            int est =0;
            for (int y = 0; y < estPac.getItemCount(); y++) {
                if (estPac.getItemAt(y).equals(pacienteSelected.getEstcivil())) {
                    est = y;
                }
            }
            estPac.setSelectedIndex(est);
            painel.setEnabledAt(1, true);
            painel.setSelectedIndex(1);

            painel.setEnabledAt(0, false);
        } else {
            JOptionPane.showMessageDialog(this, "Selecione um paciente");
        }
    }//GEN-LAST:event_botAtlteraPacienteActionPerformed

    private void botConfirmPacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botConfirmPacActionPerformed
        Pessoa paciente;
        Date data = new Date(System.currentTimeMillis());
        paciente = new Pessoa();
        paciente.setDatacad(data);
        paciente.setNome(nomePac.getText());
        paciente.setCartsus(cartSusPac.getText());
        paciente.setCidade(cidadePac.getText());
        paciente.setCpf(cpfPac.getText());
        paciente.setDatanasc(dataPac.getDate());
        paciente.setEmail(emailPac.getText());
        paciente.setEndereco(endPac.getText());
        paciente.setEstcivil(estPac.getItemAt(estPac.getSelectedIndex()));
        paciente.setNomemae(maePac.getText());
        paciente.setNomepai(paiPac.getText());
        paciente.setProfissao(profPac.getText());
        paciente.setRg(rgPac.getText());
        paciente.setSexo(sexPac.getItemAt(sexPac.getSelectedIndex()));
        paciente.setTelefone(telPac.getText());
        paciente.setUf(ufPac.getItemAt(ufPac.getSelectedIndex()));
        paciente.setBairro(bairroPac.getText());
        if (this.novo) {
            controle.adicionar(paciente);
        } else {
            paciente.setCodigo(codigoEditar);
            controle.alterar(paciente);
        }
        painel.setEnabledAt(0, true);
        painel.setSelectedIndex(0);
        painel.setEnabledAt(1, false);
        listaPaciente.clear();
        listaPaciente.addAll(controle.listaPaciente());
    }//GEN-LAST:event_botConfirmPacActionPerformed

    private void botPesquisaPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botPesquisaPacienteActionPerformed
       String pesquisa;
        listaPaciente.clear();
        pesquisa = txtPesquisa.getText();
        listaPaciente.addAll(controle.pesquisaPaciente(pesquisa));
    }//GEN-LAST:event_botPesquisaPacienteActionPerformed

    private void botExcluirPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botExcluirPacienteActionPerformed
     Pessoa pacienteSelected;
        int posicao = tabelaPaciente.getSelectedRow();
        if (posicao != -1) {
            pacienteSelected = listaPaciente.get(posicao);
            int resp = JOptionPane.showConfirmDialog(this, "Deseja mesmo excluir?\n"+pacienteSelected.getNome(), "Exclusão", JOptionPane.YES_NO_OPTION);
            if (resp == JOptionPane.YES_OPTION) {
                controle.excluir(pacienteSelected);
                listaPaciente.clear();
                listaPaciente.addAll(controle.listaPaciente());
            }
        } else {
            JOptionPane.showMessageDialog(this, "Selecione um setor");
        }
    }//GEN-LAST:event_botExcluirPacienteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField InscPac;
    private javax.swing.JTextField bairroPac;
    private javax.swing.JButton botAtlteraPaciente;
    private javax.swing.JButton botCancelaPac;
    private javax.swing.JButton botConfirmPac;
    private javax.swing.JButton botExcluirPaciente;
    private javax.swing.JButton botFecharPesquisaPaciente;
    private javax.swing.JButton botNovoPaciente;
    private javax.swing.JButton botPesquisaPaciente;
    private javax.swing.JTextField cartSusPac;
    private javax.swing.JTextField cidadePac;
    private javax.persistence.Query consultaPaciente;
    private javax.swing.JFormattedTextField cpfPac;
    private com.toedter.calendar.JDateChooser dataPac;
    private javax.swing.JTextField emailPac;
    private javax.swing.JTextField endPac;
    private javax.swing.JComboBox<String> estPac;
    private javax.persistence.EntityManager gerenteEntPaciente;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
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
    private java.util.List<Pessoa> listaPaciente;
    private javax.swing.JTextField maePac;
    private javax.swing.JTextField nomePac;
    private javax.swing.JTextField paiPac;
    private javax.swing.JTabbedPane painel;
    private javax.swing.JTextField profPac;
    private javax.swing.JFormattedTextField rgPac;
    private javax.swing.JComboBox<String> sexPac;
    private javax.swing.JTable tabelaPaciente;
    private javax.swing.JFormattedTextField telPac;
    private javax.swing.JTextField txtPesquisa;
    private javax.swing.JComboBox<String> ufPac;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import controle.ControleFuncionario;
import modelo.Funcionario;
import controle.ControleSetor;
import java.text.ParseException;
import modelo.Setor;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Bianca
 */
public class ManterFuncionario extends javax.swing.JInternalFrame {

    private ControleFuncionario controle;
    private ControleSetor controleSetor;
    private boolean novo;
    private int codigoEditar;

    public ManterFuncionario() {
        initComponents();
        controleSetor = new ControleSetor();
        controle = new ControleFuncionario();
        for (Setor f : controleSetor.listaSetor()) {
            setorFunc.addItem(f);
        }
        painel.setEnabledAt(1, false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        tipoUser = new javax.swing.ButtonGroup();
        gerEnt = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("ClinicRecordsPU").createEntityManager();
        consultaFuncionario = java.beans.Beans.isDesignTime() ? null : gerEnt.createQuery("select f from Funcionario f");
        listaFunc = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : org.jdesktop.observablecollections.ObservableCollections.observableList(consultaFuncionario.getResultList());
        painel = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        txtPesquisa = new javax.swing.JTextField();
        botFuncionarioFechar = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        botFuncionarioPesquisar = new javax.swing.JButton();
        botFuncionarioAlterar = new javax.swing.JButton();
        borFuncionarioExcluir = new javax.swing.JButton();
        botFuncionarioNovo = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaUsuario = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        nomeFunc = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        cidadeFunc = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        nomeUserFunc = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        endFunc = new javax.swing.JTextField();
        cpfFunc = new javax.swing.JTextField();
        rgFunc = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        ufFunc = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        setorFunc = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        emailFunc = new javax.swing.JTextField();
        senhaFunc = new javax.swing.JPasswordField();
        jLabel15 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        adm = new javax.swing.JRadioButton();
        comum = new javax.swing.JRadioButton();
        dataFunc = new com.toedter.calendar.JDateChooser();
        jLabel14 = new javax.swing.JLabel();
        bairroFunc = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        confirm = new javax.swing.JPasswordField();
        jLabel17 = new javax.swing.JLabel();
        profissao = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        estCivil = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        cartSus = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        nomePai = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        nomeMae = new javax.swing.JTextField();
        sexFunc = new javax.swing.JComboBox<>();
        jLabel23 = new javax.swing.JLabel();
        telFunc = new javax.swing.JFormattedTextField();
        fecharFuncCad = new javax.swing.JButton();
        botFuncionarioConfirmar = new javax.swing.JButton();

        setClosable(true);

        jLabel13.setText("Pesquisa por nome");

        txtPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesquisaActionPerformed(evt);
            }
        });

        botFuncionarioFechar.setText("Fechar");
        botFuncionarioFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botFuncionarioFecharActionPerformed(evt);
            }
        });

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder("Opções"));
        jPanel7.setLayout(new java.awt.GridLayout(1, 0));

        botFuncionarioPesquisar.setText("Pesquisar");
        botFuncionarioPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botFuncionarioPesquisarActionPerformed(evt);
            }
        });
        jPanel7.add(botFuncionarioPesquisar);

        botFuncionarioAlterar.setText("Alterar");
        botFuncionarioAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botFuncionarioAlterarActionPerformed(evt);
            }
        });
        jPanel7.add(botFuncionarioAlterar);

        borFuncionarioExcluir.setText("Excluir");
        borFuncionarioExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borFuncionarioExcluirActionPerformed(evt);
            }
        });
        jPanel7.add(borFuncionarioExcluir);

        botFuncionarioNovo.setText("Novo");
        botFuncionarioNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botFuncionarioNovoActionPerformed(evt);
            }
        });
        jPanel7.add(botFuncionarioNovo);

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Resultados"));

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, listaFunc, tabelaUsuario);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${nome}"));
        columnBinding.setColumnName("Nome");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${setor}"));
        columnBinding.setColumnName("Setor");
        columnBinding.setColumnClass(modelo.Setor.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${telefone}"));
        columnBinding.setColumnName("Telefone");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        jScrollPane1.setViewportView(tabelaUsuario);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 831, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
        );

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel12.setText("Manter Funcionário");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 843, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(314, 314, 314)
                                .addComponent(jLabel12))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel13)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(botFuncionarioFechar))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(botFuncionarioFechar)
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
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        painel.addTab("Pesquisa", jPanel2);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Ficha de Cadastro de Funcionários"));

        nomeFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeFuncActionPerformed(evt);
            }
        });

        jLabel1.setText("Nome ");

        jLabel2.setText("Cidade");

        nomeUserFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeUserFuncActionPerformed(evt);
            }
        });

        jLabel3.setText("Nome de Usuário");

        jLabel4.setText("Senha");

        cpfFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpfFuncActionPerformed(evt);
            }
        });

        rgFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rgFuncActionPerformed(evt);
            }
        });

        jLabel8.setText("RG");

        jLabel7.setText("CPF");

        jLabel5.setText("Endereço");

        jLabel6.setText("UF");

        ufFunc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AM", "AP", "BA", "CE", "DF", "ES", "GO", "MA", "MG", "MS", "MT", "PA", "PB", "PE", "PI", "PR", "RJ", "RN", "RO", "RR", "RS", "SC", "SE", "SP", "TO" }));
        ufFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ufFuncActionPerformed(evt);
            }
        });

        jLabel9.setText("Setor");

        setorFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setorFuncActionPerformed(evt);
            }
        });

        jLabel10.setText("Telefone");

        jLabel11.setText("E-mail");

        emailFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailFuncActionPerformed(evt);
            }
        });

        jLabel15.setText("Data de Nascimento");

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Tipo de Usuário"));

        tipoUser.add(adm);
        adm.setText("Administrador");
        adm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                admActionPerformed(evt);
            }
        });

        tipoUser.add(comum);
        comum.setText("Usuário Comum");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(adm)
                    .addComponent(comum))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(adm)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(comum)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jLabel14.setText("Bairro");

        jLabel16.setText("Confirmação de Senha");

        jLabel17.setText("Profissão");

        jLabel22.setText("Estado Civil");

        estCivil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Solteiro(a)", "Casado(a)", "Viúvo(a)", "Divorciado(a)" }));

        jLabel18.setText("Cartão SUS");

        jLabel19.setText("Nome do Pai");

        jLabel20.setText("Nome da Mãe");

        sexFunc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Feminino", "Masculino", "Outro" }));
        sexFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sexFuncActionPerformed(evt);
            }
        });

        jLabel23.setText("Sexo");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cpfFunc, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                            .addComponent(telFunc))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rgFunc))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 134, Short.MAX_VALUE)
                                .addComponent(jLabel8)
                                .addGap(131, 131, 131))
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(endFunc, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nomeFunc, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel23)
                                .addGap(88, 88, 88))
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nomeUserFunc, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nomePai, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addComponent(emailFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sexFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel10)
                            .addGap(116, 116, 116)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel18)
                                .addComponent(cartSus, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(62, 62, 62)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel17)
                                .addComponent(profissao, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                                .addComponent(jLabel22)
                                .addComponent(jLabel20)
                                .addComponent(estCivil, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(nomeMae, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(bairroFunc))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(senhaFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(confirm, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel4)
                        .addComponent(jLabel14)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(cidadeFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(10, 10, 10)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6)
                                .addComponent(ufFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(setorFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(10, 10, 10)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel15)
                                .addComponent(dataFunc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nomeFunc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6))
                        .addGap(4, 4, 4)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cidadeFunc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ufFunc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(endFunc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel14)
                            .addGap(26, 26, 26)))
                    .addComponent(bairroFunc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nomeUserFunc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(senhaFunc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(confirm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cpfFunc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rgFunc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel15))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(setorFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dataFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(profissao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel22)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(estCivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel10))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(9, 9, 9)
                                        .addComponent(jLabel18)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(telFunc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cartSus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(12, 12, 12)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel23))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(emailFunc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sexFunc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(jLabel20)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomePai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nomeMae, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        fecharFuncCad.setText("Fechar");
        fecharFuncCad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fecharFuncCadActionPerformed(evt);
            }
        });

        botFuncionarioConfirmar.setText("Confirmar");
        botFuncionarioConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botFuncionarioConfirmarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(botFuncionarioConfirmar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fecharFuncCad))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fecharFuncCad)
                    .addComponent(botFuncionarioConfirmar))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        painel.addTab("Cadastro", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painel, javax.swing.GroupLayout.PREFERRED_SIZE, 863, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painel)
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesquisaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPesquisaActionPerformed

    private void botFuncionarioFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botFuncionarioFecharActionPerformed

        this.dispose();
    }//GEN-LAST:event_botFuncionarioFecharActionPerformed

    private void nomeFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeFuncActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeFuncActionPerformed

    private void cpfFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpfFuncActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cpfFuncActionPerformed

    private void rgFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rgFuncActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rgFuncActionPerformed

    private void ufFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ufFuncActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ufFuncActionPerformed

    private void setorFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setorFuncActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_setorFuncActionPerformed

    private void emailFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailFuncActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailFuncActionPerformed

    private void admActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_admActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_admActionPerformed

    private void fecharFuncCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fecharFuncCadActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_fecharFuncCadActionPerformed

    private void botFuncionarioConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botFuncionarioConfirmarActionPerformed
        if(senhaFunc.getText().equals(confirm.getText())){
        Funcionario funcio;
        Date data = new Date(System.currentTimeMillis());
        funcio = new Funcionario();
        funcio.setNomeuser(nomeUserFunc.getText());
        funcio.setDatacad(data);
        funcio.setNome(nomeFunc.getText());
        funcio.setCartsus(cartSus.getText());
        funcio.setCidade(cidadeFunc.getText());
        funcio.setCpf(cpfFunc.getText());
        funcio.setDatanasc(dataFunc.getDate());
        funcio.setEmail(emailFunc.getText());
        funcio.setEndereco(endFunc.getText());
        funcio.setEstcivil(estCivil.getItemAt(estCivil.getSelectedIndex()));
        funcio.setNomemae(nomeMae.getText());
        funcio.setNomepai(nomePai.getText());
        funcio.setProfissao(profissao.getText());
        funcio.setRg(rgFunc.getText());
        funcio.setSexo(sexFunc.getItemAt(sexFunc.getSelectedIndex()));
        funcio.setTelefone(telFunc.getText());
        funcio.setUf(ufFunc.getItemAt(ufFunc.getSelectedIndex()));
        funcio.setBairro(bairroFunc.getText());
        if(adm.isSelected()){
            funcio.setTipo(true);
        }else{
            funcio.setTipo(false);
        }
        funcio.setNomeuser(nomeUserFunc.getText());
        funcio.setSenha(senhaFunc.getText());
        funcio.setSetor(setorFunc.getItemAt(setorFunc.getSelectedIndex()));
        if (this.novo) {
            controle.adicionar(funcio);
        } else {
            funcio.setCodigo(codigoEditar);
            controle.alterar(funcio);
        }
        painel.setEnabledAt(0, true);
        painel.setSelectedIndex(0);
        painel.setEnabledAt(1, false);
        listaFunc.clear();
        listaFunc.addAll(controle.listaFuncionario());
        }
        else {
            JOptionPane.showMessageDialog(this, "Confirmação de senha incorreta!");
        }
        

    }//GEN-LAST:event_botFuncionarioConfirmarActionPerformed

    private void botFuncionarioNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botFuncionarioNovoActionPerformed
        if (!controleSetor.listaSetor().isEmpty())
        {
        try {
            telFunc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###########")));
        } catch (ParseException ex) {
            Logger.getLogger(ManterPaciente.class.getName()).log(Level.SEVERE, null, ex);
        }
        cpfFunc.setText("");
        rgFunc.setText("");
        nomeFunc.setText("");
        cidadeFunc.setText("");
        endFunc.setText("");
        emailFunc.setText("");
        telFunc.setText("");
        nomeUserFunc.setText("");
        senhaFunc.setText("");
        confirm.setText("");
        tipoUser.clearSelection();
        profissao.setText("");
        cartSus.setText("");
        nomeMae.setText("");
        nomePai.setText("");
        bairroFunc.setText("");
        painel.setEnabledAt(1, true);
        painel.setSelectedIndex(1);
        painel.setEnabledAt(0, false);
        this.novo = true;
        painel.setEnabledAt(1, true);
        painel.setSelectedIndex(1);
        painel.setEnabledAt(0, false);
        }else {
            JOptionPane.showMessageDialog(this, "Cadastre um setor!");
        }

    }//GEN-LAST:event_botFuncionarioNovoActionPerformed

    private void botFuncionarioPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botFuncionarioPesquisarActionPerformed
        String pesquisa;
        listaFunc.clear();
        pesquisa = txtPesquisa.getText();
        listaFunc.addAll(controle.pesquisaMedico(pesquisa));
    }//GEN-LAST:event_botFuncionarioPesquisarActionPerformed

    private void botFuncionarioAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botFuncionarioAlterarActionPerformed
        this.novo = false;
        Funcionario funcionarioSelected;
        int posicao;
        posicao = tabelaUsuario.getSelectedRow();
        if (posicao != -1) {

            funcionarioSelected = listaFunc.get(posicao);
            this.codigoEditar = funcionarioSelected.getCodigo();
            nomeFunc.setText(funcionarioSelected.getNome());
            nomeUserFunc.setText(funcionarioSelected.getNomeuser());
            cpfFunc.setText(funcionarioSelected.getCpf());
            cidadeFunc.setText(funcionarioSelected.getCidade());
            int x = 0;
            setorFunc.setSelectedItem(funcionarioSelected.getSetor());
            for (int y = 0; y < ufFunc.getItemCount(); y++) {
                if (ufFunc.getItemAt(y).equals(funcionarioSelected.getUf())) {
                    x = y;
                }
            }
            ufFunc.setSelectedIndex(x);
            endFunc.setText(funcionarioSelected.getEndereco());
            emailFunc.setText(funcionarioSelected.getEmail());
            dataFunc.setDate(funcionarioSelected.getDatanasc());
            rgFunc.setText(funcionarioSelected.getRg());
            telFunc.setText(funcionarioSelected.getTelefone());
            bairroFunc.setText(funcionarioSelected.getBairro());
            profissao.setText(funcionarioSelected.getProfissao());
            cartSus.setText(funcionarioSelected.getCartsus());
            nomeMae.setText(funcionarioSelected.getNomemae());
            nomePai.setText(funcionarioSelected.getNomepai());
            int s=0;
            for (int y = 0; y < sexFunc.getItemCount(); y++) {
                if (sexFunc.getItemAt(y).equals(funcionarioSelected.getSexo())) {
                    s = y;
                }
            }
            sexFunc.setSelectedIndex(s);
            int est =0;
            for (int y = 0; y < estCivil.getItemCount(); y++) {
                if (estCivil.getItemAt(y).equals(funcionarioSelected.getEstcivil())) {
                    est = y;
                }
            }
            estCivil.setSelectedIndex(est);
            if (funcionarioSelected.isTipo()) {
                adm.setSelected(true);
            } else {
                comum.setSelected(true);
            }

            painel.setEnabledAt(1, true);
            painel.setSelectedIndex(1);
            painel.setEnabledAt(0, false);
        } else {
            JOptionPane.showMessageDialog(this, "Selecione um funcionário!");
        }
    }//GEN-LAST:event_botFuncionarioAlterarActionPerformed

    private void borFuncionarioExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borFuncionarioExcluirActionPerformed
        Funcionario funcionarioSelected;
        int posicao = tabelaUsuario.getSelectedRow();
        if (posicao != -1) {
            funcionarioSelected = listaFunc.get(posicao);
            int resp = JOptionPane.showConfirmDialog(this, "Deseja mesmo excluir?\n" + funcionarioSelected.getNome(), "Exclusão", JOptionPane.YES_NO_OPTION);
            if (resp == JOptionPane.YES_OPTION) {
                controle.excluir(funcionarioSelected);
                listaFunc.clear();
                listaFunc.addAll(controle.listaFuncionario());
            }
        } else {
            JOptionPane.showMessageDialog(this, "Selecione um setor");
        }
    }//GEN-LAST:event_borFuncionarioExcluirActionPerformed

    private void nomeUserFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeUserFuncActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeUserFuncActionPerformed

    private void sexFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sexFuncActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sexFuncActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton adm;
    private javax.swing.JTextField bairroFunc;
    private javax.swing.JButton borFuncionarioExcluir;
    private javax.swing.JButton botFuncionarioAlterar;
    private javax.swing.JButton botFuncionarioConfirmar;
    private javax.swing.JButton botFuncionarioFechar;
    private javax.swing.JButton botFuncionarioNovo;
    private javax.swing.JButton botFuncionarioPesquisar;
    private javax.swing.JTextField cartSus;
    private javax.swing.JTextField cidadeFunc;
    private javax.swing.JRadioButton comum;
    private javax.swing.JPasswordField confirm;
    private javax.persistence.Query consultaFuncionario;
    private javax.swing.JTextField cpfFunc;
    private com.toedter.calendar.JDateChooser dataFunc;
    private javax.swing.JTextField emailFunc;
    private javax.swing.JTextField endFunc;
    private javax.swing.JComboBox<String> estCivil;
    private javax.swing.JButton fecharFuncCad;
    private javax.persistence.EntityManager gerEnt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
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
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private java.util.List<Funcionario> listaFunc;
    private javax.swing.JTextField nomeFunc;
    private javax.swing.JTextField nomeMae;
    private javax.swing.JTextField nomePai;
    private javax.swing.JTextField nomeUserFunc;
    private javax.swing.JTabbedPane painel;
    private javax.swing.JTextField profissao;
    private javax.swing.JTextField rgFunc;
    private javax.swing.JPasswordField senhaFunc;
    private javax.swing.JComboBox<Setor> setorFunc;
    private javax.swing.JComboBox<String> sexFunc;
    private javax.swing.JTable tabelaUsuario;
    private javax.swing.JFormattedTextField telFunc;
    private javax.swing.ButtonGroup tipoUser;
    private javax.swing.JTextField txtPesquisa;
    private javax.swing.JComboBox<String> ufFunc;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}

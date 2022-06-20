package visao.crud;

import visao.inicio.InicioAdm;
import Utilidades.LimitedTextField;

import controle.ControleConsulta;
import controle.ControleFichaAtendimento;
import controle.ControleFuncionario;
import controle.ControleMedico;
import controle.ControlePaciente;
import controle.ControlePreConsulta;
import java.text.ParseException;
import java.util.ArrayList;

import modelo.Pessoa;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;
import modelo.FichaAtendimento;
import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Bianca
 */
public class ManterPaciente extends javax.swing.JInternalFrame {

    private boolean novo = false;
    private int codigoEditar;
    private ControlePaciente controle;
    private ControleConsulta controleConsulta;
    private ControleFichaAtendimento controleFicha;
    private ControlePreConsulta controlePre;
    private ControleFuncionario controleFuncionario;
    private ControleMedico controleMedico;

    public ManterPaciente() {
        initComponents();
        controle = new ControlePaciente();
        controleFuncionario = new ControleFuncionario();
        controleMedico = new ControleMedico();
        controlePre = new ControlePreConsulta();
        controleFicha = new ControleFichaAtendimento();
        painel.setEnabledAt(1, false);
        controleConsulta = new ControleConsulta();

    }

    public void maskLetter(JFormattedTextField jtf) {
        MaskFormatter formatoDois;
        try {
            formatoDois = new MaskFormatter("");
            formatoDois.setValidCharacters("0123456789()-.");
            formatoDois.install(jtf);
        } catch (ParseException e) {
            JOptionPane.showMessageDialog(
                    null,
                    this,
                    "Não foi possivel inserir mask nos campos letras: "
                    + e.getMessage(), 0);
        }
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
        txtpaci = new javax.swing.JLabel();
        botFecharPesquisaPaciente = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
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
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        jSeparator10 = new javax.swing.JSeparator();
        jSeparator11 = new javax.swing.JSeparator();
        jSeparator12 = new javax.swing.JSeparator();
        jSeparator13 = new javax.swing.JSeparator();
        jSeparator14 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        tiposang = new javax.swing.JComboBox<>();
        jLabel24 = new javax.swing.JLabel();
        botCancelaPac = new javax.swing.JButton();
        botConfirmPac = new javax.swing.JButton();

        setClosable(true);
        setTitle("Manter Paciente");

        jPanel1.setPreferredSize(new java.awt.Dimension(734, 534));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Resultados", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 16))); // NOI18N

        tabelaPaciente.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        tabelaPaciente.getTableHeader().setReorderingAllowed(false);

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
        if (tabelaPaciente.getColumnModel().getColumnCount() > 0) {
            tabelaPaciente.getColumnModel().getColumn(0).setResizable(false);
            tabelaPaciente.getColumnModel().getColumn(1).setResizable(false);
            tabelaPaciente.getColumnModel().getColumn(2).setResizable(false);
        }

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 353, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Resultados", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 16))); // NOI18N
        jPanel4.setLayout(new java.awt.GridLayout(1, 0));

        botPesquisaPaciente.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        botPesquisaPaciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/search-2-xxl.png"))); // NOI18N
        botPesquisaPaciente.setText("Pesquisar");
        botPesquisaPaciente.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botPesquisaPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botPesquisaPacienteActionPerformed(evt);
            }
        });
        jPanel4.add(botPesquisaPaciente);

        botAtlteraPaciente.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        botAtlteraPaciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/alter.png"))); // NOI18N
        botAtlteraPaciente.setText("Alterar");
        botAtlteraPaciente.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botAtlteraPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botAtlteraPacienteActionPerformed(evt);
            }
        });
        jPanel4.add(botAtlteraPaciente);

        botExcluirPaciente.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        botExcluirPaciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/delete.png"))); // NOI18N
        botExcluirPaciente.setText("Excluir");
        botExcluirPaciente.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botExcluirPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botExcluirPacienteActionPerformed(evt);
            }
        });
        jPanel4.add(botExcluirPaciente);

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/prontuario-icone-pb.png"))); // NOI18N
        jButton3.setText(" Prontuário de Consultas");
        jButton3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton3);

        botNovoPaciente.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        botNovoPaciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/plus.png"))); // NOI18N
        botNovoPaciente.setText("Novo");
        botNovoPaciente.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botNovoPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botNovoPacienteActionPerformed(evt);
            }
        });
        jPanel4.add(botNovoPaciente);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel1.setText("Pesquisar Por Nome");

        txtPesquisa.setBackground(new java.awt.Color(240, 240, 240));
        txtPesquisa.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtPesquisa.setBorder(null);

        txtpaci.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtpaci.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/atendimento-pb.png"))); // NOI18N
        txtpaci.setText("Manter Paciente");

        botFecharPesquisaPaciente.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        botFecharPesquisaPaciente.setText("Fechar");
        botFecharPesquisaPaciente.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botFecharPesquisaPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botFecharPesquisaPacienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(botFecharPesquisaPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1)
                            .addComponent(txtPesquisa, javax.swing.GroupLayout.DEFAULT_SIZE, 463, Short.MAX_VALUE)
                            .addComponent(jSeparator1)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtpaci)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtpaci)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(botFecharPesquisaPaciente)
                .addGap(22, 22, 22))
        );

        painel.addTab("Pesquisa", jPanel1);

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ficha de Cadastro de Pacientes", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 16))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel3.setText("Nome");

        nomePac.setDocument(new LimitedTextField(50));
        nomePac.setBackground(new java.awt.Color(240, 240, 240));
        nomePac.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        nomePac.setBorder(null);
        nomePac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomePacActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel4.setText("Cidade");

        cidadePac.setDocument(new LimitedTextField(30));
        cidadePac.setBackground(new java.awt.Color(240, 240, 240));
        cidadePac.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        cidadePac.setBorder(null);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel5.setText("Numero da Inscrição");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel6.setText("RG");

        InscPac.setEditable(false);
        InscPac.setBorder(null);
        InscPac.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        InscPac.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel7.setText("CPF");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel8.setText("UF");

        ufPac.setBackground(new java.awt.Color(240, 240, 240));
        ufPac.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        ufPac.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AM", "AP", "BA", "CE", "DF", "ES", "GO", "MA", "MG", "MS", "MT", "PA", "PB", "PE", "PI", "PR", "RJ", "RN", "RO", "RR", "RS", "SC", "SE", "SP", "TO" }));
        ufPac.setBorder(null);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel9.setText("Endereço");

        endPac.setDocument(new LimitedTextField(100));
        endPac.setBackground(new java.awt.Color(240, 240, 240));
        endPac.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        endPac.setBorder(null);
        endPac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                endPacActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel10.setText("Cartão SUS");

        cartSusPac.setDocument(new LimitedTextField(20));
        cartSusPac.setBackground(new java.awt.Color(240, 240, 240));
        cartSusPac.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        cartSusPac.setBorder(null);

        rgPac.setDocument(new LimitedTextField(14));
        rgPac.setBackground(new java.awt.Color(240, 240, 240));
        rgPac.setBorder(null);
        try {
            rgPac.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###-#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        rgPac.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        cpfPac.setBackground(new java.awt.Color(240, 240, 240));
        cpfPac.setBorder(null);
        try {
            cpfPac.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        cpfPac.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel11.setText("E-mail");

        emailPac.setDocument(new LimitedTextField(50));
        emailPac.setBackground(new java.awt.Color(240, 240, 240));
        emailPac.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        emailPac.setBorder(null);

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel12.setText("Telefone");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel13.setText("Estado Civil");

        estPac.setBackground(new java.awt.Color(240, 240, 240));
        estPac.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        estPac.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Solteiro(a)", "Casado(a)", "Viúvo(a)", "Divorciado(a)" }));
        estPac.setBorder(null);

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel14.setText("Profissão");

        profPac.setDocument(new LimitedTextField(40));
        profPac.setBackground(new java.awt.Color(240, 240, 240));
        profPac.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        profPac.setBorder(null);

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel15.setText("Sexo");

        sexPac.setBackground(new java.awt.Color(240, 240, 240));
        sexPac.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        sexPac.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Feminino", "Masculino", "Outro" }));
        sexPac.setBorder(null);

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel17.setText("Nome do Pai");

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel18.setText("Nome da Mãe");

        paiPac.setBackground(new java.awt.Color(240, 240, 240));
        paiPac.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        paiPac.setBorder(null);

        maePac.setBackground(new java.awt.Color(240, 240, 240));
        maePac.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        maePac.setBorder(null);
        maePac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maePacActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel2.setText("Data de Nascimento");

        telPac.setBackground(new java.awt.Color(240, 240, 240));
        telPac.setBorder(null);
        try {
            telPac.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        telPac.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel21.setText("Bairro");

        bairroPac.setBackground(new java.awt.Color(240, 240, 240));
        bairroPac.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        bairroPac.setBorder(null);

        dataPac.setFocusable(false);
        dataPac.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));

        jSeparator4.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));

        jSeparator6.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator6.setForeground(new java.awt.Color(0, 0, 0));

        jSeparator7.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator7.setForeground(new java.awt.Color(0, 0, 0));

        jSeparator8.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator8.setForeground(new java.awt.Color(0, 0, 0));

        jSeparator9.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator9.setForeground(new java.awt.Color(0, 0, 0));

        jSeparator10.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator10.setForeground(new java.awt.Color(0, 0, 0));

        jSeparator11.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator11.setForeground(new java.awt.Color(0, 0, 0));

        jSeparator12.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator12.setForeground(new java.awt.Color(0, 0, 0));

        jSeparator13.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator13.setForeground(new java.awt.Color(0, 0, 0));

        jSeparator14.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator14.setForeground(new java.awt.Color(0, 0, 0));

        jSeparator5.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));

        tiposang.setBackground(new java.awt.Color(240, 240, 240));
        tiposang.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        tiposang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A+", "A-", "B+", "B-", "AB+", "AB-", "O+", "O-" }));
        tiposang.setBorder(null);

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel24.setText("Tipo Sanguíneo");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(profPac, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
                            .addComponent(paiPac)
                            .addComponent(jSeparator13)
                            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel15)
                                    .addComponent(sexPac, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel18)
                                    .addComponent(maePac, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE)
                                    .addComponent(jSeparator14)))))
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, 537, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(bairroPac, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel5Layout.createSequentialGroup()
                                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel5Layout.createSequentialGroup()
                                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(nomePac, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel3))
                                            .addGap(21, 21, 21))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jSeparator6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(rgPac, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jSeparator7, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel4)
                                        .addComponent(cidadePac, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                                        .addComponent(cpfPac)))))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(21, 21, 21)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, 537, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(endPac, javax.swing.GroupLayout.PREFERRED_SIZE, 537, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 537, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(emailPac, javax.swing.GroupLayout.PREFERRED_SIZE, 537, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel2)
                        .addContainerGap())
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel24)
                                    .addComponent(tiposang, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel10))
                                .addGap(0, 85, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(dataPac, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(estPac, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jSeparator12, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cartSusPac, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ufPac, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jSeparator9, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(InscPac, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(telPac, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSeparator8)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel12))
                                        .addGap(0, 98, Short.MAX_VALUE)))
                                .addContainerGap())))))
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
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nomePac, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cidadePac, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator2)
                            .addComponent(jSeparator3)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(dataPac, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(telPac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cpfPac, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rgPac, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(28, 28, 28)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(endPac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(InscPac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel21)
                        .addGap(2, 2, 2)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bairroPac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ufPac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)
                        .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel8)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(32, 32, 32))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(emailPac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cartSusPac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jSeparator12, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jSeparator11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(2, 2, 2)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sexPac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(profPac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(estPac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jLabel24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tiposang, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(jLabel18))
                        .addGap(2, 2, 2)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(paiPac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(maePac, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jSeparator13)
                                .addGap(16, 16, 16))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jSeparator14, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );

        botCancelaPac.setBackground(new java.awt.Color(255, 204, 204));
        botCancelaPac.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        botCancelaPac.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/cancel.png"))); // NOI18N
        botCancelaPac.setText("Cancelar");
        botCancelaPac.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botCancelaPac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botCancelaPacActionPerformed(evt);
            }
        });

        botConfirmPac.setBackground(new java.awt.Color(204, 255, 204));
        botConfirmPac.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        botConfirmPac.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/confirm.png"))); // NOI18N
        botConfirmPac.setText("Confirmar");
        botConfirmPac.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
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
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(386, 386, 386)
                        .addComponent(botConfirmPac, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botCancelaPac, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(241, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 557, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botCancelaPac)
                    .addComponent(botConfirmPac, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(56, Short.MAX_VALUE))
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
            Pessoa p = pacienteSelected;
            if (ControleFuncionario.getLogado() != null) {
                if (!ControleFuncionario.getLogado().getTipo()) {

                    if (controleFuncionario.listaFuncionario().contains(p)) {
                        JOptionPane.showMessageDialog(this, "Este paciente pertence a uma classe a qual você não está autorizado a alterar!");
                    } else if (controleMedico.listaMedico().contains(p)) {
                        JOptionPane.showMessageDialog(this, "Este paciente pertence a uma classe a qual você não está autorizado a alterar!");
                    } else {
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
                        tiposang.setSelectedItem(pacienteSelected.getTiposang());
                        int s = 0;
                        for (int y = 0; y < sexPac.getItemCount(); y++) {
                            if (sexPac.getItemAt(y).equals(pacienteSelected.getSexo())) {
                                s = y;
                            }
                        }
                        sexPac.setSelectedIndex(s);
                        int est = 0;
                        for (int y = 0; y < estPac.getItemCount(); y++) {
                            if (estPac.getItemAt(y).equals(pacienteSelected.getEstcivil())) {
                                est = y;
                            }
                        }
                        estPac.setSelectedIndex(est);
                        painel.setEnabledAt(1, true);
                        painel.setSelectedIndex(1);

                        painel.setEnabledAt(0, false);

                    }
                }

            } else {
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
                tiposang.setSelectedItem(pacienteSelected.getTiposang());
                int s = 0;
                for (int y = 0; y < sexPac.getItemCount(); y++) {
                    if (sexPac.getItemAt(y).equals(pacienteSelected.getSexo())) {
                        s = y;
                    }
                }
                sexPac.setSelectedIndex(s);
                int est = 0;
                for (int y = 0; y < estPac.getItemCount(); y++) {
                    if (estPac.getItemAt(y).equals(pacienteSelected.getEstcivil())) {
                        est = y;
                    }
                }
                estPac.setSelectedIndex(est);
                painel.setEnabledAt(1, true);
                painel.setSelectedIndex(1);

                painel.setEnabledAt(0, false);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Selecione um paciente");
        }
    }//GEN-LAST:event_botAtlteraPacienteActionPerformed

    private void botConfirmPacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botConfirmPacActionPerformed
        if (!nomePac.getText().isEmpty() && !cartSusPac.getText().isEmpty() && !cidadePac.getText().isEmpty() && !cpfPac.getText().isEmpty()
                && !dataPac.getDate().toString().isEmpty() && !emailPac.getText().isEmpty() && !endPac.getText().isEmpty()
                && !maePac.getText().isEmpty() && !paiPac.getText().isEmpty() && !profPac.getText().isEmpty()
                && !rgPac.getText().isEmpty() && !telPac.getText().isEmpty() && !bairroPac.getText().isEmpty()) {

            Pessoa paciente;

            paciente = new Pessoa();
            paciente.setDatacad(new Date());
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
            paciente.setTiposang((String) tiposang.getSelectedItem());
            if (this.novo) {
                if (controle.pesquisaPacienteCPF(cpfPac.getText()).isEmpty()) {
                    controle.adicionar(paciente);
                    painel.setEnabledAt(0, true);
                    painel.setSelectedIndex(0);
                    painel.setEnabledAt(1, false);
                    listaPaciente.clear();
                    listaPaciente.addAll(controle.listaPaciente());
                } else {
                    JOptionPane.showMessageDialog(this, "Pessoa já cadastrada no sistema!");
                }
            } else {
                paciente.setCodigo(codigoEditar);
                controle.alterar(paciente);
                painel.setEnabledAt(0, true);
                painel.setSelectedIndex(0);
                painel.setEnabledAt(1, false);
                listaPaciente.clear();
                listaPaciente.addAll(controle.listaPaciente());
            }

        } else {
            JOptionPane.showMessageDialog(this, "Há um campo vazio!");
        }
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

            pacienteSelected = listaPaciente.get(posicao);
            Pessoa p = pacienteSelected;
            if (ControleFuncionario.getLogado() != null) {
                if (!ControleFuncionario.getLogado().getTipo()) {

                    if (controleFuncionario.listaFuncionario().contains(p)) {
                        JOptionPane.showMessageDialog(this, "Este paciente pertence a uma classe a qual você não está autorizado a excluir!");
                    } else if (controleMedico.listaMedico().contains(p)) {
                        JOptionPane.showMessageDialog(this, "Este paciente pertence a uma classe a qual você não está autorizado a excluir!");
                    } else {
                        if (controleConsulta.listaConsultasPciente(pacienteSelected).isEmpty()
                                && controleFicha.listaAtendFuncionarioPessoa(pacienteSelected.getCodigo()).isEmpty()
                                && controleFicha.pesquisaFichaAtendimentoPaciente(pacienteSelected).isEmpty()
                                && controlePre.listaPreFuncionarioPessoa(pacienteSelected.getCodigo()).isEmpty()) {
                            int resp = JOptionPane.showConfirmDialog(this, "Deseja mesmo excluir?\n" + pacienteSelected.getNome(), "Exclusão", JOptionPane.YES_NO_OPTION);
                            if (resp == JOptionPane.YES_OPTION) {
                                controle.excluir(pacienteSelected);
                                listaPaciente.clear();
                                listaPaciente.addAll(controle.listaPaciente());
                            }
                        } else {
                            JOptionPane.showMessageDialog(this, "Este paciente já está vinculado a um outro registro");
                        }
                    }
                }

            } else {
                if (controleConsulta.listaConsultasPciente(pacienteSelected).isEmpty()
                        && controleFicha.listaAtendFuncionarioPessoa(pacienteSelected.getCodigo()).isEmpty()
                        && controleFicha.pesquisaFichaAtendimentoPaciente(pacienteSelected).isEmpty()
                        && controlePre.listaPreFuncionarioPessoa(pacienteSelected.getCodigo()).isEmpty()) {
                    int resp = JOptionPane.showConfirmDialog(this, "Deseja mesmo excluir?\n" + pacienteSelected.getNome(), "Exclusão", JOptionPane.YES_NO_OPTION);
                    if (resp == JOptionPane.YES_OPTION) {
                        controle.excluir(pacienteSelected);
                        listaPaciente.clear();
                        listaPaciente.addAll(controle.listaPaciente());
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Este paciente já está vinculado a um outro registro");
                }
            }

        } else {
            JOptionPane.showMessageDialog(this, "Selecione um setor");
        }
    }//GEN-LAST:event_botExcluirPacienteActionPerformed

    private void maePacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maePacActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_maePacActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Pessoa pacienteSelected;
        int posicao = tabelaPaciente.getSelectedRow();
        if (posicao != -1) {
            pacienteSelected = listaPaciente.get(posicao);
            List<FichaAtendimento> pront;
            pront = controleFicha.pesquisaFichaAtendimentoPaciente(pacienteSelected);

            System.out.println(pront.get(0));

            try {

                JasperReport relatorio = JasperCompileManager.compileReport("src\\relatorio\\Prontuario.jrxml");
                JasperPrint impressao;

                Map parametros = new HashMap();
                parametros.put("localExame", "src\\relatorio\\");
                parametros.put("listaMed", "src\\relatorio\\");
                JRDataSource jrds = new JRBeanCollectionDataSource(pront);

                impressao = JasperFillManager.fillReport(relatorio, parametros, jrds);

                JasperViewer visaoRelatorio = new JasperViewer(impressao, false);
                visaoRelatorio.setVisible(true);
                visaoRelatorio.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

            } catch (JRException ex) {
                Logger.getLogger(InicioAdm.class
                        .getName()).log(Level.SEVERE, null, ex);
            }

        }
    }//GEN-LAST:event_jButton3ActionPerformed


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
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel24;
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
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
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
    private javax.swing.JComboBox<String> tiposang;
    private javax.swing.JTextField txtPesquisa;
    private javax.swing.JLabel txtpaci;
    private javax.swing.JComboBox<String> ufPac;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}

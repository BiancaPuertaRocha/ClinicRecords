package visao.inicio;

import Utilidades.AtualizadorHorario;
import controle.ControleConsulta;
import controle.ControleFuncionario;
import controle.ControleMedico;
import controle.ControlePaciente;
import controle.ControlePreConsulta;
import controle.ControleTipoAtendi;
import java.awt.Color;
import java.awt.Font;
import java.beans.PropertyVetoException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.Funcionario;
import modelo.Medico;
import modelo.PreConsulta;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.view.JasperViewer;
import static org.jdesktop.observablecollections.ObservableCollections.observableList;
import visao.PacienteProntuario;
//import visao.PacienteProntuario;
import visao.TelaEditarPerfilFuncionario;
import visao.crud.ManterExame;
import visao.crud.ManterFuncionario;
import visao.crud.ManterMedicamento;
import visao.crud.ManterMedico;
import visao.crud.ManterPaciente;
import visao.crud.ManterSetor;
import visao.crud.ManterTipoAtendi;
import visao.TelaFichaAtendi;
import visao.TelaPreConsulta;
import visao.TodasConsultas;
import visao.TodasConsultasDataRelatorio;
import visao.TodasPreConsultas;
import visao.TodosAtendimentos;

public class InicioAdm extends javax.swing.JFrame {

    private ControleTipoAtendi controleTipo;
    private Funcionario funcionario;
    private ControlePreConsulta controlePrec;
    private ControleMedico controleMed;
    ControleFuncionario controleFuncionario;

    public InicioAdm() {
        controlePrec = new ControlePreConsulta();
        controleTipo = new ControleTipoAtendi();
        controleFuncionario = new ControleFuncionario();
        controleMed = new ControleMedico();
        initComponents();
        //this.setExtendedState(MAXIMIZED_BOTH);
        AtualizadorHorario ah = new AtualizadorHorario(txttime, txtData);
        ah.mostrarData(true);
        Thread thHora = ah;
        thHora.start();
        manutencao.setFont(new Font("Tahoma", WIDTH, 20));
        atendimentos.setFont(new Font("Tahoma", WIDTH, 20));
        prontuarios.setFont(new Font("Tahoma", WIDTH, 20));
        relatorios.setFont(new Font("Tahoma", WIDTH, 20));
        usuario.setFont(new Font("Tahoma", WIDTH, 20));
        txttime.setFont(new Font("Tahoma", WIDTH, 20));
        txtData.setFont(new Font("Tahoma", WIDTH, 20));
        if (ControleFuncionario.getLogado() != null) {
            funcionario = ControleFuncionario.getLogado();
            usuario.setText(funcionario.getNome());

        }

        for (Medico m : listaMedicos) {
            if (controlePrec.listaConsultasDataMed(new Date(), m) != null) {
                int i = controlePrec.listaConsultasDataMed(new Date(), m).size();
                tabelaMediDispon.setValueAt(Integer.toString(m.getMaxatendi() - i), listaMedicos.indexOf(m), 2);
            }
        }

        txtPesquisaData.setDate(new Date());

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        listaMedicos = observableList(controleMed.medicosDisponiveisTudo());
        listaAgendadas = observableList(controlePrec.pesquisaPrecData(new Date())) ;
        areaDeTrabalho = new javax.swing.JDesktopPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaMediDispon = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        painelatt3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaAgendadas = new javax.swing.JTable();
        painelatt2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtPesquisaData = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        barraDeMenu = new javax.swing.JMenuBar();
        manutencao = new javax.swing.JMenu();
        manterFuncion = new javax.swing.JMenuItem();
        manterMedic = new javax.swing.JMenuItem();
        manterPacie = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        manterAtend = new javax.swing.JMenuItem();
        manterSetor = new javax.swing.JMenuItem();
        manterMedicamento = new javax.swing.JMenuItem();
        manterExame = new javax.swing.JMenuItem();
        atendimentos = new javax.swing.JMenu();
        regisAtendimento = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuItem4 = new javax.swing.JMenuItem();
        relatorios = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        prontuarios = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        usuario = new javax.swing.JMenu();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        dataFoto = new javax.swing.JMenu();
        txtData = new javax.swing.JMenu();
        timeFoto = new javax.swing.JMenu();
        txttime = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                formFocusGained(evt);
            }
        });

        areaDeTrabalho.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentRemoved(java.awt.event.ContainerEvent evt) {
                areaDeTrabalhoComponentRemoved(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new java.awt.GridLayout(4, 0));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/logomenor.png"))); // NOI18N

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));

        jPanel4.setLayout(new java.awt.GridLayout(3, 0));

        jPanel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel5MouseExited(evt);
            }
        });
        jPanel5.setLayout(new java.awt.GridLayout(1, 0));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setText("                                                                                   Atendimento");
        jPanel5.add(jLabel5);

        jPanel4.add(jPanel5);

        jPanel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel7MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel7MouseExited(evt);
            }
        });
        jPanel7.setLayout(new java.awt.GridLayout(1, 0));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel9.setText("                                                                                   Pré-Consulta");
        jPanel7.add(jLabel9);

        jPanel4.add(jPanel7);

        jPanel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel8MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel8MouseExited(evt);
            }
        });
        jPanel8.setLayout(new java.awt.GridLayout(1, 0));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel8.setText("                                                                                    Prontuários");
        jPanel8.add(jLabel8);

        jPanel4.add(jPanel8);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 1515, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tabelaMediDispon.setBackground(new java.awt.Color(240, 240, 240));
        tabelaMediDispon.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        tabelaMediDispon.getTableHeader().setReorderingAllowed(false);

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, listaMedicos, tabelaMediDispon);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${nome}"));
        columnBinding.setColumnName("Nome");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${especialidade}"));
        columnBinding.setColumnName("Especialidade");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${maxatendi}"));
        columnBinding.setColumnName("Restantes");
        columnBinding.setColumnClass(Integer.class);
        columnBinding.setEditable(false);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        tabelaMediDispon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaMediDisponMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabelaMediDispon);
        if (tabelaMediDispon.getColumnModel().getColumnCount() > 0) {
            tabelaMediDispon.getColumnModel().getColumn(0).setResizable(false);
            tabelaMediDispon.getColumnModel().getColumn(1).setResizable(false);
            tabelaMediDispon.getColumnModel().getColumn(2).setResizable(false);
        }

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel2.setText("Médicos Disponíveis No Dia Corrente");

        painelatt3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                painelatt3MouseMoved(evt);
            }
        });
        painelatt3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                painelatt3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                painelatt3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                painelatt3MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                painelatt3MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                painelatt3MouseReleased(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/IconesNovos/icons8-Refresh-40.png"))); // NOI18N

        javax.swing.GroupLayout painelatt3Layout = new javax.swing.GroupLayout(painelatt3);
        painelatt3.setLayout(painelatt3Layout);
        painelatt3Layout.setHorizontalGroup(
            painelatt3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        painelatt3Layout.setVerticalGroup(
            painelatt3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 562, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(painelatt3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(painelatt3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));

        tabelaAgendadas.setBackground(new java.awt.Color(240, 240, 240));
        tabelaAgendadas.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        tabelaAgendadas.getTableHeader().setReorderingAllowed(false);

        jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, listaAgendadas, tabelaAgendadas);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${fichaatend.paciente.nome}"));
        columnBinding.setColumnName("Paciente");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${medico.nome}"));
        columnBinding.setColumnName("Medico");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${situacao}"));
        columnBinding.setColumnName("Situacao");
        columnBinding.setColumnClass(Boolean.class);
        columnBinding.setEditable(false);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        jScrollPane1.setViewportView(tabelaAgendadas);
        if (tabelaAgendadas.getColumnModel().getColumnCount() > 0) {
            tabelaAgendadas.getColumnModel().getColumn(0).setResizable(false);
            tabelaAgendadas.getColumnModel().getColumn(1).setResizable(false);
            tabelaAgendadas.getColumnModel().getColumn(2).setResizable(false);
        }

        painelatt2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                painelatt2MouseMoved(evt);
            }
        });
        painelatt2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                painelatt2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                painelatt2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                painelatt2MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                painelatt2MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                painelatt2MouseReleased(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/IconesNovos/icons8-Refresh-40.png"))); // NOI18N

        javax.swing.GroupLayout painelatt2Layout = new javax.swing.GroupLayout(painelatt2);
        painelatt2.setLayout(painelatt2Layout);
        painelatt2Layout.setHorizontalGroup(
            painelatt2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4)
        );
        painelatt2Layout.setVerticalGroup(
            painelatt2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4)
        );

        txtPesquisaData.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        txtPesquisaData.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                txtPesquisaDataPropertyChange(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel1.setText("Pré-Consultas No Dia:");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 505, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(32, 32, 32)
                        .addComponent(txtPesquisaData, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(painelatt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPesquisaData, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)))
                    .addComponent(painelatt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(443, 443, 443))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(93, 93, 93)))
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        areaDeTrabalho.setLayer(jPanel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout areaDeTrabalhoLayout = new javax.swing.GroupLayout(areaDeTrabalho);
        areaDeTrabalho.setLayout(areaDeTrabalhoLayout);
        areaDeTrabalhoLayout.setHorizontalGroup(
            areaDeTrabalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        areaDeTrabalhoLayout.setVerticalGroup(
            areaDeTrabalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        barraDeMenu.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        manutencao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/config.png"))); // NOI18N
        manutencao.setText("  Manutenção ");
        manutencao.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N

        manterFuncion.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        manterFuncion.setText("Funcionários");
        manterFuncion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manterFuncionActionPerformed(evt);
            }
        });
        manutencao.add(manterFuncion);

        manterMedic.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        manterMedic.setText("Médicos");
        manterMedic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manterMedicActionPerformed(evt);
            }
        });
        manutencao.add(manterMedic);

        manterPacie.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        manterPacie.setText("Pacientes");
        manterPacie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manterPacieActionPerformed(evt);
            }
        });
        manutencao.add(manterPacie);
        manutencao.add(jSeparator1);

        manterAtend.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        manterAtend.setText("Tipos de Atendimentos");
        manterAtend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manterAtendActionPerformed(evt);
            }
        });
        manutencao.add(manterAtend);

        manterSetor.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        manterSetor.setText("Setores");
        manterSetor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manterSetorActionPerformed(evt);
            }
        });
        manutencao.add(manterSetor);

        manterMedicamento.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        manterMedicamento.setText("Medicamentos");
        manterMedicamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manterMedicamentoActionPerformed(evt);
            }
        });
        manutencao.add(manterMedicamento);

        manterExame.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        manterExame.setText("Exames");
        manterExame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manterExameActionPerformed(evt);
            }
        });
        manutencao.add(manterExame);

        barraDeMenu.add(manutencao);

        atendimentos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/atendimento-pb.png"))); // NOI18N
        atendimentos.setText(" Serviços ");
        atendimentos.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N

        regisAtendimento.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F7, java.awt.event.InputEvent.CTRL_MASK));
        regisAtendimento.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        regisAtendimento.setText("Registrar Atendimentos");
        regisAtendimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regisAtendimentoActionPerformed(evt);
            }
        });
        atendimentos.add(regisAtendimento);
        atendimentos.add(jSeparator2);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F8, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem4.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jMenuItem4.setText("Pré-Consulta");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        atendimentos.add(jMenuItem4);

        barraDeMenu.add(atendimentos);

        relatorios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/IconesNovos/icons8-Purchase Order-50.png"))); // NOI18N
        relatorios.setText(" Relatórios ");
        relatorios.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N

        jMenuItem1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jMenuItem1.setText("Funcionários");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        relatorios.add(jMenuItem1);

        jMenuItem2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jMenuItem2.setText("Pacientes");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        relatorios.add(jMenuItem2);

        jMenuItem3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jMenuItem3.setText("Médicos");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        relatorios.add(jMenuItem3);

        jMenu3.setText("Relatórios de Pesquisa");
        jMenu3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        jMenuItem11.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F6, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem11.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jMenuItem11.setText("Atendimentos");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem11);

        jMenuItem12.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem12.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jMenuItem12.setText("Consultas");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem12);

        jMenuItem13.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F9, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem13.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jMenuItem13.setText("Pré-Consultas");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem13);

        relatorios.add(jMenu3);

        barraDeMenu.add(relatorios);

        prontuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/IconesNovos/icons8-Treatment Plan-48.png"))); // NOI18N
        prontuarios.setText(" Prontuários ");
        prontuarios.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N

        jMenuItem9.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jMenuItem9.setText("Todos os Prontuários");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        prontuarios.add(jMenuItem9);

        barraDeMenu.add(prontuarios);

        usuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/admuser.png"))); // NOI18N
        usuario.setText("  Usuário ");
        usuario.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N

        jMenuItem14.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jMenuItem14.setText("Editar Perfil");
        jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14ActionPerformed(evt);
            }
        });
        usuario.add(jMenuItem14);

        jMenuItem15.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jMenuItem15.setText("Sair");
        jMenuItem15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem15ActionPerformed(evt);
            }
        });
        usuario.add(jMenuItem15);

        barraDeMenu.add(usuario);

        dataFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/IconesNovos/icons8-Calendar-40.png"))); // NOI18N
        barraDeMenu.add(dataFoto);

        txtData.setText("jMenu1");
        barraDeMenu.add(txtData);

        timeFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/IconesNovos/icons8-Stopwatch-40.png"))); // NOI18N
        barraDeMenu.add(timeFoto);

        txttime.setText("jMenu1");
        barraDeMenu.add(txttime);

        setJMenuBar(barraDeMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(areaDeTrabalho)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(areaDeTrabalho)
        );

        bindingGroup.bind();

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void regisAtendimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regisAtendimentoActionPerformed
        if (!controleTipo.listaTipo().isEmpty()) {
            TelaFichaAtendi aten;
            aten = new TelaFichaAtendi();
            areaDeTrabalho.add(aten);
            aten.setVisible(true);

            try {
                aten.setMaximum(true);
            } catch (PropertyVetoException ex) {
                Logger.getLogger(InicioAdm.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                aten.setSelected(true);
            } catch (PropertyVetoException ex) {
                Logger.getLogger(InicioAdm.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Cadastre um tipo de atendimento!");
        }
    }//GEN-LAST:event_regisAtendimentoActionPerformed

    private void manterFuncionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manterFuncionActionPerformed
        ManterFuncionario manterUser;
        manterUser = new ManterFuncionario();
        areaDeTrabalho.add(manterUser);
        manterUser.setVisible(true);
//        try {
//           manterUser.setMaximum(true);
//        } catch (PropertyVetoException ex) {
//            Logger.getLogger(IndexAdm.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        try {
//            manterUser.setSelected(true);
//        } catch (PropertyVetoException ex) {
//            Logger.getLogger(IndexAdm.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }//GEN-LAST:event_manterFuncionActionPerformed

    private void manterMedicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manterMedicActionPerformed
        ManterMedico manterMed;
        manterMed = new ManterMedico();
        areaDeTrabalho.add(manterMed);
        manterMed.setVisible(true);
//        try {
//           manterMed.setMaximum(true);
//        } catch (PropertyVetoException ex) {
//            Logger.getLogger(IndexAdm.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        try {
//            manterMed.setSelected(true);
//        } catch (PropertyVetoException ex) {
//            Logger.getLogger(IndexAdm.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }//GEN-LAST:event_manterMedicActionPerformed

    private void manterPacieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manterPacieActionPerformed
        ManterPaciente manterPac;
        manterPac = new ManterPaciente();

        areaDeTrabalho.add(manterPac);
        manterPac.setVisible(true);


    }//GEN-LAST:event_manterPacieActionPerformed

    private void manterAtendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manterAtendActionPerformed
        ManterTipoAtendi manterTipo;
        manterTipo = new ManterTipoAtendi();
        areaDeTrabalho.add(manterTipo);
        manterTipo.setVisible(true);
    }//GEN-LAST:event_manterAtendActionPerformed

    private void manterSetorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manterSetorActionPerformed
        ManterSetor manterSetor;
        manterSetor = new ManterSetor();
        areaDeTrabalho.add(manterSetor);
        manterSetor.setVisible(true);
    }//GEN-LAST:event_manterSetorActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed

        TelaPreConsulta pre;
        pre = new TelaPreConsulta();
        areaDeTrabalho.add(pre);
        pre.setVisible(true);

        try {
            pre.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(InicioAdm.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            pre.setSelected(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(InicioAdm.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void manterMedicamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manterMedicamentoActionPerformed
        ManterMedicamento tela = new ManterMedicamento();
        areaDeTrabalho.add(tela);
        tela.setVisible(true);

    }//GEN-LAST:event_manterMedicamentoActionPerformed

    private void jMenuItem15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem15ActionPerformed
        Inicio tela = new Inicio();

        tela.setVisible(true);
        ControleMedico.setLogado(null);
        ControleFuncionario.setLogado(null);
        this.dispose();
    }//GEN-LAST:event_jMenuItem15ActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
        TodasPreConsultas tela = new TodasPreConsultas();
        areaDeTrabalho.add(tela);
        tela.setVisible(true);
    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        TodosAtendimentos tela = new TodosAtendimentos();
        areaDeTrabalho.add(tela);
        tela.setVisible(true);
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void manterExameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manterExameActionPerformed
        ManterExame tela = new ManterExame();
        areaDeTrabalho.add(tela);
        tela.setVisible(true);
    }//GEN-LAST:event_manterExameActionPerformed

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained


    }//GEN-LAST:event_formFocusGained

    private void areaDeTrabalhoComponentRemoved(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_areaDeTrabalhoComponentRemoved
        // TODO add your handling code here:

    }//GEN-LAST:event_areaDeTrabalhoComponentRemoved

    private void tabelaMediDisponMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaMediDisponMouseClicked

    }//GEN-LAST:event_tabelaMediDisponMouseClicked

    private void txtPesquisaDataPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_txtPesquisaDataPropertyChange


    }//GEN-LAST:event_txtPesquisaDataPropertyChange

    private void painelatt2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_painelatt2MouseClicked
        listaAgendadas.clear();
        listaAgendadas.addAll(controlePrec.pesquisaPrecData(txtPesquisaData.getDate()));
    }//GEN-LAST:event_painelatt2MouseClicked

    private void painelatt2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_painelatt2MouseReleased

    }//GEN-LAST:event_painelatt2MouseReleased

    private void painelatt2MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_painelatt2MouseMoved

    }//GEN-LAST:event_painelatt2MouseMoved

    private void painelatt2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_painelatt2MouseEntered
        painelatt2.setBackground(Color.WHITE);
    }//GEN-LAST:event_painelatt2MouseEntered

    private void painelatt2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_painelatt2MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_painelatt2MousePressed

    private void painelatt2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_painelatt2MouseExited
        Color cinza = new Color(240, 240, 240);
        painelatt2.setBackground(cinza);

    }//GEN-LAST:event_painelatt2MouseExited

    private void painelatt3MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_painelatt3MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_painelatt3MouseMoved

    private void painelatt3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_painelatt3MouseClicked
        listaMedicos.clear();

        listaMedicos.addAll(controleMed.medicosDisponiveisTudo());
        for (Medico m : listaMedicos) {
            int i = controlePrec.listaConsultasDataMed(new Date(), m).size();
            tabelaMediDispon.setValueAt(Integer.toString(m.getMaxatendi() - i), listaMedicos.indexOf(m), 2);

        }
    }//GEN-LAST:event_painelatt3MouseClicked

    private void painelatt3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_painelatt3MouseEntered
        painelatt3.setBackground(Color.WHITE);
    }//GEN-LAST:event_painelatt3MouseEntered

    private void painelatt3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_painelatt3MouseExited
        Color cinza = new Color(240, 240, 240);
        painelatt3.setBackground(cinza);
    }//GEN-LAST:event_painelatt3MouseExited

    private void painelatt3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_painelatt3MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_painelatt3MousePressed

    private void painelatt3MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_painelatt3MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_painelatt3MouseReleased

    private void jPanel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseEntered
        Color cinza = new Color(153, 153, 153);
        jPanel5.setBackground(cinza);
    }//GEN-LAST:event_jPanel5MouseEntered

    private void jPanel5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseExited
        Color cinza = new Color(240, 240, 240);
        jPanel5.setBackground(cinza);
    }//GEN-LAST:event_jPanel5MouseExited

    private void jPanel7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MouseEntered
        Color cinza = new Color(153, 153, 153);
        jPanel7.setBackground(cinza);
    }//GEN-LAST:event_jPanel7MouseEntered

    private void jPanel7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MouseExited
        Color cinza = new Color(240, 240, 240);
        jPanel7.setBackground(cinza);
    }//GEN-LAST:event_jPanel7MouseExited

    private void jPanel8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel8MouseEntered
        Color cinza = new Color(153, 153, 153);
        jPanel8.setBackground(cinza);
    }//GEN-LAST:event_jPanel8MouseEntered

    private void jPanel8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel8MouseExited
        Color cinza = new Color(240, 240, 240);
        jPanel8.setBackground(cinza);
    }//GEN-LAST:event_jPanel8MouseExited

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        TodasConsultas tela = new TodasConsultas();
        areaDeTrabalho.add(tela);
        tela.setVisible(true);
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void jPanel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseClicked
        if (!controleTipo.listaTipo().isEmpty()) {
            TelaFichaAtendi aten;
            aten = new TelaFichaAtendi();
            areaDeTrabalho.add(aten);
            aten.setVisible(true);

            try {
                aten.setMaximum(true);
            } catch (PropertyVetoException ex) {
                Logger.getLogger(InicioAdm.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                aten.setSelected(true);
            } catch (PropertyVetoException ex) {
                Logger.getLogger(InicioAdm.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Cadastre um tipo de atendimento!");
        }
    }//GEN-LAST:event_jPanel5MouseClicked

    private void jPanel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MouseClicked
        TelaPreConsulta pre;
        pre = new TelaPreConsulta();
        areaDeTrabalho.add(pre);
        pre.setVisible(true);

        try {
            pre.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(InicioAdm.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            pre.setSelected(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(InicioAdm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jPanel7MouseClicked

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        JasperReport relatorio = null;
        try {
            relatorio = JasperCompileManager.compileReport("src\\relatorio\\Funcionarios_1.jrxml");
        } catch (JRException ex) {
            Logger.getLogger(InicioAdm.class.getName()).log(Level.SEVERE, null, ex);
        }
        JasperPrint impressao = null;
        try {
            impressao = JasperFillManager.fillReport(relatorio, null, new JRBeanCollectionDataSource(controleFuncionario.listaFuncionario()));
        } catch (JRException ex) {
            Logger.getLogger(InicioAdm.class.getName()).log(Level.SEVERE, null, ex);
        }

        JasperViewer visaoRelatorio = new JasperViewer(impressao, false);
        visaoRelatorio.setVisible(true);

    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        JasperReport relatorio = null;
        try {
            relatorio = JasperCompileManager.compileReport("src\\relatorio\\Medicos.jrxml");
        } catch (JRException ex) {
            Logger.getLogger(InicioAdm.class.getName()).log(Level.SEVERE, null, ex);
        }
        JasperPrint impressao = null;
        try {
            impressao = JasperFillManager.fillReport(relatorio, null, new JRBeanCollectionDataSource(controleMed.listaMedico()));
        } catch (JRException ex) {
            Logger.getLogger(InicioAdm.class.getName()).log(Level.SEVERE, null, ex);
        }

        JasperViewer visaoRelatorio = new JasperViewer(impressao, false);
        visaoRelatorio.setVisible(true);

    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem14ActionPerformed
        TelaEditarPerfilFuncionario tela;
        tela = new TelaEditarPerfilFuncionario(null, true, funcionario);
        tela.setVisible(true);
        funcionario = tela.getSelecionado();
        usuario.setText(funcionario.getNome());
    }//GEN-LAST:event_jMenuItem14ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        JasperReport relatorio = null;
        try {
            relatorio = JasperCompileManager.compileReport("src\\relatorio\\Pessoas.jrxml");
        } catch (JRException ex) {
            Logger.getLogger(InicioAdm.class.getName()).log(Level.SEVERE, null, ex);
        }
        JasperPrint impressao = null;
        try {
            ControlePaciente controlepaciente = new ControlePaciente();
            impressao = JasperFillManager.fillReport(relatorio, null, new JRBeanCollectionDataSource(controlepaciente.listaPaciente()));
        } catch (JRException ex) {
            Logger.getLogger(InicioAdm.class.getName()).log(Level.SEVERE, null, ex);
        }

        JasperViewer visaoRelatorio = new JasperViewer(impressao, false);
        visaoRelatorio.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        PacienteProntuario manterPac;
        manterPac = new PacienteProntuario();

        areaDeTrabalho.add(manterPac);
        manterPac.setVisible(true);
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jPanel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel8MouseClicked
        PacienteProntuario tela = new PacienteProntuario();
        areaDeTrabalho.add(tela);
        tela.setVisible(true);
    }//GEN-LAST:event_jPanel8MouseClicked

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
            java.util.logging.Logger.getLogger(InicioAdm.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InicioAdm.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InicioAdm.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InicioAdm.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InicioAdm().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane areaDeTrabalho;
    private javax.swing.JMenu atendimentos;
    private javax.swing.JMenuBar barraDeMenu;
    private javax.swing.JMenu dataFoto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private java.util.List<PreConsulta> listaAgendadas;
    private java.util.List<Medico> listaMedicos;
    private javax.swing.JMenuItem manterAtend;
    private javax.swing.JMenuItem manterExame;
    private javax.swing.JMenuItem manterFuncion;
    private javax.swing.JMenuItem manterMedic;
    private javax.swing.JMenuItem manterMedicamento;
    private javax.swing.JMenuItem manterPacie;
    private javax.swing.JMenuItem manterSetor;
    private javax.swing.JMenu manutencao;
    private javax.swing.JPanel painelatt2;
    private javax.swing.JPanel painelatt3;
    private javax.swing.JMenu prontuarios;
    private javax.swing.JMenuItem regisAtendimento;
    private javax.swing.JMenu relatorios;
    private javax.swing.JTable tabelaAgendadas;
    private javax.swing.JTable tabelaMediDispon;
    private javax.swing.JMenu timeFoto;
    private javax.swing.JMenu txtData;
    private com.toedter.calendar.JDateChooser txtPesquisaData;
    private javax.swing.JMenu txttime;
    private javax.swing.JMenu usuario;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}

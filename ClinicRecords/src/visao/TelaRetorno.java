package visao;

import visao.dialogs.DialogBuscaPaciente;
import controle.ControleFichaAtendimento;
import controle.ControleMedico;
import controle.ControlePreConsulta;
import controle.ControleTipoAtendi;
import java.util.Date;
import javax.swing.JOptionPane;
import modelo.FichaAtendimento;
import modelo.Pessoa;
import modelo.PreConsulta;
import modelo.TipoAtendi;

public class TelaRetorno extends javax.swing.JInternalFrame {

    private Pessoa paciente;

    private ControleTipoAtendi controleTipo;
    private ControleFichaAtendimento controle;
    private boolean novo = true;
    private ControlePreConsulta controlePrec;

    private ControleMedico controleMed;

    public TelaRetorno() {
        initComponents();

        controleTipo = new ControleTipoAtendi();
        controle = new ControleFichaAtendimento();
        controlePrec = new ControlePreConsulta();
        for (TipoAtendi f : controleTipo.listaTipo()) {
            tipoAtendimento.addItem(f);
        }
        controleMed = new ControleMedico();
        labelOrdem.setText(controle.getNumOrdem(new Date()));
        dataAtendi.setDate(new Date());
        

    }

    public TelaRetorno(Pessoa pessoa) {
        initComponents();
        controleTipo = new ControleTipoAtendi();
        controle = new ControleFichaAtendimento();
        controlePrec = new ControlePreConsulta();
        for (TipoAtendi f : controleTipo.listaTipo()) {
            tipoAtendimento.addItem(f);
        }
        controleMed = new ControleMedico();
        labelOrdem.setText(controle.getNumOrdem(new Date()));
        dataAtendi.setDate(new Date());
        this.paciente = pessoa;
        txtPaciente.setText(this.paciente.getNome());
        jButton3.setEnabled(false);
         areaPac.setText(paciente.toString());
    }

    public Date getDataAte() {
        return dataAtendi.getDate();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtficha = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        areaPac = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        txtPaciente = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tipoAtendimento = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        dataAtendi = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        labelOrdem = new javax.swing.JLabel();
        registrar = new javax.swing.JButton();

        setBackground(new java.awt.Color(232, 232, 232));
        setClosable(true);

        txtficha.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtficha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/atendimento-pb.png"))); // NOI18N
        txtficha.setText("Ficha de Agendamento de Retorno");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados do Paciente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 20))); // NOI18N

        areaPac.setEditable(false);
        areaPac.setBackground(new java.awt.Color(240, 240, 240));
        areaPac.setColumns(20);
        areaPac.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        areaPac.setRows(5);
        jScrollPane1.setViewportView(areaPac);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 416, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ficha", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 20))); // NOI18N

        txtPaciente.setEditable(false);
        txtPaciente.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        txtPaciente.setBorder(null);
        txtPaciente.setSelectedTextColor(new java.awt.Color(240, 240, 240));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/searchmenor.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel3.setText("Paciente");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel4.setText("Nº de Ordem");

        tipoAtendimento.setBackground(new java.awt.Color(240, 240, 240));
        tipoAtendimento.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        tipoAtendimento.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel5.setText("Tipo de Atendimento");

        dataAtendi.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        dataAtendi.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                dataAtendiPropertyChange(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel6.setText("Data");

        jSeparator1.setBackground(new java.awt.Color(51, 51, 51));
        jSeparator1.setForeground(new java.awt.Color(51, 51, 51));

        jSeparator3.setBackground(new java.awt.Color(51, 51, 51));
        jSeparator3.setForeground(new java.awt.Color(51, 51, 51));

        labelOrdem.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        labelOrdem.setText("    ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3))
                .addGap(18, 69, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(labelOrdem, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(178, 178, 178))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(tipoAtendimento, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(dataAtendi, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(jSeparator1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(labelOrdem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(tipoAtendimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dataAtendi, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        registrar.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        registrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/confirm.png"))); // NOI18N
        registrar.setText("Registrar");
        registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(registrar))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtficha)
                        .addGap(0, 394, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtficha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(registrar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        DialogBuscaPaciente tela;
        tela = new DialogBuscaPaciente(null, true);
        tela.setVisible(true);
        if (tela.getPacienteSelecionado() != null) {
            paciente = tela.getPacienteSelecionado();

            txtPaciente.setText(paciente.getNome());
            areaPac.setText(paciente.toString());
        }

    }//GEN-LAST:event_jButton3ActionPerformed

    private void registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarActionPerformed

        if (controleMed.listaMedico().size() > 0) {
            if (controlePrec.pesquisaPrecMedDataBool(dataAtendi.getDate(), ControleMedico.getLogado()).size() < ControleMedico.getLogado().getMaxatendi()) {
                FichaAtendimento fichaAtendimento = new FichaAtendimento();
                fichaAtendimento.setFuncionario(ControleMedico.getLogado());
                if (!dataAtendi.isValid()) {
                    labelOrdem.setText(Integer.toString(Integer.parseInt(controle.getNumOrdem(dataAtendi.getDate())) + 1));
                }
                fichaAtendimento.setNumeroordem(Integer.parseInt(labelOrdem.getText()));
                fichaAtendimento.setPaciente(paciente);
                fichaAtendimento.setTipoatend((TipoAtendi) tipoAtendimento.getSelectedItem());
                fichaAtendimento.setDataregistro(new Date());

                fichaAtendimento.setAtendmed(true);
                fichaAtendimento.setDataatend(dataAtendi.getDate());
                fichaAtendimento.setSituacao(false);

                if (ControleMedico.getLogado() != null) {

                    PreConsulta novapre;
                    novapre = new PreConsulta();
                    novapre.setFichaatend(fichaAtendimento);
                    novapre.setFuncionario(null);
                    novapre.setMedico(ControleMedico.getLogado());
                    novapre.setDataPrec(dataAtendi.getDate());
                    novapre.setAltura(0);
                    novapre.setDiastolica(0);
                    novapre.setPeso(0);
                    novapre.setSituacao(false);
                    novapre.setSistolica(0);

                    controlePrec.adicionar(novapre);

                    labelOrdem.setText(Integer.toString(Integer.parseInt(labelOrdem.getText()) + 1));
                    txtPaciente.setText("");
                    areaPac.setText("");
                    paciente = null;

                    JOptionPane.showMessageDialog(this, "Adicionado com sucesso!");
                } else {
                    JOptionPane.showMessageDialog(this, "Nesta data as Vagas estão lotadas!");
                }
            } else {

                txtPaciente.setText("");
                areaPac.setText("");
                paciente = null;

                JOptionPane.showMessageDialog(this, "Cancelado!");

            }
        } else {
            JOptionPane.showMessageDialog(this, "Cadastre um médico!");
        }


    }//GEN-LAST:event_registrarActionPerformed

    private void dataAtendiPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_dataAtendiPropertyChange
        if (!dataAtendi.isValid()) {
            labelOrdem.setText(Integer.toString(Integer.parseInt(controle.getNumOrdem(dataAtendi.getDate())) + 1));
        }


    }//GEN-LAST:event_dataAtendiPropertyChange


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaPac;
    private com.toedter.calendar.JDateChooser dataAtendi;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel labelOrdem;
    private javax.swing.JButton registrar;
    private javax.swing.JComboBox<TipoAtendi> tipoAtendimento;
    private javax.swing.JTextField txtPaciente;
    private javax.swing.JLabel txtficha;
    // End of variables declaration//GEN-END:variables
}

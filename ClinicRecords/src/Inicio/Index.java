/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inicio;

import controle.ControleTipoAtendi;
import java.beans.PropertyVetoException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import visao.ManterFuncionario;
import visao.ManterMedico;
import visao.ManterPaciente;
import visao.ManterSetor;
import visao.ManterTipoAtendi;
import visao.TelaFichaAtendi;
import visao.TelaPreConsulta;

/**
 *
 * @author Aluno
 */
public class Index extends javax.swing.JFrame {

    private ControleTipoAtendi controleTipo;
    public Index() {
       
        initComponents();
         controleTipo=new ControleTipoAtendi();
        this.setExtendedState(MAXIMIZED_BOTH);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        areaDeTrabalho = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        barraDeMenu = new javax.swing.JMenuBar();
        manutencao = new javax.swing.JMenu();
        manterFuncion = new javax.swing.JMenuItem();
        manterMedic = new javax.swing.JMenuItem();
        manterPacie = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        manterAtend = new javax.swing.JMenuItem();
        manterSetor = new javax.swing.JMenuItem();
        atendimentos = new javax.swing.JMenu();
        regisAtendimento = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuItem4 = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jMenuItem5 = new javax.swing.JMenuItem();
        relatorios = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/fun.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1556, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(501, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 922, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(368, Short.MAX_VALUE))
        );

        areaDeTrabalho.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout areaDeTrabalhoLayout = new javax.swing.GroupLayout(areaDeTrabalho);
        areaDeTrabalho.setLayout(areaDeTrabalhoLayout);
        areaDeTrabalhoLayout.setHorizontalGroup(
            areaDeTrabalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        areaDeTrabalhoLayout.setVerticalGroup(
            areaDeTrabalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        barraDeMenu.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        manutencao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/config.png"))); // NOI18N
        manutencao.setText("    Manutenção   ");

        manterFuncion.setText("Funcionários");
        manterFuncion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manterFuncionActionPerformed(evt);
            }
        });
        manutencao.add(manterFuncion);

        manterMedic.setText("Médicos");
        manterMedic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manterMedicActionPerformed(evt);
            }
        });
        manutencao.add(manterMedic);

        manterPacie.setText("Pacientes");
        manterPacie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manterPacieActionPerformed(evt);
            }
        });
        manutencao.add(manterPacie);
        manutencao.add(jSeparator1);

        manterAtend.setText("Tipos de Atendimentos");
        manterAtend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manterAtendActionPerformed(evt);
            }
        });
        manutencao.add(manterAtend);

        manterSetor.setText("Setor");
        manterSetor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manterSetorActionPerformed(evt);
            }
        });
        manutencao.add(manterSetor);

        barraDeMenu.add(manutencao);

        atendimentos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/atendimento.png"))); // NOI18N
        atendimentos.setText("     Atendimentos    ");

        regisAtendimento.setText("Registrar Atendimentos");
        regisAtendimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regisAtendimentoActionPerformed(evt);
            }
        });
        atendimentos.add(regisAtendimento);
        atendimentos.add(jSeparator2);

        jMenuItem4.setText("Pré-Consulta");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        atendimentos.add(jMenuItem4);
        atendimentos.add(jSeparator3);

        jMenuItem5.setText("Realizar Consulta");
        atendimentos.add(jMenuItem5);

        barraDeMenu.add(atendimentos);

        relatorios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/relatorio.png"))); // NOI18N
        relatorios.setText("     Relatórios    ");

        jMenuItem1.setText("Prontuário");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        relatorios.add(jMenuItem1);

        barraDeMenu.add(relatorios);

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

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void regisAtendimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regisAtendimentoActionPerformed
        if(!controleTipo.listaTipo().isEmpty()){
        TelaFichaAtendi aten;
        aten = new TelaFichaAtendi();
        areaDeTrabalho.add(aten);
        aten.setVisible(true);

        try {
            aten.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(Index.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            aten.setSelected(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(Index.class.getName()).log(Level.SEVERE, null, ex);
        }
        }else {
            JOptionPane.showMessageDialog(this, "Cadastre um tipo de atendimento!");
        }
    }//GEN-LAST:event_regisAtendimentoActionPerformed

    private void manterFuncionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manterFuncionActionPerformed
        ManterFuncionario manterUser;
        manterUser = new ManterFuncionario();
        areaDeTrabalho.add(manterUser);
        manterUser.setVisible(true);
    }//GEN-LAST:event_manterFuncionActionPerformed

    private void manterMedicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manterMedicActionPerformed
        ManterMedico manterMed;
        manterMed = new ManterMedico();
        areaDeTrabalho.add(manterMed);
        manterMed.setVisible(true);
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

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        TelaPreConsulta pre;
        pre = new TelaPreConsulta();
        areaDeTrabalho.add(pre);
        pre.setVisible(true);

        try {
            pre.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(Index.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            pre.setSelected(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(Index.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jMenuItem4ActionPerformed

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
            java.util.logging.Logger.getLogger(Index.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Index.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Index.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Index.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Index().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane areaDeTrabalho;
    private javax.swing.JMenu atendimentos;
    private javax.swing.JMenuBar barraDeMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JMenuItem manterAtend;
    private javax.swing.JMenuItem manterFuncion;
    private javax.swing.JMenuItem manterMedic;
    private javax.swing.JMenuItem manterPacie;
    private javax.swing.JMenuItem manterSetor;
    private javax.swing.JMenu manutencao;
    private javax.swing.JMenuItem regisAtendimento;
    private javax.swing.JMenu relatorios;
    // End of variables declaration//GEN-END:variables
}

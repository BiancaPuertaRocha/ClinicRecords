package visao.inicio;
import controle.ControleFuncionario;
import controle.ControleMedico;
import java.awt.event.KeyEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import modelo.Funcionario;
import modelo.Medico;

public class Inicio extends javax.swing.JFrame {

    private static Medico med = null;
    private static Funcionario funci = null;
    private ControleFuncionario controleFunc;
    private ControleMedico controleMedico;
    private boolean prim;

    public Inicio() {
        initComponents();

        controleFunc = new ControleFuncionario();
        controleMedico = new ControleMedico();

        if (controleFunc.listaFuncionario().size() > 0) {
            primAcesso.setEnabled(false);

        }
        funcionario.setSelected(true);
    }
    public void enter(java.awt.event.KeyEvent evt){
        if (evt.getKeyCode()==KeyEvent.VK_ENTER){
            entrar();
        }
    }
    public void entrar (){
        if (medico.isSelected()) {
            if (controleMedico.pesquisaUsuarioSenha(txtusuario.getText(), txtsenha.getText()) != null) {

                UIManager.removeAuxiliaryLookAndFeel(UIManager.getLookAndFeel());
                controleMedico.setLogado(controleMedico.pesquisaUsuarioSenha(txtusuario.getText(), txtsenha.getText()));
                InicioMedico telaMed = new InicioMedico();
                try {
                    UIManager.setLookAndFeel("de.javasoft.plaf.synthetica.SyntheticaWhiteVisionLookAndFeel");
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                    Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                    Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
                } catch (UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
                }

                SwingUtilities.updateComponentTreeUI(telaMed);

                telaMed.setVisible(true);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Usuário e/ou senha incorreto(s)!");
            }
        } else if (funcionario.isSelected()) {
            if (controleFunc.pesquisaUsuarioSenha(txtusuario.getText(), txtsenha.getText()) != null) {
                controleFunc.setLogado(controleFunc.pesquisaUsuarioSenha(txtusuario.getText(), txtsenha.getText()));

                InicioAdm telaMed = new InicioAdm();
                try {
                    UIManager.setLookAndFeel("de.javasoft.plaf.synthetica.SyntheticaWhiteVisionLookAndFeel");
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                    Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                    Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
                } catch (UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
                }

                SwingUtilities.updateComponentTreeUI(telaMed);
                telaMed.setVisible(true);
                this.dispose();

            } else {
                JOptionPane.showMessageDialog(this, "Usuário e/ou senha incorreto(s)!");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Selecione um tipo para o login!");
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tipo = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtusuario = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        txtsenha = new javax.swing.JPasswordField();
        jSeparator2 = new javax.swing.JSeparator();
        medico = new javax.swing.JRadioButton();
        funcionario = new javax.swing.JRadioButton();
        botacesso = new javax.swing.JButton();
        primAcesso = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new java.awt.GridLayout(10, 1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel3.setText("Usuário");
        jPanel1.add(jLabel3);

        txtusuario.setBackground(new java.awt.Color(240, 240, 240));
        txtusuario.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        txtusuario.setBorder(null);
        txtusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtusuarioActionPerformed(evt);
            }
        });
        txtusuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtusuarioKeyPressed(evt);
            }
        });
        jPanel1.add(txtusuario);

        jSeparator1.setBackground(new java.awt.Color(51, 51, 51));
        jSeparator1.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.add(jSeparator1);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel1.setText("Senha");
        jPanel1.add(jLabel1);

        txtsenha.setBackground(new java.awt.Color(240, 240, 240));
        txtsenha.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        txtsenha.setBorder(null);
        txtsenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtsenhaKeyPressed(evt);
            }
        });
        jPanel1.add(txtsenha);

        jSeparator2.setBackground(new java.awt.Color(51, 51, 51));
        jSeparator2.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.add(jSeparator2);

        tipo.add(medico);
        medico.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        medico.setText("Médico");
        medico.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                medicoKeyPressed(evt);
            }
        });
        jPanel1.add(medico);

        tipo.add(funcionario);
        funcionario.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        funcionario.setText("Funcionário");
        funcionario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                funcionarioKeyPressed(evt);
            }
        });
        jPanel1.add(funcionario);

        botacesso.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        botacesso.setText("Acessar");
        botacesso.setBorder(null);
        botacesso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botacessoActionPerformed(evt);
            }
        });
        botacesso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                botacessoKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                botacessoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                botacessoKeyTyped(evt);
            }
        });
        jPanel1.add(botacesso);

        primAcesso.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        primAcesso.setText("Primeiro Acesso");
        primAcesso.setBorder(null);
        primAcesso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                primAcessoActionPerformed(evt);
            }
        });
        jPanel1.add(primAcesso);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/logo.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 637, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 80, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(136, 136, 136))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 306, Short.MAX_VALUE)
                .addGap(16, 16, 16))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtusuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtusuarioActionPerformed

    private void botacessoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botacessoActionPerformed

        entrar();


    }//GEN-LAST:event_botacessoActionPerformed

    private void primAcessoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_primAcessoActionPerformed

        CadPrimeiroAcesso telaFunc;
        telaFunc = new CadPrimeiroAcesso();
        telaFunc.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_primAcessoActionPerformed

    private void botacessoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_botacessoKeyPressed

    }//GEN-LAST:event_botacessoKeyPressed

    private void botacessoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_botacessoKeyTyped
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (medico.isSelected()) {
                if (controleMedico.pesquisaUsuarioSenha(txtusuario.getText(), txtsenha.getText()) != null) {
                    med = controleMedico.pesquisaUsuarioSenha(txtusuario.getText(), txtsenha.getText());
                    InicioMedico telaMed = new InicioMedico();
                    telaMed.setVisible(true);
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(this, "Usuário e/ou senha incorreto(s)!");
                }
            } else if (funcionario.isSelected()) {
                if (controleFunc.pesquisaUsuarioSenha(txtusuario.getText(), txtsenha.getText()) != null) {
                    funci = controleFunc.pesquisaUsuarioSenha(txtusuario.getText(), txtsenha.getText());

                    InicioAdm telaMed = new InicioAdm();
                    telaMed.setVisible(true);
                    this.dispose();

                } else {
                    JOptionPane.showMessageDialog(this, "Usuário e/ou senha incorreto(s)!");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Selecione um tipo para o login!");
            }
        }
    }//GEN-LAST:event_botacessoKeyTyped

    private void botacessoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_botacessoKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (medico.isSelected()) {
                if (controleMedico.pesquisaUsuarioSenha(txtusuario.getText(), txtsenha.getText()) != null) {
                    med = controleMedico.pesquisaUsuarioSenha(txtusuario.getText(), txtsenha.getText());
                    InicioMedico telaMed = new InicioMedico();
                    telaMed.setVisible(true);
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(this, "Usuário e/ou senha incorreto(s)!");
                }
            } else if (funcionario.isSelected()) {
                if (controleFunc.pesquisaUsuarioSenha(txtusuario.getText(), txtsenha.getText()) != null) {
                    funci = controleFunc.pesquisaUsuarioSenha(txtusuario.getText(), txtsenha.getText());

                    InicioAdm telaMed = new InicioAdm();
                    telaMed.setVisible(true);
                    this.dispose();

                } else {
                    JOptionPane.showMessageDialog(this, "Usuário e/ou senha incorreto(s)!");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Selecione um tipo para o login!");
            }
        }
    }//GEN-LAST:event_botacessoKeyReleased

    private void txtusuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtusuarioKeyPressed
        enter(evt);
    }//GEN-LAST:event_txtusuarioKeyPressed

    private void txtsenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsenhaKeyPressed
        enter(evt);
    }//GEN-LAST:event_txtsenhaKeyPressed

    private void funcionarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_funcionarioKeyPressed
         enter(evt);
    }//GEN-LAST:event_funcionarioKeyPressed

    private void medicoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_medicoKeyPressed
         enter(evt);
    }//GEN-LAST:event_medicoKeyPressed

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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botacesso;
    private javax.swing.JRadioButton funcionario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JRadioButton medico;
    private javax.swing.JButton primAcesso;
    private javax.swing.ButtonGroup tipo;
    private javax.swing.JPasswordField txtsenha;
    private javax.swing.JTextField txtusuario;
    // End of variables declaration//GEN-END:variables
}

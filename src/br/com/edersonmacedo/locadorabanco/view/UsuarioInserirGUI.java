/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.edersonmacedo.locadorabanco.view;

import br.com.edersonmacedo.locadorabanco.model.Usuario;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author guest01
 */
public class UsuarioInserirGUI extends javax.swing.JFrame {

    /**
     * Creates new form UsuarioInserirGUI
     */
    public UsuarioInserirGUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoSexo = new javax.swing.ButtonGroup();
        painelFrom = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txCodigo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txLogin = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txSenha = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txCpf = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txTefone = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        rbMasculino = new javax.swing.JRadioButton();
        rbFeminino = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        txDataNascimento = new javax.swing.JTextField();
        btLimpar = new javax.swing.JButton();
        btAdicionar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        painelFrom.setBackground(new java.awt.Color(255, 255, 255));
        painelFrom.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.MatteBorder(null), "Cadastro de Pessoa", 2, 0, new java.awt.Font("Arial", 0, 12), new java.awt.Color(0, 0, 0))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        jLabel1.setText("Codigo.:");

        txCodigo.setEditable(false);
        txCodigo.setBorder(new javax.swing.border.MatteBorder(null));
        txCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txCodigoActionPerformed(evt);
            }
        });

        jLabel2.setText("Nome.:");

        txNome.setBorder(new javax.swing.border.MatteBorder(null));
        txNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txNomeActionPerformed(evt);
            }
        });

        jLabel3.setText("Login.:");

        txLogin.setBorder(new javax.swing.border.MatteBorder(null));
        txLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txLoginActionPerformed(evt);
            }
        });

        jLabel4.setText("Senha.:");

        txSenha.setBorder(new javax.swing.border.MatteBorder(null));
        txSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txSenhaActionPerformed(evt);
            }
        });

        jLabel5.setText("CPF.:");

        txCpf.setBorder(new javax.swing.border.MatteBorder(null));
        txCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txCpfActionPerformed(evt);
            }
        });

        jLabel6.setText("Telefone.:");

        txTefone.setBorder(new javax.swing.border.MatteBorder(null));
        txTefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txTefoneActionPerformed(evt);
            }
        });

        jLabel7.setText("Sexo.:");

        rbMasculino.setBackground(new java.awt.Color(255, 255, 255));
        grupoSexo.add(rbMasculino);
        rbMasculino.setText("Masculino");

        rbFeminino.setBackground(new java.awt.Color(255, 255, 255));
        grupoSexo.add(rbFeminino);
        rbFeminino.setText("Feminino");
        rbFeminino.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel8.setText("Data de nascimento.:");

        txDataNascimento.setBorder(new javax.swing.border.MatteBorder(null));

        btLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Monsters.png"))); // NOI18N
        btLimpar.setToolTipText("Limpar. Irá limpar os campos preenchidos");
        btLimpar.setContentAreaFilled(false);
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        btAdicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add.png"))); // NOI18N
        btAdicionar.setToolTipText("Adicionar. Adiciona um novo cliente.");
        btAdicionar.setContentAreaFilled(false);
        btAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAdicionarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelFromLayout = new javax.swing.GroupLayout(painelFrom);
        painelFrom.setLayout(painelFromLayout);
        painelFromLayout.setHorizontalGroup(
            painelFromLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelFromLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelFromLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelFromLayout.createSequentialGroup()
                        .addGroup(painelFromLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(painelFromLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelFromLayout.createSequentialGroup()
                                .addComponent(txCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(painelFromLayout.createSequentialGroup()
                                .addComponent(txLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txSenha))
                            .addGroup(painelFromLayout.createSequentialGroup()
                                .addComponent(txCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 110, Short.MAX_VALUE)
                                .addComponent(txTefone, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txNome, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(1, 1, 1))
                    .addGroup(painelFromLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(rbMasculino)
                        .addGap(18, 18, 18)
                        .addComponent(rbFeminino)
                        .addGap(43, 43, 43)
                        .addGroup(painelFromLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelFromLayout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(painelFromLayout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txDataNascimento))))
                    .addGroup(painelFromLayout.createSequentialGroup()
                        .addComponent(btLimpar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btAdicionar)))
                .addContainerGap())
        );
        painelFromLayout.setVerticalGroup(
            painelFromLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelFromLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(painelFromLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painelFromLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(painelFromLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painelFromLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(painelFromLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(txCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txTefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(painelFromLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(rbMasculino)
                    .addComponent(rbFeminino)
                    .addComponent(jLabel8)
                    .addComponent(txDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 115, Short.MAX_VALUE)
                .addGroup(painelFromLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btLimpar)
                    .addComponent(btAdicionar))
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelFrom, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelFrom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txCodigoActionPerformed

    private void txNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txNomeActionPerformed

    private void txLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txLoginActionPerformed

    private void txSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txSenhaActionPerformed

    private void txCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txCpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txCpfActionPerformed

    private void txTefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txTefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txTefoneActionPerformed

    private void btAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAdicionarActionPerformed
        // TODO add your handling code here:
        Usuario u = new Usuario();
        u.setNome(txNome.getText());
        u.setCpf(txCpf.getText());
        u.setLogin(txLogin.getText());
        u.setSenha(txSenha.getText());
        if(rbFeminino.isSelected()){
            u.setSexo("Feminino");
        }else if(rbMasculino.isSelected()){
            u.setSexo("Masculino");
        }
        try{
            String data = txDataNascimento.getText();
            u.setDataNascimento(new SimpleDateFormat("dd/MM/yyyy").parse(data));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,"Erro ao converter data: "+ex);
        }
        //u.setDataNascimento(txDataNascimento.);
        
    }//GEN-LAST:event_btAdicionarActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        txCodigo.setText("");
        txCpf.setText("");
        txDataNascimento.setText("");
        txLogin.setText("");
        txNome.setText("");
        txSenha.setText("");
        txTefone.setText("");
        
    }//GEN-LAST:event_btLimparActionPerformed

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
            java.util.logging.Logger.getLogger(UsuarioInserirGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UsuarioInserirGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UsuarioInserirGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UsuarioInserirGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UsuarioInserirGUI().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAdicionar;
    private javax.swing.JButton btLimpar;
    private javax.swing.ButtonGroup grupoSexo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel painelFrom;
    private javax.swing.JRadioButton rbFeminino;
    private javax.swing.JRadioButton rbMasculino;
    private javax.swing.JTextField txCodigo;
    private javax.swing.JTextField txCpf;
    private javax.swing.JTextField txDataNascimento;
    private javax.swing.JTextField txLogin;
    private javax.swing.JTextField txNome;
    private javax.swing.JTextField txSenha;
    private javax.swing.JTextField txTefone;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;
import model.bean.Vaga;
import model.dao.VagaDAO;
/**
 *
 * @author 03832903097
 */
public class JFCadastrarVaga extends javax.swing.JFrame {

    /**
     * Creates new form JFCadastrarVaga
     */
    public JFCadastrarVaga() {
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

        BGTipoVaga = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTFNumero = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTFRua = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jRBObliqua = new javax.swing.JRadioButton();
        jRBParalela = new javax.swing.JRadioButton();
        jBtnCancelar = new javax.swing.JButton();
        jBtnLimpar = new javax.swing.JButton();
        jBtnSalvar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastrar Vaga");

        jLabel1.setFont(new java.awt.Font("Frank Ruhl Hofshi", 0, 36)); // NOI18N
        jLabel1.setText("Cadastrar Vaga");

        jLabel2.setText("Número");

        jTFNumero.setFont(new java.awt.Font("Gabriola", 0, 14)); // NOI18N
        jTFNumero.setName(""); // NOI18N
        jTFNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFNumeroActionPerformed(evt);
            }
        });

        jLabel3.setText("Rua");

        jTFRua.setFont(new java.awt.Font("Gabriola", 0, 14)); // NOI18N
        jTFRua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFRuaActionPerformed(evt);
            }
        });

        jLabel4.setText("Tipo de Vaga ");

        BGTipoVaga.add(jRBObliqua);
        jRBObliqua.setText("Obliqua");

        BGTipoVaga.add(jRBParalela);
        jRBParalela.setText("Paralela");

        jBtnCancelar.setText("Cancelar");
        jBtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCancelarActionPerformed(evt);
            }
        });

        jBtnLimpar.setText("Limpar");
        jBtnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnLimparActionPerformed(evt);
            }
        });

        jBtnSalvar.setText("Salvar");
        jBtnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnSalvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTFNumero, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                                    .addComponent(jTFRua)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(jRBObliqua)
                                .addGap(18, 18, 18)
                                .addComponent(jRBParalela))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addComponent(jLabel1)))
                        .addGap(0, 72, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jBtnSalvar)
                        .addGap(18, 18, 18)
                        .addComponent(jBtnLimpar)
                        .addGap(18, 18, 18)
                        .addComponent(jBtnCancelar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTFNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTFRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jRBObliqua)
                        .addComponent(jRBParalela)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnCancelar)
                    .addComponent(jBtnLimpar)
                    .addComponent(jBtnSalvar))
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTFNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFNumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFNumeroActionPerformed

    private void jTFRuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFRuaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFRuaActionPerformed

    private void jBtnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSalvarActionPerformed
        Vaga v = new Vaga();     
        VagaDAO dao = new VagaDAO();
        v.setNumero(Integer.parseInt(jTFNumero.getText()));
        v.setRua(jTFRua.getText());
        if(jRBObliqua.isSelected()){
            v.setObliqua (true);
        } else if(jRBParalela.isSelected()){
            v.setObliqua (false);
        }
        dao.create(v);
    }//GEN-LAST:event_jBtnSalvarActionPerformed

    private void jBtnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnLimparActionPerformed
        jTFRua.setText("");
        jTFNumero.setText("");
        BGTipoVaga.clearSelection();
    }//GEN-LAST:event_jBtnLimparActionPerformed

    private void jBtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_jBtnCancelarActionPerformed

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
            java.util.logging.Logger.getLogger(JFCadastrarVaga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFCadastrarVaga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFCadastrarVaga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFCadastrarVaga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFCadastrarVaga().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup BGTipoVaga;
    private javax.swing.JButton jBtnCancelar;
    private javax.swing.JButton jBtnLimpar;
    private javax.swing.JButton jBtnSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JRadioButton jRBObliqua;
    private javax.swing.JRadioButton jRBParalela;
    private javax.swing.JTextField jTFNumero;
    private javax.swing.JTextField jTFRua;
    // End of variables declaration//GEN-END:variables
}

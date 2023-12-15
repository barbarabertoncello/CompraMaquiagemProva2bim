/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JDlgFornecedorNovo;

import bean.FornecedorBbd;
import dao.FornecedorDao_bbd;
import java.text.ParseException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;
import tools.Util;
import view.JDlgUsuario;

/**
 *
 * @author "Autor"
 */
public class JDlgFornecedorIA extends javax.swing.JDialog {

    /**
     * Creates new form JDlgFornecedorNovo2
     */
    MaskFormatter mascaraCpf, mascaratTel, mascaraCel, mascaraRg, mascaraCnpj;
    FornecedorBbd fornecedorBbd;
    FornecedorDao_bbd fornecedorDao_bbd;
    JDlgFornecedorNovo jDlgFornecedorNovo;

    public JDlgFornecedorIA(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setTitle("Fornecedor");
        setLocationRelativeTo(null);

        fornecedorBbd = new FornecedorBbd();
        fornecedorDao_bbd = new FornecedorDao_bbd();

        try {
            mascaraCpf = new MaskFormatter("###.###.###-##");
            mascaraCel = new MaskFormatter("(##)#####.####");
            mascaraCnpj = new MaskFormatter("##.###.###/####-##");
            mascaraRg = new MaskFormatter("#.###.###");
            mascaratTel = new MaskFormatter("(##)#####.####");

        } catch (ParseException ex) {
            Logger.getLogger(JDlgUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        jFmtCpf_bbd.setFormatterFactory(new DefaultFormatterFactory(mascaraCpf));
        jFmtCelular_bbd.setFormatterFactory(new DefaultFormatterFactory(mascaraCel));
        jFmtCnpj_bbd.setFormatterFactory(new DefaultFormatterFactory(mascaraCnpj));
        jFmtRg_bbd.setFormatterFactory(new DefaultFormatterFactory(mascaraRg));
        jFmtTelefone_bbd.setFormatterFactory(new DefaultFormatterFactory(mascaratTel));

    }

    public void limparCampo() {

        Util.limparCampos(jFmtRg_bbd,
                jFmtCpf_bbd,
                jTxtCodigoFornecedor_bbd,
                jTxtNome_bbd,
                jTxtEndereco_bbd,
                jTxtSobrenome_bbd,
                jTxtNomeFant_bbd,
                jTxtEmail_bbd,
                jTxtInstagram_bbd,
                jTxtFace_bbd,
                jFmtTelefone_bbd,
                jCboAtivo_bbd,
                jFmtCelular_bbd,
                jTxtSite_bbd,
                jFmtCnpj_bbd,
                //botoes
                jBtnCancelar_bbd,
                jBtnConfirmar_bbd);

    }

    public FornecedorBbd viewBean() {
        fornecedorBbd = new FornecedorBbd();
        int id = Integer.valueOf(jTxtCodigoFornecedor_bbd.getText());
        fornecedorBbd.setIdfornecedorBbd(id);
        fornecedorBbd.setNomeProprietarioBbd(jTxtNome_bbd.getText());
        fornecedorBbd.setRgBbd(jFmtRg_bbd.getText());
        fornecedorBbd.setCpfBbd(jFmtCpf_bbd.getText());
        fornecedorBbd.setEnderecoBbd(jTxtEndereco_bbd.getText());
        fornecedorBbd.setSobrenomeBbd(jTxtSobrenome_bbd.getText());
        fornecedorBbd.setNomeFantasiaBbd(jTxtNomeFant_bbd.getText());
        fornecedorBbd.setEmailBbd(jTxtEmail_bbd.getText());
        fornecedorBbd.setInstagramBbd(jTxtInstagram_bbd.getText());
        fornecedorBbd.setFacebookBbd(jTxtFace_bbd.getText());
        fornecedorBbd.setTelefoneFixoBbd(jFmtTelefone_bbd.getText());
        fornecedorBbd.setCelularBbd(jFmtCelular_bbd.getText());
        fornecedorBbd.setSiteBbd(jTxtSite_bbd.getText());
        fornecedorBbd.setCnpjBbd(jFmtCnpj_bbd.getText());

        fornecedorBbd.setAtivoBbd(jCboAtivo_bbd.isSelected() == true ? 1 : 2);

        return fornecedorBbd;

    }

    public void beanView(FornecedorBbd fornecedor) {

        String cad = String.valueOf(fornecedor.getIdfornecedorBbd());
        jTxtCodigoFornecedor_bbd.setText(cad);
        jTxtNome_bbd.setText(fornecedor.getNomeProprietarioBbd());
        jFmtCpf_bbd.setText(fornecedor.getCpfBbd());
        jFmtRg_bbd.setText(fornecedor.getRgBbd());
        jTxtEndereco_bbd.setText(fornecedor.getEnderecoBbd());
        jTxtSobrenome_bbd.setText(fornecedor.getSobrenomeBbd());
        jTxtNomeFant_bbd.setText(fornecedor.getNomeFantasiaBbd());
        jTxtEmail_bbd.setText(fornecedor.getEmailBbd());
        jTxtInstagram_bbd.setText(fornecedor.getInstagramBbd());
        jTxtFace_bbd.setText(fornecedor.getFacebookBbd());
        jFmtTelefone_bbd.setText(fornecedor.getTelefoneFixoBbd());
        jFmtCelular_bbd.setText(fornecedor.getCelularBbd());
        jTxtSite_bbd.setText(fornecedor.getSiteBbd());
        jFmtCnpj_bbd.setText(fornecedor.getCnpjBbd());

        if (fornecedor.getAtivoBbd().equals(1)) {
            jCboAtivo_bbd.setSelected(true);
        } else {
            jCboAtivo_bbd.setSelected(false);
        }

    }

    public void setTelaAnterio(JDlgFornecedorNovo jdlgFornecedorNovo) {
        jDlgFornecedorNovo = jdlgFornecedorNovo;
    }

    public void ativar() {
        jTxtCodigoFornecedor_bbd.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTxtInstagram_bbd = new javax.swing.JTextField();
        jTxtFace_bbd = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTxtCodigoFornecedor_bbd = new javax.swing.JTextField();
        jTxtNome_bbd = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jTxtEndereco_bbd = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTxtNomeFant_bbd = new javax.swing.JTextField();
        jTxtSobrenome_bbd = new javax.swing.JTextField();
        jFmtCpf_bbd = new javax.swing.JFormattedTextField();
        jCboAtivo_bbd = new javax.swing.JCheckBox();
        jBtnConfirmar_bbd = new javax.swing.JButton();
        jBtnCancelar_bbd = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jTxtEmail_bbd = new javax.swing.JTextField();
        jTxtSite_bbd = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jFmtTelefone_bbd = new javax.swing.JFormattedTextField();
        jFmtCelular_bbd = new javax.swing.JFormattedTextField();
        jFmtCnpj_bbd = new javax.swing.JFormattedTextField();
        jFmtRg_bbd = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel9.setText("instagram");

        jLabel10.setText("facebook");

        jLabel1.setText("código do Fornecedor");

        jTxtCodigoFornecedor_bbd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtCodigoFornecedor_bbdActionPerformed(evt);
            }
        });

        jLabel13.setText("Cnpj");

        jLabel2.setText("Nome");

        jLabel14.setText("Sobrenome");

        jLabel6.setText("RG");

        jLabel15.setText("Nome Fantasia");

        jLabel3.setText("Endereço:");

        jCboAtivo_bbd.setText("ativo");

        jBtnConfirmar_bbd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/gravar.png"))); // NOI18N
        jBtnConfirmar_bbd.setText("Confirmar");
        jBtnConfirmar_bbd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnConfirmar_bbdActionPerformed(evt);
            }
        });

        jBtnCancelar_bbd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cancelar.png"))); // NOI18N
        jBtnCancelar_bbd.setText("Cancelar");
        jBtnCancelar_bbd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCancelar_bbdActionPerformed(evt);
            }
        });

        jLabel7.setText("site");

        jLabel8.setText("telefone fixo");

        jLabel11.setText("celular");

        jLabel4.setText("email");

        jLabel5.setText("CPF");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel13)
                        .addGap(254, 254, 254))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jFmtCelular_bbd, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 205, Short.MAX_VALUE)
                        .addComponent(jFmtCnpj_bbd, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(100, 100, 100))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jFmtTelefone_bbd, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jFmtRg_bbd, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(51, 51, 51)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTxtCodigoFornecedor_bbd, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel8))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(36, 36, 36)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTxtNome_bbd, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel15))
                                    .addGap(34, 34, 34)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel14)
                                        .addComponent(jTxtSobrenome_bbd)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(62, 62, 62)
                                    .addComponent(jLabel9)
                                    .addGap(133, 133, 133)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel10)
                                            .addGap(111, 111, 111))
                                        .addComponent(jTxtFace_bbd)))))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(291, 291, 291)
                            .addComponent(jBtnConfirmar_bbd)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jBtnCancelar_bbd))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jFmtCpf_bbd, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(37, 37, 37)
                            .addComponent(jTxtNomeFant_bbd, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jTxtEndereco_bbd, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jTxtEmail_bbd, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jTxtInstagram_bbd, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(138, 138, 138)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTxtSite_bbd, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addComponent(jCboAtivo_bbd)))
                    .addGap(51, 51, 51)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(78, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(44, 44, 44)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jFmtTelefone_bbd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFmtRg_bbd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jFmtCelular_bbd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFmtCnpj_bbd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(83, 83, 83))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(31, 31, 31)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jLabel2)
                        .addComponent(jLabel14))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTxtCodigoFornecedor_bbd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTxtNome_bbd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTxtSobrenome_bbd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel15))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jFmtCpf_bbd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTxtNomeFant_bbd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTxtEndereco_bbd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(jLabel10))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTxtEmail_bbd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTxtInstagram_bbd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTxtFace_bbd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jLabel8)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jCboAtivo_bbd)
                    .addGap(13, 13, 13)
                    .addComponent(jLabel7)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jTxtSite_bbd)
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jBtnConfirmar_bbd)
                        .addComponent(jBtnCancelar_bbd))
                    .addGap(31, 31, 31)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTxtCodigoFornecedor_bbdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtCodigoFornecedor_bbdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtCodigoFornecedor_bbdActionPerformed

    private void jBtnConfirmar_bbdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnConfirmar_bbdActionPerformed

        if (getTitle().equals("Incluindo")) {
            fornecedorDao_bbd = new FornecedorDao_bbd();
            fornecedorBbd = viewBean();
            fornecedorDao_bbd.insert(fornecedorBbd);
            List lista = fornecedorDao_bbd.listAll();
            jDlgFornecedorNovo.fornecedorControle.setList(lista);
            Util.mensagem("Incluido");
            setVisible(false);
        } else if (getTitle().equals("Alterar")) {
            fornecedorDao_bbd = new FornecedorDao_bbd();
            fornecedorBbd = viewBean();
            fornecedorDao_bbd.update(fornecedorBbd);
            List lista = fornecedorDao_bbd.listAll();
            jDlgFornecedorNovo.fornecedorControle.setList(lista);
            Util.mensagem("Alterando");
            setVisible(false);
        } else {
            Util.mensagem("ERRO" + getTitle());
        }
    }//GEN-LAST:event_jBtnConfirmar_bbdActionPerformed

    private void jBtnCancelar_bbdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCancelar_bbdActionPerformed
        // TODO add your handling code here:

        if (Util.perguntar("Quer cancelar")) {
            limparCampo();
            setVisible(false);
        } else {
            Util.mensagem("Operação continua");
        }
    }//GEN-LAST:event_jBtnCancelar_bbdActionPerformed

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
            java.util.logging.Logger.getLogger(JDlgFornecedorIA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDlgFornecedorIA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDlgFornecedorIA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDlgFornecedorIA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDlgFornecedorIA dialog = new JDlgFornecedorIA(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnCancelar_bbd;
    private javax.swing.JButton jBtnConfirmar_bbd;
    private javax.swing.JCheckBox jCboAtivo_bbd;
    private javax.swing.JFormattedTextField jFmtCelular_bbd;
    private javax.swing.JFormattedTextField jFmtCnpj_bbd;
    private javax.swing.JFormattedTextField jFmtCpf_bbd;
    private javax.swing.JFormattedTextField jFmtRg_bbd;
    private javax.swing.JFormattedTextField jFmtTelefone_bbd;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTxtCodigoFornecedor_bbd;
    private javax.swing.JTextField jTxtEmail_bbd;
    private javax.swing.JTextField jTxtEndereco_bbd;
    private javax.swing.JTextField jTxtFace_bbd;
    private javax.swing.JTextField jTxtInstagram_bbd;
    private javax.swing.JTextField jTxtNomeFant_bbd;
    private javax.swing.JTextField jTxtNome_bbd;
    private javax.swing.JTextField jTxtSite_bbd;
    private javax.swing.JTextField jTxtSobrenome_bbd;
    // End of variables declaration//GEN-END:variables
}

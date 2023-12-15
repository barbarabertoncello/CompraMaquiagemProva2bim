/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JDlgFornecedorNovo;

import bean.FornecedorBbd;
import dao.FornecedorDao_bbd;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;
import tools.Util;
import view.JDlgUsuario;

/**
 *
 * @author u04863235100
 */
public class JDlgFornecedor extends javax.swing.JDialog {

    Boolean incluindo;
    MaskFormatter mascaraCpf;
    FornecedorBbd fornecedorBbd;
    FornecedorDao_bbd fornecedorDao_bbd;

    public JDlgFornecedor(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setTitle("Fornecedor");
        setLocationRelativeTo(null);
        habilitar(true);
        fornecedorBbd = new FornecedorBbd();
        fornecedorDao_bbd = new FornecedorDao_bbd();
        incluindo = false;
        try {
            mascaraCpf = new MaskFormatter("###.###.###-##");

        } catch (ParseException ex) {
            Logger.getLogger(JDlgUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        jFmtCpf_bbd.setFormatterFactory(new DefaultFormatterFactory(mascaraCpf));

    }

    private void habilitar(boolean valor) {
        Util.habilitar(valor, jTxtRg_bbd,
                jFmtCpf_bbd,
                jTxtCodigoFornecedor_bbd,
                jTxtNome_bbd,
                jTxtEndereco_bbd,
                jTxtSobrenome_bbd,
                jTxtNomeFant_bbd,
                jTxtEmail_bbd,
                jTxtInstagram_bbd,
                jTxtFace_bbd,
                jTxtTelFixo_bbd,
                jCboAtivo_bbd,
                jTxtCelular_bbd,
                jTxtSite_bbd,
                jTxtCnpj_bbd,
                //botoes
                jBtnCancelar_bbd,
                jBtnConfirmar_bbd);
        Util.habilitar(!valor,
                jBtnAlterar_bbd,
                jBtnExcluir_bbd,
                jBtnIncluir_bbd,
                jBtnPesquisar_bbd);
    }

    public void limparCampo() {

        Util.limparCampos(jTxtRg_bbd,
                jFmtCpf_bbd,
                jTxtCodigoFornecedor_bbd,
                jTxtNome_bbd,
                jTxtEndereco_bbd,
                jTxtSobrenome_bbd,
                jTxtNomeFant_bbd,
                jTxtEmail_bbd,
                jTxtInstagram_bbd,
                jTxtFace_bbd,
                jTxtTelFixo_bbd,
                jCboAtivo_bbd,
                jTxtCelular_bbd,
                jTxtSite_bbd,
                jTxtCnpj_bbd,
                //botoes
                jBtnCancelar_bbd,
                jBtnConfirmar_bbd);

    }

    public FornecedorBbd viewBean() {
        fornecedorBbd = new FornecedorBbd();
        int id = Integer.valueOf(jTxtCodigoFornecedor_bbd.getText());
        fornecedorBbd.setIdfornecedorBbd(id);
        fornecedorBbd.setNomeProprietarioBbd(jTxtNome_bbd.getText());
        fornecedorBbd.setRgBbd(jTxtRg_bbd.getText());
        fornecedorBbd.setCpfBbd(jFmtCpf_bbd.getText());
        fornecedorBbd.setEnderecoBbd(jTxtEndereco_bbd.getText());
        fornecedorBbd.setSobrenomeBbd(jTxtSobrenome_bbd.getText());
        fornecedorBbd.setNomeFantasiaBbd(jTxtNomeFant_bbd.getText());
        fornecedorBbd.setEmailBbd(jTxtEmail_bbd.getText());
        fornecedorBbd.setInstagramBbd(jTxtInstagram_bbd.getText());
        fornecedorBbd.setFacebookBbd(jTxtFace_bbd.getText());
        fornecedorBbd.setTelefoneFixoBbd(jTxtTelFixo_bbd.getText());
        fornecedorBbd.setCelularBbd(jTxtCelular_bbd.getText());
        fornecedorBbd.setSiteBbd(jTxtSite_bbd.getText());
        fornecedorBbd.setCnpjBbd(jTxtCnpj_bbd.getText());
        
        fornecedorBbd.setAtivoBbd(jCboAtivo_bbd.isSelected() == true ? 1 : 2);

        return fornecedorBbd;

    }

    public void beanView(FornecedorBbd fornecedor) {
        String cad = String.valueOf(fornecedor.getIdfornecedorBbd());
        jTxtCodigoFornecedor_bbd.setText(cad);
        jTxtNome_bbd.setText(fornecedor.getNomeProprietarioBbd());
        jFmtCpf_bbd.setText(fornecedor.getCpfBbd());
        jTxtRg_bbd.setText(fornecedor.getRgBbd());
        jTxtEndereco_bbd.setText(fornecedor.getEnderecoBbd());
        jTxtSobrenome_bbd.setText(fornecedor.getSobrenomeBbd());
        jTxtNomeFant_bbd.setText(fornecedor.getNomeFantasiaBbd());
        jTxtEmail_bbd.setText(fornecedor.getEmailBbd());
        jTxtInstagram_bbd.setText(fornecedor.getInstagramBbd());
        jTxtFace_bbd.setText(fornecedor.getFacebookBbd());
        jTxtTelFixo_bbd.setText(fornecedor.getTelefoneFixoBbd());
        jTxtCelular_bbd.setText(fornecedor.getCelularBbd());
        jTxtSite_bbd.setText(fornecedor.getSiteBbd());
        jTxtCnpj_bbd.setText(fornecedor.getCnpjBbd());
       
        
         if (fornecedorBbd.getAtivoBbd().equals(1) == true) { 
           jCboAtivo_bbd.setSelected(true);
       }else {
           jCboAtivo_bbd.setSelected(false);
       }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTxtCodigoFornecedor_bbd = new javax.swing.JTextField();
        jTxtNome_bbd = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jBtnPesquisar_bbd = new javax.swing.JButton();
        jTxtEndereco_bbd = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jFmtCpf_bbd = new javax.swing.JFormattedTextField();
        jTxtRg_bbd = new javax.swing.JTextField();
        jBtnIncluir_bbd = new javax.swing.JButton();
        jBtnAlterar_bbd = new javax.swing.JButton();
        jBtnExcluir_bbd = new javax.swing.JButton();
        jBtnConfirmar_bbd = new javax.swing.JButton();
        jBtnCancelar_bbd = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTxtEmail_bbd = new javax.swing.JTextField();
        jTxtSite_bbd = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTxtTelFixo_bbd = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTxtInstagram_bbd = new javax.swing.JTextField();
        jTxtFace_bbd = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTxtCelular_bbd = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jTxtCnpj_bbd = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jTxtNomeFant_bbd = new javax.swing.JTextField();
        jTxtSobrenome_bbd = new javax.swing.JTextField();
        jCboAtivo_bbd = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("código do Fornecedor");

        jTxtCodigoFornecedor_bbd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtCodigoFornecedor_bbdActionPerformed(evt);
            }
        });

        jLabel2.setText("Nome");

        jLabel5.setText("CPF");

        jLabel6.setText("RG");

        jBtnPesquisar_bbd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/pesquisar.png"))); // NOI18N
        jBtnPesquisar_bbd.setText("Pesquisar");
        jBtnPesquisar_bbd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnPesquisar_bbdActionPerformed(evt);
            }
        });

        jLabel3.setText("Endereço:");

        jBtnIncluir_bbd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/incluir_1.png"))); // NOI18N
        jBtnIncluir_bbd.setText("Incluir");
        jBtnIncluir_bbd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnIncluir_bbdActionPerformed(evt);
            }
        });

        jBtnAlterar_bbd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/alterar.png"))); // NOI18N
        jBtnAlterar_bbd.setText("Alterar");
        jBtnAlterar_bbd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAlterar_bbdActionPerformed(evt);
            }
        });

        jBtnExcluir_bbd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Excluir.png"))); // NOI18N
        jBtnExcluir_bbd.setText("Excluir");
        jBtnExcluir_bbd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnExcluir_bbdActionPerformed(evt);
            }
        });

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

        jLabel4.setText("email");

        jLabel7.setText("site");

        jLabel8.setText("telefone fixo");

        jLabel9.setText("instagram");

        jLabel10.setText("facebook");

        jLabel11.setText("celular");

        jLabel13.setText("Cnpj");

        jLabel14.setText("Sobrenome");

        jLabel15.setText("Nome Fantasia");

        jCboAtivo_bbd.setText("ativo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTxtCodigoFornecedor_bbd, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel8)
                            .addComponent(jTxtTelFixo_bbd, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)
                            .addComponent(jTxtCelular_bbd, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
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
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jTxtSobrenome_bbd)
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addComponent(jLabel9)
                                .addGap(133, 133, 133)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTxtFace_bbd, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10))
                                .addContainerGap())))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jBtnIncluir_bbd)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBtnAlterar_bbd)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBtnExcluir_bbd)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBtnConfirmar_bbd)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBtnCancelar_bbd)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBtnPesquisar_bbd))
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
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTxtRg_bbd, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTxtCnpj_bbd, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jCboAtivo_bbd)
                                        .addComponent(jLabel13)))))
                        .addContainerGap(130, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
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
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(jLabel15)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jFmtCpf_bbd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtNomeFant_bbd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtEndereco_bbd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTxtEmail_bbd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtInstagram_bbd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtFace_bbd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTxtTelFixo_bbd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtRg_bbd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCboAtivo_bbd))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel7)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTxtCnpj_bbd, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtCelular_bbd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtSite_bbd, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnIncluir_bbd)
                    .addComponent(jBtnAlterar_bbd)
                    .addComponent(jBtnExcluir_bbd)
                    .addComponent(jBtnConfirmar_bbd)
                    .addComponent(jBtnCancelar_bbd)
                    .addComponent(jBtnPesquisar_bbd))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTxtCodigoFornecedor_bbdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtCodigoFornecedor_bbdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtCodigoFornecedor_bbdActionPerformed

    private void jBtnPesquisar_bbdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnPesquisar_bbdActionPerformed
        // TODO add your handling code here:
        fornecedorBbd = new FornecedorBbd();
        JDlgFornecedorPesquisar jDlgFornecedorPesquisar = new JDlgFornecedorPesquisar(null, true);
        jDlgFornecedorPesquisar.setTelaAnterior(this);
        jDlgFornecedorPesquisar.setVisible(true);
    }//GEN-LAST:event_jBtnPesquisar_bbdActionPerformed

    private void jBtnIncluir_bbdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnIncluir_bbdActionPerformed
        // TODO add your handling code here:
        fornecedorBbd = new FornecedorBbd();
        habilitar(true);
        limparCampo();
        incluindo = true;
    }//GEN-LAST:event_jBtnIncluir_bbdActionPerformed

    private void jBtnAlterar_bbdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAlterar_bbdActionPerformed
        // TODO add your handling code here:
        habilitar(true);
        jTxtCodigoFornecedor_bbd.setEnabled(false);
        incluindo = false;
    }//GEN-LAST:event_jBtnAlterar_bbdActionPerformed

    private void jBtnExcluir_bbdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnExcluir_bbdActionPerformed
        // TODO add your handling code here:
        if (Util.perguntar("Quer excluir?")) {
            fornecedorBbd = viewBean();
            fornecedorDao_bbd.delete(fornecedorBbd);
            Util.mensagem("Excluido com sucesso");
        } else {
            Util.mensagem("Exclusão cancelada");
        }
    }//GEN-LAST:event_jBtnExcluir_bbdActionPerformed

    private void jBtnConfirmar_bbdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnConfirmar_bbdActionPerformed
       
        fornecedorDao_bbd = new FornecedorDao_bbd();
        if (Util.perguntar("Confirmar?")) {
            if(incluindo==true){
            fornecedorBbd = viewBean();
            fornecedorDao_bbd.insert(fornecedorBbd);
            Util.mensagem("Sucesso");
            habilitar(false);
            limparCampo();
            fornecedorBbd = null;    
            } else{
               fornecedorBbd = viewBean();
            fornecedorDao_bbd.update(fornecedorBbd);
            Util.mensagem("Alterado");
            limparCampo();
            fornecedorBbd = null; 
            }
        } else {
            Util.mensagem("Cancelado");
        }

    }//GEN-LAST:event_jBtnConfirmar_bbdActionPerformed

    private void jBtnCancelar_bbdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCancelar_bbdActionPerformed
        // TODO add your handling code here:
        habilitar(false);
        limparCampo();
        Util.mensagem("Cancelado");
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
            java.util.logging.Logger.getLogger(JDlgFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDlgFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDlgFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDlgFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDlgFornecedor dialog = new JDlgFornecedor(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton jBtnAlterar_bbd;
    private javax.swing.JButton jBtnCancelar_bbd;
    private javax.swing.JButton jBtnConfirmar_bbd;
    private javax.swing.JButton jBtnExcluir_bbd;
    private javax.swing.JButton jBtnIncluir_bbd;
    private javax.swing.JButton jBtnPesquisar_bbd;
    private javax.swing.JCheckBox jCboAtivo_bbd;
    private javax.swing.JFormattedTextField jFmtCpf_bbd;
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
    private javax.swing.JTextField jTxtCelular_bbd;
    private javax.swing.JTextField jTxtCnpj_bbd;
    private javax.swing.JTextField jTxtCodigoFornecedor_bbd;
    private javax.swing.JTextField jTxtEmail_bbd;
    private javax.swing.JTextField jTxtEndereco_bbd;
    private javax.swing.JTextField jTxtFace_bbd;
    private javax.swing.JTextField jTxtInstagram_bbd;
    private javax.swing.JTextField jTxtNomeFant_bbd;
    private javax.swing.JTextField jTxtNome_bbd;
    private javax.swing.JTextField jTxtRg_bbd;
    private javax.swing.JTextField jTxtSite_bbd;
    private javax.swing.JTextField jTxtSobrenome_bbd;
    private javax.swing.JTextField jTxtTelFixo_bbd;
    // End of variables declaration//GEN-END:variables
}

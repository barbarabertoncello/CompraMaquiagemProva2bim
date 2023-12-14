/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bean.CompraProdutoBbd;
import bean.ProdutoBbd;
import dao.ProdutoDao_bbd;
import static java.awt.Frame.MAXIMIZED_BOTH;
import java.util.List;
import tools.Util;

/**
 *
 * @author u07329163139
 */
public class JDlgCompraProduto extends javax.swing.JDialog {

    private boolean incluindo;
     ProdutoDao_bbd produtoDAO;
       JDlgCompra jDlgCompra;

    /**
     * Creates new form JDlgUsuario
     */
    public JDlgCompraProduto(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
          setTitle("Compra Produto");
          setLocationRelativeTo(null);
                
        produtoDAO = new ProdutoDao_bbd();
        List lista = (List) produtoDAO.listAll();
        for (Object item : lista) {
            jCboProdutos.addItem((ProdutoBbd) item);
        }
         
    }
    
    public void setTelaAnterior(JDlgCompra jDlgCompra) {
        this.jDlgCompra = jDlgCompra;
   
    }
  
  void beanView(CompraProdutoBbd compraProduto) {
        jCboProdutos.setSelectedItem(compraProduto.getProdutoBbd());
        jTxtQuantidade.setText(Integer.toString(compraProduto.getQuantidadeBbd()));
        jTxtPrecoUnitario.setText(Util.doubleStr(compraProduto.getValorUnitarioBdd()));
       
    }
   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jTxtQuantidade = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTxtPrecoUnitario = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jBtnConfirmar = new javax.swing.JButton();
        jBtnCancelar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jTxtPrecoTotal = new javax.swing.JTextField();
        jCboProdutos = new javax.swing.JComboBox<ProdutoBbd>();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel2.setText("Quantidade");

        jTxtQuantidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtQuantidadeActionPerformed(evt);
            }
        });

        jLabel3.setText("Preço Unitario");

        jBtnConfirmar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/gravar.png"))); // NOI18N
        jBtnConfirmar.setText("Confirmar");
        jBtnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnConfirmarActionPerformed(evt);
            }
        });

        jBtnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cancelar.png"))); // NOI18N
        jBtnCancelar.setText("Cancelar");
        jBtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCancelarActionPerformed(evt);
            }
        });

        jLabel9.setText("Preço Total");

        jCboProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCboProdutosActionPerformed(evt);
            }
        });

        jLabel1.setText("Produto");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jTxtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jTxtPrecoUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jTxtPrecoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jCboProdutos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(jBtnConfirmar)
                        .addGap(106, 106, 106)
                        .addComponent(jBtnCancelar)))
                .addContainerGap(236, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCboProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTxtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTxtPrecoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTxtPrecoUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jBtnCancelar)
                        .addGap(5, 5, 5))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jBtnConfirmar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jLabel5)
                .addGap(39, 39, 39))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCancelarActionPerformed
        setVisible(false);
    }//GEN-LAST:event_jBtnCancelarActionPerformed

    private void jCboProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCboProdutosActionPerformed
        // TODO add your handling code here:
        jTxtQuantidade.setText( "1" );
        ProdutoBbd produtos = (ProdutoBbd) jCboProdutos.getSelectedItem();
        jTxtPrecoUnitario.setText( Util.doubleStr(produtos.getValorBbd()));
    }//GEN-LAST:event_jCboProdutosActionPerformed

    private void jBtnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnConfirmarActionPerformed
      CompraProdutoBbd compraProduto = new CompraProdutoBbd();
        compraProduto.setProdutoBbd((ProdutoBbd) jCboProdutos.getSelectedItem() );
        compraProduto.setQuantidadeBbd(Util.strInt(jTxtQuantidade.getText() ));
        compraProduto.setValorUnitarioBdd(Util.strDouble(jTxtPrecoUnitario.getText()));
        if (getTitle().toUpperCase().substring(0, 1).equals("I")) {
           jDlgCompra.compraProdutoControle.addBean(compraProduto);
        } else {            
            jDlgCompra.compraProdutoControle.updateBean(jDlgCompra.getSelectedRowProd(), compraProduto);
        }
        setVisible(false);
      
    }//GEN-LAST:event_jBtnConfirmarActionPerformed

    private void jTxtQuantidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtQuantidadeActionPerformed
        if (jTxtQuantidade.getText().isEmpty() == false) {
            double unitario = Util.strDouble(jTxtPrecoUnitario.getText());
            double quantidade = Util.strDouble(jTxtQuantidade.getText());
            jTxtPrecoTotal.setText(String.valueOf(quantidade * unitario));
        } else {
            jTxtPrecoTotal.setText("0");
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtQuantidadeActionPerformed

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
            java.util.logging.Logger.getLogger(JDlgCompraProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDlgCompraProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDlgCompraProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDlgCompraProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDlgCompraProduto dialog = new JDlgCompraProduto(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton jBtnCancelar;
    private javax.swing.JButton jBtnConfirmar;
    private javax.swing.JComboBox<ProdutoBbd> jCboProdutos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTxtPrecoTotal;
    private javax.swing.JTextField jTxtPrecoUnitario;
    private javax.swing.JTextField jTxtQuantidade;
    // End of variables declaration//GEN-END:variables

    void setVIsible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import JDlgFornecedorNovo.JDlgFornecedorNovo;
import JDlgProdutoNovo.JDlgProdutoIA;
import consultas.JDlgConsultasGrupo;
import consultas.JDlgConsultasFornecedor;
import consultas.JDlgConsultasProduto;
import consultas.JDlgConsultasUsuario;



/**
 *
 * @author u04863235100
 */
public class JFrmPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form JRrmPrincipal
     */
    public JFrmPrincipal() {
        initComponents();
        setTitle("Sistema de compra de maquiagens");
        setExtendedState(MAXIMIZED_BOTH);
        setLocationRelativeTo(null);
      // JDlgLogin jDlgLogin = new JDlgLogin(this, true);
       //jDlgLogin.setVisible(true);

    }
    
    
   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu6 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jToolBar1 = new javax.swing.JToolBar();
        jBtnFornecedor = new javax.swing.JButton();
        jBtnUsuario = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMnuUsuarios = new javax.swing.JMenuItem();
        jMnuProduto1 = new javax.swing.JMenuItem();
        jMnuFornecedor = new javax.swing.JMenuItem();
        jMnuGrupo = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMnuSair = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMnuCompras = new javax.swing.JMenuItem();
        jMnuCompra_Produto = new javax.swing.JMenuItem();
        jMnuConsultasGrupo = new javax.swing.JMenu();
        jMnuConsultasUsuario = new javax.swing.JMenuItem();
        jMnuFornecedorConsulta = new javax.swing.JMenuItem();
        jMnuComprasConsulta = new javax.swing.JMenuItem();
        jMnuProdutoConsulta = new javax.swing.JMenuItem();

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        jMenu5.setText("jMenu5");

        jMenu6.setText("File");
        jMenuBar3.add(jMenu6);

        jMenu7.setText("Edit");
        jMenuBar3.add(jMenu7);

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jToolBar1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jToolBar1.setRollover(true);

        jBtnFornecedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/elevador.png"))); // NOI18N
        jBtnFornecedor.setFocusable(false);
        jBtnFornecedor.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBtnFornecedor.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBtnFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnFornecedorActionPerformed(evt);
            }
        });
        jToolBar1.add(jBtnFornecedor);

        jBtnUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cliente_1.png"))); // NOI18N
        jBtnUsuario.setFocusable(false);
        jBtnUsuario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBtnUsuario.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBtnUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnUsuarioActionPerformed(evt);
            }
        });
        jToolBar1.add(jBtnUsuario);

        jMenuBar1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jMenu1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenu1.setMnemonic('c');
        jMenu1.setText("Cadastros");

        jMnuUsuarios.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_MASK));
        jMnuUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cliente_1.png"))); // NOI18N
        jMnuUsuarios.setMnemonic('u');
        jMnuUsuarios.setText("Usuários");
        jMnuUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnuUsuariosActionPerformed(evt);
            }
        });
        jMenu1.add(jMnuUsuarios);

        jMnuProduto1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        jMnuProduto1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/livro-alcorao.png"))); // NOI18N
        jMnuProduto1.setMnemonic('l');
        jMnuProduto1.setText("Produto");
        jMnuProduto1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnuProduto1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMnuProduto1);

        jMnuFornecedor.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.SHIFT_MASK));
        jMnuFornecedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/elevador.png"))); // NOI18N
        jMnuFornecedor.setText("Fornecedor");
        jMnuFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnuFornecedorActionPerformed(evt);
            }
        });
        jMenu1.add(jMnuFornecedor);

        jMnuGrupo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Y, java.awt.event.InputEvent.SHIFT_MASK));
        jMnuGrupo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/mais-vendidos (1).png"))); // NOI18N
        jMnuGrupo.setText("Grupo");
        jMnuGrupo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnuGrupoActionPerformed(evt);
            }
        });
        jMenu1.add(jMnuGrupo);
        jMenu1.add(jSeparator1);

        jMnuSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMnuSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/exit.png"))); // NOI18N
        jMnuSair.setMnemonic('s');
        jMnuSair.setText("Sair");
        jMnuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnuSairActionPerformed(evt);
            }
        });
        jMenu1.add(jMnuSair);

        jMenuBar1.add(jMenu1);

        jMenu2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenu2.setMnemonic('m');
        jMenu2.setText("Movimentos");

        jMnuCompras.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_MASK));
        jMnuCompras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/etiqueta-de-venda.png"))); // NOI18N
        jMnuCompras.setText("Compras");
        jMnuCompras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnuComprasActionPerformed(evt);
            }
        });
        jMenu2.add(jMnuCompras);

        jMnuCompra_Produto.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        jMnuCompra_Produto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/caixas.png"))); // NOI18N
        jMnuCompra_Produto.setMnemonic('l');
        jMnuCompra_Produto.setText("Comprar Produto");
        jMnuCompra_Produto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnuCompra_ProdutoActionPerformed(evt);
            }
        });
        jMenu2.add(jMnuCompra_Produto);

        jMenuBar1.add(jMenu2);

        jMnuConsultasGrupo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMnuConsultasGrupo.setMnemonic('m');
        jMnuConsultasGrupo.setText("Consultas");

        jMnuConsultasUsuario.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_W, java.awt.event.InputEvent.CTRL_MASK));
        jMnuConsultasUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cliente_1.png"))); // NOI18N
        jMnuConsultasUsuario.setMnemonic('l');
        jMnuConsultasUsuario.setText("Usuarios");
        jMnuConsultasUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnuConsultasUsuarioActionPerformed(evt);
            }
        });
        jMnuConsultasGrupo.add(jMnuConsultasUsuario);

        jMnuFornecedorConsulta.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        jMnuFornecedorConsulta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/elevador.png"))); // NOI18N
        jMnuFornecedorConsulta.setText("Fornecedor");
        jMnuFornecedorConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnuFornecedorConsultaActionPerformed(evt);
            }
        });
        jMnuConsultasGrupo.add(jMnuFornecedorConsulta);

        jMnuComprasConsulta.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        jMnuComprasConsulta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/etiqueta-de-venda.png"))); // NOI18N
        jMnuComprasConsulta.setText("Compra");
        jMnuComprasConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnuComprasConsultaActionPerformed(evt);
            }
        });
        jMnuConsultasGrupo.add(jMnuComprasConsulta);

        jMnuProdutoConsulta.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
        jMnuProdutoConsulta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/livro-alcorao.png"))); // NOI18N
        jMnuProdutoConsulta.setText("Produto");
        jMnuProdutoConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnuProdutoConsultaActionPerformed(evt);
            }
        });
        jMnuConsultasGrupo.add(jMnuProdutoConsulta);

        jMenuBar1.add(jMnuConsultasGrupo);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 299, Short.MAX_VALUE)
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 168, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMnuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnuSairActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jMnuSairActionPerformed

    private void jMnuComprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnuComprasActionPerformed
         // TODO add your handling code here:
        JDlgCompra jDlgCompra = new JDlgCompra(this, true);
        jDlgCompra.setVisible(true);
    }//GEN-LAST:event_jMnuComprasActionPerformed

    private void jMnuCompra_ProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnuCompra_ProdutoActionPerformed
        // TODO add your handling code here:
        JDlgCompraProduto jDlgCompraProduto = new JDlgCompraProduto(this, true);
        jDlgCompraProduto.setVisible(true);
    }//GEN-LAST:event_jMnuCompra_ProdutoActionPerformed

    private void jMnuFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnuFornecedorActionPerformed
        // TODO add your handling code here:
        JDlgFornecedorNovo jDlgFornecedor = new JDlgFornecedorNovo(this, true);
        jDlgFornecedor.setVisible(true);

    }//GEN-LAST:event_jMnuFornecedorActionPerformed

    private void jMnuProduto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnuProduto1ActionPerformed
        // TODO add your handling code here:
        JDlgProdutoIA jDlgProdutoIA =new JDlgProdutoIA(this,true);
        jDlgProdutoIA.setVisible(true); 
    }//GEN-LAST:event_jMnuProduto1ActionPerformed

    private void jMnuUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnuUsuariosActionPerformed
        // TODO add your handling code here:
        JDlgUsuario jDlgUsuario = new JDlgUsuario(this, true);
        jDlgUsuario.setVisible(true);
    }//GEN-LAST:event_jMnuUsuariosActionPerformed

    private void jMnuFornecedorConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnuFornecedorConsultaActionPerformed
        // TODO add your handling code here:
        JDlgConsultasFornecedor jDlgConsultasFornecedor = new JDlgConsultasFornecedor(this, true);
        jDlgConsultasFornecedor.setVisible(true);
    }//GEN-LAST:event_jMnuFornecedorConsultaActionPerformed

    private void jMnuConsultasUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnuConsultasUsuarioActionPerformed
        // TODO add your handling code here:
        JDlgConsultasUsuario jDlgConsultasUsuario = new JDlgConsultasUsuario(this, true);
        jDlgConsultasUsuario.setVisible(true);
    }//GEN-LAST:event_jMnuConsultasUsuarioActionPerformed

    private void jMnuComprasConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnuComprasConsultaActionPerformed
        // TODO add your handling code here:
        JDlgConsultasGrupo jDlgConsultasCompra = new JDlgConsultasGrupo(this, true);
        jDlgConsultasCompra.setVisible(true);
    }//GEN-LAST:event_jMnuComprasConsultaActionPerformed

    private void jMnuProdutoConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnuProdutoConsultaActionPerformed
        // TODO add your handling code here:
        JDlgConsultasProduto jDlgConsultasProduto = new JDlgConsultasProduto(this, true);
        jDlgConsultasProduto.setVisible(true);
    }//GEN-LAST:event_jMnuProdutoConsultaActionPerformed

    private void jMnuGrupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnuGrupoActionPerformed
        // TODO add your handling code here:
        JDlgGrupo jDlgGrupo = new JDlgGrupo(this, true);
        jDlgGrupo.setVisible(true);
    }//GEN-LAST:event_jMnuGrupoActionPerformed

    private void jBtnUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnUsuarioActionPerformed
        // TODO add your handling code here:
        JDlgUsuario  JDlgUsuario  = new JDlgUsuario(this, true);
        JDlgUsuario.setVisible(true);
    }//GEN-LAST:event_jBtnUsuarioActionPerformed

    private void jBtnFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnFornecedorActionPerformed
        // TODO add your handling code here:
        JDlgFornecedorNovo jDlgFornecedor = new JDlgFornecedorNovo(this, true);
        jDlgFornecedor.setVisible(true);

    }//GEN-LAST:event_jBtnFornecedorActionPerformed

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
            java.util.logging.Logger.getLogger(JFrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnFornecedor;
    private javax.swing.JButton jBtnUsuario;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMnuCompra_Produto;
    private javax.swing.JMenuItem jMnuCompras;
    private javax.swing.JMenuItem jMnuComprasConsulta;
    private javax.swing.JMenu jMnuConsultasGrupo;
    private javax.swing.JMenuItem jMnuConsultasUsuario;
    private javax.swing.JMenuItem jMnuFornecedor;
    private javax.swing.JMenuItem jMnuFornecedorConsulta;
    private javax.swing.JMenuItem jMnuGrupo;
    private javax.swing.JMenuItem jMnuProduto1;
    private javax.swing.JMenuItem jMnuProdutoConsulta;
    private javax.swing.JMenuItem jMnuSair;
    private javax.swing.JMenuItem jMnuUsuarios;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables
}

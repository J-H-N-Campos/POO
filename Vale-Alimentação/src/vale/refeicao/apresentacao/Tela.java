package vale.refeicao.apresentacao;

import vale.refeicao.persistencia.ValeRefeicaoBD;
import vale.refeicao.negocio.Valerefeicao;

/** @author João de Campos**/

public class Tela extends javax.swing.JFrame {
  
    private Valerefeicao vale;

    public Tela(Valerefeicao vale) {
        this.vale = vale;
        initComponents();
        
        atualizarCampos();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botao_Sair = new javax.swing.JButton();
        botao_Adm = new javax.swing.JButton();
        botao_Comprar_Vales = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        campoRefeicao = new javax.swing.JTextField();
        campoSolicitacao = new javax.swing.JTextField();
        campoValesComprados = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        botao_Sair.setText("Sair");
        botao_Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_SairActionPerformed(evt);
            }
        });

        botao_Adm.setText("ADM");
        botao_Adm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_AdmActionPerformed(evt);
            }
        });

        botao_Comprar_Vales.setText("Comprar Vales");
        botao_Comprar_Vales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_Comprar_ValesActionPerformed(evt);
            }
        });

        jLabel1.setText("Vale Refeição:");

        campoRefeicao.setEditable(false);
        campoRefeicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoRefeicaoActionPerformed(evt);
            }
        });

        campoSolicitacao.setEditable(false);
        campoSolicitacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoSolicitacaoActionPerformed(evt);
            }
        });

        campoValesComprados.setEditable(false);
        campoValesComprados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoValesCompradosActionPerformed(evt);
            }
        });

        jLabel2.setText("Vale Solicitação:");

        jLabel3.setText("Quantidade de Vales Comprados:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(campoValesComprados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botao_Adm)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botao_Sair))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(campoSolicitacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(campoRefeicao, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(42, 42, 42)
                                .addComponent(botao_Comprar_Vales, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1)))
                        .addGap(0, 4, Short.MAX_VALUE)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {botao_Adm, botao_Comprar_Vales, botao_Sair});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {campoRefeicao, campoSolicitacao, campoValesComprados});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel1, jLabel2, jLabel3});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(campoRefeicao, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botao_Comprar_Vales, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoSolicitacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(campoValesComprados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botao_Sair)
                    .addComponent(botao_Adm)))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {botao_Adm, botao_Comprar_Vales, botao_Sair});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {campoRefeicao, campoSolicitacao, campoValesComprados});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel1, jLabel2, jLabel3});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    void atualizarCampos() {
        campoRefeicao.setText(vale.getValeRefeicao()+ " ");
        campoSolicitacao.setText(vale.getValeSolicitacao()+ " ");
        campoValesComprados.setText(vale.getQuantidadeValeGeral()+ " ");
    }
    
    private void formWindowClosing(java.awt.event.WindowEvent evt) {                                   

        ValeRefeicaoBD bd = new ValeRefeicaoBD();
        bd.Salvar(vale);
    }     
    
    private void campoSolicitacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoSolicitacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoSolicitacaoActionPerformed

    private void botao_SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_SairActionPerformed
        ValeRefeicaoBD bd = new ValeRefeicaoBD();
        bd.Salvar(vale);
        dispose();
    }//GEN-LAST:event_botao_SairActionPerformed

    private void campoRefeicaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoRefeicaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoRefeicaoActionPerformed

    private void campoValesCompradosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoValesCompradosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoValesCompradosActionPerformed

    private void botao_Comprar_ValesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_Comprar_ValesActionPerformed
        vale.getQuantidadeValeGeral();
        vale.getValeRefeicao();
        vale.getValeSolicitacao();
        vale.getCaixa();
        vale.getPreco();
        atualizarCampos();
    }//GEN-LAST:event_botao_Comprar_ValesActionPerformed

    private void botao_AdmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_AdmActionPerformed
        TelaAdmin tela = new TelaAdmin(vale);
        tela.setTelaPrincipal(this);
        this.setEnabled(false);
        tela.setVisible(true);
    }//GEN-LAST:event_botao_AdmActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botao_Adm;
    private javax.swing.JButton botao_Comprar_Vales;
    private javax.swing.JButton botao_Sair;
    private javax.swing.JTextField campoRefeicao;
    private javax.swing.JTextField campoSolicitacao;
    private javax.swing.JTextField campoValesComprados;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}

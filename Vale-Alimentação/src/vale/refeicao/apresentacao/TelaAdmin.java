package vale.refeicao.apresentacao;

import vale.refeicao.negocio.Valerefeicao;

/** @author João de Campos*/

public class TelaAdmin extends javax.swing.JFrame 
{
    
    private Valerefeicao vale;
    private Tela telaPrincipal;

    public TelaAdmin(Valerefeicao vale)
    {
        this.vale = vale;
        
        campoCaixa.setText(vale.getCaixa()+ " R$");
        campoValeSolicitacao.setText(vale.getValeSolicitacao() + " ");
        campoValeRefeicao.setText(vale.getValeRefeicao() + " ");
        campoQuantidadeTotalVales.setText(vale.getQuantidadeValeGeral() + " ");
        
        initComponents();
        
    }
    
    public void setTelaPrincipal(Tela telaPrincipal)
    {
        this.telaPrincipal = telaPrincipal;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botaoSair = new javax.swing.JButton();
        botaoZerarValorCaixa = new javax.swing.JButton();
        botaoZerarQuantidadeTotalVales = new javax.swing.JButton();
        botaoZerarValeSolicitacao = new javax.swing.JButton();
        botaoZerarValeRefeicao = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        campoValeSolicitacao = new javax.swing.JTextField();
        campoValeRefeicao = new javax.swing.JTextField();
        campoCaixa = new javax.swing.JTextField();
        campoQuantidadeTotalVales = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        botaoSair.setText("Sair");
        botaoSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSairActionPerformed(evt);
            }
        });

        botaoZerarValorCaixa.setText("Zerar o Valor no Caixa");
        botaoZerarValorCaixa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoZerarValorCaixaActionPerformed(evt);
            }
        });

        botaoZerarQuantidadeTotalVales.setText("Zerar Toda a Quantidade Total de Vales");
        botaoZerarQuantidadeTotalVales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoZerarQuantidadeTotalValesActionPerformed(evt);
            }
        });

        botaoZerarValeSolicitacao.setText("Zerar a Quantidade de Vale de Solicitação");
        botaoZerarValeSolicitacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoZerarValeSolicitacaoActionPerformed(evt);
            }
        });

        botaoZerarValeRefeicao.setText("Zerar a Quantidade de Vale Refeição");
        botaoZerarValeRefeicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoZerarValeRefeicaoActionPerformed(evt);
            }
        });

        jLabel1.setText("Quantidade de Valor no Caixa:");

        jLabel2.setText("Quantidade de Vale Refeição:");

        jLabel3.setText("Quantidade de Vale de Solicitação:");

        jLabel4.setText("Quantidade Total de Vales:");

        campoValeSolicitacao.setEditable(false);
        campoValeSolicitacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoValeSolicitacaoActionPerformed(evt);
            }
        });

        campoValeRefeicao.setEditable(false);
        campoValeRefeicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoValeRefeicaoActionPerformed(evt);
            }
        });

        campoCaixa.setEditable(false);
        campoCaixa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoCaixaActionPerformed(evt);
            }
        });

        campoQuantidadeTotalVales.setEditable(false);
        campoQuantidadeTotalVales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoQuantidadeTotalValesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campoValeSolicitacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(campoCaixa, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoValeRefeicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(campoQuantidadeTotalVales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 85, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botaoZerarQuantidadeTotalVales, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botaoZerarValeSolicitacao, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botaoZerarValeRefeicao, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botaoZerarValorCaixa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(botaoSair, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {botaoSair, botaoZerarQuantidadeTotalVales, botaoZerarValeRefeicao, botaoZerarValeSolicitacao, botaoZerarValorCaixa});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel1, jLabel2, jLabel3, jLabel4});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {campoCaixa, campoQuantidadeTotalVales, campoValeRefeicao, campoValeSolicitacao});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botaoZerarValorCaixa, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(campoCaixa, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoValeRefeicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoZerarValeRefeicao))
                .addGap(29, 29, 29)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoValeSolicitacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoZerarValeSolicitacao))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(campoQuantidadeTotalVales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botaoZerarQuantidadeTotalVales)))
                .addGap(18, 18, 18)
                .addComponent(botaoSair, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {botaoSair, botaoZerarQuantidadeTotalVales, botaoZerarValeRefeicao, botaoZerarValeSolicitacao, botaoZerarValorCaixa});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel1, jLabel2, jLabel3, jLabel4});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {campoCaixa, campoQuantidadeTotalVales, campoValeRefeicao, campoValeSolicitacao});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSairActionPerformed
        telaPrincipal.setEnabled(true);
    }//GEN-LAST:event_botaoSairActionPerformed

    private void botaoZerarQuantidadeTotalValesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoZerarQuantidadeTotalValesActionPerformed
        vale.getQuantidadeValeGeralZeradas();
        telaPrincipal.atualizarCampos();
    }//GEN-LAST:event_botaoZerarQuantidadeTotalValesActionPerformed

    private void botaoZerarValeSolicitacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoZerarValeSolicitacaoActionPerformed
        vale.getValeSolicitacaoZerado();
        telaPrincipal.atualizarCampos();
    }//GEN-LAST:event_botaoZerarValeSolicitacaoActionPerformed

    private void botaoZerarValorCaixaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoZerarValorCaixaActionPerformed
        vale.getZerarCaixa();
        telaPrincipal.atualizarCampos();
    }//GEN-LAST:event_botaoZerarValorCaixaActionPerformed

    private void campoValeSolicitacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoValeSolicitacaoActionPerformed
        campoValeSolicitacao.setText(vale.getValeSolicitacao() + " ");
    }//GEN-LAST:event_campoValeSolicitacaoActionPerformed

    private void campoCaixaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoCaixaActionPerformed
        campoCaixa.setText(vale.getCaixa()+ " R$");
    }//GEN-LAST:event_campoCaixaActionPerformed

    private void botaoZerarValeRefeicaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoZerarValeRefeicaoActionPerformed
        vale.getValeRefeicaoZerado();
        telaPrincipal.atualizarCampos();
    }//GEN-LAST:event_botaoZerarValeRefeicaoActionPerformed

    private void campoQuantidadeTotalValesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoQuantidadeTotalValesActionPerformed
        campoQuantidadeTotalVales.setText(vale.getQuantidadeValeGeral() + " ");
    }//GEN-LAST:event_campoQuantidadeTotalValesActionPerformed

    private void campoValeRefeicaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoValeRefeicaoActionPerformed
        campoValeRefeicao.setText(vale.getValeRefeicao() + " ");
    }//GEN-LAST:event_campoValeRefeicaoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoSair;
    private javax.swing.JButton botaoZerarQuantidadeTotalVales;
    private javax.swing.JButton botaoZerarValeRefeicao;
    private javax.swing.JButton botaoZerarValeSolicitacao;
    private javax.swing.JButton botaoZerarValorCaixa;
    private javax.swing.JTextField campoCaixa;
    private javax.swing.JTextField campoQuantidadeTotalVales;
    private javax.swing.JTextField campoValeRefeicao;
    private javax.swing.JTextField campoValeSolicitacao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables

}
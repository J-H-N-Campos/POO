package maquinacacaniqueis.apresentacao;

import maquinacacaniqueis.negocio.CacaNiqueis;

public class Tela2 extends javax.swing.JFrame
{
    private CacaNiqueis joaozinho;
    private TelaPrincipal telaPrincipal;

       public Tela2(CacaNiqueis joaozinho)
       {
           
        this.joaozinho = joaozinho;
        initComponents(); 
       }
       public void setTelaPrincipal(TelaPrincipal telaPrincipal)
    {
        this.telaPrincipal = telaPrincipal;
    }
       
       void atualizarCampos()
    {
        campoPremios.setText(joaozinho.getPremiacao()+ " Quantidades");
        campoCaixa.setText(joaozinho.getCaixa()+ " Moedas");
    }
       
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botaoFechar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        botaoAdicionarMoedas = new javax.swing.JButton();
        botaoSangria = new javax.swing.JButton();
        botaoRetirarMoedas = new javax.swing.JButton();
        campoCaixa = new javax.swing.JTextField();
        campoPremios = new javax.swing.JTextField();
        botaoPremiacao = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        botaoFechar.setText("Fechar");
        botaoFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoFecharActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 24)); // NOI18N
        jLabel1.setText("Administrador");

        botaoAdicionarMoedas.setText("Adicionar Moedas");
        botaoAdicionarMoedas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAdicionarMoedasActionPerformed(evt);
            }
        });

        botaoSangria.setText("Retirar Moedas (Sangria de Moedas)");
        botaoSangria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSangriaActionPerformed(evt);
            }
        });

        botaoRetirarMoedas.setText("Retirar Moedas");
        botaoRetirarMoedas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoRetirarMoedasActionPerformed(evt);
            }
        });

        campoCaixa.setEditable(false);

        campoPremios.setEditable(false);

        botaoPremiacao.setText("Premiação");
        botaoPremiacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoPremiacaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(145, 145, 145)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(campoCaixa, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                .addComponent(botaoRetirarMoedas, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campoPremios, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botaoAdicionarMoedas, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botaoPremiacao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoSangria, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {botaoAdicionarMoedas, botaoPremiacao, botaoRetirarMoedas, botaoSangria});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {campoCaixa, campoPremios});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(campoCaixa, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                    .addComponent(botaoRetirarMoedas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(botaoAdicionarMoedas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(botaoSangria, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoPremios, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                        .addGap(42, 42, 42)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoPremiacao, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {campoCaixa, campoPremios});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {botaoAdicionarMoedas, botaoFechar, botaoPremiacao, botaoRetirarMoedas, botaoSangria});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoRetirarMoedasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoRetirarMoedasActionPerformed
        joaozinho.retirarMoedasCaixa();
        atualizarCampos();
    }//GEN-LAST:event_botaoRetirarMoedasActionPerformed

    private void botaoAdicionarMoedasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAdicionarMoedasActionPerformed
        joaozinho.abastecerMoedasCaixa();
        atualizarCampos();
    }//GEN-LAST:event_botaoAdicionarMoedasActionPerformed

    private void botaoSangriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSangriaActionPerformed
        joaozinho.sangriaMaquina();
        atualizarCampos();
    }//GEN-LAST:event_botaoSangriaActionPerformed

    private void botaoPremiacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPremiacaoActionPerformed
        joaozinho.premiacao();
        atualizarCampos();
    }//GEN-LAST:event_botaoPremiacaoActionPerformed

    private void botaoFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoFecharActionPerformed
        telaPrincipal.setEnabled(true);
        dispose();
    }//GEN-LAST:event_botaoFecharActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoAdicionarMoedas;
    private javax.swing.JButton botaoFechar;
    private javax.swing.JButton botaoPremiacao;
    private javax.swing.JButton botaoRetirarMoedas;
    private javax.swing.JButton botaoSangria;
    private javax.swing.JTextField campoCaixa;
    private javax.swing.JTextField campoPremios;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}

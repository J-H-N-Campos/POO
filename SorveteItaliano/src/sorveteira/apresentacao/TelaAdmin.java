package sorveteira.apresentacao;

import sorveteira.negocio.Sorveteira;

public class TelaAdmin extends javax.swing.JPanel
{
    private Sorveteira italiana;
    private Tela telaPrincipal;

       public TelaAdmin()
       {
        this.italiana = italiana;
        initComponents(); 
    }
       public void setTelaPrincipal(Tela telaPrincipal)
    {
        this.telaPrincipal = telaPrincipal;
    }
       
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botaoLeite = new javax.swing.JButton();
        botaoEmulsificante = new javax.swing.JButton();
        botaoChocolate = new javax.swing.JButton();
        botaoBaunilha = new javax.swing.JButton();
        botaoVoltar = new javax.swing.JButton();
        botaoSair = new javax.swing.JButton();
        campoQtdChocolate = new javax.swing.JTextField();
        campoQtdBaunilha = new javax.swing.JTextField();

        botaoLeite.setFont(new java.awt.Font("Microsoft JhengHei", 0, 24)); // NOI18N
        botaoLeite.setText("Completar Leite");
        botaoLeite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoLeiteActionPerformed(evt);
            }
        });

        botaoEmulsificante.setFont(new java.awt.Font("Microsoft JhengHei", 0, 24)); // NOI18N
        botaoEmulsificante.setText("Completar Emulsificante");
        botaoEmulsificante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoEmulsificanteActionPerformed(evt);
            }
        });

        botaoChocolate.setFont(new java.awt.Font("Microsoft JhengHei", 0, 24)); // NOI18N
        botaoChocolate.setText("Completar Chocolate");
        botaoChocolate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoChocolateActionPerformed(evt);
            }
        });

        botaoBaunilha.setFont(new java.awt.Font("Microsoft JhengHei", 0, 24)); // NOI18N
        botaoBaunilha.setText("Completar Baunilha");
        botaoBaunilha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoBaunilhaActionPerformed(evt);
            }
        });

        botaoVoltar.setFont(new java.awt.Font("Microsoft JhengHei", 0, 24)); // NOI18N
        botaoVoltar.setText("Voltar");
        botaoVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVoltarActionPerformed(evt);
            }
        });

        botaoSair.setFont(new java.awt.Font("Microsoft JhengHei", 0, 24)); // NOI18N
        botaoSair.setText("Sair");
        botaoSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSairActionPerformed(evt);
            }
        });

        campoQtdChocolate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoQtdChocolateActionPerformed(evt);
            }
        });

        campoQtdBaunilha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoQtdBaunilhaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botaoEmulsificante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botaoLeite, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botaoChocolate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botaoBaunilha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 40, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botaoSair, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoQtdChocolate, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botaoVoltar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                    .addComponent(campoQtdBaunilha, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {botaoSair, botaoVoltar});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {campoQtdBaunilha, campoQtdChocolate});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(botaoLeite, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botaoEmulsificante, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botaoChocolate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botaoBaunilha, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(campoQtdBaunilha, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                    .addComponent(campoQtdChocolate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoSair, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {botaoBaunilha, botaoChocolate, botaoEmulsificante, botaoLeite});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {botaoSair, botaoVoltar});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {campoQtdBaunilha, campoQtdChocolate});

    }// </editor-fold>//GEN-END:initComponents

    private void botaoLeiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoLeiteActionPerformed
        italiana.completarNivelLeite();
        telaPrincipal.atualizarCampos();    }//GEN-LAST:event_botaoLeiteActionPerformed

    private void botaoEmulsificanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEmulsificanteActionPerformed
        italiana.getCompletarNivelEmulsificante();
        telaPrincipal.atualizarCampos();
    }//GEN-LAST:event_botaoEmulsificanteActionPerformed

    private void botaoChocolateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoChocolateActionPerformed
         italiana.getCompletarNivelChocolate();
        telaPrincipal.atualizarCampos();
    }//GEN-LAST:event_botaoChocolateActionPerformed

    private void botaoBaunilhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoBaunilhaActionPerformed
        italiana.getCompletarNivelBaunilha();
        telaPrincipal.atualizarCampos();    }//GEN-LAST:event_botaoBaunilhaActionPerformed

    private void botaoVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVoltarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoVoltarActionPerformed

    private void botaoSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSairActionPerformed
        telaPrincipal.setEnabled(true);
    
        
    }//GEN-LAST:event_botaoSairActionPerformed

    private void campoQtdChocolateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoQtdChocolateActionPerformed
        italiana.getSorvetechocolateVendidos();
        telaPrincipal.atualizarCampos();
    }//GEN-LAST:event_campoQtdChocolateActionPerformed

    private void campoQtdBaunilhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoQtdBaunilhaActionPerformed
        italiana.getSorveteBaunilhaVendidos();
        telaPrincipal.atualizarCampos();
    }//GEN-LAST:event_campoQtdBaunilhaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoBaunilha;
    private javax.swing.JButton botaoChocolate;
    private javax.swing.JButton botaoEmulsificante;
    private javax.swing.JButton botaoLeite;
    private javax.swing.JButton botaoSair;
    private javax.swing.JButton botaoVoltar;
    private javax.swing.JTextField campoQtdBaunilha;
    private javax.swing.JTextField campoQtdChocolate;
    // End of variables declaration//GEN-END:variables
}

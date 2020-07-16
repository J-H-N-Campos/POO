package sorveteira.apresentacao;

import sorveteira.negocio.Sorveteira;

public class Tela2 extends javax.swing.JFrame
{
    private Sorveteira italiana;
    private Tela telaPrincipal;

    public Tela2(Sorveteira italiana)
    {
        this.italiana = italiana;
        initComponents();
        campoQtdBaunilha.setText(italiana.getSorveteBaunilhaVendidos()+ " un");
        campoQtdChocolate.setText(italiana.getSorvetechocolateVendidos()+ " un");
    }

    public void setTelaPrincipal(Tela telaPrincipal)
    {
        this.telaPrincipal = telaPrincipal;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        campoQtdBaunilha = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        botaoLeite = new javax.swing.JButton();
        botaoEmulsificante = new javax.swing.JButton();
        botaoChocolate = new javax.swing.JButton();
        botaoBaunilha = new javax.swing.JButton();
        botaoSair = new javax.swing.JButton();
        campoQtdChocolate = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        campoQtdBaunilha.setEditable(false);
        campoQtdBaunilha.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        campoQtdBaunilha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoQtdBaunilhaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        jLabel1.setText("Sorvetes de Baunilha Vendidos");

        jLabel2.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        jLabel2.setText("Sorvetes De Chocolate Vendidos");

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

        botaoSair.setFont(new java.awt.Font("Microsoft JhengHei", 0, 24)); // NOI18N
        botaoSair.setText("Sair");
        botaoSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSairActionPerformed(evt);
            }
        });

        campoQtdChocolate.setEditable(false);
        campoQtdChocolate.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        campoQtdChocolate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoQtdChocolateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botaoSair, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoQtdChocolate, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 139, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campoQtdBaunilha, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addContainerGap())))
            .addComponent(botaoBaunilha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(botaoChocolate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(botaoLeite, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(botaoEmulsificante, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(botaoLeite, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoEmulsificante, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(botaoChocolate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botaoBaunilha, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(campoQtdBaunilha, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                    .addComponent(campoQtdChocolate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botaoSair, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campoQtdBaunilhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoQtdBaunilhaActionPerformed
        ///
    }//GEN-LAST:event_campoQtdBaunilhaActionPerformed

    private void botaoLeiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoLeiteActionPerformed
        italiana.completarNivelLeite();
        telaPrincipal.atualizarCampos();
    }//GEN-LAST:event_botaoLeiteActionPerformed

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
        telaPrincipal.atualizarCampos();
    }//GEN-LAST:event_botaoBaunilhaActionPerformed

    private void botaoSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSairActionPerformed
        telaPrincipal.setEnabled(true);
        dispose();
    }//GEN-LAST:event_botaoSairActionPerformed

    private void campoQtdChocolateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoQtdChocolateActionPerformed
        ///
    }//GEN-LAST:event_campoQtdChocolateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoBaunilha;
    private javax.swing.JButton botaoChocolate;
    private javax.swing.JButton botaoEmulsificante;
    private javax.swing.JButton botaoLeite;
    private javax.swing.JButton botaoSair;
    private javax.swing.JTextField campoQtdBaunilha;
    private javax.swing.JTextField campoQtdChocolate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
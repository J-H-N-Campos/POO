package maquinacacaniqueis.apresentacao;

import maquinacacaniqueis.negocio.CacaNiqueis;
import maquinacacaniqueis.persistencia.CacaNiqueisBD;

public class TelaPrincipal extends javax.swing.JFrame
{
    private CacaNiqueis joaozinho;

    public TelaPrincipal(CacaNiqueis joaozinho)
    {
        this.joaozinho = joaozinho;
        initComponents();

        atualizarCampos();
        this.setLocationRelativeTo(null);
    }
    
    void atualizarCampos()
    {
        campoQtdJogadas.setText(joaozinho.getNumeroJogadas()+ " Quantidades");
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botaoFechar = new javax.swing.JButton();
        botaoAdmin = new javax.swing.JButton();
        botaoJogar = new javax.swing.JButton();
        campoQtdJogadas = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        botaoFechar.setText("Fechar");
        botaoFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoFecharActionPerformed(evt);
            }
        });

        botaoAdmin.setText("Admin");
        botaoAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAdminActionPerformed(evt);
            }
        });

        botaoJogar.setText("Jogar");
        botaoJogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoJogarActionPerformed(evt);
            }
        });

        campoQtdJogadas.setEditable(false);
        campoQtdJogadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoQtdJogadasActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 24)); // NOI18N
        jLabel2.setText("Caça - Níqueis");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(botaoAdmin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botaoFechar))
            .addGroup(layout.createSequentialGroup()
                .addComponent(campoQtdJogadas, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botaoJogar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 69, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoQtdJogadas, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoJogar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(112, 112, 112)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoFechar)
                    .addComponent(botaoAdmin)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoFecharActionPerformed
       CacaNiqueisBD bd = new CacaNiqueisBD();
        bd.Salvar(joaozinho);
        dispose();
    }//GEN-LAST:event_botaoFecharActionPerformed

    private void botaoJogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoJogarActionPerformed
        joaozinho.jogar();
        atualizarCampos();
    }//GEN-LAST:event_botaoJogarActionPerformed

    private void botaoAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAdminActionPerformed
        Tela2 tela = new Tela2(joaozinho);
        tela.setTelaPrincipal(this);
        this.setEnabled(false);
        tela.setVisible(true);
    }//GEN-LAST:event_botaoAdminActionPerformed

    private void campoQtdJogadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoQtdJogadasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoQtdJogadasActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoAdmin;
    private javax.swing.JButton botaoFechar;
    private javax.swing.JButton botaoJogar;
    private javax.swing.JTextField campoQtdJogadas;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}

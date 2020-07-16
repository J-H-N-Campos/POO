package batatasfritas.apresentacao;

import batatasfritas.negocio.BatatasFritas;
import batatasfritas.persistencia.batatasFritasBD;
import javax.swing.JOptionPane;

public class Tela extends javax.swing.JFrame
{
    
private BatatasFritas batatas;

    public Tela(BatatasFritas batatas)
{
        this.batatas = batatas;
        initComponents();

        atualizarCampos();
        this.setLocationRelativeTo(null);

        this.botaoBatatas.setSelected(true);
        this.botaoOleo.setSelected(true);
        this.botaoIniciarProcesso.setSelected(true);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botaoSair = new javax.swing.JButton();
        botaoAdmin = new javax.swing.JButton();
        campoOleo = new javax.swing.JTextField();
        campoBatatas = new javax.swing.JTextField();
        botaoOleo = new javax.swing.JButton();
        botaoBatatas = new javax.swing.JButton();
        botaoIniciarProcesso = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        botaoSair.setText("Fechar");
        botaoSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSairActionPerformed(evt);
            }
        });

        botaoAdmin.setText("Admin");
        botaoAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAdminActionPerformed(evt);
            }
        });

        botaoOleo.setText("Adicionar Óleo");
        botaoOleo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoOleoActionPerformed(evt);
            }
        });

        botaoBatatas.setText("Adicionar Batatas");
        botaoBatatas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoBatatasActionPerformed(evt);
            }
        });

        botaoIniciarProcesso.setText("Iniciar Processo");
        botaoIniciarProcesso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoIniciarProcessoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(botaoAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 132, Short.MAX_VALUE)
                .addComponent(botaoSair, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(campoBatatas, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(campoOleo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botaoBatatas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botaoOleo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addComponent(botaoIniciarProcesso, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoOleo, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoOleo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoBatatas, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoBatatas, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(botaoIniciarProcesso, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoSair, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {botaoBatatas, botaoOleo});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoOleoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoOleoActionPerformed
          
           batatas.completarOleo();
            atualizarCampos();
    }//GEN-LAST:event_botaoOleoActionPerformed

    private void botaoBatatasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoBatatasActionPerformed

        batatas.completarBatatas();
        atualizarCampos();
    }//GEN-LAST:event_botaoBatatasActionPerformed

    private void botaoIniciarProcessoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoIniciarProcessoActionPerformed
        
        boolean ok = false;
        
        if(botaoOleo.isSelected() && botaoBatatas.isSelected())
        {
            ok = batatas.fritar();
        }
        
        if (!ok)
        {
            JOptionPane.showMessageDialog(this, "Faltou insumos" );
        }
        else
        {
            atualizarCampos();
        }               
    }//GEN-LAST:event_botaoIniciarProcessoActionPerformed

    private void botaoSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSairActionPerformed
        
        batatasFritasBD bd = new batatasFritasBD();
        bd.Salvar(batatas);
        dispose();
    }//GEN-LAST:event_botaoSairActionPerformed

    private void botaoAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAdminActionPerformed
        
        TelaAdmin tela = new TelaAdmin(batatas);
        tela.setTelaPrincipal(this);
        this.setEnabled(false);
        tela.setVisible(true);
        
    }//GEN-LAST:event_botaoAdminActionPerformed

    void atualizarCampos()
    {
        campoBatatas.setText(batatas.getDepositoBatatas()+ " kg ");
        campoOleo.setText(batatas.getNivelOleo()+ " ml ");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoAdmin;
    private javax.swing.JButton botaoBatatas;
    private javax.swing.JButton botaoIniciarProcesso;
    private javax.swing.JButton botaoOleo;
    private javax.swing.JButton botaoSair;
    private javax.swing.JTextField campoBatatas;
    private javax.swing.JTextField campoOleo;
    // End of variables declaration//GEN-END:variables
}

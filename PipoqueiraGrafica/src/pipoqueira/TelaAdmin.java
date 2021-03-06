/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pipoqueira;

/**
 *
 * @author mouriac
 */
public class TelaAdmin extends javax.swing.JFrame
{
    private Pipoqueira popcorn;
    private Tela telaPrincipal;
    /**
     * Creates new form TelaAdmin
     */
    public TelaAdmin(Pipoqueira popcorn)
    {
        this.popcorn = popcorn;
        initComponents();
        
        cpCaixa.setValue( popcorn.getValorVendido() );
        this.setLocationRelativeTo(null);
    }

    public void setTelaPrincipal(Tela telaPrincipal)
    {
        this.telaPrincipal = telaPrincipal;
    }
    
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        btnFechar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btnPipoca = new javax.swing.JButton();
        btnAcucar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnSal = new javax.swing.JButton();
        cpCaixa = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Admin");
        setResizable(false);

        btnFechar.setText("Fechar");
        btnFechar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnFecharActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnPipoca.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnPipoca.setText("Completar pipoca");
        btnPipoca.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnPipocaActionPerformed(evt);
            }
        });

        btnAcucar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnAcucar.setText("Completar açúcar");
        btnAcucar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnAcucarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Valor em caixa:");

        btnSal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnSal.setText("Completar sal");
        btnSal.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnSalActionPerformed(evt);
            }
        });

        cpCaixa.setEditable(false);
        cpCaixa.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0.00"))));
        cpCaixa.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        cpCaixa.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPipoca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAcucar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cpCaixa))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnPipoca, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAcucar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(btnSal, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cpCaixa, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnFechar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnFecharActionPerformed
    {//GEN-HEADEREND:event_btnFecharActionPerformed
        telaPrincipal.setEnabled(true);
        dispose();
    }//GEN-LAST:event_btnFecharActionPerformed

    private void btnSalActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnSalActionPerformed
    {//GEN-HEADEREND:event_btnSalActionPerformed
        popcorn.completarSal();
        telaPrincipal.atualizarCampos();
    }//GEN-LAST:event_btnSalActionPerformed

    private void btnPipocaActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnPipocaActionPerformed
    {//GEN-HEADEREND:event_btnPipocaActionPerformed
        popcorn.completarMilho();
        telaPrincipal.atualizarCampos();
    }//GEN-LAST:event_btnPipocaActionPerformed

    private void btnAcucarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnAcucarActionPerformed
    {//GEN-HEADEREND:event_btnAcucarActionPerformed
        popcorn.completarAcucar();
        telaPrincipal.atualizarCampos();
    }//GEN-LAST:event_btnAcucarActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAcucar;
    private javax.swing.JButton btnFechar;
    private javax.swing.JButton btnPipoca;
    private javax.swing.JButton btnSal;
    private javax.swing.JFormattedTextField cpCaixa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}

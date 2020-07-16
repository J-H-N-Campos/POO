/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pipoqueira.apresentacao;

import pipoqueira.negocio.Pipoqueira;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import pipoqueira.persistencia.PipoqueiraDao;

/**
 *
 * @author mouriac
 */
public class Tela extends javax.swing.JFrame
{
    private Pipoqueira popcorn;
    /**
     * Creates new form Tela
     */
    public Tela(Pipoqueira popcorn)
    {
        this.popcorn = popcorn;
        initComponents();

        atualizarCampos();
        this.setLocationRelativeTo(null);
        
        this.rbSaborDoce.setSelected(true);
        this.rbTamGrande.setSelected(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoSabor = new javax.swing.ButtonGroup();
        grupoTamanho = new javax.swing.ButtonGroup();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jPanel1 = new javax.swing.JPanel();
        cpPipoca = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cpAcucar = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cpSal = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        rbSaborDoce = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        rbSaborSalgado = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        rbTamGrande = new javax.swing.JRadioButton();
        rbTamPequeno = new javax.swing.JRadioButton();
        btnComprar = new javax.swing.JButton();
        btnFechar = new javax.swing.JButton();
        btnAdmin = new javax.swing.JButton();

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pipoqueira");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        cpPipoca.setEditable(false);
        cpPipoca.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cpPipoca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpPipocaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Pipoca");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Açucar");

        cpAcucar.setEditable(false);
        cpAcucar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Sal");

        cpSal.setEditable(false);
        cpSal.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cpPipoca, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cpAcucar, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cpSal, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cpPipoca, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cpAcucar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cpSal, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        grupoSabor.add(rbSaborDoce);
        rbSaborDoce.setText("Doce");
        rbSaborDoce.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbSaborDoceActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Sabor");

        grupoSabor.add(rbSaborSalgado);
        rbSaborSalgado.setText("Salgada");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Tamanho");

        grupoTamanho.add(rbTamGrande);
        rbTamGrande.setText("Grande");

        grupoTamanho.add(rbTamPequeno);
        rbTamPequeno.setText("Pequeno");
        rbTamPequeno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbTamPequenoActionPerformed(evt);
            }
        });

        btnComprar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnComprar.setText("Comprar");
        btnComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnComprar, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbSaborSalgado)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbSaborDoce)
                    .addComponent(rbTamGrande)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbTamPequeno))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbSaborDoce)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbSaborSalgado)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbTamPequeno)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbTamGrande)
                .addGap(18, 18, 18)
                .addComponent(btnComprar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnFechar.setText("Fechar");
        btnFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharActionPerformed(evt);
            }
        });

        btnAdmin.setText("Admin");
        btnAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdminActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFechar)
                    .addComponent(btnAdmin))
                .addGap(13, 13, 13))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdminActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnAdminActionPerformed
    {//GEN-HEADEREND:event_btnAdminActionPerformed
        TelaAdmin tela2 = new TelaAdmin(popcorn);
        tela2.setTelaPrincipal(this);
        this.setEnabled(false);
        tela2.setVisible(true);
    }//GEN-LAST:event_btnAdminActionPerformed

    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnFecharActionPerformed
    {//GEN-HEADEREND:event_btnFecharActionPerformed
        PipoqueiraDao dao = new PipoqueiraDao();
        dao.salvar(popcorn);
        dispose();
    }//GEN-LAST:event_btnFecharActionPerformed

    private void cpPipocaActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_cpPipocaActionPerformed
    {//GEN-HEADEREND:event_cpPipocaActionPerformed
        System.out.println("sdklfjsdlk");
    }//GEN-LAST:event_cpPipocaActionPerformed

    private void btnComprarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnComprarActionPerformed
    {//GEN-HEADEREND:event_btnComprarActionPerformed
        boolean ok = false;
        if (rbSaborDoce.isSelected() && rbTamGrande.isSelected())
        {
            ok = popcorn.servirPipocaDoceGrande();
        }
        if (rbSaborSalgado.isSelected() && rbTamGrande.isSelected())
        {
            ok = popcorn.servirPipocaSalgadaGrande();
        }
        if (rbSaborDoce.isSelected() && rbTamPequeno.isSelected())
        {
            ok = popcorn.servirPipocaDocePequena();
        }
        if (rbSaborSalgado.isSelected() && rbTamPequeno.isSelected())
        {
            ok = popcorn.servirPipocaSalgadaPequena();
        }
        if (!ok)
        {
            JOptionPane.showMessageDialog(this, "Faltou insumos" );
            //System.out.println("Eu pau na pipoqueira");
        }
        else
        {
            atualizarCampos();
        }
    }//GEN-LAST:event_btnComprarActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt)//GEN-FIRST:event_formWindowClosing
    {//GEN-HEADEREND:event_formWindowClosing
        PipoqueiraDao dao = new PipoqueiraDao();
        dao.salvar(popcorn);
    }//GEN-LAST:event_formWindowClosing

    private void rbTamPequenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbTamPequenoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbTamPequenoActionPerformed

    private void rbSaborDoceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbSaborDoceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbSaborDoceActionPerformed

   void atualizarCampos()
   {
       cpPipoca.setText( popcorn.getNivelPipoca()+" kg" );
       cpAcucar.setText( popcorn.getNivelAcucar()+" kg" );
       cpSal.setText( popcorn.getNivelSal()+" g");
   }

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdmin;
    private javax.swing.JButton btnComprar;
    private javax.swing.JButton btnFechar;
    private javax.swing.JTextField cpAcucar;
    private javax.swing.JTextField cpPipoca;
    private javax.swing.JTextField cpSal;
    private javax.swing.ButtonGroup grupoSabor;
    private javax.swing.ButtonGroup grupoTamanho;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton rbSaborDoce;
    private javax.swing.JRadioButton rbSaborSalgado;
    private javax.swing.JRadioButton rbTamGrande;
    private javax.swing.JRadioButton rbTamPequeno;
    // End of variables declaration//GEN-END:variables
}
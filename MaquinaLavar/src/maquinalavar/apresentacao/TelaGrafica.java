package maquinalavar.apresentacao;

import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import maquinalavar.negocio.Bosstemp;

public class TelaGrafica extends javax.swing.JFrame
{

    private Bosstemp maquina;

    public TelaGrafica(Bosstemp maquina)
    {
        this.maquina = maquina;
        initComponents();
        
        atualizarCampos();
        this.setLocationRelativeTo(null);
       
        cpRoupa.setBackground(new Color(255, 255, 102));
        cpSabao.setBackground(new Color(255, 255, 102));
        cpAmaciante.setBackground(new Color(255, 255, 102));

    }
    
    void atualizarCampos()
    {
        cpRoupa.setText(maquina.getNivelRoupas()+ " kg");
        cpSabao.setText(maquina.getNivelSabao()+ " ml");
        cpAmaciante.setText(maquina.getNivelAmaciante()+ " ml");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        painelPrincipal = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cpRoupa = new javax.swing.JTextField();
        cpSabao = new javax.swing.JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cpAmaciante = new javax.swing.JFormattedTextField();
        btnColocarRoupas = new javax.swing.JButton();
        btnRetirarRoupas = new javax.swing.JButton();
        btnColocarSabao = new javax.swing.JButton();
        btnColocarAmaciante = new javax.swing.JButton();
        btnLavar = new javax.swing.JButton();
        btnConfirmar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Máquina Lava Roupas");

        painelPrincipal.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("Roupas:");

        cpRoupa.setEditable(false);
        cpRoupa.setBackground(new java.awt.Color(153, 255, 153));
        cpRoupa.setText("Vazia");
        cpRoupa.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                cpRoupaActionPerformed(evt);
            }
        });
        cpRoupa.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                cpRoupaKeyTyped(evt);
            }
        });

        cpSabao.setEditable(false);
        cpSabao.setBackground(new java.awt.Color(255, 255, 102));
        cpSabao.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter()));
        cpSabao.setText("Sem sabão");

        jLabel2.setText("Sabão:");

        jLabel3.setText("Amaciante:");

        cpAmaciante.setEditable(false);
        cpAmaciante.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter()));
        cpAmaciante.setText("Sem amaciante");

        btnColocarRoupas.setText("Colocar Roupas");
        btnColocarRoupas.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnColocarRoupasActionPerformed(evt);
            }
        });

        btnRetirarRoupas.setText("Retirar Roupas");
        btnRetirarRoupas.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnRetirarRoupasActionPerformed(evt);
            }
        });

        btnColocarSabao.setText("Colocar Sabão");
        btnColocarSabao.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnColocarSabaoActionPerformed(evt);
            }
        });

        btnColocarAmaciante.setText("Colocar Amaciante");
        btnColocarAmaciante.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnColocarAmacianteActionPerformed(evt);
            }
        });

        btnLavar.setText("LAVAR");
        btnLavar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnLavarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelPrincipalLayout = new javax.swing.GroupLayout(painelPrincipal);
        painelPrincipal.setLayout(painelPrincipalLayout);
        painelPrincipalLayout.setHorizontalGroup(
            painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(painelPrincipalLayout.createSequentialGroup()
                        .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnColocarSabao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnColocarRoupas, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnColocarAmaciante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnRetirarRoupas, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnLavar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelPrincipalLayout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addGap(48, 48, 48))
                        .addComponent(jLabel1)
                        .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cpRoupa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cpSabao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel2))
                    .addComponent(cpAmaciante, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );
        painelPrincipalLayout.setVerticalGroup(
            painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelPrincipalLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(cpRoupa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cpSabao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelPrincipalLayout.createSequentialGroup()
                        .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnRetirarRoupas, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnColocarRoupas, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnColocarAmaciante, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                            .addComponent(btnColocarSabao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLavar, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addGroup(painelPrincipalLayout.createSequentialGroup()
                        .addComponent(cpAmaciante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        btnConfirmar.setText("Fechar");
        btnConfirmar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnConfirmarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btnConfirmar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnConfirmarActionPerformed
    {//GEN-HEADEREND:event_btnConfirmarActionPerformed
        dispose();
    }//GEN-LAST:event_btnConfirmarActionPerformed

    private void cpRoupaActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_cpRoupaActionPerformed
    {//GEN-HEADEREND:event_cpRoupaActionPerformed
        dispose();
    }//GEN-LAST:event_cpRoupaActionPerformed

    private void cpRoupaKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_cpRoupaKeyTyped
    {//GEN-HEADEREND:event_cpRoupaKeyTyped
        if (!Character.isDigit(evt.getKeyChar()))
        {
            evt.consume();
        }
    }//GEN-LAST:event_cpRoupaKeyTyped

    private void btnColocarRoupasActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnColocarRoupasActionPerformed
    {//GEN-HEADEREND:event_btnColocarRoupasActionPerformed
        double kg = Entrada.leiaDouble("Informe peso (kg) das roupas");
        if (maquina.colocarRoupas(kg))
        {
            cpRoupa.setText(maquina.getNivelRoupas() + " kg suja");
            cpRoupa.setBackground(new Color(153, 255, 153));  
        } else
        {
            JOptionPane.showMessageDialog(this, "Está cheio ou já está lavado");
        }
         atualizarCampos();
    }//GEN-LAST:event_btnColocarRoupasActionPerformed

    private void btnColocarSabaoActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnColocarSabaoActionPerformed
    {//GEN-HEADEREND:event_btnColocarSabaoActionPerformed
        int gr = Entrada.leiaInt("Informe quantidade (gr) de sabão");
        if (maquina.colocarSabao(gr))
        {
            cpSabao.setText(maquina.getNivelSabao() + " g");
            cpSabao.setBackground(new Color(153, 255, 153));
        } else
        {
            JOptionPane.showMessageDialog(this, "Compartimento cheio");
        }
         atualizarCampos();
    }//GEN-LAST:event_btnColocarSabaoActionPerformed

    private void btnColocarAmacianteActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnColocarAmacianteActionPerformed
    {//GEN-HEADEREND:event_btnColocarAmacianteActionPerformed
        int ml = Entrada.leiaInt("Informe quantidade (ml) de amaciante");
        if (maquina.colocarAmaciante(ml))
        {
            cpAmaciante.setText(maquina.getNivelAmaciante() + " ml");
            cpAmaciante.setBackground(new Color(153, 255, 153));
        } else
        {
            JOptionPane.showMessageDialog(this, "Compartimento cheio");
        }
         atualizarCampos();
    }//GEN-LAST:event_btnColocarAmacianteActionPerformed

    private void btnRetirarRoupasActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnRetirarRoupasActionPerformed
    {//GEN-HEADEREND:event_btnRetirarRoupasActionPerformed
        if (maquina.retirarRoupas())
        {
            cpRoupa.setText("Vazia");
            cpRoupa.setBackground(new Color(255, 255, 102)); 
        } else
        {
            JOptionPane.showMessageDialog(this, "Compartimento está vazio");
        }
         atualizarCampos();
    }//GEN-LAST:event_btnRetirarRoupasActionPerformed

    private void btnLavarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnLavarActionPerformed
    {//GEN-HEADEREND:event_btnLavarActionPerformed
        if (maquina.lavar())
        {
            cpRoupa.setText(maquina.getNivelRoupas() + " kg lavada");
            cpRoupa.setBackground(new Color(153, 204, 255));
            
            cpSabao.setText("Sem sabão");
            cpSabao.setBackground(new Color(255, 255, 102));
            
            cpAmaciante.setText("Sem amaciante");
            cpAmaciante.setBackground(new Color(255, 255, 102));
        } else
        {
            JOptionPane.showMessageDialog(this, "Falha na operação");
        }
         atualizarCampos();
    }//GEN-LAST:event_btnLavarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnColocarAmaciante;
    private javax.swing.JButton btnColocarRoupas;
    private javax.swing.JButton btnColocarSabao;
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JButton btnLavar;
    private javax.swing.JButton btnRetirarRoupas;
    private javax.swing.JFormattedTextField cpAmaciante;
    private javax.swing.JTextField cpRoupa;
    private javax.swing.JFormattedTextField cpSabao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel painelPrincipal;
    // End of variables declaration//GEN-END:variables
}

package sorveteira.apresentacao;

import javax.swing.JOptionPane;
import sorveteira.negocio.Sorveteira;
import sorveteira.persistencia.SorveteiraBD;

public class Tela extends javax.swing.JFrame {

    private Sorveteira italiana;

    public Tela(Sorveteira italiana) {
        this.italiana = italiana;
        initComponents();

        atualizarCampos();
        this.setLocationRelativeTo(null);

        this.saborBaunilha.setSelected(true);
        this.saborChocolate.setSelected(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        jFrame1 = new javax.swing.JFrame();
        popupMenu1 = new java.awt.PopupMenu();
        buttonGroup6 = new javax.swing.ButtonGroup();
        buttonGroup7 = new javax.swing.ButtonGroup();
        buttonGroup8 = new javax.swing.ButtonGroup();
        buttonGroup9 = new javax.swing.ButtonGroup();
        buttonGroup10 = new javax.swing.ButtonGroup();
        buttonGroup11 = new javax.swing.ButtonGroup();
        buttonGroup12 = new javax.swing.ButtonGroup();
        buttonGroup13 = new javax.swing.ButtonGroup();
        buttonGroup14 = new javax.swing.ButtonGroup();
        buttonGroup15 = new javax.swing.ButtonGroup();
        buttonGroup16 = new javax.swing.ButtonGroup();
        buttonGroup17 = new javax.swing.ButtonGroup();
        buttonGroup18 = new javax.swing.ButtonGroup();
        buttonGroup19 = new javax.swing.ButtonGroup();
        buttonGroup20 = new javax.swing.ButtonGroup();
        buttonGroup21 = new javax.swing.ButtonGroup();
        buttonGroup22 = new javax.swing.ButtonGroup();
        buttonGroup23 = new javax.swing.ButtonGroup();
        buttonGroup24 = new javax.swing.ButtonGroup();
        buttonGroup25 = new javax.swing.ButtonGroup();
        Sair = new javax.swing.JButton();
        Admin = new javax.swing.JButton();
        nomeSabores = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        campoLeite = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        campoChocolate = new javax.swing.JTextPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        campoBaunilha = new javax.swing.JTextPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        campoEmulsificante = new javax.swing.JTextPane();
        nomeLeite = new javax.swing.JLabel();
        nomeChocolate = new javax.swing.JLabel();
        nomeBaunilha = new javax.swing.JLabel();
        nomeEmulsificante = new javax.swing.JLabel();
        saborBaunilha = new javax.swing.JButton();
        saborChocolate = new javax.swing.JButton();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        popupMenu1.setLabel("popupMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
        addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                formComponentAdded(evt);
            }
        });
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                formComponentHidden(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        Sair.setFont(new java.awt.Font("Microsoft JhengHei", 0, 24)); // NOI18N
        Sair.setText("Sair");
        Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SairActionPerformed(evt);
            }
        });

        Admin.setFont(new java.awt.Font("Microsoft JhengHei", 0, 24)); // NOI18N
        Admin.setText("Admin");
        Admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdminActionPerformed(evt);
            }
        });

        nomeSabores.setFont(new java.awt.Font("Microsoft JhengHei", 0, 24)); // NOI18N
        nomeSabores.setText("Sabores");

        campoLeite.setEditable(false);
        campoLeite.setFont(new java.awt.Font("Microsoft JhengHei", 0, 24)); // NOI18N
        jScrollPane1.setViewportView(campoLeite);

        campoChocolate.setEditable(false);
        campoChocolate.setFont(new java.awt.Font("Microsoft JhengHei", 0, 24)); // NOI18N
        campoChocolate.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                campoChocolateAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane2.setViewportView(campoChocolate);

        campoBaunilha.setEditable(false);
        campoBaunilha.setFont(new java.awt.Font("Microsoft JhengHei", 0, 24)); // NOI18N
        campoBaunilha.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                campoBaunilhaAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane3.setViewportView(campoBaunilha);

        campoEmulsificante.setEditable(false);
        campoEmulsificante.setFont(new java.awt.Font("Microsoft JhengHei", 0, 24)); // NOI18N
        campoEmulsificante.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                campoEmulsificanteAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane4.setViewportView(campoEmulsificante);

        nomeLeite.setFont(new java.awt.Font("Microsoft JhengHei", 0, 24)); // NOI18N
        nomeLeite.setText("Leite");
        nomeLeite.setToolTipText("");

        nomeChocolate.setFont(new java.awt.Font("Microsoft JhengHei", 0, 24)); // NOI18N
        nomeChocolate.setText("Chocolate");

        nomeBaunilha.setFont(new java.awt.Font("Microsoft JhengHei", 0, 24)); // NOI18N
        nomeBaunilha.setText("Baunilha");

        nomeEmulsificante.setFont(new java.awt.Font("Microsoft JhengHei", 0, 24)); // NOI18N
        nomeEmulsificante.setText("Emulsificante");

        saborBaunilha.setFont(new java.awt.Font("Microsoft JhengHei", 0, 24)); // NOI18N
        saborBaunilha.setText("Baunilha");
        saborBaunilha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saborBaunilhaActionPerformed(evt);
            }
        });

        saborChocolate.setFont(new java.awt.Font("Microsoft JhengHei", 0, 24)); // NOI18N
        saborChocolate.setText("Chocolate");
        saborChocolate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saborChocolateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(nomeSabores, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(saborBaunilha, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(saborChocolate, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nomeBaunilha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nomeChocolate, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(nomeEmulsificante, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(254, 254, 254)
                        .addComponent(nomeLeite, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Sair, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Admin, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {nomeBaunilha, nomeChocolate, nomeEmulsificante, nomeLeite});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {saborBaunilha, saborChocolate});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {Admin, Sair});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jScrollPane1, jScrollPane2, jScrollPane3, jScrollPane4});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(saborChocolate, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                        .addComponent(saborBaunilha, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(nomeSabores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Admin, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(nomeChocolate)
                                    .addComponent(nomeLeite, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nomeBaunilha)
                            .addComponent(nomeEmulsificante))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addComponent(Sair, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jScrollPane1, jScrollPane2, jScrollPane3, jScrollPane4});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {nomeBaunilha, nomeChocolate, nomeEmulsificante, nomeLeite});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {saborBaunilha, saborChocolate});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {Admin, Sair});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_formComponentHidden

    private void formComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_formComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_formComponentAdded

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowActivated

    private void SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SairActionPerformed
        SorveteiraBD bd = new SorveteiraBD();
        bd.Salvar(italiana);
        dispose();
    }//GEN-LAST:event_SairActionPerformed

    void atualizarCampos() {
        campoChocolate.setText(italiana.getNivelReservatorioChocolate() + " ml");
        campoLeite.setText(italiana.getNivelReservatorioLeite() + " ml");
        campoBaunilha.setText(italiana.getNivelReservatorioBaunilha() + " ml");
        campoEmulsificante.setText(italiana.getNivelReservatorioEmulsificante() + " kg");
    }


    private void campoChocolateAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_campoChocolateAncestorAdded

        campoChocolate.setText(italiana.getNivelReservatorioChocolate() + " ml");
    }//GEN-LAST:event_campoChocolateAncestorAdded

    private void campoBaunilhaAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_campoBaunilhaAncestorAdded

        campoBaunilha.setText(italiana.getNivelReservatorioBaunilha() + " ml");
    }//GEN-LAST:event_campoBaunilhaAncestorAdded

    private void campoEmulsificanteAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_campoEmulsificanteAncestorAdded

        campoEmulsificante.setText(italiana.getNivelReservatorioEmulsificante() + " kg");
    }//GEN-LAST:event_campoEmulsificanteAncestorAdded

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing

        SorveteiraBD bd = new SorveteiraBD();
        bd.Salvar(italiana);
    }//GEN-LAST:event_formWindowClosing

    private void saborChocolateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saborChocolateActionPerformed
        if (saborChocolate.isSelected()) {
            italiana.setFazerSorveteChocolate();
            atualizarCampos();
        }
    }//GEN-LAST:event_saborChocolateActionPerformed

    private void saborBaunilhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saborBaunilhaActionPerformed

        if (saborBaunilha.isSelected()) {
            italiana.setFazerSorveteBaunilha();
            atualizarCampos();
        }
    }//GEN-LAST:event_saborBaunilhaActionPerformed

    private void AdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdminActionPerformed
        Tela2 tela = new Tela2(italiana);
        tela.setTelaPrincipal(this);
        this.setEnabled(false);
        tela.setVisible(true);
    }//GEN-LAST:event_AdminActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Admin;
    private javax.swing.JButton Sair;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup10;
    private javax.swing.ButtonGroup buttonGroup11;
    private javax.swing.ButtonGroup buttonGroup12;
    private javax.swing.ButtonGroup buttonGroup13;
    private javax.swing.ButtonGroup buttonGroup14;
    private javax.swing.ButtonGroup buttonGroup15;
    private javax.swing.ButtonGroup buttonGroup16;
    private javax.swing.ButtonGroup buttonGroup17;
    private javax.swing.ButtonGroup buttonGroup18;
    private javax.swing.ButtonGroup buttonGroup19;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup20;
    private javax.swing.ButtonGroup buttonGroup21;
    private javax.swing.ButtonGroup buttonGroup22;
    private javax.swing.ButtonGroup buttonGroup23;
    private javax.swing.ButtonGroup buttonGroup24;
    private javax.swing.ButtonGroup buttonGroup25;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.ButtonGroup buttonGroup6;
    private javax.swing.ButtonGroup buttonGroup7;
    private javax.swing.ButtonGroup buttonGroup8;
    private javax.swing.ButtonGroup buttonGroup9;
    private javax.swing.JTextPane campoBaunilha;
    private javax.swing.JTextPane campoChocolate;
    private javax.swing.JTextPane campoEmulsificante;
    private javax.swing.JTextPane campoLeite;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel nomeBaunilha;
    private javax.swing.JLabel nomeChocolate;
    private javax.swing.JLabel nomeEmulsificante;
    private javax.swing.JLabel nomeLeite;
    private javax.swing.JLabel nomeSabores;
    private java.awt.PopupMenu popupMenu1;
    private javax.swing.JButton saborBaunilha;
    private javax.swing.JButton saborChocolate;
    // End of variables declaration//GEN-END:variables
}

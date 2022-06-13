/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Lucas Pontes Soares
 */
public class Caculator extends javax.swing.JFrame {
    
    //variavel publica, não precisa falar que é publica
    double num1, num2, resultado;
    String operacao;    

    public Caculator() {
        initComponents();
    }

    public void NovoNum() {
        num1 = Double.parseDouble(jTextVisor.getText());
        jTextVisor.setText("0");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextVisor = new javax.swing.JTextField();
        bnt0 = new javax.swing.JButton();
        bnt1 = new javax.swing.JButton();
        bnt2 = new javax.swing.JButton();
        bnt3 = new javax.swing.JButton();
        bnt4 = new javax.swing.JButton();
        bnt5 = new javax.swing.JButton();
        bnt6 = new javax.swing.JButton();
        bnt7 = new javax.swing.JButton();
        bnt8 = new javax.swing.JButton();
        bnt9 = new javax.swing.JButton();
        bntVir = new javax.swing.JButton();
        bntIgual = new javax.swing.JButton();
        bntMenos = new javax.swing.JButton();
        bntSoma = new javax.swing.JButton();
        bntDividir = new javax.swing.JButton();
        bntMulti = new javax.swing.JButton();
        bntVoltar = new javax.swing.JButton();
        bntClear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextVisor.setEditable(false);
        jTextVisor.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jTextVisor.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextVisor.setText("0");

        bnt0.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bnt0.setText("0");
        bnt0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnt0ActionPerformed(evt);
            }
        });

        bnt1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bnt1.setText("1");
        bnt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnt1ActionPerformed(evt);
            }
        });

        bnt2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bnt2.setText("2");
        bnt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnt2ActionPerformed(evt);
            }
        });

        bnt3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bnt3.setText("3");
        bnt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnt3ActionPerformed(evt);
            }
        });

        bnt4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bnt4.setText("4");
        bnt4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnt4ActionPerformed(evt);
            }
        });

        bnt5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bnt5.setText("5");
        bnt5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnt5ActionPerformed(evt);
            }
        });

        bnt6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bnt6.setText("6");
        bnt6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnt6ActionPerformed(evt);
            }
        });

        bnt7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bnt7.setText("7");
        bnt7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnt7ActionPerformed(evt);
            }
        });

        bnt8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bnt8.setText("8");
        bnt8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnt8ActionPerformed(evt);
            }
        });

        bnt9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bnt9.setText("9");
        bnt9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnt9ActionPerformed(evt);
            }
        });

        bntVir.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bntVir.setText(",");
        bntVir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntVirActionPerformed(evt);
            }
        });

        bntIgual.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bntIgual.setText("=");
        bntIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntIgualActionPerformed(evt);
            }
        });

        bntMenos.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bntMenos.setText("-");
        bntMenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntMenosActionPerformed(evt);
            }
        });

        bntSoma.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bntSoma.setText("+");
        bntSoma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntSomaActionPerformed(evt);
            }
        });

        bntDividir.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bntDividir.setText("/");
        bntDividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntDividirActionPerformed(evt);
            }
        });

        bntMulti.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bntMulti.setText("*");
        bntMulti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntMultiActionPerformed(evt);
            }
        });

        bntVoltar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bntVoltar.setText("<--");
        bntVoltar.setToolTipText("");
        bntVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntVoltarActionPerformed(evt);
            }
        });

        bntClear.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bntClear.setText("C");
        bntClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTextVisor, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bnt0, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bntVir, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bntIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(bnt1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(bnt4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(bnt5, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bnt2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(bntClear, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bnt7, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bnt8, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(bntVoltar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bnt9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bnt6, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(bnt3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(bntDividir, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(bntMulti, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bntMenos, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(bntSoma, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jTextVisor, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bntVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bntClear, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bnt9, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bnt8, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bnt7, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bnt6, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bnt5, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bnt4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bnt3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bnt2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bnt1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bntDividir, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bntMulti, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bntMenos, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(bntSoma, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bnt0, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bntVir, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bntIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(78, 78, 78))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
   
    public void digitar(String num){
        if("0".equals(jTextVisor.getText())){
               jTextVisor.setText(num);
        } else {
            jTextVisor.setText(jTextVisor.getText() + num);
        }
    }

    private void bnt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnt1ActionPerformed
        digitar("1");
    }//GEN-LAST:event_bnt1ActionPerformed

    private void bnt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnt2ActionPerformed
        digitar("2");
    }//GEN-LAST:event_bnt2ActionPerformed

    private void bnt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnt3ActionPerformed
        digitar("3");
    }//GEN-LAST:event_bnt3ActionPerformed

    private void bntClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntClearActionPerformed
        jTextVisor.setText("0");
    }//GEN-LAST:event_bntClearActionPerformed

    private void bnt4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnt4ActionPerformed
        digitar("4");
    }//GEN-LAST:event_bnt4ActionPerformed

    private void bnt5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnt5ActionPerformed
        digitar("5");
    }//GEN-LAST:event_bnt5ActionPerformed

    private void bnt6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnt6ActionPerformed
        digitar("6");
    }//GEN-LAST:event_bnt6ActionPerformed

    private void bnt7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnt7ActionPerformed
        digitar("7");
    }//GEN-LAST:event_bnt7ActionPerformed

    private void bnt8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnt8ActionPerformed
        digitar("8");
    }//GEN-LAST:event_bnt8ActionPerformed

    private void bnt9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnt9ActionPerformed
        digitar("9");
    }//GEN-LAST:event_bnt9ActionPerformed

    private void bntVirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntVirActionPerformed

    if(jTextVisor.getText().contains(".") == false){
        jTextVisor.setText(jTextVisor.getText() + ".");
    } 

    }//GEN-LAST:event_bntVirActionPerformed

    private void bntVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntVoltarActionPerformed
    //length informar qual número de caracteres

    if((jTextVisor.getText().length() == 1)){ 
         jTextVisor.setText("0");
    } else {
    jTextVisor.setText(jTextVisor.getText().substring(0, jTextVisor.getText().length()-1));
    }
    //substring = copiar e colar, comecar no 0 e pegar a ultima posição e tirar
    }//GEN-LAST:event_bntVoltarActionPerformed

    private void bnt0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnt0ActionPerformed
        digitar("0");
    }//GEN-LAST:event_bnt0ActionPerformed

    private void bntSomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntSomaActionPerformed
        NovoNum();
        operacao = "+";
    }//GEN-LAST:event_bntSomaActionPerformed

    private void bntIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntIgualActionPerformed
    num2 = Double.parseDouble(jTextVisor.getText());

    if (operacao == "+"){
        jTextVisor.setText(String.valueOf(num1 + num2));
    } else if (operacao == "-"){
        jTextVisor.setText(String.valueOf(num1 - num2));
    } else if (operacao == "*"){
        jTextVisor.setText(String.valueOf(num1 * num2));
    } else if (operacao == "/"){
        jTextVisor.setText(String.valueOf(num1 / num2));
    }

    }//GEN-LAST:event_bntIgualActionPerformed

    private void bntMenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntMenosActionPerformed
        NovoNum();
        operacao = "-";
    }//GEN-LAST:event_bntMenosActionPerformed

    private void bntMultiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntMultiActionPerformed
        NovoNum();
        operacao = "*";
    }//GEN-LAST:event_bntMultiActionPerformed

    private void bntDividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntDividirActionPerformed
        NovoNum();
        operacao = "/";
    }//GEN-LAST:event_bntDividirActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Caculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Caculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Caculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Caculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Caculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bnt0;
    private javax.swing.JButton bnt1;
    private javax.swing.JButton bnt2;
    private javax.swing.JButton bnt3;
    private javax.swing.JButton bnt4;
    private javax.swing.JButton bnt5;
    private javax.swing.JButton bnt6;
    private javax.swing.JButton bnt7;
    private javax.swing.JButton bnt8;
    private javax.swing.JButton bnt9;
    private javax.swing.JButton bntClear;
    private javax.swing.JButton bntDividir;
    private javax.swing.JButton bntIgual;
    private javax.swing.JButton bntMenos;
    private javax.swing.JButton bntMulti;
    private javax.swing.JButton bntSoma;
    private javax.swing.JButton bntVir;
    private javax.swing.JButton bntVoltar;
    private javax.swing.JTextField jTextVisor;
    // End of variables declaration//GEN-END:variables
}

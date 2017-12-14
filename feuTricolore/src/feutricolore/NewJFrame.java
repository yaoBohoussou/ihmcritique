/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feutricolore;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

/**
 *
 * @author ybohouss
 */
public class NewJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
        initComponents();
        ampouleO.setColor(Color.ORANGE);
        ampouleV.setColor(Color.GREEN);
        ampouleR.setColor(Color.RED);
        
        stop.setEnabled(false);
        error.setEnabled(false);

        ActionListener taskPerformer = new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                count++;
                
                switch (etat) 
                {
                    case Eteint:
                        manageFeu(0);
                        count = 0;
                        break;
                    case Rouge :
                        if (count ==4)
                        {
                            manageFeu(3); //3 passe le vert à on et le reste à off
                            count = 0;
                        }
                        break;
                    case Orange:
                        if (count ==3)
                        {
                            manageFeu(1); //1 passe le rouge à on et le reste à off
                            count = 0;
                        }
                        break;
                    case Vert:
                        if (count ==6)
                        {
                            manageFeu(2); //2 passe l'orange à on et le reste à off
                            count = 0;
                        }
                        break;
                    case ErreurOrangeOn :
                        if (count ==1)
                        {
                            manageFeu(4); //4 passe l'orange à off et le reste demeure à off
                            count = 0;
                        }
                        break;
                    case ErreurOrangeOff:
                        if (count ==2)
                        {
                            manageFeu(5); 
                            count = 0;
                        }
                        break;
                }
                
            }
        };
        
        timerTick = new Timer(delay, taskPerformer);
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ampouleR = new m1.info.example.Ampoule();
        ampouleO = new m1.info.example.Ampoule();
        ampouleV = new m1.info.example.Ampoule();
        start = new javax.swing.JButton();
        error = new javax.swing.JButton();
        stop = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout ampouleRLayout = new javax.swing.GroupLayout(ampouleR);
        ampouleR.setLayout(ampouleRLayout);
        ampouleRLayout.setHorizontalGroup(
            ampouleRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        ampouleRLayout.setVerticalGroup(
            ampouleRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout ampouleOLayout = new javax.swing.GroupLayout(ampouleO);
        ampouleO.setLayout(ampouleOLayout);
        ampouleOLayout.setHorizontalGroup(
            ampouleOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        ampouleOLayout.setVerticalGroup(
            ampouleOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout ampouleVLayout = new javax.swing.GroupLayout(ampouleV);
        ampouleV.setLayout(ampouleVLayout);
        ampouleVLayout.setHorizontalGroup(
            ampouleVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        ampouleVLayout.setVerticalGroup(
            ampouleVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        start.setText("START");
        start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startActionPerformed(evt);
            }
        });

        error.setText("ERROR");
        error.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                errorActionPerformed(evt);
            }
        });

        stop.setText("STOP");
        stop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stopActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ampouleV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ampouleO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ampouleR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 116, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(stop)
                    .addComponent(error)
                    .addComponent(start))
                .addGap(57, 57, 57))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(ampouleR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(start)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ampouleO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(stop)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ampouleV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(error)))
                .addContainerGap(87, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void errorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_errorActionPerformed
        // TODO add your handling code here:
        //etat = EtatFeu.ErreurOrangeOn;
        manageFeu(5);
        count = 0;
        start.setEnabled(true);
        error.setEnabled(false);
        stop.setEnabled(true);
    }//GEN-LAST:event_errorActionPerformed

    private void stopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stopActionPerformed
        // TODO add your handling code here:
        //etat = EtatFeu.Eteint;
        manageFeu(0);
        count = 0;
        timerTick.stop();
        error.setEnabled(false);
        stop.setEnabled(false);
        start.setEnabled(true);
    }//GEN-LAST:event_stopActionPerformed

    private void startActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startActionPerformed
        // TODO add your handling code here:
        //etat = EtatFeu.Rouge;
        ampouleR.turnON();
        count = 0;
        manageFeu(1);
        timerTick.start();
        start.setEnabled(false);
        error.setEnabled(true);
        stop.setEnabled(true);
    }//GEN-LAST:event_startActionPerformed

    
    public void manageFeu(int cmd)
    {
        if(cmd==0)
        {
            ampouleR.turnOFF();
            ampouleO.turnOFF();
            ampouleV.turnOFF();
            etat = EtatFeu.Eteint;
        }
        if(cmd==1)
        {
            ampouleR.turnON();
            ampouleO.turnOFF();
            ampouleV.turnOFF();
            etat = EtatFeu.Rouge;
        }
        else if(cmd==2)
        {
            ampouleR.turnOFF();
            ampouleO.turnON();
            ampouleV.turnOFF();
            etat = EtatFeu.Orange;
        }
        else if(cmd==3)
        {
            ampouleR.turnOFF();
            ampouleO.turnOFF();
            ampouleV.turnON();
            etat = EtatFeu.Vert;
        }
        else if(cmd==4)
        {
            ampouleR.turnOFF();
            ampouleO.turnOFF();
            ampouleV.turnOFF();
            etat = EtatFeu.ErreurOrangeOff;
        }
        else if(cmd==5)
        {
            ampouleR.turnOFF();
            ampouleO.turnON();
            ampouleV.turnOFF();
            etat = EtatFeu.ErreurOrangeOn;
        }
    }
    
    
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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private m1.info.example.Ampoule ampouleO;
    private m1.info.example.Ampoule ampouleR;
    private m1.info.example.Ampoule ampouleV;
    private javax.swing.JButton error;
    private javax.swing.JButton start;
    private javax.swing.JButton stop;
    // End of variables declaration//GEN-END:variables

    private Timer timerTick;
    private int count = 0;
    private int delay = 500;
    private EtatFeu etat = EtatFeu.Eteint;

}

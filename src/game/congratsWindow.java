/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

/**
 *
 * @author engeer
 */
public class congratsWindow extends javax.swing.JFrame {
    JPanel jPanel;
    JTabbedPane jTabbedPane1;
    int index = 100;
    /**
     * Creates new form congratsWindow
     */
    public congratsWindow() {
        initComponents();
    }
    public congratsWindow(JPanel jPanel,JTabbedPane jTabbedPane1) {
        initComponents();
        this.jPanel = jPanel;
        this.jTabbedPane1 = jTabbedPane1;
        jButtonContinue.setVisible(false);
        
        Timer timer =new Timer();
        timer.schedule(new TimerTask(){ // Timer to para mag show ng saglet ung second card
                
                @Override
                public void run(){
                    jButtonContinue.setVisible(true);
                    
                }
            },1000);
        
    }
    
    public congratsWindow(int index,JTabbedPane jTabbedPane1) {
        initComponents();
        this.index = index;
        this.jTabbedPane1 = jTabbedPane1;
        jButtonContinue.setVisible(false);
        
        Timer timer =new Timer();
        timer.schedule(new TimerTask(){ // Timer to para mag show ng saglet ung second card
                
                @Override
                public void run(){
                    jButtonContinue.setVisible(true);
                    
                }
            },1000);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonContinue = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setAlwaysOnTop(true);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMaximumSize(new java.awt.Dimension(400, 300));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonContinue.setText("Continue");
        jButtonContinue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonContinueActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonContinue, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/promptWindow.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonContinueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonContinueActionPerformed
        // TODO add your handling code here:
        
        
        if (index == 100){
            jTabbedPane1.setSelectedComponent(jPanel);
        }else{
            jTabbedPane1.setSelectedIndex(index);
            index=100;
        }
        dispose();
        
    }//GEN-LAST:event_jButtonContinueActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonContinue;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import java.io.File;
import java.util.Timer;
import java.util.TimerTask;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

/**
 *
 * @author engeer
 */
public class o_gamePanel6 extends javax.swing.JPanel {
    File correctFile = new File ("./src/resources/correct.wav");
    AudioInputStream correctStream;
    Clip correctClip; 
            
    JPanel timerPanel,difficultyPanel,startPanel;
    
    JLabel secOnesDigit,secTensDigit,sec100sDigit;
    JTabbedPane jTabbedPane1; 
    JButton playButton;
    
    
    defaultValues DV = new defaultValues();
    Timer timer2 =new Timer();
    
    boolean restartLevelWatcher = false;
    private int clickCounter=1;//--
    boolean firstClick=true,notDone=false,notDone2=false; 
    int j,i,x,y, b, sumAS;
    int x1 = 50,x2 = 50,y1 = 50,y2 = 50;
    
    int secNorma1_3 = 60;
    int secHard_3 = 40;
    int cardInstances2 = 12;
    
    public int[][] cardArrayH2 = new int[4][6];  //HERE
//    public int[][] cardArrayS2 = new int[4][4];
    public int[][] cardArrayS2 ={ { 1, 1,1, 1 , 1, 1}, { 1, 1, 1, 1, 1, 1}, { 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1}}; //HERE
    /**
     * Creates new form o_gamePanel4
     */
    public o_gamePanel6() {
        initComponents();
    }
    public o_gamePanel6(JPanel timerPanel,JLabel secTensDigit, JLabel secOnesDigit,
            JTabbedPane jTabbedPane1, JPanel difficultyPanel, JButton playButton,
            JPanel startPanel,JLabel sec100sDigit) {
        initComponents();
        this.timerPanel = timerPanel;
        this.secTensDigit = secTensDigit;
        this.secOnesDigit = secOnesDigit;
        this.jTabbedPane1 = jTabbedPane1;
        this.difficultyPanel = difficultyPanel;
        this.playButton = playButton;
        this.startPanel = startPanel;
       this.sec100sDigit =sec100sDigit;
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonMedium00 = new javax.swing.JButton();
        jButtonMedium01 = new javax.swing.JButton();
        jButtonMedium02 = new javax.swing.JButton();
        jButtonMedium03 = new javax.swing.JButton();
        jButtonMedium04 = new javax.swing.JButton();
        jButtonMedium14 = new javax.swing.JButton();
        jButtonMedium13 = new javax.swing.JButton();
        jButtonMedium12 = new javax.swing.JButton();
        jButtonMedium11 = new javax.swing.JButton();
        jButtonMedium10 = new javax.swing.JButton();
        jButtonMedium20 = new javax.swing.JButton();
        jButtonMedium21 = new javax.swing.JButton();
        jButtonMedium22 = new javax.swing.JButton();
        jButtonMedium23 = new javax.swing.JButton();
        jButtonMedium24 = new javax.swing.JButton();
        jButtonMedium30 = new javax.swing.JButton();
        jButtonMedium31 = new javax.swing.JButton();
        jButtonMedium32 = new javax.swing.JButton();
        jButtonMedium33 = new javax.swing.JButton();
        jButtonMedium34 = new javax.swing.JButton();
        jButtonMedium35 = new javax.swing.JButton();
        jButtonMedium25 = new javax.swing.JButton();
        jButtonMedium05 = new javax.swing.JButton();
        jButtonMedium15 = new javax.swing.JButton();

        setBackground(new java.awt.Color(153, 153, 255));
        setMaximumSize(new java.awt.Dimension(693, 623));
        setMinimumSize(new java.awt.Dimension(693, 623));
        setPreferredSize(new java.awt.Dimension(693, 623));

        jButtonMedium00.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/@back.jpg"))); // NOI18N
        jButtonMedium00.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButtonMedium00.setMaximumSize(new java.awt.Dimension(100, 100));
        jButtonMedium00.setMinimumSize(new java.awt.Dimension(100, 100));
        jButtonMedium00.setPreferredSize(new java.awt.Dimension(100, 100));
        jButtonMedium00.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMedium00ActionPerformed(evt);
            }
        });

        jButtonMedium01.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/@back.jpg"))); // NOI18N
        jButtonMedium01.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButtonMedium01.setMaximumSize(new java.awt.Dimension(100, 100));
        jButtonMedium01.setMinimumSize(new java.awt.Dimension(100, 100));
        jButtonMedium01.setPreferredSize(new java.awt.Dimension(100, 100));
        jButtonMedium01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMedium01ActionPerformed(evt);
            }
        });

        jButtonMedium02.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/@back.jpg"))); // NOI18N
        jButtonMedium02.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButtonMedium02.setMaximumSize(new java.awt.Dimension(100, 100));
        jButtonMedium02.setMinimumSize(new java.awt.Dimension(100, 100));
        jButtonMedium02.setPreferredSize(new java.awt.Dimension(100, 100));
        jButtonMedium02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMedium02ActionPerformed(evt);
            }
        });

        jButtonMedium03.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/@back.jpg"))); // NOI18N
        jButtonMedium03.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButtonMedium03.setMaximumSize(new java.awt.Dimension(100, 100));
        jButtonMedium03.setMinimumSize(new java.awt.Dimension(100, 100));
        jButtonMedium03.setPreferredSize(new java.awt.Dimension(100, 100));
        jButtonMedium03.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMedium03ActionPerformed(evt);
            }
        });

        jButtonMedium04.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/@back.jpg"))); // NOI18N
        jButtonMedium04.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButtonMedium04.setMaximumSize(new java.awt.Dimension(100, 100));
        jButtonMedium04.setMinimumSize(new java.awt.Dimension(100, 100));
        jButtonMedium04.setPreferredSize(new java.awt.Dimension(100, 100));
        jButtonMedium04.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMedium04ActionPerformed(evt);
            }
        });

        jButtonMedium14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/@back.jpg"))); // NOI18N
        jButtonMedium14.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButtonMedium14.setMaximumSize(new java.awt.Dimension(100, 100));
        jButtonMedium14.setMinimumSize(new java.awt.Dimension(100, 100));
        jButtonMedium14.setPreferredSize(new java.awt.Dimension(100, 100));
        jButtonMedium14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMedium14ActionPerformed(evt);
            }
        });

        jButtonMedium13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/@back.jpg"))); // NOI18N
        jButtonMedium13.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButtonMedium13.setMaximumSize(new java.awt.Dimension(100, 100));
        jButtonMedium13.setMinimumSize(new java.awt.Dimension(100, 100));
        jButtonMedium13.setPreferredSize(new java.awt.Dimension(100, 100));
        jButtonMedium13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMedium13ActionPerformed(evt);
            }
        });

        jButtonMedium12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/@back.jpg"))); // NOI18N
        jButtonMedium12.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButtonMedium12.setMaximumSize(new java.awt.Dimension(100, 100));
        jButtonMedium12.setMinimumSize(new java.awt.Dimension(100, 100));
        jButtonMedium12.setPreferredSize(new java.awt.Dimension(100, 100));
        jButtonMedium12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMedium12ActionPerformed(evt);
            }
        });

        jButtonMedium11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/@back.jpg"))); // NOI18N
        jButtonMedium11.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButtonMedium11.setMaximumSize(new java.awt.Dimension(100, 100));
        jButtonMedium11.setMinimumSize(new java.awt.Dimension(100, 100));
        jButtonMedium11.setPreferredSize(new java.awt.Dimension(100, 100));
        jButtonMedium11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMedium11ActionPerformed(evt);
            }
        });

        jButtonMedium10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/@back.jpg"))); // NOI18N
        jButtonMedium10.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButtonMedium10.setMaximumSize(new java.awt.Dimension(100, 100));
        jButtonMedium10.setMinimumSize(new java.awt.Dimension(100, 100));
        jButtonMedium10.setPreferredSize(new java.awt.Dimension(100, 100));
        jButtonMedium10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMedium10ActionPerformed(evt);
            }
        });

        jButtonMedium20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/@back.jpg"))); // NOI18N
        jButtonMedium20.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButtonMedium20.setMaximumSize(new java.awt.Dimension(100, 100));
        jButtonMedium20.setMinimumSize(new java.awt.Dimension(100, 100));
        jButtonMedium20.setPreferredSize(new java.awt.Dimension(100, 100));
        jButtonMedium20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMedium20ActionPerformed(evt);
            }
        });

        jButtonMedium21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/@back.jpg"))); // NOI18N
        jButtonMedium21.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButtonMedium21.setMaximumSize(new java.awt.Dimension(100, 100));
        jButtonMedium21.setMinimumSize(new java.awt.Dimension(100, 100));
        jButtonMedium21.setPreferredSize(new java.awt.Dimension(100, 100));
        jButtonMedium21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMedium21ActionPerformed(evt);
            }
        });

        jButtonMedium22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/@back.jpg"))); // NOI18N
        jButtonMedium22.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButtonMedium22.setMaximumSize(new java.awt.Dimension(100, 100));
        jButtonMedium22.setMinimumSize(new java.awt.Dimension(100, 100));
        jButtonMedium22.setPreferredSize(new java.awt.Dimension(100, 100));
        jButtonMedium22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMedium22ActionPerformed(evt);
            }
        });

        jButtonMedium23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/@back.jpg"))); // NOI18N
        jButtonMedium23.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButtonMedium23.setMaximumSize(new java.awt.Dimension(100, 100));
        jButtonMedium23.setMinimumSize(new java.awt.Dimension(100, 100));
        jButtonMedium23.setPreferredSize(new java.awt.Dimension(100, 100));
        jButtonMedium23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMedium23ActionPerformed(evt);
            }
        });

        jButtonMedium24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/@back.jpg"))); // NOI18N
        jButtonMedium24.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButtonMedium24.setMaximumSize(new java.awt.Dimension(100, 100));
        jButtonMedium24.setMinimumSize(new java.awt.Dimension(100, 100));
        jButtonMedium24.setPreferredSize(new java.awt.Dimension(100, 100));
        jButtonMedium24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMedium24ActionPerformed(evt);
            }
        });

        jButtonMedium30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/@back.jpg"))); // NOI18N
        jButtonMedium30.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButtonMedium30.setMaximumSize(new java.awt.Dimension(100, 100));
        jButtonMedium30.setMinimumSize(new java.awt.Dimension(100, 100));
        jButtonMedium30.setPreferredSize(new java.awt.Dimension(100, 100));
        jButtonMedium30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMedium30ActionPerformed(evt);
            }
        });

        jButtonMedium31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/@back.jpg"))); // NOI18N
        jButtonMedium31.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButtonMedium31.setMaximumSize(new java.awt.Dimension(100, 100));
        jButtonMedium31.setMinimumSize(new java.awt.Dimension(100, 100));
        jButtonMedium31.setPreferredSize(new java.awt.Dimension(100, 100));
        jButtonMedium31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMedium31ActionPerformed(evt);
            }
        });

        jButtonMedium32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/@back.jpg"))); // NOI18N
        jButtonMedium32.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButtonMedium32.setMaximumSize(new java.awt.Dimension(100, 100));
        jButtonMedium32.setMinimumSize(new java.awt.Dimension(100, 100));
        jButtonMedium32.setPreferredSize(new java.awt.Dimension(100, 100));
        jButtonMedium32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMedium32ActionPerformed(evt);
            }
        });

        jButtonMedium33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/@back.jpg"))); // NOI18N
        jButtonMedium33.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButtonMedium33.setMaximumSize(new java.awt.Dimension(100, 100));
        jButtonMedium33.setMinimumSize(new java.awt.Dimension(100, 100));
        jButtonMedium33.setPreferredSize(new java.awt.Dimension(100, 100));
        jButtonMedium33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMedium33ActionPerformed(evt);
            }
        });

        jButtonMedium34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/@back.jpg"))); // NOI18N
        jButtonMedium34.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButtonMedium34.setMaximumSize(new java.awt.Dimension(100, 100));
        jButtonMedium34.setMinimumSize(new java.awt.Dimension(100, 100));
        jButtonMedium34.setPreferredSize(new java.awt.Dimension(100, 100));
        jButtonMedium34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMedium34ActionPerformed(evt);
            }
        });

        jButtonMedium35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/@back.jpg"))); // NOI18N
        jButtonMedium35.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButtonMedium35.setMaximumSize(new java.awt.Dimension(100, 100));
        jButtonMedium35.setMinimumSize(new java.awt.Dimension(100, 100));
        jButtonMedium35.setPreferredSize(new java.awt.Dimension(100, 100));
        jButtonMedium35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMedium35ActionPerformed(evt);
            }
        });

        jButtonMedium25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/@back.jpg"))); // NOI18N
        jButtonMedium25.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButtonMedium25.setMaximumSize(new java.awt.Dimension(100, 100));
        jButtonMedium25.setMinimumSize(new java.awt.Dimension(100, 100));
        jButtonMedium25.setPreferredSize(new java.awt.Dimension(100, 100));
        jButtonMedium25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMedium25ActionPerformed(evt);
            }
        });

        jButtonMedium05.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/@back.jpg"))); // NOI18N
        jButtonMedium05.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButtonMedium05.setMaximumSize(new java.awt.Dimension(100, 100));
        jButtonMedium05.setMinimumSize(new java.awt.Dimension(100, 100));
        jButtonMedium05.setPreferredSize(new java.awt.Dimension(100, 100));
        jButtonMedium05.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMedium05ActionPerformed(evt);
            }
        });

        jButtonMedium15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/@back.jpg"))); // NOI18N
        jButtonMedium15.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButtonMedium15.setMaximumSize(new java.awt.Dimension(100, 100));
        jButtonMedium15.setMinimumSize(new java.awt.Dimension(100, 100));
        jButtonMedium15.setPreferredSize(new java.awt.Dimension(100, 100));
        jButtonMedium15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMedium15ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jButtonMedium00, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButtonMedium01, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButtonMedium02, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButtonMedium03, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButtonMedium04, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jButtonMedium10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButtonMedium11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButtonMedium12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButtonMedium13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButtonMedium14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonMedium30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonMedium31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonMedium32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonMedium33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonMedium34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonMedium20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonMedium21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonMedium22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonMedium23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonMedium24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonMedium05, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonMedium15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonMedium35, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonMedium25, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonMedium05, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonMedium15, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonMedium25, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonMedium35, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButtonMedium01, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonMedium00, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonMedium02, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonMedium03, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonMedium04, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButtonMedium13, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonMedium12, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonMedium10, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonMedium11, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonMedium14, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonMedium21, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonMedium20, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonMedium22, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonMedium23, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonMedium24, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonMedium31, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonMedium30, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonMedium32, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonMedium33, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonMedium34, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(104, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    public void firstClickRandomizer2(){
        //stop sound game bgm mysterious
        //input sound game bgm exiting
        for (i=0;i<=cardInstances2;i++){
                for(;;){                                    //first coordinate
                    x=(int)(Math.random()*4); // ------- //HERE
                    y=(int)(Math.random()*6);  // ------- //HERE
                    
                   if(cardArrayH2[x][y]==0){
                       cardArrayH2[x][y]=i;
//                       System.out.println(x+ " "+ y);
                       break;
                   }
                }
                    for(;;){                                    //2nd coordinate but same value
                        x=(int)(Math.random()*4);  // -------
                        y=(int)(Math.random()*6); // -------
//                        System.out.println(x);
//                        System.out.println(y);
                       if(cardArrayH2[x][y]==0){
                           cardArrayH2[x][y]=i;
                           break;
                       }
                    }
            }
        for(i=0;i<4;i++){  // -------
            for(j=0;j<6;j++){  // -------
                System.out.print(cardArrayH2[i][j]+"  ");
                }
            System.out.println("  ");
            }
         System.out.println("  ");
         //Not square matrix
//         for(i = 0; i<4; i++){  // -------
//            for(j = 0; j<4; j++){  // -------
//                cardArrayS2 [i][j]=1;
//                System.out.print(cardArrayS2[i][j]+" ");
//                }
//            System.out.println();
//        }
        
        for (int[] eachRow : cardArrayS2) {
                        for (int j : eachRow) {
                                
                                System.out.print(j + "\t");
                        }
                        System.out.println("");
                        
                }
        secNorma1_3 = DV.getDsecNorma1_6(); // ------- //HERE
        secHard_3 = DV.getDsecHard_6(); // ------- //HERE
        try{
        timer2.scheduleAtFixedRate(task2, 1000,1000); }
        catch(Exception e){
            
        } 
   
    }
    public void ArrayHCompare2(){
        try{
        if(cardArrayH2[x2][y2]==cardArrayH2[x1][y1]){// compares 2 user inputed coord.
               //System.out.println("well done");
               cardArrayS2[x2][y2]=0;
               cardArrayS2[x1][y1]=0;
               //input sound correct
               try{
               this.correctStream = AudioSystem.getAudioInputStream(correctFile);
                this.correctClip= AudioSystem.getClip();
                correctClip.open(correctStream);
                correctClip.start();}
               catch(Exception E){
                   
               }
           } else{
               //input sound wrong
           }
        }catch(Exception e){
            System.out.println("error "+ e);
        }
            
            timer2.schedule(new TimerTask(){ // Timer to para mag show ng saglet ung second card
                
                @Override
                public void run(){
                    imageClear2();
                    notDone=false;
                    notDone2=false;
                }
            },500); 
            
    }
    public void sumArrayS2(){ //checks the array value to know how many left to pair and if the game ends
        sumAS=0;
        for (int[] eachRow : cardArrayS2) {
                        for (int j : eachRow) {
                                sumAS+=j;
                        }
                }
         System.out.println("Cards to match: "+ sumAS);
         if(sumAS==0){
            imageClear2();
//            System.out.println("Congrats! Game Completed");
//input sound congratulations
            firstClick = true;
            java.awt.EventQueue.invokeLater(new Runnable() {
                    public void run() {
                        new congratsWindow(6,13,jTabbedPane1).setVisible(true); //-------- //HERE
                        //jPanelStory_6
                    } 
                });

            task2.cancel(); // stop timer //--------
            setTimerImage(0, 0);
            }
         
    }
    public void resetGame1(){
        setTimerImage(0,0);
        cardArrayH2 = new int[4][6]; // ------- //HERE
//        this.cardArrayS1 = { { 1, 1 }, { 1, 1}, { 1, 1 } }
//          RESETING THE Solution Array
//        resetCardArrayS2();
 // ------
        firstClick=true;
        notDone=false;
        notDone2=false; 
        clickCounter=1;
        x1 = 50;x2 = 50;y1 = 50;y2 = 50;
//        for(i = 0; i<cardInstances; i++){ // resetting summaryArray
//            for(j = 0; j<cardInstances; j++){
//                cardArrayS [i][j]=1;
//            }
//        }
    }
    
    TimerTask task2 = new TimerTask(){ // timer ng oras
        public void run(){
            
            currentSettings cSettings = currentSettings.getInstance();
            int diff = cSettings.getDifficulty();
            switch (diff) {
                case 2:// Normal
                    {
                        
                        timerPanel.setVisible(true);
                        int ones = secNorma1_3% 10;
                        int tens = secNorma1_3 /10;
                        int huns  = secNorma1_3/100;
                        if (huns ==1 ){
                            sec100sDigit.setVisible(true);
                            sec100sDigit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/timer1.png")));
                        }else{ 
                            sec100sDigit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/timer0.png")));
                            sec100sDigit.setVisible(false);
                        }
                        if (restartLevelWatcher){
                            setTimerImage(0, 0);
                        }else{
                            setTimerImage(ones, tens);
                        }       // Out of time Scenario Restarting Level
                        if(secNorma1_3==0){
                            resetGame2();
                            imageClear2();
                            levelFailedWindow();
                        }       secNorma1_3 --;
                        break;
                    }
                case 3://Hard
                    {
                        
                        timerPanel.setVisible(true);
                        int ones = secHard_3% 10;
                        int tens = secHard_3 /10;
                        setTimerImage(ones, tens);
                        // Out of time Scenario Restarting Level
                        if(secHard_3==0){
                            resetGame2();
                            imageClear2();
                            levelFailedWindow();
                        }       secHard_3 --;
                        break;
                    }
                default:
                    timerPanel.setVisible(false);
                    break;
            }
        }
};
    public void imageClear2(){

        switch(cardArrayS2[0][0]){
            case 1:
                jButtonMedium00.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/@back.jpg")));
                break;
            case 0:
                jButtonMedium00.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/@solve.jpg")));
                break;      
        }
        switch(cardArrayS2[0][1]){
            case 1:
                jButtonMedium01.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/@back.jpg")));
                break;
            case 0:
                jButtonMedium01.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/@solve.jpg")));
                break;      
        }
        
      
        switch(cardArrayS2[1][0]){
            case 1:
                jButtonMedium10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/@back.jpg")));
                break;
            case 0:
                jButtonMedium10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/@solve.jpg")));
                break;     
        }
        switch(cardArrayS2[1][1]){
            case 1:
                jButtonMedium11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/@back.jpg")));
                break;
            case 0:
                jButtonMedium11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/@solve.jpg")));
                break;     
        }
        switch(cardArrayS2[2][0]){
            case 1:
                jButtonMedium20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/@back.jpg")));
                break;
            case 0:
                jButtonMedium20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/@solve.jpg")));
                break;     
        }
        switch(cardArrayS2[2][1]){
            case 1:
                jButtonMedium21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/@back.jpg")));
                break;
            case 0:
                jButtonMedium21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/@solve.jpg")));
                break;     
        }
            switch(cardArrayS2[0][2]){
            case 1:
                jButtonMedium02.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/@back.jpg")));
                break;
            case 0:
                jButtonMedium02.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/@solve.jpg")));
                break;      
        }
        switch(cardArrayS2[0][3]){
            case 1:
                jButtonMedium03.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/@back.jpg")));
                break;
            case 0:
                jButtonMedium03.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/@solve.jpg")));
                break;      
        }
        switch(cardArrayS2[1][2]){
            case 1:
                jButtonMedium12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/@back.jpg")));
                break;
            case 0:
                jButtonMedium12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/@solve.jpg")));
                break;     
        }
        switch(cardArrayS2[1][3]){
            case 1:
                jButtonMedium13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/@back.jpg")));
                break;
            case 0:
                jButtonMedium13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/@solve.jpg")));
                break;     
        }
        switch(cardArrayS2[2][2]){
            case 1:
                jButtonMedium22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/@back.jpg")));
                break;
            case 0:
                jButtonMedium22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/@solve.jpg")));
                break;     
        }
        switch(cardArrayS2[2][3]){
            case 1:
                jButtonMedium23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/@back.jpg")));
                break;
            case 0:
                jButtonMedium23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/@solve.jpg")));
                break;     
        }
        switch(cardArrayS2[3][0]){
            case 1:
                jButtonMedium30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/@back.jpg")));
                break;
            case 0:
                jButtonMedium30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/@solve.jpg")));
                break;      
        }
        switch(cardArrayS2[3][1]){
            case 1:
                jButtonMedium31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/@back.jpg")));
                break;
            case 0:
                jButtonMedium31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/@solve.jpg")));
                break;      
        }
        switch(cardArrayS2[3][2]){
            case 1:
                jButtonMedium32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/@back.jpg")));
                break;
            case 0:
                jButtonMedium32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/@solve.jpg")));
                break;      
        }
        switch(cardArrayS2[3][3]){
            case 1:
                jButtonMedium33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/@back.jpg")));
                break;
            case 0:
                jButtonMedium33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/@solve.jpg")));
                break;      
        }
        switch(cardArrayS2[0][4]){
            case 1:
                jButtonMedium04.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/@back.jpg")));
                break;
            case 0:
                jButtonMedium04.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/@solve.jpg")));
                break;      
        }
        switch(cardArrayS2[1][4]){
            case 1:
                jButtonMedium14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/@back.jpg")));
                break;
            case 0:
                jButtonMedium14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/@solve.jpg")));
                break;      
        }
        switch(cardArrayS2[2][4]){
            case 1:
                jButtonMedium24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/@back.jpg")));
                break;
            case 0:
                jButtonMedium24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/@solve.jpg")));
                break;      
        }
        switch(cardArrayS2[3][4]){
            case 1:
                jButtonMedium34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/@back.jpg")));
                break;
            case 0:
                jButtonMedium34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/@solve.jpg")));
                break;      
        }
        switch(cardArrayS2[0][5]){
            case 1:
                jButtonMedium05.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/@back.jpg")));
                break;
            case 0:
                jButtonMedium05.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/@solve.jpg")));
                break;      
        }
        switch(cardArrayS2[1][5]){
            case 1:
                jButtonMedium15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/@back.jpg")));
                break;
            case 0:
                jButtonMedium15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/@solve.jpg")));
                break;      
        }
        switch(cardArrayS2[2][5]){
            case 1:
                jButtonMedium25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/@back.jpg")));
                break;
            case 0:
                jButtonMedium25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/@solve.jpg")));
                break;      
        }
        switch(cardArrayS2[3][5]){
            case 1:
                jButtonMedium35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/@back.jpg")));
                break;
            case 0:
                jButtonMedium35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/@solve.jpg")));
                break;      
        }
    } 
    public void resetGame2(){ // Not Used
        setTimerImage(0,0);
        cardArrayH2 = new int[4][6]; // -------
//          RESETING THE Solution Array
//        cardArrayS2 = new int[4][4];
        resetCardArrayS2();
 // ------
        firstClick=true;
        notDone=false;
        notDone2=false; 
        clickCounter=1;
        x1 = 50;x2 = 50;y1 = 50;y2 = 50;
//        for(i = 0; i<cardInstances; i++){ // resetting summaryArray
//            for(j = 0; j<cardInstances; j++){
//                cardArrayS [i][j]=1;
//            }
//        }
    }
    public void resetCardArrayS2(){
        for(int i=0; i<cardArrayS2.length; i++) {//-------
                    for(int j=0; j<cardArrayS2[i].length; j++) {//-------
        //                System.out.println(i +" "+ j);
                        cardArrayS2[i][j]=1;   //-------

                    }
        }
    }
    
    public void setTimerImage(int ones , int tens ){
        switch (ones){
            case 0:
                secOnesDigit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/timer0.png")));
                break;
            case 1:
                secOnesDigit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/timer1.png")));
                break;
            case 2:
                secOnesDigit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/timer2.png")));
                break;
            case 3:
                secOnesDigit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/timer3.png")));
                break;
            case 4:
                secOnesDigit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/timer4.png")));
                break;
            case 5:
                secOnesDigit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/timer5.png")));
                break;
            case 6:
                secOnesDigit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/timer6.png")));
                break;
            case 7:
                secOnesDigit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/timer7.png")));
                break;
            case 8:
                secOnesDigit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/timer8.png")));
                break;
            case 9:
                secOnesDigit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/timer9.png")));
                break;
        }
        switch (tens){
            case 0:
                secTensDigit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/timer0.png")));
                break;
            case 1:
                secTensDigit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/timer1.png")));
                break;
            case 2:
                secTensDigit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/timer2.png")));
                break;
            case 3:
                secTensDigit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/timer3.png")));
                break;
            case 4:
                secTensDigit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/timer4.png")));
                break;
            case 5:
                secTensDigit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/timer5.png")));
                break;
            case 6:
                secTensDigit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/timer6.png")));
                break;
            case 7:
                secTensDigit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/timer7.png")));
                break;
            case 8:
                secTensDigit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/timer8.png")));
                break;
            case 9:
                secTensDigit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/timer9.png")));
                break;
                case 10:
                secTensDigit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/timer0.png")));
                break;
                case 11:
                secTensDigit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/timer1.png")));
                break;
                case 12:
                secTensDigit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/timer2.png")));
                break;
                case 13:
                secTensDigit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/timer3.png")));
                break;
                case 14:
                secTensDigit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/timer4.png")));
                break;
                case 15:
                secTensDigit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/timer5.png")));
                break;
                case 16:
                secTensDigit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/timer5.png")));
                break;
        }
        
    }
    
//    public void resetCardArrayS2(){ // Not Used
//        for (int[] cardArrayS11 : cardArrayS2) {
//            for (int[] cardArrayS12 : cardArrayS2) {
////                cardArrayS2[row][col] = 1;
//            }
//        }
//    }    //not used dahil pantay
    public void levelFailedWindow(){
        java.awt.EventQueue.invokeLater(new Runnable() {// prompt to restart or quit
                        public void run() {
                            new levelFailedWindow(jTabbedPane1,difficultyPanel,playButton, startPanel).setVisible(true);
                        }
                    });
    }
    public void buttonImageGiver(JButton a , int b){
        switch(b){
            case 1:
//                
                a.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/01.jpg")));
                break;
            case 2:
//                
                a.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/02.jpg")));
                break;
            case 3:
//                
                a.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/03.jpg")));
                break;
            case 4:
//                
                a.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/04.jpg")));
                break;
            case 5:
//                
                a.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/05.jpg")));
                break;
            case 6:
//                
                a.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/06.jpg")));
                break;
            case 7:
//                
                a.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/07.jpg")));
                break;
            case 8:
//                
                a.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/08.jpg")));
                break;
            case 9:
//                
                a.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/09.jpg")));
                break;
            case 10:
//                
                a.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10.jpg")));
                break;
            case 11:
//                
                a.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/11.jpg")));
                break;
            case 12:
//                
                a.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/12.jpg")));
                break;
        }
    }
    
    private void jButtonMedium00ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMedium00ActionPerformed
        // TODO add your handling code here:
        if(firstClick){

            firstClickRandomizer2();
            firstClick = false;
        }
        if(cardArrayS2[0][0]==0 ){                 //***
            System.out.println("this card is already done"); // error counting ?
        }else if(x1==0 && y1==0){                 //***
            System.out.println("this is your 1st choice pick another card"); // error counting ?
        }else if(notDone==true && notDone2==true){                           //prevent actions while pairing
            System.out.println("di pa tpos mag compute sandali naman");
        }else if(clickCounter==1){
            notDone= true;
            clickCounter=2;

            b =cardArrayH2[0][0];     //***
            buttonImageGiver(jButtonMedium00, b);//***
            x1=0;                                 //***
            y1=0;                                 //***
            System.out.println("1st choice");
        }else{

            notDone2= true;

            b =cardArrayH2[0][0];     //***
            buttonImageGiver(jButtonMedium00, b);//***
            x2=0;                                 //***
            y2=0;                                 //***
            System.out.println("2nd choice");

            ArrayHCompare2();
            sumArrayS2();
            clickCounter=1;
        }

    }//GEN-LAST:event_jButtonMedium00ActionPerformed

    private void jButtonMedium01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMedium01ActionPerformed
        // TODO add your handling code here:

        if(firstClick){

            firstClickRandomizer2();

            //System.out.println("check check22");
            firstClick = false;
        }
        if(cardArrayS2[0][1]==0 ){                 //***
            System.out.println("this card is already done"); // error counting ?
        }else if(x1==0 && y1==1){                 //***
            System.out.println("this is your 1st choice pick another card"); // error counting ?
        }else if(notDone==true && notDone2==true){                           //prevent actions while pairing
            System.out.println("di pa tpos mag compute sandali naman");
        }else if(clickCounter==1){
            notDone= true;
            clickCounter=2;

            b =cardArrayH2[0][1];     //***
            buttonImageGiver(jButtonMedium01, b);//***
            x1=0;                                 //***
            y1=1;                                 //***
            System.out.println("1st choice");
        }else{

            notDone2= true;

            b =cardArrayH2[0][1];     //***
            buttonImageGiver(jButtonMedium01, b);//***
            x2=0;                                 //***
            y2=1;                                 //***
            System.out.println("2nd choice");

            ArrayHCompare2();
            sumArrayS2();
            clickCounter=1;
        }

    }//GEN-LAST:event_jButtonMedium01ActionPerformed

    private void jButtonMedium02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMedium02ActionPerformed
        // TODO add your handling code here:
        if(firstClick){

            firstClickRandomizer2();

            //System.out.println("check check22");
            firstClick = false;
        }
        if(cardArrayS2[0][2]==0 ){                 //***
            System.out.println("this card is already done"); // error counting ?
        }else if(x1==0 && y1==2){                 //***
            System.out.println("this is your 1st choice pick another card"); // error counting ?
        }else if(notDone==true && notDone2==true){                           //prevent actions while pairing
            System.out.println("di pa tpos mag compute sandali naman");
        }else if(clickCounter==1){
            notDone= true;
            clickCounter=2;

            b =cardArrayH2[0][2];     //***
            buttonImageGiver(jButtonMedium02, b);//***
            x1=0;                                 //***
            y1=2;                                 //***
            System.out.println("1st choice");
        }else{

            notDone2= true;

            b =cardArrayH2[0][2];     //***
            buttonImageGiver(jButtonMedium02, b);//***
            x2=0;                                 //***
            y2=2;                                 //***
            System.out.println("2nd choice");

            ArrayHCompare2();
            sumArrayS2();
            clickCounter=1;
        }

    }//GEN-LAST:event_jButtonMedium02ActionPerformed

    private void jButtonMedium03ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMedium03ActionPerformed
        // TODO add your handling code here:

        if(firstClick){

            firstClickRandomizer2();

            //System.out.println("check check22");
            firstClick = false;
        }
        if(cardArrayS2[0][3]==0 ){                 //***
            System.out.println("this card is already done"); // error counting ?
        }else if(x1==0 && y1==3){                 //***
            System.out.println("this is your 1st choice pick another card"); // error counting ?
        }else if(notDone==true && notDone2==true){                           //prevent actions while pairing
            System.out.println("di pa tpos mag compute sandali naman");
        }else if(clickCounter==1){
            notDone= true;
            clickCounter=2;

            b =cardArrayH2[0][3];     //***
            buttonImageGiver(jButtonMedium03, b);//***
            x1=0;                                 //***
            y1=3;                                 //***
            System.out.println("1st choice");
        }else{

            notDone2= true;

            b =cardArrayH2[0][3];     //***
            buttonImageGiver(jButtonMedium03, b);//***
            x2=0;                                 //***
            y2=3;                                 //***
            System.out.println("2nd choice");

            ArrayHCompare2();
            sumArrayS2();
            clickCounter=1;
        }

    }//GEN-LAST:event_jButtonMedium03ActionPerformed

    private void jButtonMedium13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMedium13ActionPerformed
        // TODO add your handling code here:

        if(firstClick){

            firstClickRandomizer2();

            //System.out.println("check check22");
            firstClick = false;
        }
        if(cardArrayS2[1][3]==0 ){                 //***
            System.out.println("this card is already done"); // error counting ?
        }else if(x1==1 && y1==3){                 //***
            System.out.println("this is your 1st choice pick another card"); // error counting ?
        }else if(notDone==true && notDone2==true){                           //prevent actions while pairing
            System.out.println("di pa tpos mag compute sandali naman");
        }else if(clickCounter==1){
            notDone= true;
            clickCounter=2;

            b =cardArrayH2[1][3];     //***
            buttonImageGiver(jButtonMedium13, b);//***
            x1=1;                                 //***
            y1=3;                                 //***
            System.out.println("1st choice");
        }else{

            notDone2= true;

            b =cardArrayH2[1][3];     //***
            buttonImageGiver(jButtonMedium13, b);//***
            x2=1;                                 //***
            y2=3;                                 //***
            System.out.println("2nd choice");

            ArrayHCompare2();
            sumArrayS2();
            clickCounter=1;
        }

    }//GEN-LAST:event_jButtonMedium13ActionPerformed

    private void jButtonMedium12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMedium12ActionPerformed
        // TODO add your handling code here:
        if(firstClick){

            firstClickRandomizer2();

            //System.out.println("check check22");
            firstClick = false;
        }
        if(cardArrayS2[1][2]==0 ){                 //***
            System.out.println("this card is already done"); // error counting ?
        }else if(x1==1 && y1==2){                 //***
            System.out.println("this is your 1st choice pick another card"); // error counting ?
        }else if(notDone==true && notDone2==true){                           //prevent actions while pairing
            System.out.println("di pa tpos mag compute sandali naman");
        }else if(clickCounter==1){
            notDone= true;
            clickCounter=2;

            b =cardArrayH2[1][2];     //***
            buttonImageGiver(jButtonMedium12, b);//***
            x1=1;                                 //***
            y1=2;                                 //***
            System.out.println("1st choice");
        }else{

            notDone2= true;

            b =cardArrayH2[1][2];     //***
            buttonImageGiver(jButtonMedium12, b);//***
            x2=1;                                 //***
            y2=2;                                 //***
            System.out.println("2nd choice");

            ArrayHCompare2();
            sumArrayS2();
            clickCounter=1;
        }

    }//GEN-LAST:event_jButtonMedium12ActionPerformed

    private void jButtonMedium11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMedium11ActionPerformed
        // TODO add your handling code here:

        if(firstClick){

            firstClickRandomizer2();

            //System.out.println("check check22");
            firstClick = false;
        }
        if(cardArrayS2[1][1]==0 ){                 //***
            System.out.println("this card is already done"); // error counting ?
        }else if(x1==1 && y1==1){                 //***
            System.out.println("this is your 1st choice pick another card"); // error counting ?
        }else if(notDone==true && notDone2==true){                           //prevent actions while pairing
            System.out.println("di pa tpos mag compute sandali naman");
        }else if(clickCounter==1){
            notDone= true;
            clickCounter=2;

            b =cardArrayH2[1][1];     //***
            buttonImageGiver(jButtonMedium11, b);//***
            x1=1;                                 //***
            y1=1;                                 //***
            System.out.println("1st choice");
        }else{

            notDone2= true;

            b =cardArrayH2[1][1];     //***
            buttonImageGiver(jButtonMedium11, b);//***
            x2=1;                                 //***
            y2=1;                                 //***
            System.out.println("2nd choice");

            ArrayHCompare2();
            sumArrayS2();
            clickCounter=1;
        }

    }//GEN-LAST:event_jButtonMedium11ActionPerformed

    private void jButtonMedium10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMedium10ActionPerformed
        // TODO add your handling code here:
        if(firstClick){

            firstClickRandomizer2();

            //System.out.println("check check22");
            firstClick = false;
        }
        if(cardArrayS2[1][0]==0 ){                 //***
            System.out.println("this card is already done"); // error counting ?
        }else if(x1==1 && y1==0){                 //***
            System.out.println("this is your 1st choice pick another card"); // error counting ?
        }else if(notDone==true && notDone2==true){                           //prevent actions while pairing
            System.out.println("di pa tpos mag compute sandali naman");
        }else if(clickCounter==1){
            notDone= true;
            clickCounter=2;

            b =cardArrayH2[1][0];     //***
            buttonImageGiver(jButtonMedium10, b);//***
            x1=1;                                 //***
            y1=0;                                 //***
            System.out.println("1st choice");
        }else{

            notDone2= true;

            b =cardArrayH2[1][0];     //***
            buttonImageGiver(jButtonMedium10, b);//***
            x2=1;                                 //***
            y2=0;                                 //***
            System.out.println("2nd choice");

            ArrayHCompare2();
            sumArrayS2();
            clickCounter=1;
        }

    }//GEN-LAST:event_jButtonMedium10ActionPerformed

    private void jButtonMedium20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMedium20ActionPerformed
        // TODO add your handling code here:
        if(firstClick){

            firstClickRandomizer2();

            //System.out.println("check check22");
            firstClick = false;
        }
        if(cardArrayS2[2][0]==0 ){                 //***
            System.out.println("this card is already done"); // error counting ?
        }else if(x1==2 && y1==0){                 //***
            System.out.println("this is your 1st choice pick another card"); // error counting ?
        }else if(notDone==true && notDone2==true){                           //prevent actions while pairing
            System.out.println("di pa tpos mag compute sandali naman");
        }else if(clickCounter==1){
            notDone= true;
            clickCounter=2;

            b =cardArrayH2[2][0];     //***
            buttonImageGiver(jButtonMedium20, b);//***
            x1=2;                                 //***
            y1=0;                                 //***
            System.out.println("1st choice");
        }else{

            notDone2= true;

            b =cardArrayH2[2][0];     //***
            buttonImageGiver(jButtonMedium20, b);//***
            x2=2;                                 //***
            y2=0;                                 //***
            System.out.println("2nd choice");

            ArrayHCompare2();
            sumArrayS2();
            clickCounter=1;
        }

    }//GEN-LAST:event_jButtonMedium20ActionPerformed

    private void jButtonMedium21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMedium21ActionPerformed
        // TODO add your handling code here:
        if(firstClick){

            firstClickRandomizer2();

            //System.out.println("check check22");
            firstClick = false;
        }
        if(cardArrayS2[2][1]==0 ){                 //***
            System.out.println("this card is already done"); // error counting ?
        }else if(x1==2 && y1==1){                 //***
            System.out.println("this is your 1st choice pick another card"); // error counting ?
        }else if(notDone==true && notDone2==true){                           //prevent actions while pairing
            System.out.println("di pa tpos mag compute sandali naman");
        }else if(clickCounter==1){
            notDone= true;
            clickCounter=2;

            b =cardArrayH2[2][1];     //***
            buttonImageGiver(jButtonMedium21, b);//***
            x1=2;                                 //***
            y1=1;                                 //***
            System.out.println("1st choice");
        }else{

            notDone2= true;

            b =cardArrayH2[2][1];     //***
            buttonImageGiver(jButtonMedium21, b);//***
            x2=2;                                 //***
            y2=1;                                 //***
            System.out.println("2nd choice");

            ArrayHCompare2();
            sumArrayS2();
            clickCounter=1;
        }

    }//GEN-LAST:event_jButtonMedium21ActionPerformed

    private void jButtonMedium22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMedium22ActionPerformed
        // TODO add your handling code here:

        if(firstClick){

            firstClickRandomizer2();

            //System.out.println("check check22");
            firstClick = false;
        }
        if(cardArrayS2[2][2]==0 ){                 //***
            System.out.println("this card is already done"); // error counting ?
        }else if(x1==2 && y1==2){                 //***
            System.out.println("this is your 1st choice pick another card"); // error counting ?
        }else if(notDone==true && notDone2==true){                           //prevent actions while pairing
            System.out.println("di pa tpos mag compute sandali naman");
        }else if(clickCounter==1){
            notDone= true;
            clickCounter=2;

            b =cardArrayH2[2][2];     //***
            buttonImageGiver(jButtonMedium22, b);//***
            x1=2;                                 //***
            y1=2;                                 //***
            System.out.println("1st choice");
        }else{

            notDone2= true;

            b =cardArrayH2[2][2];     //***
            buttonImageGiver(jButtonMedium22, b);//***
            x2=2;                                 //***
            y2=2;                                 //***
            System.out.println("2nd choice");

            ArrayHCompare2();
            sumArrayS2();
            clickCounter=1;
        }

    }//GEN-LAST:event_jButtonMedium22ActionPerformed

    private void jButtonMedium23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMedium23ActionPerformed
        // TODO add your handling code here:

        if(firstClick){

            firstClickRandomizer2();

            //System.out.println("check check22");
            firstClick = false;
        }
        if(cardArrayS2[2][3]==0 ){                 //***
            System.out.println("this card is already done"); // error counting ?
        }else if(x1==2 && y1==3){                 //***
            System.out.println("this is your 1st choice pick another card"); // error counting ?
        }else if(notDone==true && notDone2==true){                           //prevent actions while pairing
            System.out.println("di pa tpos mag compute sandali naman");
        }else if(clickCounter==1){
            notDone= true;
            clickCounter=2;

            b =cardArrayH2[2][3];     //***
            buttonImageGiver(jButtonMedium23, b);//***
            x1=2;                                 //***
            y1=3;                                 //***
            System.out.println("1st choice");
        }else{

            notDone2= true;

            b =cardArrayH2[2][3];     //***
            buttonImageGiver(jButtonMedium23, b);//***
            x2=2;                                 //***
            y2=3;                                 //***
            System.out.println("2nd choice");

            ArrayHCompare2();
            sumArrayS2();
            clickCounter=1;
        }

    }//GEN-LAST:event_jButtonMedium23ActionPerformed

    private void jButtonMedium30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMedium30ActionPerformed
        // TODO add your handling code here:
        if(firstClick){
            firstClickRandomizer2();
            firstClick = false;
        }
        if(cardArrayS2[3][0]==0 ){                 //***
            System.out.println("this card is already done"); // error counting ?
        }else if(x1==3 && y1==0){                 //***
            System.out.println("this is your 1st choice pick another card"); // error counting ?
        }else if(notDone==true && notDone2==true){                           //prevent actions while pairing
            System.out.println("computing");
        }else if(clickCounter==1){
            notDone= true;
            clickCounter=2;
            b =cardArrayH2[3][0];     //***
            buttonImageGiver(jButtonMedium30, b);//***
            x1=3;                                 //***
            y1=0;                                 //***
            System.out.println("1st choice");
        }else{
            notDone2= true;
            b =cardArrayH2[3][0];     //***
            buttonImageGiver(jButtonMedium30, b);//***
            x2=3;                                 //***
            y2=0;                                 //***
            ArrayHCompare2();
            sumArrayS2();
            clickCounter=1;
        }
    }//GEN-LAST:event_jButtonMedium30ActionPerformed

    private void jButtonMedium31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMedium31ActionPerformed
        // TODO add your handling code here:
        if(firstClick){
            firstClickRandomizer2();
            firstClick = false;
        }
        if(cardArrayS2[3][1]==0 ){                 //***
            System.out.println("this card is already done"); // error counting ?
        }else if(x1==3 && y1==1){                 //***
            System.out.println("this is your 1st choice pick another card"); // error counting ?
        }else if(notDone==true && notDone2==true){                           //prevent actions while pairing
            System.out.println("computing");
        }else if(clickCounter==1){
            notDone= true;
            clickCounter=2;
            b =cardArrayH2[3][1];     //***
            buttonImageGiver(jButtonMedium31, b);//***
            x1=3; y1=1;                                 //***
            System.out.println("1st choice");
        }else{
            notDone2= true;
            b =cardArrayH2[3][1];     //***
            buttonImageGiver(jButtonMedium31, b);//***
            x2=3;y2=1;                                 //***
            ArrayHCompare2();
            sumArrayS2();
            clickCounter=1;
        }
    }//GEN-LAST:event_jButtonMedium31ActionPerformed

    private void jButtonMedium32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMedium32ActionPerformed
        // TODO add your handling code here:
        if(firstClick){
            firstClickRandomizer2();
            firstClick = false;
        }
        if(cardArrayS2[3][2]==0 ){                 //***
            System.out.println("this card is already done"); // error counting ?
        }else if(x1==3 && y1==2){                 //***
            System.out.println("this is your 1st choice pick another card"); // error counting ?
        }else if(notDone==true && notDone2==true){                           //prevent actions while pairing
            System.out.println("computing");
        }else if(clickCounter==1){
            notDone= true;
            clickCounter=2;
            b =cardArrayH2[3][2];     //***
            buttonImageGiver(jButtonMedium32, b);//***
            x1=3; y1=2;                                 //***
            System.out.println("1st choice");
        }else{
            notDone2= true;
            b =cardArrayH2[3][2];     //***
            buttonImageGiver(jButtonMedium32, b);//***
            x2=3;y2=2;                                 //***
            ArrayHCompare2();
            sumArrayS2();
            clickCounter=1;
        }
    }//GEN-LAST:event_jButtonMedium32ActionPerformed

    private void jButtonMedium33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMedium33ActionPerformed
        // TODO add your handling code here:
        if(firstClick){
            firstClickRandomizer2();
            firstClick = false;
        }
        if(cardArrayS2[3][3]==0 ){                 //***
            System.out.println("this card is already done"); // error counting ?
        }else if(x1==3 && y1==3){                 //***
            System.out.println("this is your 1st choice pick another card"); // error counting ?
        }else if(notDone==true && notDone2==true){                           //prevent actions while pairing
            System.out.println("computing");
        }else if(clickCounter==1){
            notDone= true;
            clickCounter=2;
            b =cardArrayH2[3][3];     //***
            buttonImageGiver(jButtonMedium33, b);//***
            x1=3; y1=3;                                 //***
            System.out.println("1st choice");
        }else{
            notDone2= true;
            b =cardArrayH2[3][3];     //***
            buttonImageGiver(jButtonMedium33, b);//***
            x2=3;y2=3;                                 //***
            ArrayHCompare2();
            sumArrayS2();
            clickCounter=1;
        }
    }//GEN-LAST:event_jButtonMedium33ActionPerformed

    private void jButtonMedium24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMedium24ActionPerformed
        // TODO add your handling code here:
        if(firstClick){
            firstClickRandomizer2();
            firstClick = false;
        }
        if(cardArrayS2[2][4]==0 ){                 //***
            System.out.println("this card is already done"); // error counting ?
        }else if(x1==2 && y1==4){                 //***
            System.out.println("this is your 1st choice pick another card"); // error counting ?
        }else if(notDone==true && notDone2==true){                           //prevent actions while pairing
            System.out.println("computing");
        }else if(clickCounter==1){
            notDone= true;
            clickCounter=2;
            b =cardArrayH2[2][4];     //***
            buttonImageGiver(jButtonMedium24, b);//***
            x1=2; y1=4;                                 //***
            System.out.println("1st choice");
        }else{
            notDone2= true;
            b =cardArrayH2[2][4];     //***
            buttonImageGiver(jButtonMedium24, b);//***
            x2=2;y2=4;                                 //***
            ArrayHCompare2();
            sumArrayS2();
            clickCounter=1;
        }
    }//GEN-LAST:event_jButtonMedium24ActionPerformed

    private void jButtonMedium04ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMedium04ActionPerformed
        // TODO add your handling code here:
        if(firstClick){
            firstClickRandomizer2();
            firstClick = false;
        }
        if(cardArrayS2[0][4]==0 ){                 //***
            System.out.println("this card is already done"); 
        }else if(x1==0 && y1==4){                 //***
            System.out.println("this is your 1st choice pick another card"); 
        }else if(notDone==true && notDone2==true){                          
            System.out.println("computing");
        }else if(clickCounter==1){
            notDone= true;
            clickCounter=2;
            b =cardArrayH2[0][4];     //***
            buttonImageGiver(jButtonMedium04, b);//***
            x1=0; y1=4;                                 //***
            System.out.println("1st choice");
        }else{
            notDone2= true;
            b =cardArrayH2[0][4];     //***
            buttonImageGiver(jButtonMedium04, b);//***
            x2=0;y2=4;                                 //***
            ArrayHCompare2();
            sumArrayS2();
            clickCounter=1;
        }
    }//GEN-LAST:event_jButtonMedium04ActionPerformed

    private void jButtonMedium14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMedium14ActionPerformed
        // TODO add your handling code here:
        
        if(firstClick){
            firstClickRandomizer2();
            firstClick = false;
        }
        if(cardArrayS2[1][4]==0 ){                 //***
            System.out.println("this card is already done"); 
        }else if(x1==1 && y1==4){                 //***
            System.out.println("this is your 1st choice pick another card"); 
        }else if(notDone==true && notDone2==true){                          
            System.out.println("computing");
        }else if(clickCounter==1){
            notDone= true;
            clickCounter=2;
            b =cardArrayH2[1][4];     //***
            buttonImageGiver(jButtonMedium14, b);//***
            x1=1; y1=4;                                 //***
            System.out.println("1st choice");
        }else{
            notDone2= true;
            b =cardArrayH2[1][4];     //***
            buttonImageGiver(jButtonMedium14, b);//***
            x2=1;y2=4;                                 //***
            ArrayHCompare2();
            sumArrayS2();
            clickCounter=1;
        }
    }//GEN-LAST:event_jButtonMedium14ActionPerformed

    private void jButtonMedium34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMedium34ActionPerformed
        // TODO add your handling code here:
        
        if(firstClick){
            firstClickRandomizer2();
            firstClick = false;
        }
        if(cardArrayS2[3][4]==0 ){                 //***
            System.out.println("this card is already done"); 
        }else if(x1==3 && y1==4){                 //***
            System.out.println("this is your 1st choice pick another card"); 
        }else if(notDone==true && notDone2==true){                          
            System.out.println("computing");
        }else if(clickCounter==1){
            notDone= true;
            clickCounter=2;
            b =cardArrayH2[3][4];     //***
            buttonImageGiver(jButtonMedium34, b);//***
            x1=3; y1=4;                                 //***
            System.out.println("1st choice");
        }else{
            notDone2= true;
            b =cardArrayH2[3][4];     //***
            buttonImageGiver(jButtonMedium34, b);//***
            x2=3;y2=4;                                 //***
            ArrayHCompare2();
            sumArrayS2();
            clickCounter=1;
        }
    }//GEN-LAST:event_jButtonMedium34ActionPerformed

    private void jButtonMedium35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMedium35ActionPerformed
        // TODO add your handling code here:
        
        if(firstClick){
            firstClickRandomizer2();
            firstClick = false;
        }
        if(cardArrayS2[3][5]==0 ){                 //***
            System.out.println("this card is already done"); 
        }else if(x1==3 && y1==5){                 //***
            System.out.println("this is your 1st choice pick another card"); 
        }else if(notDone==true && notDone2==true){                          
            System.out.println("computing");
        }else if(clickCounter==1){
            notDone= true;
            clickCounter=2;
            b =cardArrayH2[3][5];     //***
            buttonImageGiver(jButtonMedium35, b);//***
            x1=3; y1=5;                                 //***
            System.out.println("1st choice");
        }else{
            notDone2= true;
            b =cardArrayH2[3][5];     //***
            buttonImageGiver(jButtonMedium35, b);//***
            x2=3;y2=5;                                 //***
            ArrayHCompare2();
            sumArrayS2();
            clickCounter=1;
        }
    }//GEN-LAST:event_jButtonMedium35ActionPerformed

    private void jButtonMedium25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMedium25ActionPerformed
        // TODO add your handling code here:
        
        if(firstClick){
            firstClickRandomizer2();
            firstClick = false;
        }
        if(cardArrayS2[2][5]==0 ){                 //***
            System.out.println("this card is already done"); 
        }else if(x1==2 && y1==5){                 //***
            System.out.println("this is your 1st choice pick another card"); 
        }else if(notDone==true && notDone2==true){                          
            System.out.println("computing");
        }else if(clickCounter==1){
            notDone= true;
            clickCounter=2;
            b =cardArrayH2[2][5];                   //***
            buttonImageGiver(jButtonMedium25, b);   //***
            x1=2; y1=5;                             //***
            System.out.println("1st choice");
        }else{
            notDone2= true;
            b =cardArrayH2[2][5];                   //***
            buttonImageGiver(jButtonMedium25, b);   //***
            x2=2;y2=5;                              //***
            ArrayHCompare2();
            sumArrayS2();
            clickCounter=1;
        }
    }//GEN-LAST:event_jButtonMedium25ActionPerformed

    private void jButtonMedium05ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMedium05ActionPerformed
        // TODO add your handling code here:
        
        if(firstClick){
            firstClickRandomizer2();
            firstClick = false;
        }
        if(cardArrayS2[0][5]==0 ){                 //***
            System.out.println("this card is already done"); 
        }else if(x1==0 && y1==5){                 //***
            System.out.println("this is your 1st choice pick another card"); 
        }else if(notDone==true && notDone2==true){                          
            System.out.println("computing");
        }else if(clickCounter==1){
            notDone= true;
            clickCounter=2;
            b =cardArrayH2[0][5];                   //***
            buttonImageGiver(jButtonMedium05, b);   //***
            x1=0; y1=5;                             //***
            System.out.println("1st choice");
        }else{
            notDone2= true;
            b =cardArrayH2[0][5];                   //***
            buttonImageGiver(jButtonMedium05, b);   //***
            x2=0;y2=5;                              //***
            ArrayHCompare2();
            sumArrayS2();
            clickCounter=1;
        }
    }//GEN-LAST:event_jButtonMedium05ActionPerformed

    private void jButtonMedium15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMedium15ActionPerformed
        // TODO add your handling code here:
        
        
        if(firstClick){
            firstClickRandomizer2();
            firstClick = false;
        }
        if(cardArrayS2[1][5]==0 ){                 //***
            System.out.println("this card is already done"); 
        }else if(x1==1 && y1==5){                 //***
            System.out.println("this is your 1st choice pick another card"); 
        }else if(notDone==true && notDone2==true){                          
            System.out.println("computing");
        }else if(clickCounter==1){
            notDone= true;
            clickCounter=2;
            b =cardArrayH2[1][5];                   //***
            buttonImageGiver(jButtonMedium15, b);   //***
            x1=1; y1=5;                             //***
            System.out.println("1st choice");
        }else{
            notDone2= true;
            b =cardArrayH2[1][5];                   //***
            buttonImageGiver(jButtonMedium15, b);   //***
            x2=1;y2=5;                              //***
            ArrayHCompare2();
            sumArrayS2();
            clickCounter=1;
        }
    }//GEN-LAST:event_jButtonMedium15ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonMedium00;
    private javax.swing.JButton jButtonMedium01;
    private javax.swing.JButton jButtonMedium02;
    private javax.swing.JButton jButtonMedium03;
    private javax.swing.JButton jButtonMedium04;
    private javax.swing.JButton jButtonMedium05;
    private javax.swing.JButton jButtonMedium10;
    private javax.swing.JButton jButtonMedium11;
    private javax.swing.JButton jButtonMedium12;
    private javax.swing.JButton jButtonMedium13;
    private javax.swing.JButton jButtonMedium14;
    private javax.swing.JButton jButtonMedium15;
    private javax.swing.JButton jButtonMedium20;
    private javax.swing.JButton jButtonMedium21;
    private javax.swing.JButton jButtonMedium22;
    private javax.swing.JButton jButtonMedium23;
    private javax.swing.JButton jButtonMedium24;
    private javax.swing.JButton jButtonMedium25;
    private javax.swing.JButton jButtonMedium30;
    private javax.swing.JButton jButtonMedium31;
    private javax.swing.JButton jButtonMedium32;
    private javax.swing.JButton jButtonMedium33;
    private javax.swing.JButton jButtonMedium34;
    private javax.swing.JButton jButtonMedium35;
    // End of variables declaration//GEN-END:variables
}

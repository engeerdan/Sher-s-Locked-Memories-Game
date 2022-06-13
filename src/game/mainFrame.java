/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;
import java.awt.AWTException;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Robot;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JButton;
import javax.swing.JLabel;
/**
 *
 * @author engeer
 */
public class mainFrame extends javax.swing.JFrame  {
    File bgmFile = new File ("./src/resources/Stopping By the Inn - Twin Musicom.wav");
    AudioInputStream bgmStream;
    Clip bgmClip; 
    File correctFile = new File ("./src/resources/correct.wav");
    AudioInputStream correctStream;
    Clip correctClip; 
            
    
    
    defaultValues DV = new defaultValues();
    Timer timer =new Timer();
    Timer timer1 =new Timer();
    Timer timer2 =new Timer();
    Timer timer3 =new Timer();
    boolean restartLevelWatcher = false;
    private int clickCounter=1;//--
    boolean firstClick=true,notDone=false,notDone2=false; 
    int j,i,x,y, b, sumAS;
    int x1 = 50,x2 = 50,y1 = 50,y2 = 50;
    int animation = 1;
    //
    int secNorma1_1 = 30; // temp 10 should be 30
    int secHard_1 = 10;
    int secNorma1_2 = 40;
    int secHard_2 = 15;
    int secNorma1_3 = 60;
    int secHard_3 = 40;
    //
    int cardInstances = 2;
    int cardInstances1 = 3;
    int cardInstances2 = 6;
    
    //
    public int[][] cardArrayH = new int[2][2];
    public int[][] cardArrayS = new int[2][2];
    
    public int[][] cardArrayH1 = new int[3][2];
    public int[][] cardArrayS1 ={ { 1, 1 }, { 1, 1}, { 1, 1 } };
    
    public int[][] cardArrayH2 = new int[4][5];
    public int[][] cardArrayS2 ={ {1,1,1,1 }, { 1, 1, 1, 1}, { 1, 1, 1, 1 } };

    public mainFrame() throws UnsupportedAudioFileException,IOException, LineUnavailableException{
        initComponents();
        this.bgmStream = AudioSystem.getAudioInputStream(bgmFile);
        this.bgmClip= AudioSystem.getClip();
        bgmClip.open(bgmStream);
        bgmClip.start();
        bgmClip.loop(Clip.LOOP_CONTINUOUSLY);
        MusicjToggleButton1.setToolTipText("Toggle to turn the music on/off");
        
        difficultyPanel.setVisible(false);
        sec100sDigit.setVisible(false);
        timerPanel.setVisible(false);
        timerPanel.setToolTipText("The level fails when this timer hit zero and not all cards are solved");
        timer3.scheduleAtFixedRate(taskAnimate, 1000,500);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        coverInfoPanel = new javax.swing.JPanel();
        sidePanel = new javax.swing.JPanel();
        MusicjToggleButton1 = new javax.swing.JToggleButton();
        timerPanel = new javax.swing.JPanel();
        secTensDigit = new javax.swing.JLabel();
        secOnesDigit = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        sec100sDigit = new javax.swing.JLabel();
        jLabelPanelAnimator = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        startPanel = new javax.swing.JPanel();
        playButton = new javax.swing.JButton();
        difficultyPanel = new javax.swing.JPanel();
        jButtonEasy = new javax.swing.JButton();
        jButtonNormal = new javax.swing.JButton();
        jButtonHard = new javax.swing.JButton();
        jButtonHard1 = new javax.swing.JButton();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        instructionPanel = new javax.swing.JPanel();
        continueToStage1Button = new javax.swing.JButton();
        jLabel53 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        gamePanel1 = new javax.swing.JPanel();
        jButtonEasy00 = new javax.swing.JButton();
        jButtonEasy01 = new javax.swing.JButton();
        jButtonEasy10 = new javax.swing.JButton();
        jButtonEasy11 = new javax.swing.JButton();
        jPanelStory_1 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        gamePanel2 = new javax.swing.JPanel();
        jButtonEasyy00 = new javax.swing.JButton();
        jButtonEasyy01 = new javax.swing.JButton();
        jButtonEasyy20 = new javax.swing.JButton();
        jButtonEasyy10 = new javax.swing.JButton();
        jButtonEasyy11 = new javax.swing.JButton();
        jButtonEasyy21 = new javax.swing.JButton();
        jPanelStory_2 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        gamePanel3 = new javax.swing.JPanel();
        jButtonMedium00 = new javax.swing.JButton();
        jButtonMedium10 = new javax.swing.JButton();
        jButtonMedium01 = new javax.swing.JButton();
        jButtonMedium11 = new javax.swing.JButton();
        jButtonMedium21 = new javax.swing.JButton();
        jButtonMedium20 = new javax.swing.JButton();
        jButtonMedium02 = new javax.swing.JButton();
        jButtonMedium12 = new javax.swing.JButton();
        jButtonMedium22 = new javax.swing.JButton();
        jButtonMedium03 = new javax.swing.JButton();
        jButtonMedium13 = new javax.swing.JButton();
        jButtonMedium23 = new javax.swing.JButton();
        jPanelStory_3 = new javax.swing.JPanel();
        togamePanel4 = new javax.swing.JButton();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        gamePanel4 = new javax.swing.JPanel();
        o_gamePanel41 = new game.o_gamePanel4( timerPanel, secTensDigit, secOnesDigit,
            jTabbedPane1,  difficultyPanel,  playButton,startPanel,jPanelStory_4);
        jPanelStory_4 = new javax.swing.JPanel();
        togamePanel5 = new javax.swing.JButton();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        gamePanel5 = new javax.swing.JPanel();
        o_gamePanel51 = new game.o_gamePanel5(timerPanel, secTensDigit,  secOnesDigit,
            jTabbedPane1,  difficultyPanel,  playButton,
            startPanel,sec100sDigit);
        jPanelStory_5 = new javax.swing.JPanel();
        togamePanel6 = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        gamePanel6 = new javax.swing.JPanel();
        o_gamePanel61 = new game.o_gamePanel6(timerPanel, secTensDigit,  secOnesDigit,
            jTabbedPane1,  difficultyPanel,  playButton,
            startPanel,sec100sDigit);
        jPanelStory_6 = new javax.swing.JPanel();
        togamePanel7 = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        gamePanel7 = new javax.swing.JPanel();
        o_gamePanel71 = new game.o_gamePanel7(
            timerPanel, secTensDigit,  secOnesDigit,
            jTabbedPane1,  difficultyPanel,  playButton,
            startPanel, sec100sDigit
        );
        jPanelStory_7 = new javax.swing.JPanel();
        togamePanel8 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        gamePanel8 = new javax.swing.JPanel();
        o_gamePanel81 = new game.o_gamePanel8(
            timerPanel, secTensDigit,  secOnesDigit,
            jTabbedPane1,  difficultyPanel,  playButton,
            startPanel, sec100sDigit
        );
        jPanelStory_8 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(0, 0));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        coverInfoPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                coverInfoPanelMouseEntered(evt);
            }
        });

        javax.swing.GroupLayout coverInfoPanelLayout = new javax.swing.GroupLayout(coverInfoPanel);
        coverInfoPanel.setLayout(coverInfoPanelLayout);
        coverInfoPanelLayout.setHorizontalGroup(
            coverInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 870, Short.MAX_VALUE)
        );
        coverInfoPanelLayout.setVerticalGroup(
            coverInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        getContentPane().add(coverInfoPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 600, 870, 30));

        sidePanel.setBackground(new java.awt.Color(153, 0, 255));
        sidePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MusicjToggleButton1.setBackground(new java.awt.Color(115, 115, 115));
        MusicjToggleButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/musicToggle.png"))); // NOI18N
        MusicjToggleButton1.setBorder(null);
        MusicjToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MusicjToggleButton1ActionPerformed(evt);
            }
        });
        sidePanel.add(MusicjToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 420, 40, 40));

        timerPanel.setBackground(new java.awt.Color(115, 115, 115));

        secTensDigit.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        secTensDigit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/timer0.png"))); // NOI18N

        secOnesDigit.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        secOnesDigit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/timer0.png"))); // NOI18N

        jLabel52.setFont(new java.awt.Font("Cooper Black", 1, 18)); // NOI18N
        jLabel52.setText("Time:");

        sec100sDigit.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        sec100sDigit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/timer0.png"))); // NOI18N

        javax.swing.GroupLayout timerPanelLayout = new javax.swing.GroupLayout(timerPanel);
        timerPanel.setLayout(timerPanelLayout);
        timerPanelLayout.setHorizontalGroup(
            timerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(timerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(timerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(timerPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(sec100sDigit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(secTensDigit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(secOnesDigit))
                    .addGroup(timerPanelLayout.createSequentialGroup()
                        .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        timerPanelLayout.setVerticalGroup(
            timerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, timerPanelLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel52)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(timerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(secOnesDigit, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(secTensDigit, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(sec100sDigit, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(20, 20, 20))
        );

        sidePanel.add(timerPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 460, 170, 140));

        jLabelPanelAnimator.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/sidePaneAnimation 1.png"))); // NOI18N
        sidePanel.add(jLabelPanelAnimator, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, 600));

        getContentPane().add(sidePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, 600));

        jTabbedPane1.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        jTabbedPane1.setTabPlacement(javax.swing.JTabbedPane.BOTTOM);
        jTabbedPane1.setMaximumSize(new java.awt.Dimension(698, 668));
        jTabbedPane1.setPreferredSize(new java.awt.Dimension(698, 646));

        startPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        playButton.setBackground(new java.awt.Color(238, 238, 117));
        playButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        playButton.setText("Play");
        playButton.setMargin(new java.awt.Insets(0, 0, 0, 0));
        playButton.setMaximumSize(new java.awt.Dimension(100, 100));
        playButton.setMinimumSize(new java.awt.Dimension(100, 100));
        playButton.setPreferredSize(new java.awt.Dimension(100, 100));
        playButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playButtonActionPerformed(evt);
            }
        });
        startPanel.add(playButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 220, 170, 60));

        difficultyPanel.setBackground(new java.awt.Color(153, 153, 255));
        difficultyPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonEasy.setBackground(new java.awt.Color(238, 238, 117));
        jButtonEasy.setText("Easy");
        jButtonEasy.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonEasyMouseEntered(evt);
            }
        });
        jButtonEasy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEasyActionPerformed(evt);
            }
        });
        difficultyPanel.add(jButtonEasy, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 90, -1));

        jButtonNormal.setBackground(new java.awt.Color(238, 238, 117));
        jButtonNormal.setText("Normal");
        jButtonNormal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNormalActionPerformed(evt);
            }
        });
        difficultyPanel.add(jButtonNormal, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 90, -1));

        jButtonHard.setBackground(new java.awt.Color(238, 238, 117));
        jButtonHard.setText("Hard");
        jButtonHard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHardActionPerformed(evt);
            }
        });
        difficultyPanel.add(jButtonHard, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 90, -1));

        jButtonHard1.setBackground(new java.awt.Color(238, 238, 117));
        jButtonHard1.setText("Hard");
        jButtonHard1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHard1ActionPerformed(evt);
            }
        });
        difficultyPanel.add(jButtonHard1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 90, -1));

        jLabel50.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/diffpanel.png"))); // NOI18N
        difficultyPanel.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, 410, 240));

        startPanel.add(difficultyPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 320, 250, 180));

        jLabel51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/buttonBG.jpg"))); // NOI18N
        startPanel.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 640));

        jTabbedPane1.addTab("tab1", startPanel);

        instructionPanel.setBackground(new java.awt.Color(210, 240, 240));
        instructionPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        continueToStage1Button.setText("Skip");
        continueToStage1Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                continueToStage1ButtonActionPerformed(evt);
            }
        });
        instructionPanel.add(continueToStage1Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(598, 583, -1, -1));

        jLabel53.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Instruction.png"))); // NOI18N
        jLabel53.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel53MouseClicked(evt);
            }
        });
        jLabel53.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLabel53KeyPressed(evt);
            }
        });
        instructionPanel.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 21, 700, 600));

        jLabel45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Scene01.jpg"))); // NOI18N
        jLabel45.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel45MouseClicked(evt);
            }
        });
        jLabel45.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLabel45KeyPressed(evt);
            }
        });
        instructionPanel.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 21, 700, 600));

        jLabel46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Scene02.jpg"))); // NOI18N
        jLabel46.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel46MouseClicked(evt);
            }
        });
        jLabel46.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLabel46KeyPressed(evt);
            }
        });
        instructionPanel.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 21, 700, 600));

        jLabel47.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Scene03.jpg"))); // NOI18N
        jLabel47.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel47MouseClicked(evt);
            }
        });
        jLabel47.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLabel47KeyPressed(evt);
            }
        });
        instructionPanel.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 21, 700, 600));

        jLabel48.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Scene04.jpg"))); // NOI18N
        jLabel48.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel48MouseClicked(evt);
            }
        });
        jLabel48.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLabel48KeyPressed(evt);
            }
        });
        instructionPanel.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 21, 700, 600));

        jLabel49.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/LV 1 Puzzle.jpg"))); // NOI18N
        jLabel49.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel49MouseClicked(evt);
            }
        });
        jLabel49.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLabel49KeyPressed(evt);
            }
        });
        instructionPanel.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 21, 700, 600));

        jTabbedPane1.addTab("tab2", instructionPanel);

        gamePanel1.setBackground(new java.awt.Color(240, 210, 240));
        gamePanel1.setEnabled(false);

        jButtonEasy00.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/@back.jpg"))); // NOI18N
        jButtonEasy00.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButtonEasy00.setMaximumSize(new java.awt.Dimension(100, 100));
        jButtonEasy00.setMinimumSize(new java.awt.Dimension(100, 100));
        jButtonEasy00.setPreferredSize(new java.awt.Dimension(100, 100));
        jButtonEasy00.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEasy00ActionPerformed(evt);
            }
        });

        jButtonEasy01.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/@back.jpg"))); // NOI18N
        jButtonEasy01.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButtonEasy01.setMaximumSize(new java.awt.Dimension(100, 100));
        jButtonEasy01.setMinimumSize(new java.awt.Dimension(100, 100));
        jButtonEasy01.setPreferredSize(new java.awt.Dimension(100, 100));
        jButtonEasy01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEasy01ActionPerformed(evt);
            }
        });

        jButtonEasy10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/@back.jpg"))); // NOI18N
        jButtonEasy10.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButtonEasy10.setMaximumSize(new java.awt.Dimension(100, 100));
        jButtonEasy10.setMinimumSize(new java.awt.Dimension(100, 100));
        jButtonEasy10.setPreferredSize(new java.awt.Dimension(100, 100));
        jButtonEasy10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEasy10ActionPerformed(evt);
            }
        });

        jButtonEasy11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/@back.jpg"))); // NOI18N
        jButtonEasy11.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButtonEasy11.setMaximumSize(new java.awt.Dimension(100, 100));
        jButtonEasy11.setMinimumSize(new java.awt.Dimension(100, 100));
        jButtonEasy11.setPreferredSize(new java.awt.Dimension(100, 100));
        jButtonEasy11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEasy11ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout gamePanel1Layout = new javax.swing.GroupLayout(gamePanel1);
        gamePanel1.setLayout(gamePanel1Layout);
        gamePanel1Layout.setHorizontalGroup(
            gamePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gamePanel1Layout.createSequentialGroup()
                .addGap(237, 237, 237)
                .addGroup(gamePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(gamePanel1Layout.createSequentialGroup()
                        .addComponent(jButtonEasy10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonEasy11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(gamePanel1Layout.createSequentialGroup()
                        .addComponent(jButtonEasy00, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonEasy01, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(238, Short.MAX_VALUE))
        );
        gamePanel1Layout.setVerticalGroup(
            gamePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gamePanel1Layout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addGroup(gamePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonEasy01, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonEasy00, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(gamePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonEasy11, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonEasy10, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(201, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab3", gamePanel1);

        jPanelStory_1.setBackground(new java.awt.Color(240, 210, 230));
        jPanelStory_1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton4.setText("skip");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanelStory_1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 590, -1, -1));

        jLabel40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Scene05.jpg"))); // NOI18N
        jLabel40.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel40MouseClicked(evt);
            }
        });
        jLabel40.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLabel40KeyPressed(evt);
            }
        });
        jPanelStory_1.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 21, 700, 600));

        jLabel41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Scene06.jpg"))); // NOI18N
        jLabel41.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel41MouseClicked(evt);
            }
        });
        jLabel41.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLabel41KeyPressed(evt);
            }
        });
        jPanelStory_1.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 21, 700, 600));

        jLabel42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Scene07.jpg"))); // NOI18N
        jLabel42.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel42MouseClicked(evt);
            }
        });
        jLabel42.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLabel42KeyPressed(evt);
            }
        });
        jPanelStory_1.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 21, 700, 600));

        jLabel44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Scene08.jpg"))); // NOI18N
        jLabel44.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel44MouseClicked(evt);
            }
        });
        jLabel44.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLabel44KeyPressed(evt);
            }
        });
        jPanelStory_1.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 21, 700, 600));

        jLabel43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/LV 2 Puzzle.jpg"))); // NOI18N
        jLabel43.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel43MouseClicked(evt);
            }
        });
        jLabel43.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLabel43KeyPressed(evt);
            }
        });
        jPanelStory_1.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 21, 700, 600));

        jTabbedPane1.addTab("tab4", jPanelStory_1);

        gamePanel2.setBackground(new java.awt.Color(153, 153, 255));

        jButtonEasyy00.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/@back.jpg"))); // NOI18N
        jButtonEasyy00.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButtonEasyy00.setMaximumSize(new java.awt.Dimension(100, 100));
        jButtonEasyy00.setMinimumSize(new java.awt.Dimension(100, 100));
        jButtonEasyy00.setPreferredSize(new java.awt.Dimension(100, 100));
        jButtonEasyy00.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEasyy00ActionPerformed(evt);
            }
        });

        jButtonEasyy01.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/@back.jpg"))); // NOI18N
        jButtonEasyy01.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButtonEasyy01.setMaximumSize(new java.awt.Dimension(100, 100));
        jButtonEasyy01.setMinimumSize(new java.awt.Dimension(100, 100));
        jButtonEasyy01.setPreferredSize(new java.awt.Dimension(100, 100));
        jButtonEasyy01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEasyy01ActionPerformed(evt);
            }
        });

        jButtonEasyy20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/@back.jpg"))); // NOI18N
        jButtonEasyy20.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButtonEasyy20.setMaximumSize(new java.awt.Dimension(100, 100));
        jButtonEasyy20.setMinimumSize(new java.awt.Dimension(100, 100));
        jButtonEasyy20.setPreferredSize(new java.awt.Dimension(100, 100));
        jButtonEasyy20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEasyy20ActionPerformed(evt);
            }
        });

        jButtonEasyy10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/@back.jpg"))); // NOI18N
        jButtonEasyy10.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButtonEasyy10.setMaximumSize(new java.awt.Dimension(100, 100));
        jButtonEasyy10.setMinimumSize(new java.awt.Dimension(100, 100));
        jButtonEasyy10.setPreferredSize(new java.awt.Dimension(100, 100));
        jButtonEasyy10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEasyy10ActionPerformed(evt);
            }
        });

        jButtonEasyy11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/@back.jpg"))); // NOI18N
        jButtonEasyy11.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButtonEasyy11.setMaximumSize(new java.awt.Dimension(100, 100));
        jButtonEasyy11.setMinimumSize(new java.awt.Dimension(100, 100));
        jButtonEasyy11.setPreferredSize(new java.awt.Dimension(100, 100));
        jButtonEasyy11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEasyy11ActionPerformed(evt);
            }
        });

        jButtonEasyy21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/@back.jpg"))); // NOI18N
        jButtonEasyy21.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButtonEasyy21.setMaximumSize(new java.awt.Dimension(100, 100));
        jButtonEasyy21.setMinimumSize(new java.awt.Dimension(100, 100));
        jButtonEasyy21.setPreferredSize(new java.awt.Dimension(100, 100));
        jButtonEasyy21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEasyy21ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout gamePanel2Layout = new javax.swing.GroupLayout(gamePanel2);
        gamePanel2.setLayout(gamePanel2Layout);
        gamePanel2Layout.setHorizontalGroup(
            gamePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gamePanel2Layout.createSequentialGroup()
                .addGap(237, 237, 237)
                .addGroup(gamePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(gamePanel2Layout.createSequentialGroup()
                        .addComponent(jButtonEasyy20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonEasyy21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(gamePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(gamePanel2Layout.createSequentialGroup()
                            .addComponent(jButtonEasyy10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jButtonEasyy11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(gamePanel2Layout.createSequentialGroup()
                            .addComponent(jButtonEasyy00, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jButtonEasyy01, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(238, Short.MAX_VALUE))
        );
        gamePanel2Layout.setVerticalGroup(
            gamePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gamePanel2Layout.createSequentialGroup()
                .addContainerGap(142, Short.MAX_VALUE)
                .addGroup(gamePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonEasyy01, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonEasyy00, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(gamePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonEasyy11, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonEasyy10, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(gamePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonEasyy20, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonEasyy21, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(141, 141, 141))
        );

        jTabbedPane1.addTab("tab5", gamePanel2);

        jPanelStory_2.setBackground(new java.awt.Color(240, 40, 240));
        jPanelStory_2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton6.setText("Skip");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanelStory_2.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 580, -1, -1));

        jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Scene09.jpg"))); // NOI18N
        jLabel35.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel35MouseClicked(evt);
            }
        });
        jLabel35.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLabel35KeyPressed(evt);
            }
        });
        jPanelStory_2.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 21, 700, 600));

        jLabel36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Scene10.jpg"))); // NOI18N
        jLabel36.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel36MouseClicked(evt);
            }
        });
        jLabel36.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLabel36KeyPressed(evt);
            }
        });
        jPanelStory_2.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 21, 700, 600));

        jLabel37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/scene11.jpg"))); // NOI18N
        jLabel37.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel37MouseClicked(evt);
            }
        });
        jLabel37.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLabel37KeyPressed(evt);
            }
        });
        jPanelStory_2.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 21, 700, 600));

        jLabel39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Scene12.jpg"))); // NOI18N
        jLabel39.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel39MouseClicked(evt);
            }
        });
        jLabel39.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLabel39KeyPressed(evt);
            }
        });
        jPanelStory_2.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 21, 700, 600));

        jLabel38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/LV 3 Puzzle.jpg"))); // NOI18N
        jLabel38.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel38MouseClicked(evt);
            }
        });
        jLabel38.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLabel38KeyPressed(evt);
            }
        });
        jPanelStory_2.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 21, 700, 600));

        jTabbedPane1.addTab("tab6", jPanelStory_2);

        gamePanel3.setBackground(new java.awt.Color(240, 240, 40));

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

        javax.swing.GroupLayout gamePanel3Layout = new javax.swing.GroupLayout(gamePanel3);
        gamePanel3.setLayout(gamePanel3Layout);
        gamePanel3Layout.setHorizontalGroup(
            gamePanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gamePanel3Layout.createSequentialGroup()
                .addContainerGap(120, Short.MAX_VALUE)
                .addGroup(gamePanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(gamePanel3Layout.createSequentialGroup()
                        .addComponent(jButtonMedium20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonMedium21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(gamePanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(gamePanel3Layout.createSequentialGroup()
                            .addComponent(jButtonMedium10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jButtonMedium11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(gamePanel3Layout.createSequentialGroup()
                            .addComponent(jButtonMedium00, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jButtonMedium01, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(gamePanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonMedium22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(gamePanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jButtonMedium12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonMedium02, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(gamePanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonMedium23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(gamePanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jButtonMedium13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonMedium03, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(119, 119, 119))
        );
        gamePanel3Layout.setVerticalGroup(
            gamePanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gamePanel3Layout.createSequentialGroup()
                .addContainerGap(141, Short.MAX_VALUE)
                .addGroup(gamePanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(gamePanel3Layout.createSequentialGroup()
                        .addComponent(jButtonMedium03, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonMedium13, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonMedium23, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(gamePanel3Layout.createSequentialGroup()
                        .addComponent(jButtonMedium02, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonMedium12, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonMedium22, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(gamePanel3Layout.createSequentialGroup()
                        .addGroup(gamePanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButtonMedium01, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonMedium00, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(gamePanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButtonMedium11, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonMedium10, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(gamePanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonMedium20, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonMedium21, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(142, 142, 142))
        );

        jTabbedPane1.addTab("tab7", gamePanel3);

        jPanelStory_3.setBackground(new java.awt.Color(204, 204, 204));
        jPanelStory_3.setMaximumSize(new java.awt.Dimension(693, 623));
        jPanelStory_3.setMinimumSize(new java.awt.Dimension(693, 623));
        jPanelStory_3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        togamePanel4.setText("game4");
        togamePanel4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                togamePanel4ActionPerformed(evt);
            }
        });
        jPanelStory_3.add(togamePanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 590, -1, -1));

        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Scene13.jpg"))); // NOI18N
        jLabel31.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel31MouseClicked(evt);
            }
        });
        jLabel31.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLabel31KeyPressed(evt);
            }
        });
        jPanelStory_3.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 21, 700, 600));

        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Scene14.jpg"))); // NOI18N
        jLabel32.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel32MouseClicked(evt);
            }
        });
        jLabel32.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLabel32KeyPressed(evt);
            }
        });
        jPanelStory_3.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 21, 700, 600));

        jLabel34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Scene15.jpg"))); // NOI18N
        jLabel34.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel34MouseClicked(evt);
            }
        });
        jLabel34.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLabel34KeyPressed(evt);
            }
        });
        jPanelStory_3.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 21, 700, 600));

        jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/LV 4 Puzzle.jpg"))); // NOI18N
        jLabel33.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel33MouseClicked(evt);
            }
        });
        jLabel33.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLabel33KeyPressed(evt);
            }
        });
        jPanelStory_3.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 21, 700, 600));

        jTabbedPane1.addTab("tab8", jPanelStory_3);

        javax.swing.GroupLayout gamePanel4Layout = new javax.swing.GroupLayout(gamePanel4);
        gamePanel4.setLayout(gamePanel4Layout);
        gamePanel4Layout.setHorizontalGroup(
            gamePanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(o_gamePanel41, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        gamePanel4Layout.setVerticalGroup(
            gamePanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gamePanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(o_gamePanel41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane1.addTab("tab9", gamePanel4);

        jPanelStory_4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        togamePanel5.setText("skip");
        togamePanel5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                togamePanel5ActionPerformed(evt);
            }
        });
        jPanelStory_4.add(togamePanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 590, -1, -1));

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Scene16.jpg"))); // NOI18N
        jLabel28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel28MouseClicked(evt);
            }
        });
        jLabel28.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLabel28KeyPressed(evt);
            }
        });
        jPanelStory_4.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 21, 700, 600));

        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Scene17.jpg"))); // NOI18N
        jLabel29.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel29MouseClicked(evt);
            }
        });
        jLabel29.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLabel29KeyPressed(evt);
            }
        });
        jPanelStory_4.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 21, 700, 600));

        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/LV 5 Puzzle.jpg"))); // NOI18N
        jLabel30.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel30MouseClicked(evt);
            }
        });
        jLabel30.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLabel30KeyPressed(evt);
            }
        });
        jPanelStory_4.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 21, 700, 600));

        jTabbedPane1.addTab("tab10", jPanelStory_4);

        javax.swing.GroupLayout gamePanel5Layout = new javax.swing.GroupLayout(gamePanel5);
        gamePanel5.setLayout(gamePanel5Layout);
        gamePanel5Layout.setHorizontalGroup(
            gamePanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gamePanel5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(o_gamePanel51, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        gamePanel5Layout.setVerticalGroup(
            gamePanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gamePanel5Layout.createSequentialGroup()
                .addComponent(o_gamePanel51, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab11", gamePanel5);

        jPanelStory_5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        togamePanel6.setText("skip");
        togamePanel6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                togamePanel6ActionPerformed(evt);
            }
        });
        jPanelStory_5.add(togamePanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 590, -1, -1));

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Scene18.jpg"))); // NOI18N
        jLabel23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel23MouseClicked(evt);
            }
        });
        jLabel23.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLabel23KeyPressed(evt);
            }
        });
        jPanelStory_5.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 21, 700, 600));

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Scene19.jpg"))); // NOI18N
        jLabel24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel24MouseClicked(evt);
            }
        });
        jLabel24.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLabel24KeyPressed(evt);
            }
        });
        jPanelStory_5.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 21, 700, 600));

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Scene20.jpg"))); // NOI18N
        jLabel25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel25MouseClicked(evt);
            }
        });
        jLabel25.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLabel25KeyPressed(evt);
            }
        });
        jPanelStory_5.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 21, 700, 600));

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Scene21.jpg"))); // NOI18N
        jLabel26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel26MouseClicked(evt);
            }
        });
        jLabel26.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLabel26KeyPressed(evt);
            }
        });
        jPanelStory_5.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 21, 700, 600));

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/LV 6 Puzzle.jpg"))); // NOI18N
        jLabel27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel27MouseClicked(evt);
            }
        });
        jLabel27.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLabel27KeyPressed(evt);
            }
        });
        jPanelStory_5.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 21, 700, 600));

        jTabbedPane1.addTab("tab12", jPanelStory_5);

        javax.swing.GroupLayout gamePanel6Layout = new javax.swing.GroupLayout(gamePanel6);
        gamePanel6.setLayout(gamePanel6Layout);
        gamePanel6Layout.setHorizontalGroup(
            gamePanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gamePanel6Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(o_gamePanel61, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        gamePanel6Layout.setVerticalGroup(
            gamePanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gamePanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(o_gamePanel61, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("tab11", gamePanel6);

        jPanelStory_6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        togamePanel7.setText("Skip");
        togamePanel7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                togamePanel7ActionPerformed(evt);
            }
        });
        jPanelStory_6.add(togamePanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 590, -1, -1));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Scene 22.jpg"))); // NOI18N
        jLabel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel19MouseClicked(evt);
            }
        });
        jLabel19.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLabel19KeyPressed(evt);
            }
        });
        jPanelStory_6.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 21, 700, 600));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Scene 23.jpg"))); // NOI18N
        jLabel20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel20MouseClicked(evt);
            }
        });
        jLabel20.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLabel20KeyPressed(evt);
            }
        });
        jPanelStory_6.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 21, 700, 600));

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Scene 24.jpg"))); // NOI18N
        jLabel21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel21MouseClicked(evt);
            }
        });
        jLabel21.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLabel21KeyPressed(evt);
            }
        });
        jPanelStory_6.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 21, 700, 600));

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/LV 7 Puzzle.jpg"))); // NOI18N
        jLabel22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel22MouseClicked(evt);
            }
        });
        jLabel22.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLabel22KeyPressed(evt);
            }
        });
        jPanelStory_6.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 21, 700, 600));

        jTabbedPane1.addTab("tab12", jPanelStory_6);

        javax.swing.GroupLayout gamePanel7Layout = new javax.swing.GroupLayout(gamePanel7);
        gamePanel7.setLayout(gamePanel7Layout);
        gamePanel7Layout.setHorizontalGroup(
            gamePanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gamePanel7Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(o_gamePanel71, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        gamePanel7Layout.setVerticalGroup(
            gamePanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gamePanel7Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(o_gamePanel71, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane1.addTab("tab11", gamePanel7);

        jPanelStory_7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        togamePanel8.setText("skip");
        togamePanel8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                togamePanel8ActionPerformed(evt);
            }
        });
        jPanelStory_7.add(togamePanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 590, -1, -1));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Scene 25.jpg"))); // NOI18N
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });
        jLabel16.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLabel16KeyPressed(evt);
            }
        });
        jPanelStory_7.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 21, 700, 600));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Scene 26.jpg"))); // NOI18N
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel17MouseClicked(evt);
            }
        });
        jLabel17.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLabel17KeyPressed(evt);
            }
        });
        jPanelStory_7.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 21, 700, 600));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/LV 8 Puzzle.jpg"))); // NOI18N
        jLabel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel18MouseClicked(evt);
            }
        });
        jLabel18.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLabel18KeyPressed(evt);
            }
        });
        jPanelStory_7.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 21, 700, 600));

        jTabbedPane1.addTab("tab12", jPanelStory_7);

        javax.swing.GroupLayout gamePanel8Layout = new javax.swing.GroupLayout(gamePanel8);
        gamePanel8.setLayout(gamePanel8Layout);
        gamePanel8Layout.setHorizontalGroup(
            gamePanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gamePanel8Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(o_gamePanel81, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        gamePanel8Layout.setVerticalGroup(
            gamePanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gamePanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(o_gamePanel81, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("tab11", gamePanel8);

        jPanelStory_8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Scene 27.jpg"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jLabel1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLabel1KeyPressed(evt);
            }
        });
        jPanelStory_8.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 21, 700, 600));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Scene 28.jpg"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jLabel2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLabel2KeyPressed(evt);
            }
        });
        jPanelStory_8.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-5, 19, 700, 600));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Scene 29.jpg"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jLabel3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLabel3KeyPressed(evt);
            }
        });
        jPanelStory_8.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 21, 700, 600));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Scene 30.jpg"))); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jLabel4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLabel4KeyPressed(evt);
            }
        });
        jPanelStory_8.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-5, 19, 700, 600));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Scene 31.jpg"))); // NOI18N
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jLabel5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLabel5KeyPressed(evt);
            }
        });
        jPanelStory_8.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 21, 700, 600));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Scene 32.jpg"))); // NOI18N
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        jLabel6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLabel6KeyPressed(evt);
            }
        });
        jPanelStory_8.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(-5, 19, 700, 600));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Scene 33.jpg"))); // NOI18N
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        jLabel7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLabel7KeyPressed(evt);
            }
        });
        jPanelStory_8.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 21, 700, 600));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Scene 34.jpg"))); // NOI18N
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jLabel8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLabel8KeyPressed(evt);
            }
        });
        jPanelStory_8.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(-5, 19, 700, 600));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Scene 35.jpg"))); // NOI18N
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        jLabel9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLabel9KeyPressed(evt);
            }
        });
        jPanelStory_8.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 21, 700, 600));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Scene 36.jpg"))); // NOI18N
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        jLabel10.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLabel10KeyPressed(evt);
            }
        });
        jPanelStory_8.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(-5, 19, 700, 600));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Scene 37.jpg"))); // NOI18N
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        jLabel11.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLabel11KeyPressed(evt);
            }
        });
        jPanelStory_8.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 21, 700, 600));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Scene 38.jpg"))); // NOI18N
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });
        jLabel12.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLabel12KeyPressed(evt);
            }
        });
        jPanelStory_8.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(-5, 19, 700, 600));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Scene 39.jpg"))); // NOI18N
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });
        jLabel13.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLabel13KeyPressed(evt);
            }
        });
        jPanelStory_8.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 21, 700, 600));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Scene 40.jpg"))); // NOI18N
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });
        jLabel14.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLabel14KeyPressed(evt);
            }
        });
        jPanelStory_8.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(-5, 19, 700, 600));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Scene 41.jpg"))); // NOI18N
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });
        jLabel15.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLabel15KeyPressed(evt);
            }
        });
        jPanelStory_8.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(-5, 19, 700, 600));

        jLabel54.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Credits.png"))); // NOI18N
        jLabel54.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel54MouseClicked(evt);
            }
        });
        jLabel54.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLabel54KeyPressed(evt);
            }
        });
        jPanelStory_8.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(-5, 19, 700, 600));

        jTabbedPane1.addTab("tab12", jPanelStory_8);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, -23, 698, 646));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        
        jTabbedPane1.setSelectedComponent(gamePanel3);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        
       
        jTabbedPane1.setSelectedComponent(gamePanel2);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void continueToStage1ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_continueToStage1ButtonActionPerformed
        

        jTabbedPane1.setSelectedComponent(gamePanel1);
    }//GEN-LAST:event_continueToStage1ButtonActionPerformed

    private void jButtonEasy00ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEasy00ActionPerformed
        
        // @here
        if(firstClick){
            firstClickRandomizer();
            //System.out.println("check check22");
            firstClick = false;
        }
        if(cardArrayS[0][0]==0 ){                 //***
            System.out.println("this card is already done"); // error counting ?
        }else if(x1==0 && y1==0){                 //***
            System.out.println("this is your 1st choice pick another card"); // error counting ?
        }else if(notDone==true && notDone2==true){                           //prevent actions while pairing
            System.out.println("di pa tpos mag compute sandali naman");
        }else if(clickCounter==1){
            notDone= true;
            clickCounter=2;
            
            b =cardArrayH[0][0];     //***
            buttonImageGiver(jButtonEasy00, b);
            x1=0;                                 //***
            y1=0;                                 //***
            System.out.println("1st choice");
        }else{
            
            notDone2= true;
            
            
            b =cardArrayH[0][0];     //***
            buttonImageGiver(jButtonEasy00, b);
            x2=0;                                 //*** 
            y2=0;                                 //***  
            System.out.println("2nd choice");
                
            try {
                ArrayHCompare();
            } catch (LineUnavailableException ex) {
                Logger.getLogger(mainFrame.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(mainFrame.class.getName()).log(Level.SEVERE, null, ex);
            } catch (UnsupportedAudioFileException ex) {
                Logger.getLogger(mainFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
            sumArrayS();             
            clickCounter=1;
            }
        
    }//GEN-LAST:event_jButtonEasy00ActionPerformed

    public void sumArrayS(){ //checks the array value to know how many left to pair and if the game ends
        sumAS=0;
        for(i = 0; i<cardInstances; i++)
            {
                for(j = 0; j<cardInstances; j++)
                    {
                        sumAS+=cardArrayS[i][j];
                    }
            }
         System.out.println("Cards to match: "+ sumAS);
         if(sumAS==0){
                System.out.println("Congrats! Game Completed");
                imageClear();
                firstClick = true;
                java.awt.EventQueue.invokeLater(new Runnable() {
                    public void run() {
                        new congratsWindow(1,jPanelStory_1,jTabbedPane1).setVisible(true); //--------
                    }
                });

            task.cancel(); // stop timer //--------
            setTimerImage(0, 0);
                
            }
         
    }
    public void sumArrayS1(){ //checks the array value to know how many left to pair and if the game ends
        sumAS=0;
        for (int[] eachRow : cardArrayS1) {
                        for (int j : eachRow) {
                                sumAS+=j;
                        }

                }
         System.out.println("Cards to match: "+ sumAS);
         if(sumAS==0){
             imageClear1();
                System.out.println("Congrats! Game Completed");
                firstClick = true;
                java.awt.EventQueue.invokeLater(new Runnable() {
                    public void run() {
                        new congratsWindow(2,jPanelStory_2,jTabbedPane1).setVisible(true); //--------
                    }
                });
            task1.cancel(); // stop timer //--------
            setTimerImage(0, 0);
            }
         
    }
    public void sumArrayS2(){ //checks the array value to know how many left to pair and if the game ends
        sumAS=0;
//        for(i = 0; i<cardInstances; i++)
//            {
//                for(j = 0; j<cardInstances; j++)
//                    {
//                        sumAS+=cardArrayS[i][j];
//                    }
//            }
        
        for (int[] eachRow : cardArrayS2) {
                        for (int j : eachRow) {
                                sumAS+=j;
                        }
//                        System.out.println("");
                }
         System.out.println("Cards to match: "+ sumAS);
         if(sumAS==0){
             imageClear1();
             
                
                System.out.println("Congrats! Game Completed");
                firstClick = true;
                java.awt.EventQueue.invokeLater(new Runnable() {
                    public void run() {
                        new congratsWindow(3,jPanelStory_3,jTabbedPane1).setVisible(true); //--------
                    }
                });

                task2.cancel(); // stop timer //--------
                setTimerImage(0, 0);
                
            }
         
    }
         
    public void ArrayHCompare() throws LineUnavailableException, IOException, UnsupportedAudioFileException{
        if(cardArrayH[x2][y2]==cardArrayH[x1][y1]){// compares 2 user inputed coord.
               //System.out.println("well done");
               cardArrayS[x2][y2]=0;
               cardArrayS[x1][y1]=0;
               try{
               this.correctStream = AudioSystem.getAudioInputStream(correctFile);
                this.correctClip= AudioSystem.getClip();
                correctClip.open(correctStream);
                correctClip.start();}
               catch(Exception E){
                   
               }
           } else{
               //System.out.println("WRONG"); count error
           }
            
            timer.schedule(new TimerTask(){ // Timer to para mag show ng saglet ung second card
                
                @Override
                public void run(){
                    imageClear();
                    notDone=false;
                    notDone2=false;
                }
            },500); 
            
    }
    public void ArrayHCompare1() throws UnsupportedAudioFileException, IOException, LineUnavailableException{
        if(cardArrayH1[x2][y2]==cardArrayH1[x1][y1]){// compares 2 user inputed coord.
               //System.out.println("well done");
               cardArrayS1[x2][y2]=0;
               cardArrayS1[x1][y1]=0;
               try{
               this.correctStream = AudioSystem.getAudioInputStream(correctFile);
                this.correctClip= AudioSystem.getClip();
                correctClip.open(correctStream);
                correctClip.start();}
               catch(Exception E){
                   
               }
           } else{
               //System.out.println("WRONG"); count error
           }
            
            timer.schedule(new TimerTask(){ // Timer to para mag show ng saglet ung second card
                
                @Override
                public void run(){
                    imageClear1();
                    notDone=false;
                    notDone2=false;
                }
            },500); 
            
    }
    public void ArrayHCompare2(){
        try{
        if(cardArrayH2[x2][y2]==cardArrayH2[x1][y1]){// compares 2 user inputed coord.
               //System.out.println("well done");
               cardArrayS2[x2][y2]=0;
               cardArrayS2[x1][y1]=0;
               
               try{
               this.correctStream = AudioSystem.getAudioInputStream(correctFile);
                this.correctClip= AudioSystem.getClip();
                correctClip.open(correctStream);
                correctClip.start();}
               catch(Exception E){
                   
               }
           } else{
               //System.out.println("WRONG"); count error
           }
        
            
            timer.schedule(new TimerTask(){ // Timer to para mag show ng saglet ung second card
                
                @Override
                public void run(){
                    imageClear2();
                    notDone=false;
                    notDone2=false;
                }
            },500); 
        }catch(Exception e){
            System.out.println("exception @ArrayHCompare2 ");
        }
    }
    
    public void imageClear(){

        switch(cardArrayS[0][0]){
            case 1:
                jButtonEasy00.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/@back.jpg")));
                break;
            case 0:
                jButtonEasy00.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/@solve.jpg")));
                break;      
        }
        switch(cardArrayS[0][1]){
            case 1:
                jButtonEasy01.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/@back.jpg")));
                break;
            case 0:
                jButtonEasy01.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/@solve.jpg")));
                break;      
        }
        
      
        switch(cardArrayS[1][0]){
            case 1:
                jButtonEasy10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/@back.jpg")));
                break;
            case 0:
                jButtonEasy10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/@solve.jpg")));
                break;     
        }
        switch(cardArrayS[1][1]){
            case 1:
                jButtonEasy11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/@back.jpg")));
                break;
            case 0:
                jButtonEasy11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/@solve.jpg")));
                break;     
        }
        
    }
    public void imageClear1(){

        switch(cardArrayS1[0][0]){
            case 1:
                jButtonEasyy00.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/@back.jpg")));
                break;
            case 0:
                jButtonEasyy00.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/@solve.jpg")));
                break;      
        }
        switch(cardArrayS1[0][1]){
            case 1:
                jButtonEasyy01.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/@back.jpg")));
                break;
            case 0:
                jButtonEasyy01.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/@solve.jpg")));
                break;      
        }
        
      
        switch(cardArrayS1[1][0]){
            case 1:
                jButtonEasyy10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/@back.jpg")));
                break;
            case 0:
                jButtonEasyy10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/@solve.jpg")));
                break;     
        }
        switch(cardArrayS1[1][1]){
            case 1:
                jButtonEasyy11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/@back.jpg")));
                break;
            case 0:
                jButtonEasyy11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/@solve.jpg")));
                break;     
        }
        switch(cardArrayS1[2][0]){
            case 1:
                jButtonEasyy20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/@back.jpg")));
                break;
            case 0:
                jButtonEasyy20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/@solve.jpg")));
                break;     
        }
        switch(cardArrayS1[2][1]){
            case 1:
                jButtonEasyy21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/@back.jpg")));
                break;
            case 0:
                jButtonEasyy21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/@solve.jpg")));
                break;     
        }
        
    }  
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
//        -------------------------
      
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
        
    }     
    public void buttonImageGiver(JButton a , int b){
        switch(b){
            case 1:
//                a.setIcon(imagea);
                a.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/01.jpg")));
                break;
            case 2:
//                a.setIcon(imageb);
                a.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/02.jpg")));
                break;
            case 3:
//                a.setIcon(imageb);
                a.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/03.jpg")));
                break;
            case 4:
//                a.setIcon(imagea);
                a.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/04.jpg")));
                break;
            case 5:
//                a.setIcon(imageb);
                a.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/05.jpg")));
                break;
            case 6:
//                a.setIcon(imageb);
                a.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/06.jpg")));
                break;
        }
    }
    public void firstClickRandomizer(){
        for (i=0;i<=cardInstances;i++){
                for(;;){                                    //first coordinate
                    x=(int)(Math.random()*2);
                    y=(int)(Math.random()*2);
                   if(cardArrayH[x][y]==0){
                       cardArrayH[x][y]=i;
                       break;
                   }else{
                       //System.out.println(x+" "+y);   
                   }
                }
                    for(;;){                                    //2nd coordinate but same value
                        x=(int)(Math.random()*2);
                        y=(int)(Math.random()*2);
                       if(cardArrayH[x][y]==0){
                           cardArrayH[x][y]=i;
                           break;
                       }else{
                           //System.out.println(x+" "+y);   
                       }
                    }
            }
        for(i=0;i<cardInstances;i++){
            for(j=0;j<cardInstances;j++){
                System.out.print(cardArrayH[i][j]+" ");
                }
            System.out.println(" ");
            }
         System.out.println(" ");
         for(i = 0; i<cardInstances; i++){
            for(j = 0; j<cardInstances; j++){
                cardArrayS [i][j]=1;
                System.out.print(cardArrayS[i][j]+" ");
                }
            System.out.println();
        }
        secNorma1_1 = DV.getDsecNorma1_1();;
        secHard_1 = DV.getDsecHard_1();;
        try{
        timer.scheduleAtFixedRate(task, 1000,1000); 
        }catch(Exception e){
            System.out.println("not the first" + e);
        }
    }   
    public void firstClickRandomizer1(){
        for (i=0;i<=cardInstances1;i++){
                for(;;){                                    //first coordinate
                    x=(int)(Math.random()*3);
                    y=(int)(Math.random()*2);
                    
                   if(cardArrayH1[x][y]==0){
                       cardArrayH1[x][y]=i;
                       System.out.println(x+ " "+ y);
                       break;
                   }else{
                       //System.out.println(x+" "+y);   
                   }
                }
                    for(;;){                                    //2nd coordinate but same value
                        x=(int)(Math.random()*3);
                        y=(int)(Math.random()*2);
//                        System.out.println(x+ " "+ y);
                       if(cardArrayH1[x][y]==0){
                           cardArrayH1[x][y]=i;
                           System.out.println(x+ " "+ y);
                           break;
                       }else{
                           //System.out.println(x+" "+y);   
                       }
                    }
            }
        for(i=0;i<3;i++){
            for(j=0;j<2;j++){
                System.out.print(cardArrayH1[i][j]+" ");
                }
            System.out.println(" ");
            }
         System.out.println(" ");

        
        for (int[] eachRow : cardArrayS1) {
                        for (int j : eachRow) {
                                
                                System.out.print(j + "\t");
                        }
                        System.out.println("");
                        
                }
        secNorma1_2 = DV.getDsecNorma1_2();
        secHard_2 = DV.getDsecHard_2();
        try{
        timer1.scheduleAtFixedRate(task1, 1000,1000); }
        catch(Exception e){
            System.out.println("not the first" + e);
        }
   
    }
    public void firstClickRandomizer2(){
        for (i=0;i<=cardInstances2;i++){
                for(;;){                                    //first coordinate
                    x=(int)(Math.random()*3);
                    y=(int)(Math.random()*4);
                    
                   if(cardArrayH2[x][y]==0){
                       cardArrayH2[x][y]=i;
//                       System.out.println(x+ " "+ y);
                       break;
                   }else{
                       //System.out.println(x+" "+y);   
                   }
                }
                    for(;;){                                    //2nd coordinate but same value
                        x=(int)(Math.random()*3);
                        y=(int)(Math.random()*4);
//                        System.out.println(x+ " "+ y);
                       if(cardArrayH2[x][y]==0){
                           cardArrayH2[x][y]=i;
//                           System.out.println(x+ " "+ y);
                           break;
                       }
                    }
            }
        for(i=0;i<3;i++){
            for(j=0;j<4;j++){
                System.out.print(cardArrayH2[i][j]+" ");
                }
            System.out.println(" ");
            }
         System.out.println(" ");

        
        for (int[] eachRow : cardArrayS2) {
                        for (int j : eachRow) {
                                
                                System.out.print(j + "\t");
                        }
                        System.out.println("");
                        
                }
         
        secNorma1_3 = DV.getDsecNorma1_3();
        secHard_3 = DV.getDsecHard_3();
        
        try{
            timer2.scheduleAtFixedRate(task2, 1000,1000);
         }
        catch(Exception e){
            System.out.println("not the first" + e);
        }
    }
    TimerTask task = new TimerTask(){ // timer ng oras
        public void run(){
            currentSettings cSettings = currentSettings.getInstance();
            
            int diff = cSettings.getDifficulty();
            switch (diff) {
                case 2:
                    {
                        // Normal
                        timerPanel.setVisible(true);
                        int ones = secNorma1_1% 10; //--------
                        int tens = secNorma1_1 /10; //--------
                        if (restartLevelWatcher){
                            setTimerImage(0, 0);
                        }else{
                            setTimerImage(ones, tens);
                        }       // Out of time Scenario Restarting Level
                        if(secNorma1_1==0){      //--------
                            resetGame();
                            imageClear();
                            levelFailedWindow();
                        }       secNorma1_1 --; //--------
                        break;
                    }
                case 3:
                    {
                        //Hard
                        timerPanel.setVisible(true);
                        int ones = secHard_1% 10; //--------
                        int tens = secHard_1 /10; //--------
                        setTimerImage(ones, tens);
                        // Out of time Scenario Restarting Level
                        if(secHard_1==0){          //--------
                            resetGame();
                            imageClear(); //--------
                            levelFailedWindow();
                        }       secHard_1 --; //--------
                        break;
                    }
                default:
                    timerPanel.setVisible(false);
                    break;
            }
        }
};
    TimerTask task1 = new TimerTask(){ // timer ng oras
        public void run(){
//            System.out.println("timer");
//            
            currentSettings cSettings = currentSettings.getInstance();
            
            int diff = cSettings.getDifficulty();
            switch (diff) {
                case 2:// Normal
                    {
                        
                        timerPanel.setVisible(true);
                        int ones = secNorma1_2% 10;
                        int tens = secNorma1_2 /10;
                        if (restartLevelWatcher){
                            setTimerImage(0, 0);
                        }else{
                            setTimerImage(ones, tens);
                        }       // Out of time Scenario Restarting Level
                        if(secNorma1_2==0){
                            resetGame1();
                            imageClear1();
                            levelFailedWindow();
                        }       secNorma1_2 --;
                        break;
                    }
                case 3://Hard
                    {
                        timerPanel.setVisible(true);
                        int ones = secHard_2% 10;
                        int tens = secHard_2 /10;
                        setTimerImage(ones, tens);
                        // Out of time Scenario Restarting Level
                        if(secHard_2==0){
                            resetGame1();
                            imageClear1();
                            levelFailedWindow();
                        }       secHard_2 --;
                        break;
                    }
                default:
                    timerPanel.setVisible(false);
                    break;
            }
        }
    };
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
    
    public void resetGame(){
        setTimerImage(0,0);
        cardArrayH = new int[2][2];
        cardArrayS = new int[2][2];
        firstClick=true;
        notDone=false;
        notDone2=false; 
        clickCounter=1;
        x1 = 50;x2 = 50;y1 = 50;y2 = 50;
        for(i = 0; i<cardInstances; i++){ // resetting summaryArray
            for(j = 0; j<cardInstances; j++){
                cardArrayS [i][j]=1;
            }
        }
    }
    public void resetGame1(){
        setTimerImage(0,0);
        cardArrayH1 = new int[3][2]; // -------
//        this.cardArrayS1 = { { 1, 1 }, { 1, 1}, { 1, 1 } }
//          RESETING THE Solution Array
        resetCardArrayS1();
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
    public void resetGame2(){
        setTimerImage(0,0);
        cardArrayH2 = new int[3][4]; // -------
//        this.cardArrayS1 = { { 1, 1 }, { 1, 1}, { 1, 1 } }
//          RESETING THE Solution Array
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
    public void resetCardArrayS1(){
        for(int i=0; i<cardArrayS1.length; i++) {//-------
            for(int j=0; j<cardArrayS1[i].length; j++) {//-------
                cardArrayS1[i][j]=1;//-------
            }
        }
    }
    public void resetCardArrayS2(){
        
        for(int i=0; i<cardArrayS2.length; i++) {//-------
            for(int j=0; j<cardArrayS2[i].length; j++) {//-------
//                System.out.println(i +" "+ j);
                cardArrayS2[i][j]=1;   //-------
                
            }
        }
    }
    public void levelFailedWindow(){
        java.awt.EventQueue.invokeLater(new Runnable() {// prompt to restart or quit
                        public void run() {
                            new levelFailedWindow(jTabbedPane1,difficultyPanel,playButton, startPanel).setVisible(true);
                        }
                    });
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
        }
        
    }
    TimerTask taskAnimate = new TimerTask(){ // timer ng oras
        public void run(){
            animation++;
            switch (animation){
            case 1:
                jLabelPanelAnimator.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/sidePaneAnimation 1.png")));
                break;
            case 2:
                jLabelPanelAnimator.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/sidePaneAnimation 2.png")));
                break;
            case 3:
                jLabelPanelAnimator.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/sidePaneAnimation 3.png")));
                break;
            case 4:
                jLabelPanelAnimator.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/sidePaneAnimation 4.png")));
                break;
            }
            if(animation== 4){
                animation = 0;
            }
        }
};
        
    private void jButtonEasy01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEasy01ActionPerformed
        
        if(firstClick){
            firstClickRandomizer();
            //System.out.println("check check22");
            firstClick = false;
        }
        if(cardArrayS[0][1]==0 ){                 //***
            System.out.println("this card is already done"); // error counting ?
        }else if(x1==0 && y1==1){                 //***
            System.out.println("this is your 1st choice pick another card"); // error counting ?
        }else if(notDone==true && notDone2==true){                           //prevent actions while pairing
            System.out.println("di pa tpos mag compute sandali naman");
        }else if(clickCounter==1){
            notDone= true;
            clickCounter=2;
            b =cardArrayH[0][1];     //***
            buttonImageGiver(jButtonEasy01, b);       //***
            x1=0;                                 //***
            y1=1;                                 //***
            System.out.println("1st choice");
        }else{
            
            notDone2= true;
            b =cardArrayH[0][1];     //***
            buttonImageGiver(jButtonEasy01, b);  //***
            x2=0;                                 //*** 
            y2=1;                                 //***  
            System.out.println("2nd choice");
                
            try {
                ArrayHCompare();
            } catch (LineUnavailableException ex) {
                Logger.getLogger(mainFrame.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(mainFrame.class.getName()).log(Level.SEVERE, null, ex);
            } catch (UnsupportedAudioFileException ex) {
                Logger.getLogger(mainFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
            sumArrayS();             
            clickCounter=1;
            }
    }//GEN-LAST:event_jButtonEasy01ActionPerformed

    private void jButtonEasy10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEasy10ActionPerformed
        
        if(firstClick){
            firstClickRandomizer();
            //System.out.println("check check22");
            firstClick = false;
        }
        if(cardArrayS[1][0]==0 ){                 //***
            System.out.println("this card is already done"); // error counting ?
        }else if(x1==1 && y1==0){                 //***
            System.out.println("this is your 1st choice pick another card"); // error counting ?
        }else if(notDone==true && notDone2==true){                           //prevent actions while pairing
            System.out.println("di pa tpos mag compute sandali naman");
        }else if(clickCounter==1){
            notDone= true;
            clickCounter=2;
            b =cardArrayH[1][0];     //***
            buttonImageGiver(jButtonEasy10, b);       //***
            x1=1;                                 //***
            y1=0;                                 //***
            System.out.println("1st choice");
        }else{
            
            notDone2= true;
            b =cardArrayH[1][0];     //***
            buttonImageGiver(jButtonEasy10, b);  //***
            x2=1;                                 //*** 
            y2=0;                                 //***  
            System.out.println("2nd choice");
                
            try {
                ArrayHCompare();
            } catch (LineUnavailableException ex) {
                Logger.getLogger(mainFrame.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(mainFrame.class.getName()).log(Level.SEVERE, null, ex);
            } catch (UnsupportedAudioFileException ex) {
                Logger.getLogger(mainFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
            sumArrayS();             
            clickCounter=1;
            }
    }//GEN-LAST:event_jButtonEasy10ActionPerformed

    private void jButtonEasy11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEasy11ActionPerformed
        
        if(firstClick){
            firstClickRandomizer();
            //System.out.println("check check22");
            firstClick = false;
        }
        if(cardArrayS[1][1]==0 ){                 //***
            System.out.println("this card is already done"); // error counting ?
        }else if(x1==1 && y1==1){                 //***
            System.out.println("this is your 1st choice pick another card"); // error counting ?
        }else if(notDone==true && notDone2==true){                           //prevent actions while pairing
            System.out.println("di pa tpos mag compute sandali naman");
        }else if(clickCounter==1){
            notDone= true;
            clickCounter=2;
            b =cardArrayH[1][1];     //***
            buttonImageGiver(jButtonEasy11, b);       //***
            x1=1;                                 //***
            y1=1;                                 //***
            System.out.println("1st choice");
        }else{
            
            notDone2= true;
            b =cardArrayH[1][1];     //***
            buttonImageGiver(jButtonEasy11, b);  //***
            x2=1;                                 //*** 
            y2=1;                                 //***  
            System.out.println("2nd choice");
                
            try {
                ArrayHCompare();
            } catch (LineUnavailableException ex) {
                Logger.getLogger(mainFrame.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(mainFrame.class.getName()).log(Level.SEVERE, null, ex);
            } catch (UnsupportedAudioFileException ex) {
                Logger.getLogger(mainFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
            sumArrayS();             
            clickCounter=1;
            }
    }//GEN-LAST:event_jButtonEasy11ActionPerformed

    private void jButtonEasyy10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEasyy10ActionPerformed
        
        if(firstClick){
            
            firstClickRandomizer1();
            
            //System.out.println("check check22");
            firstClick = false;
        }
        if(cardArrayS1[1][0]==0 ){                 //***
            System.out.println("this card is already done"); // error counting ?
        }else if(x1==1 && y1==0){                 //***
            System.out.println("this is your 1st choice pick another card"); // error counting ?
        }else if(notDone==true && notDone2==true){                           //prevent actions while pairing
            System.out.println("di pa tpos mag compute sandali naman");
        }else if(clickCounter==1){
            notDone= true;
            clickCounter=2;
            
            b =cardArrayH1[1][0];     //***
            buttonImageGiver(jButtonEasyy10, b);
            x1=1;                                 //***
            y1=0;                                 //***
            System.out.println("1st choice");
        }else{
            
            notDone2= true;
            
            
            b =cardArrayH1[1][0];     //***
            buttonImageGiver(jButtonEasyy10, b);
            x2=1;                                 //*** 
            y2=0;                                 //***  
            System.out.println("2nd choice");
                
            try {
                ArrayHCompare1();
            } catch (UnsupportedAudioFileException ex) {
                Logger.getLogger(mainFrame.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(mainFrame.class.getName()).log(Level.SEVERE, null, ex);
            } catch (LineUnavailableException ex) {
                Logger.getLogger(mainFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
            sumArrayS1();             
            clickCounter=1;
            }
   
    }//GEN-LAST:event_jButtonEasyy10ActionPerformed

    private void jButtonEasyy00ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEasyy00ActionPerformed
        
        if(firstClick){
            
            firstClickRandomizer1();
            
            //System.out.println("check check22");
            firstClick = false;
        }
        if(cardArrayS1[0][0]==0 ){                 //***
            System.out.println("this card is already done"); // error counting ?
        }else if(x1==0 && y1==0){                 //***
            System.out.println("this is your 1st choice pick another card"); // error counting ?
        }else if(notDone==true && notDone2==true){                           //prevent actions while pairing
            System.out.println("di pa tpos mag compute sandali naman");
        }else if(clickCounter==1){
            notDone= true;
            clickCounter=2;
            
            b =cardArrayH1[0][0];     //***
            buttonImageGiver(jButtonEasyy00, b);
            x1=0;                                 //***
            y1=0;                                 //***
            System.out.println("1st choice");
        }else{
            
            notDone2= true;
            
            
            b =cardArrayH1[0][0];     //***
            buttonImageGiver(jButtonEasyy00, b);
            x2=0;                                 //*** 
            y2=0;                                 //***  
            System.out.println("2nd choice");
                
            try {
                ArrayHCompare1();
            } catch (UnsupportedAudioFileException ex) {
                Logger.getLogger(mainFrame.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(mainFrame.class.getName()).log(Level.SEVERE, null, ex);
            } catch (LineUnavailableException ex) {
                Logger.getLogger(mainFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
            sumArrayS1();             
            clickCounter=1;
            }
        
    }//GEN-LAST:event_jButtonEasyy00ActionPerformed

    private void jButtonEasyy01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEasyy01ActionPerformed
        
        if(firstClick){
            
            firstClickRandomizer1();
            
            //System.out.println("check check22");
            firstClick = false;
        }
        if(cardArrayS1[0][1]==0 ){                 //***
            System.out.println("this card is already done"); // error counting ?
        }else if(x1==0 && y1==1){                 //***
            System.out.println("this is your 1st choice pick another card"); // error counting ?
        }else if(notDone==true && notDone2==true){                           //prevent actions while pairing
            System.out.println("di pa tpos mag compute sandali naman");
        }else if(clickCounter==1){
            notDone= true;
            clickCounter=2;
            
            b =cardArrayH1[0][1];     //***
            buttonImageGiver(jButtonEasyy01, b);
            x1=0;                                 //***
            y1=1;                                 //***
            System.out.println("1st choice");
        }else{
            
            notDone2= true;
            
            
            b =cardArrayH1[0][1];     //***
            buttonImageGiver(jButtonEasyy01, b);
            x2=0;                                 //*** 
            y2=1;                                 //***  
            System.out.println("2nd choice");
                
            try {
                ArrayHCompare1();
            } catch (UnsupportedAudioFileException ex) {
                Logger.getLogger(mainFrame.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(mainFrame.class.getName()).log(Level.SEVERE, null, ex);
            } catch (LineUnavailableException ex) {
                Logger.getLogger(mainFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
            sumArrayS1();             
            clickCounter=1;
            }
   
    }//GEN-LAST:event_jButtonEasyy01ActionPerformed

    private void jButtonEasyy11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEasyy11ActionPerformed
        
        if(firstClick){
            
            firstClickRandomizer1();
            
            //System.out.println("check check22");
            firstClick = false;
        }
        if(cardArrayS1[1][1]==0 ){                 //***
            System.out.println("this card is already done"); // error counting ?
        }else if(x1==1 && y1==1){                 //***
            System.out.println("this is your 1st choice pick another card"); // error counting ?
        }else if(notDone==true && notDone2==true){                           //prevent actions while pairing
            System.out.println("di pa tpos mag compute sandali naman");
        }else if(clickCounter==1){
            notDone= true;
            clickCounter=2;
            
            b =cardArrayH1[1][1];     //***
            buttonImageGiver(jButtonEasyy11, b);
            x1=1;                                 //***
            y1=1;                                 //***
            System.out.println("1st choice");
        }else{
            
            notDone2= true;
            
            
            b =cardArrayH1[1][1];     //***
            buttonImageGiver(jButtonEasyy11, b);
            x2=1;                                 //*** 
            y2=1;                                 //***  
            System.out.println("2nd choice");
                
            try {
                ArrayHCompare1();
            } catch (UnsupportedAudioFileException ex) {
                Logger.getLogger(mainFrame.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(mainFrame.class.getName()).log(Level.SEVERE, null, ex);
            } catch (LineUnavailableException ex) {
                Logger.getLogger(mainFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
            sumArrayS1();             
            clickCounter=1;
            }
   
    }//GEN-LAST:event_jButtonEasyy11ActionPerformed

    private void jButtonEasyy20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEasyy20ActionPerformed
        
        if(firstClick){
            
            firstClickRandomizer1();
            
            //System.out.println("check check22");
            firstClick = false;
        }
        if(cardArrayS1[2][0]==0 ){                 //***
            System.out.println("this card is already done"); // error counting ?
        }else if(x1==2 && y1==0){                 //***
            System.out.println("this is your 1st choice pick another card"); // error counting ?
        }else if(notDone==true && notDone2==true){                           //prevent actions while pairing
            System.out.println("di pa tpos mag compute sandali naman");
        }else if(clickCounter==1){
            notDone= true;
            clickCounter=2;
            
            b =cardArrayH1[2][0];     //***
            buttonImageGiver(jButtonEasyy20, b);
            x1=2;                                 //***
            y1=0;                                 //***
            System.out.println("1st choice");
        }else{
            
            notDone2= true;
            
            
            b =cardArrayH1[2][0];     //***
            buttonImageGiver(jButtonEasyy20, b);
            x2=2;                                 //*** 
            y2=0;                                 //***  
            System.out.println("2nd choice");
                
            try {
                ArrayHCompare1();
            } catch (UnsupportedAudioFileException ex) {
                Logger.getLogger(mainFrame.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(mainFrame.class.getName()).log(Level.SEVERE, null, ex);
            } catch (LineUnavailableException ex) {
                Logger.getLogger(mainFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
            sumArrayS1();             
            clickCounter=1;
            }
   
    }//GEN-LAST:event_jButtonEasyy20ActionPerformed

    private void jButtonEasyy21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEasyy21ActionPerformed
        
        if(firstClick){
            
            firstClickRandomizer1();
            
            //System.out.println("check check22");
            firstClick = false;
        }
        if(cardArrayS1[2][1]==0 ){                 //***
            System.out.println("this card is already done"); // error counting ?
        }else if(x1==2 && y1==1){                 //***
            System.out.println("this is your 1st choice pick another card"); // error counting ?
        }else if(notDone==true && notDone2==true){                           //prevent actions while pairing
            System.out.println("di pa tpos mag compute sandali naman");
        }else if(clickCounter==1){
            notDone= true;
            clickCounter=2;
            
            b =cardArrayH1[2][1];     //***
            buttonImageGiver(jButtonEasyy21, b);
            x1=2;                                 //***
            y1=1;                                 //***
            System.out.println("1st choice");
        }else{
            
            notDone2= true;
            
            
            b =cardArrayH1[2][1];     //***
            buttonImageGiver(jButtonEasyy21, b);
            x2=2;                                 //*** 
            y2=1;                                 //***  
            System.out.println("2nd choice");
                
            try {
                ArrayHCompare1();
            } catch (UnsupportedAudioFileException ex) {
                Logger.getLogger(mainFrame.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(mainFrame.class.getName()).log(Level.SEVERE, null, ex);
            } catch (LineUnavailableException ex) {
                Logger.getLogger(mainFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
            sumArrayS1();             
            clickCounter=1;
            }
   
    }//GEN-LAST:event_jButtonEasyy21ActionPerformed

    private void jButtonMedium00ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMedium00ActionPerformed
        
        if(firstClick){
            
            firstClickRandomizer2();
            
            //System.out.println("check check22");
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

    private void jButtonMedium10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMedium10ActionPerformed
        
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

    private void jButtonMedium01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMedium01ActionPerformed
        
        
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

    private void jButtonMedium11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMedium11ActionPerformed
        
        
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

    private void jButtonMedium21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMedium21ActionPerformed
        
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

    private void jButtonMedium20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMedium20ActionPerformed
        
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

    private void jButtonMedium02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMedium02ActionPerformed
        
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

    private void jButtonMedium12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMedium12ActionPerformed
        
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

    private void jButtonMedium22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMedium22ActionPerformed
        
        
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

    private void jButtonMedium03ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMedium03ActionPerformed
        
        
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

    private void jButtonMedium23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMedium23ActionPerformed
        
        
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

    private void playButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playButtonActionPerformed
        
        jButtonEasy.setToolTipText("Play in easy mode. There are no Time limits in every level");
        jButtonNormal.setToolTipText("Play in normal mode. The time is adequate enough to finish the levels");
        jButtonHard.setToolTipText("Play in hard mode. Each card must be paired with minimal errors to finish the game within the time limit.");
        difficultyPanel.setVisible(true);

        playButton.setVisible(false);
    }//GEN-LAST:event_playButtonActionPerformed

    private void jButtonEasyMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonEasyMouseEntered
        
        
    }//GEN-LAST:event_jButtonEasyMouseEntered

    private void jButtonEasyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEasyActionPerformed
        
        currentSettings cSettings = currentSettings.getInstance();
        cSettings.setDifficulty(1);

        jTabbedPane1.setSelectedComponent(instructionPanel);
    }//GEN-LAST:event_jButtonEasyActionPerformed

    private void jButtonNormalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNormalActionPerformed
        
        currentSettings cSettings = currentSettings.getInstance();
        cSettings.setDifficulty(2);
        
        jTabbedPane1.setSelectedComponent(instructionPanel);
    }//GEN-LAST:event_jButtonNormalActionPerformed

    private void jButtonHardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHardActionPerformed
        
        currentSettings cSettings = currentSettings.getInstance();
        cSettings.setDifficulty(3);
        
        jTabbedPane1.setSelectedComponent(instructionPanel);
    }//GEN-LAST:event_jButtonHardActionPerformed

    private void togamePanel4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_togamePanel4ActionPerformed
        
        jTabbedPane1.setSelectedComponent(gamePanel4);
        
    }//GEN-LAST:event_togamePanel4ActionPerformed

    private void togamePanel5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_togamePanel5ActionPerformed
        
        jTabbedPane1.setSelectedComponent(gamePanel5);
    }//GEN-LAST:event_togamePanel5ActionPerformed

    private void togamePanel6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_togamePanel6ActionPerformed
        
        jTabbedPane1.setSelectedComponent(gamePanel6);
    }//GEN-LAST:event_togamePanel6ActionPerformed

    private void togamePanel7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_togamePanel7ActionPerformed
        
        jTabbedPane1.setSelectedComponent(gamePanel7);
    }//GEN-LAST:event_togamePanel7ActionPerformed

    private void togamePanel8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_togamePanel8ActionPerformed
        
        jTabbedPane1.setSelectedComponent(gamePanel8);
    }//GEN-LAST:event_togamePanel8ActionPerformed

    private void jLabel1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel1KeyPressed
        
        jLabel1.setVisible(false);
    }//GEN-LAST:event_jLabel1KeyPressed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        
        jLabel1.setVisible(false);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        
        jLabel2.setVisible(false);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel2KeyPressed
        
        jLabel2.setVisible(false);
    }//GEN-LAST:event_jLabel2KeyPressed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        
        jLabel3.setVisible(false);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel3KeyPressed
        
        jLabel3.setVisible(false);
    }//GEN-LAST:event_jLabel3KeyPressed

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        jLabel4.setVisible(false);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel4KeyPressed
        jLabel4.setVisible(false);
    }//GEN-LAST:event_jLabel4KeyPressed

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        jLabel5.setVisible(false);
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel5KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel5KeyPressed
        jLabel5.setVisible(false);
    }//GEN-LAST:event_jLabel5KeyPressed

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        jLabel6.setVisible(false);
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel6KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel6KeyPressed
        jLabel6.setVisible(false);
    }//GEN-LAST:event_jLabel6KeyPressed

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        jLabel7.setVisible(false);
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel7KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel7KeyPressed
        jLabel7.setVisible(false);
    }//GEN-LAST:event_jLabel7KeyPressed

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        jLabel8.setVisible(false);
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel8KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel8KeyPressed
        jLabel8.setVisible(false);
    }//GEN-LAST:event_jLabel8KeyPressed

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        jLabel9.setVisible(false);
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel9KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel9KeyPressed
        jLabel9.setVisible(false);
    }//GEN-LAST:event_jLabel9KeyPressed

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        jLabel10.setVisible(false);
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel10KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel10KeyPressed
        jLabel10.setVisible(false);
    }//GEN-LAST:event_jLabel10KeyPressed

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        jLabel11.setVisible(false);
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jLabel11KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel11KeyPressed
        jLabel11.setVisible(false);
    }//GEN-LAST:event_jLabel11KeyPressed

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        jLabel12.setVisible(false);
    }//GEN-LAST:event_jLabel12MouseClicked

    private void jLabel12KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel12KeyPressed
        jLabel12.setVisible(false);
    }//GEN-LAST:event_jLabel12KeyPressed

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        jLabel13.setVisible(false);
    }//GEN-LAST:event_jLabel13MouseClicked

    private void jLabel13KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel13KeyPressed
        jLabel13.setVisible(false);
    }//GEN-LAST:event_jLabel13KeyPressed

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        jLabel14.setVisible(false);
    }//GEN-LAST:event_jLabel14MouseClicked

    private void jLabel14KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel14KeyPressed
        jLabel14.setVisible(false);
    }//GEN-LAST:event_jLabel14KeyPressed

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        jLabel15.setVisible(false);
    }//GEN-LAST:event_jLabel15MouseClicked

    private void jLabel15KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel15KeyPressed
        //ENDING SCENE CREDITS
    }//GEN-LAST:event_jLabel15KeyPressed

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        // TODO add your handling code here:
        jLabel16.setVisible(false);
    }//GEN-LAST:event_jLabel16MouseClicked

    private void jLabel16KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel16KeyPressed
        // TODO add your handling code here:
        jLabel16.setVisible(false);
    }//GEN-LAST:event_jLabel16KeyPressed

    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked
        // TODO add your handling code here:
        jLabel17.setVisible(false);
    }//GEN-LAST:event_jLabel17MouseClicked

    private void jLabel17KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel17KeyPressed
        // TODO add your handling code here:
        jLabel17.setVisible(false);
    }//GEN-LAST:event_jLabel17KeyPressed

    private void jLabel18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseClicked
        // TODO add your handling code here:
        jTabbedPane1.setSelectedComponent(gamePanel8);
    }//GEN-LAST:event_jLabel18MouseClicked

    private void jLabel18KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel18KeyPressed
        // TODO add your handling code here:
        jTabbedPane1.setSelectedComponent(gamePanel8);
    }//GEN-LAST:event_jLabel18KeyPressed

    private void jLabel19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseClicked
        // TODO add your handling code here:
        jLabel19.setVisible(false);
    }//GEN-LAST:event_jLabel19MouseClicked

    private void jLabel19KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel19KeyPressed
        // TODO add your handling code here:
        jLabel19.setVisible(false);
    }//GEN-LAST:event_jLabel19KeyPressed

    private void jLabel20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseClicked
        // TODO add your handling code here:
        jLabel20.setVisible(false);
    }//GEN-LAST:event_jLabel20MouseClicked

    private void jLabel20KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel20KeyPressed
        // TODO add your handling code here:
        jLabel20.setVisible(false);
    }//GEN-LAST:event_jLabel20KeyPressed

    private void jLabel21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseClicked
        // TODO add your handling code here:
        jLabel21.setVisible(false);
    }//GEN-LAST:event_jLabel21MouseClicked

    private void jLabel21KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel21KeyPressed
        // TODO add your handling code here:
        jLabel21.setVisible(false);
    }//GEN-LAST:event_jLabel21KeyPressed

    private void jLabel22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MouseClicked
        // TODO add your handling code here:
        jTabbedPane1.setSelectedComponent(gamePanel7);
    }//GEN-LAST:event_jLabel22MouseClicked

    private void jLabel22KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel22KeyPressed
        // TODO add your handling code here:
        jTabbedPane1.setSelectedComponent(gamePanel7);
    }//GEN-LAST:event_jLabel22KeyPressed

    private void jLabel23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel23MouseClicked
        // TODO add your handling code here:
        jLabel23.setVisible(false);
    }//GEN-LAST:event_jLabel23MouseClicked

    private void jLabel23KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel23KeyPressed
        // TODO add your handling code here:
        
        jLabel23.setVisible(false);
    }//GEN-LAST:event_jLabel23KeyPressed

    private void jLabel24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel24MouseClicked
        // TODO add your handling code here:
        jLabel24.setVisible(false);
    }//GEN-LAST:event_jLabel24MouseClicked

    private void jLabel24KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel24KeyPressed
        // TODO add your handling code here:
        jLabel24.setVisible(false);
    }//GEN-LAST:event_jLabel24KeyPressed

    private void jLabel25MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel25MouseClicked
        // TODO add your handling code here:
        jLabel25.setVisible(false);
    }//GEN-LAST:event_jLabel25MouseClicked

    private void jLabel25KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel25KeyPressed
        // TODO add your handling code here:
        jLabel25.setVisible(false);
    }//GEN-LAST:event_jLabel25KeyPressed

    private void jLabel26MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel26MouseClicked
        // TODO add your handling code here:
        jLabel26.setVisible(false);
    }//GEN-LAST:event_jLabel26MouseClicked

    private void jLabel26KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel26KeyPressed
        // TODO add your handling code here:
        jLabel26.setVisible(false);
    }//GEN-LAST:event_jLabel26KeyPressed

    private void jLabel27MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel27MouseClicked
        // TODO add your handling code here:
        jTabbedPane1.setSelectedComponent(gamePanel6);
    }//GEN-LAST:event_jLabel27MouseClicked

    private void jLabel27KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel27KeyPressed
        // TODO add your handling code here:
        jTabbedPane1.setSelectedComponent(gamePanel6);
    }//GEN-LAST:event_jLabel27KeyPressed

    private void jLabel28MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel28MouseClicked
        // TODO add your handling code here:
        jLabel28.setVisible(false);
    }//GEN-LAST:event_jLabel28MouseClicked

    private void jLabel28KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel28KeyPressed
        // TODO add your handling code here:
        jLabel28.setVisible(false);
    }//GEN-LAST:event_jLabel28KeyPressed

    private void jLabel29MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel29MouseClicked
        // TODO add your handling code here:
        jLabel29.setVisible(false);
    }//GEN-LAST:event_jLabel29MouseClicked

    private void jLabel29KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel29KeyPressed
        // TODO add your handling code here:
        jLabel29.setVisible(false);
    }//GEN-LAST:event_jLabel29KeyPressed

    private void jLabel30MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel30MouseClicked
        // TODO add your handling code here:
        jTabbedPane1.setSelectedComponent(gamePanel5);
    }//GEN-LAST:event_jLabel30MouseClicked

    private void jLabel30KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel30KeyPressed
        // TODO add your handling code here:
        jTabbedPane1.setSelectedComponent(gamePanel5);
    }//GEN-LAST:event_jLabel30KeyPressed

    private void jLabel31MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel31MouseClicked
        // TODO add your handling code here:
        jLabel31.setVisible(false);
    }//GEN-LAST:event_jLabel31MouseClicked

    private void jLabel31KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel31KeyPressed
        // TODO add your handling code here:
        jLabel31.setVisible(false);
    }//GEN-LAST:event_jLabel31KeyPressed

    private void jLabel32MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel32MouseClicked
        // TODO add your handling code here:
        jLabel32.setVisible(false);
    }//GEN-LAST:event_jLabel32MouseClicked

    private void jLabel32KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel32KeyPressed
        // TODO add your handling code here:
        jLabel32.setVisible(false);
    }//GEN-LAST:event_jLabel32KeyPressed

    private void jLabel33MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel33MouseClicked
        // TODO add your handling code here:
        jLabel33.setVisible(false);
    }//GEN-LAST:event_jLabel33MouseClicked

    private void jLabel33KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel33KeyPressed
        // TODO add your handling code here:
        jLabel32.setVisible(false);
    }//GEN-LAST:event_jLabel33KeyPressed

    private void jLabel34MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel34MouseClicked
        // TODO add your handling code here:
        jTabbedPane1.setSelectedComponent(gamePanel4);
    }//GEN-LAST:event_jLabel34MouseClicked

    private void jLabel34KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel34KeyPressed
        // TODO add your handling code here:
        jTabbedPane1.setSelectedComponent(gamePanel4);
    }//GEN-LAST:event_jLabel34KeyPressed

    private void jLabel35MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel35MouseClicked
        // TODO add your handling code here:
        jLabel35.setVisible(false);
    }//GEN-LAST:event_jLabel35MouseClicked

    private void jLabel35KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel35KeyPressed
        // TODO add your handling code here:
        
        jLabel35.setVisible(false);
    }//GEN-LAST:event_jLabel35KeyPressed

    private void jLabel36MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel36MouseClicked
        // TODO add your handling code here:
        jLabel36.setVisible(false);
    }//GEN-LAST:event_jLabel36MouseClicked

    private void jLabel36KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel36KeyPressed
        // TODO add your handling code here:
        jLabel36.setVisible(false);
    }//GEN-LAST:event_jLabel36KeyPressed

    private void jLabel37MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel37MouseClicked
        // TODO add your handling code here:
        jLabel37.setVisible(false);
    }//GEN-LAST:event_jLabel37MouseClicked

    private void jLabel37KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel37KeyPressed
        // TODO add your handling code here:
        jLabel37.setVisible(false);
    }//GEN-LAST:event_jLabel37KeyPressed

    private void jLabel38MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel38MouseClicked
        // TODO add your handling code here:
        jTabbedPane1.setSelectedComponent(gamePanel3);
    }//GEN-LAST:event_jLabel38MouseClicked

    private void jLabel38KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel38KeyPressed
        // TODO add your handling code here:
        jTabbedPane1.setSelectedComponent(gamePanel3);
    }//GEN-LAST:event_jLabel38KeyPressed

    private void jLabel39MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel39MouseClicked
        // TODO add your handling code here:
        jLabel39.setVisible(false);
    }//GEN-LAST:event_jLabel39MouseClicked

    private void jLabel39KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel39KeyPressed
        // TODO add your handling code here:
        jLabel39.setVisible(false);
    }//GEN-LAST:event_jLabel39KeyPressed

    private void jLabel40MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel40MouseClicked
        // TODO add your handling code here:
        jLabel40.setVisible(false);
    }//GEN-LAST:event_jLabel40MouseClicked

    private void jLabel40KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel40KeyPressed
        // TODO add your handling code here:
        jLabel41.setVisible(false);
    }//GEN-LAST:event_jLabel40KeyPressed

    private void jLabel41MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel41MouseClicked
        // TODO add your handling code here:
        jLabel41.setVisible(false);
    }//GEN-LAST:event_jLabel41MouseClicked

    private void jLabel41KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel41KeyPressed
        // TODO add your handling code here:
        jLabel41.setVisible(false);
    }//GEN-LAST:event_jLabel41KeyPressed

    private void jLabel42MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel42MouseClicked
        // TODO add your handling code here:
        jLabel42.setVisible(false);
    }//GEN-LAST:event_jLabel42MouseClicked

    private void jLabel42KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel42KeyPressed
        // TODO add your handling code here:
        jLabel42.setVisible(false);
    }//GEN-LAST:event_jLabel42KeyPressed

    private void jLabel43MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel43MouseClicked
        // TODO add your handling code here:
        jTabbedPane1.setSelectedComponent(gamePanel2);
    }//GEN-LAST:event_jLabel43MouseClicked

    private void jLabel43KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel43KeyPressed
        // TODO add your handling code here:
        jTabbedPane1.setSelectedComponent(gamePanel2);
    }//GEN-LAST:event_jLabel43KeyPressed

    private void jLabel44MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel44MouseClicked
        // TODO add your handling code here:
        jLabel44.setVisible(false);
    }//GEN-LAST:event_jLabel44MouseClicked

    private void jLabel44KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel44KeyPressed
        // TODO add your handling code here:
        jLabel44.setVisible(false);
    }//GEN-LAST:event_jLabel44KeyPressed

    private void jLabel45MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel45MouseClicked
        // TODO add your handling code here:
        jLabel45.setVisible(false);
    }//GEN-LAST:event_jLabel45MouseClicked

    private void jLabel45KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel45KeyPressed
        // TODO add your handling code here:
        jLabel45.setVisible(false);
    }//GEN-LAST:event_jLabel45KeyPressed

    private void jLabel46MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel46MouseClicked
        // TODO add your handling code here:
        jLabel46.setVisible(false);
    }//GEN-LAST:event_jLabel46MouseClicked

    private void jLabel46KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel46KeyPressed
        // TODO add your handling code here:
        jLabel46.setVisible(false);
    }//GEN-LAST:event_jLabel46KeyPressed

    private void jLabel47MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel47MouseClicked
        // TODO add your handling code here:
        jLabel47.setVisible(false);
    }//GEN-LAST:event_jLabel47MouseClicked

    private void jLabel47KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel47KeyPressed
        // TODO add your handling code here:
        jLabel47.setVisible(false);
    }//GEN-LAST:event_jLabel47KeyPressed

    private void jLabel48MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel48MouseClicked
        // TODO add your handling code here:
        jLabel48.setVisible(false);
    }//GEN-LAST:event_jLabel48MouseClicked

    private void jLabel48KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel48KeyPressed
        // TODO add your handling code here:
        jLabel48.setVisible(false);
    }//GEN-LAST:event_jLabel48KeyPressed

    private void jLabel49MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel49MouseClicked
        // TODO add your handling code here:
        
        jTabbedPane1.setSelectedComponent(gamePanel1);
    }//GEN-LAST:event_jLabel49MouseClicked

    private void jLabel49KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel49KeyPressed
        // TODO add your handling code here:
        
        jTabbedPane1.setSelectedComponent(gamePanel1);
    }//GEN-LAST:event_jLabel49KeyPressed

    private void coverInfoPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_coverInfoPanelMouseEntered
        // TODO add your handling code here:
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int centerX = screenSize.width/2;
        int centerY = screenSize.height/2;
        
         try {
            // These coordinates are screen coordinates
            int xCoord = centerX;
            int yCoord = centerY;

            // Move the cursor
            Robot robot = new Robot();
            robot.mouseMove(xCoord, yCoord);
          } catch (AWTException e) {
              System.out.println(e); 
          }
    }//GEN-LAST:event_coverInfoPanelMouseEntered

    private void MusicjToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MusicjToggleButton1ActionPerformed
        // TODO add your handling code here:
        if(MusicjToggleButton1.isSelected()){
            MusicjToggleButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/musicToggle_off.png")));
            bgmClip.stop();
        }else{
            MusicjToggleButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/musicToggle.png")));
            bgmClip.start();
        }
    }//GEN-LAST:event_MusicjToggleButton1ActionPerformed

    private void jLabel53MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel53MouseClicked
        // TODO add your handling code here:
        jLabel53.setVisible(false);
    }//GEN-LAST:event_jLabel53MouseClicked

    private void jLabel53KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel53KeyPressed
        // TODO add your handling code here:
        jLabel53.setVisible(false);
    }//GEN-LAST:event_jLabel53KeyPressed

    private void jLabel54MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel54MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel54MouseClicked

    private void jLabel54KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel54KeyPressed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel54KeyPressed

    private void jButtonHard1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHard1ActionPerformed
        // TODO add your handling code here:
        jTabbedPane1.setSelectedComponent(gamePanel4);
    }//GEN-LAST:event_jButtonHard1ActionPerformed

    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton MusicjToggleButton1;
    private javax.swing.JButton continueToStage1Button;
    private javax.swing.JPanel coverInfoPanel;
    private javax.swing.JPanel difficultyPanel;
    private javax.swing.JPanel gamePanel1;
    private javax.swing.JPanel gamePanel2;
    private javax.swing.JPanel gamePanel3;
    private javax.swing.JPanel gamePanel4;
    private javax.swing.JPanel gamePanel5;
    private javax.swing.JPanel gamePanel6;
    private javax.swing.JPanel gamePanel7;
    private javax.swing.JPanel gamePanel8;
    private javax.swing.JPanel instructionPanel;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButtonEasy;
    private javax.swing.JButton jButtonEasy00;
    private javax.swing.JButton jButtonEasy01;
    private javax.swing.JButton jButtonEasy10;
    private javax.swing.JButton jButtonEasy11;
    private javax.swing.JButton jButtonEasyy00;
    private javax.swing.JButton jButtonEasyy01;
    private javax.swing.JButton jButtonEasyy10;
    private javax.swing.JButton jButtonEasyy11;
    private javax.swing.JButton jButtonEasyy20;
    private javax.swing.JButton jButtonEasyy21;
    private javax.swing.JButton jButtonHard;
    private javax.swing.JButton jButtonHard1;
    private javax.swing.JButton jButtonMedium00;
    private javax.swing.JButton jButtonMedium01;
    private javax.swing.JButton jButtonMedium02;
    private javax.swing.JButton jButtonMedium03;
    private javax.swing.JButton jButtonMedium10;
    private javax.swing.JButton jButtonMedium11;
    private javax.swing.JButton jButtonMedium12;
    private javax.swing.JButton jButtonMedium13;
    private javax.swing.JButton jButtonMedium20;
    private javax.swing.JButton jButtonMedium21;
    private javax.swing.JButton jButtonMedium22;
    private javax.swing.JButton jButtonMedium23;
    private javax.swing.JButton jButtonNormal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelPanelAnimator;
    private javax.swing.JPanel jPanelStory_1;
    private javax.swing.JPanel jPanelStory_2;
    private javax.swing.JPanel jPanelStory_3;
    private javax.swing.JPanel jPanelStory_4;
    private javax.swing.JPanel jPanelStory_5;
    private javax.swing.JPanel jPanelStory_6;
    private javax.swing.JPanel jPanelStory_7;
    private javax.swing.JPanel jPanelStory_8;
    private javax.swing.JTabbedPane jTabbedPane1;
    private game.o_gamePanel4 o_gamePanel41;
    private game.o_gamePanel5 o_gamePanel51;
    private game.o_gamePanel6 o_gamePanel61;
    private game.o_gamePanel7 o_gamePanel71;
    private game.o_gamePanel8 o_gamePanel81;
    private javax.swing.JButton playButton;
    private javax.swing.JLabel sec100sDigit;
    private javax.swing.JLabel secOnesDigit;
    private javax.swing.JLabel secTensDigit;
    private javax.swing.JPanel sidePanel;
    private javax.swing.JPanel startPanel;
    private javax.swing.JPanel timerPanel;
    private javax.swing.JButton togamePanel4;
    private javax.swing.JButton togamePanel5;
    private javax.swing.JButton togamePanel6;
    private javax.swing.JButton togamePanel7;
    private javax.swing.JButton togamePanel8;
    // End of variables declaration//GEN-END:variables

    void hideTimerpanel() {
       timerPanel.setVisible(false);
       secTensDigit.setVisible(false);
       secOnesDigit.setVisible(false);
    }
}

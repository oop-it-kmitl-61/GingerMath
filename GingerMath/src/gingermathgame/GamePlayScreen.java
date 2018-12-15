/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gingermathgame;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author Corvette
 */
public class GamePlayScreen extends javax.swing.JFrame {
    
    private static GameImplement game;
    private Prepare pre;
    
    public GamePlayScreen() {
//       initComponents();
    }
    
    public GamePlayScreen(GameImplement game){
        initComponents();
        jPanel1.setBackground(new Color(0, 0, 0, 0));
        jPanel2.setBackground(new Color(0, 0, 0, 0));
        answerField.setBackground(new Color(0, 0, 0, 10));
        timeLabel.setText("");
        
        
        this.game = game;
        game.setParentFrame(this);
        game.setTimeLabel(timeLabel);
        game.setAnswerField(answerField);
        game.setTimeoutDialog(timeoutDialog);
        game.setScoreShowLabel(todscoreShowLabel);
        game.setStatus(false, false); // 1st is Pause Activate 2nd is Exit
        game.start();
        
        problemLabel.setText(game.getProblem1() + " + " + game.getProblem2());
        
        //timeoutDialog
        timeoutDialog.setBackground(new Color(0,0,0,70));
        todPanelCenter.setBackground(new Color(255,185,50));
        todPanelLeft.setBackground(new Color(0,0,0,0));
        todPanelRight.setBackground(new Color(0,0,0,0));
        todPanelTop.setBackground(new Color(0,0,0,0));
        todPanelBottom.setBackground(new Color(0,0,0,0));
        
        //pauseDialog
        pauseDialog.setBackground(new Color(0,0,0,70));
        pdPanelCenter.setBackground(new Color(255,185,50));
        pdPanelLeft.setBackground(new Color(0,0,0,0));
        pdPanelRight.setBackground(new Color(0,0,0,0));
        pdPanelTop.setBackground(new Color(0,0,0,0));
        pdPanelBottom.setBackground(new Color(0,0,0,0));
    
 
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        timeoutDialog = new javax.swing.JDialog();
        todPanelLeft = new javax.swing.JPanel();
        todPanelRight = new javax.swing.JPanel();
        todPanelTop = new javax.swing.JPanel();
        todPanelBottom = new javax.swing.JPanel();
        todPanelCenter = new javax.swing.JPanel();
        todtimeoutLabel = new javax.swing.JLabel();
        todscoreShowLabel = new javax.swing.JLabel();
        todmsgLabel = new javax.swing.JLabel();
        todbackBt = new javax.swing.JButton();
        todscoreBoardBt = new javax.swing.JButton();
        pauseDialog = new javax.swing.JDialog();
        pdPanelLeft = new javax.swing.JPanel();
        pdPanelRight = new javax.swing.JPanel();
        pdPanelTop = new javax.swing.JPanel();
        pdPanelBottom = new javax.swing.JPanel();
        pdPanelCenter = new javax.swing.JPanel();
        pdExitBt = new javax.swing.JButton();
        pdContinueBt = new javax.swing.JButton();
        pdGamepauseLabel = new javax.swing.JLabel();
        pdMessageLabel1 = new javax.swing.JLabel();
        pdMessageLabel2 = new javax.swing.JLabel();
        gradientPanel1 = new gingermathgame.GradientPanel();
        answerField = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        scoreLabel = new javax.swing.JLabel();
        problemLabel = new javax.swing.JLabel();
        timeLabel = new javax.swing.JLabel();

        timeoutDialog.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        timeoutDialog.setModalityType(java.awt.Dialog.ModalityType.APPLICATION_MODAL);
        timeoutDialog.setUndecorated(true);
        timeoutDialog.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                timeoutDialogComponentResized(evt);
            }
        });

        javax.swing.GroupLayout todPanelLeftLayout = new javax.swing.GroupLayout(todPanelLeft);
        todPanelLeft.setLayout(todPanelLeftLayout);
        todPanelLeftLayout.setHorizontalGroup(
            todPanelLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 177, Short.MAX_VALUE)
        );
        todPanelLeftLayout.setVerticalGroup(
            todPanelLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout todPanelRightLayout = new javax.swing.GroupLayout(todPanelRight);
        todPanelRight.setLayout(todPanelRightLayout);
        todPanelRightLayout.setHorizontalGroup(
            todPanelRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 176, Short.MAX_VALUE)
        );
        todPanelRightLayout.setVerticalGroup(
            todPanelRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout todPanelTopLayout = new javax.swing.GroupLayout(todPanelTop);
        todPanelTop.setLayout(todPanelTopLayout);
        todPanelTopLayout.setHorizontalGroup(
            todPanelTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        todPanelTopLayout.setVerticalGroup(
            todPanelTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout todPanelBottomLayout = new javax.swing.GroupLayout(todPanelBottom);
        todPanelBottom.setLayout(todPanelBottomLayout);
        todPanelBottomLayout.setHorizontalGroup(
            todPanelBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        todPanelBottomLayout.setVerticalGroup(
            todPanelBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        todtimeoutLabel.setFont(new java.awt.Font("Sweet Sensations Personal Use", 1, 48)); // NOI18N
        todtimeoutLabel.setForeground(new java.awt.Color(255, 255, 255));
        todtimeoutLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        todtimeoutLabel.setText("Timeout");

        todscoreShowLabel.setFont(new java.awt.Font("Sweet Pea", 1, 36)); // NOI18N
        todscoreShowLabel.setForeground(new java.awt.Color(255, 255, 255));
        todscoreShowLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        todscoreShowLabel.setText("Your Score  0");

        todmsgLabel.setFont(new java.awt.Font("Sweet Sensations Personal Use", 1, 24)); // NOI18N
        todmsgLabel.setForeground(new java.awt.Color(255, 255, 255));
        todmsgLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        todmsgLabel.setText("Congratulation");

        todbackBt.setText("Back to Main Menu");
        todbackBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                todbackBtActionPerformed(evt);
            }
        });

        todscoreBoardBt.setText("Scoreboard");

        javax.swing.GroupLayout todPanelCenterLayout = new javax.swing.GroupLayout(todPanelCenter);
        todPanelCenter.setLayout(todPanelCenterLayout);
        todPanelCenterLayout.setHorizontalGroup(
            todPanelCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(todPanelCenterLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(todscoreShowLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(50, 50, 50))
            .addGroup(todPanelCenterLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(todPanelCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(todPanelCenterLayout.createSequentialGroup()
                        .addComponent(todbackBt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(34, 34, 34)
                        .addComponent(todscoreBoardBt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(todmsgLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(todtimeoutLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(25, 25, 25))
        );
        todPanelCenterLayout.setVerticalGroup(
            todPanelCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(todPanelCenterLayout.createSequentialGroup()
                .addComponent(todtimeoutLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(todscoreShowLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(todmsgLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(todPanelCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(todbackBt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(todscoreBoardBt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(36, 36, 36))
        );

        javax.swing.GroupLayout timeoutDialogLayout = new javax.swing.GroupLayout(timeoutDialog.getContentPane());
        timeoutDialog.getContentPane().setLayout(timeoutDialogLayout);
        timeoutDialogLayout.setHorizontalGroup(
            timeoutDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(timeoutDialogLayout.createSequentialGroup()
                .addComponent(todPanelLeft, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(timeoutDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(timeoutDialogLayout.createSequentialGroup()
                        .addGroup(timeoutDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(timeoutDialogLayout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(todPanelBottom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(timeoutDialogLayout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(todPanelTop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(20, 20, 20)))
                        .addGap(43, 43, 43))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, timeoutDialogLayout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(todPanelCenter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(80, 80, 80)))
                .addComponent(todPanelRight, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        timeoutDialogLayout.setVerticalGroup(
            timeoutDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(todPanelLeft, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(todPanelRight, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(timeoutDialogLayout.createSequentialGroup()
                .addComponent(todPanelTop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(todPanelCenter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(36, 36, 36)
                .addComponent(todPanelBottom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        timeoutDialog.getAccessibleContext().setAccessibleDescription("");
        timeoutDialog.getAccessibleContext().setAccessibleParent(gradientPanel1);

        pauseDialog.setUndecorated(true);
        pauseDialog.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                pauseDialogComponentResized(evt);
            }
        });

        javax.swing.GroupLayout pdPanelLeftLayout = new javax.swing.GroupLayout(pdPanelLeft);
        pdPanelLeft.setLayout(pdPanelLeftLayout);
        pdPanelLeftLayout.setHorizontalGroup(
            pdPanelLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 203, Short.MAX_VALUE)
        );
        pdPanelLeftLayout.setVerticalGroup(
            pdPanelLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pdPanelRightLayout = new javax.swing.GroupLayout(pdPanelRight);
        pdPanelRight.setLayout(pdPanelRightLayout);
        pdPanelRightLayout.setHorizontalGroup(
            pdPanelRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 202, Short.MAX_VALUE)
        );
        pdPanelRightLayout.setVerticalGroup(
            pdPanelRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pdPanelTopLayout = new javax.swing.GroupLayout(pdPanelTop);
        pdPanelTop.setLayout(pdPanelTopLayout);
        pdPanelTopLayout.setHorizontalGroup(
            pdPanelTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pdPanelTopLayout.setVerticalGroup(
            pdPanelTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 97, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pdPanelBottomLayout = new javax.swing.GroupLayout(pdPanelBottom);
        pdPanelBottom.setLayout(pdPanelBottomLayout);
        pdPanelBottomLayout.setHorizontalGroup(
            pdPanelBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pdPanelBottomLayout.setVerticalGroup(
            pdPanelBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 96, Short.MAX_VALUE)
        );

        pdExitBt.setBackground(new java.awt.Color(100, 108, 119));
        pdExitBt.setFont(new java.awt.Font("Sweet Pea", 1, 18)); // NOI18N
        pdExitBt.setForeground(new java.awt.Color(255, 255, 255));
        pdExitBt.setText(" I'm quit ");
        pdExitBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pdExitBtActionPerformed(evt);
            }
        });

        pdContinueBt.setBackground(new java.awt.Color(138, 192, 84));
        pdContinueBt.setFont(new java.awt.Font("Sweet Pea", 1, 18)); // NOI18N
        pdContinueBt.setForeground(new java.awt.Color(255, 255, 255));
        pdContinueBt.setText(" Continue Game ");
        pdContinueBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pdContinueBtActionPerformed(evt);
            }
        });

        pdGamepauseLabel.setFont(new java.awt.Font("Sweet Sensations Personal Use", 1, 48)); // NOI18N
        pdGamepauseLabel.setForeground(new java.awt.Color(255, 255, 255));
        pdGamepauseLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pdGamepauseLabel.setText("Game Pause");

        pdMessageLabel1.setFont(new java.awt.Font("Kanit", 0, 18)); // NOI18N
        pdMessageLabel1.setForeground(new java.awt.Color(255, 255, 255));
        pdMessageLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pdMessageLabel1.setText("Do you need to quit this game?");

        pdMessageLabel2.setFont(new java.awt.Font("Kanit", 0, 18)); // NOI18N
        pdMessageLabel2.setForeground(new java.awt.Color(255, 255, 255));
        pdMessageLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pdMessageLabel2.setText("or just pause");

        javax.swing.GroupLayout pdPanelCenterLayout = new javax.swing.GroupLayout(pdPanelCenter);
        pdPanelCenter.setLayout(pdPanelCenterLayout);
        pdPanelCenterLayout.setHorizontalGroup(
            pdPanelCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pdPanelCenterLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(pdPanelCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pdPanelCenterLayout.createSequentialGroup()
                        .addComponent(pdMessageLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(23, 23, 23))
                    .addGroup(pdPanelCenterLayout.createSequentialGroup()
                        .addComponent(pdExitBt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(28, 28, 28)
                        .addComponent(pdContinueBt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(20, 20, 20))
                    .addGroup(pdPanelCenterLayout.createSequentialGroup()
                        .addComponent(pdMessageLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(31, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pdPanelCenterLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(pdGamepauseLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(51, 51, 51))
        );
        pdPanelCenterLayout.setVerticalGroup(
            pdPanelCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pdPanelCenterLayout.createSequentialGroup()
                .addComponent(pdGamepauseLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pdMessageLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pdMessageLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pdPanelCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pdPanelCenterLayout.createSequentialGroup()
                        .addComponent(pdContinueBt, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(20, 20, 20))
                    .addGroup(pdPanelCenterLayout.createSequentialGroup()
                        .addComponent(pdExitBt, javax.swing.GroupLayout.PREFERRED_SIZE, 34, Short.MAX_VALUE)
                        .addGap(22, 22, 22))))
        );

        javax.swing.GroupLayout pauseDialogLayout = new javax.swing.GroupLayout(pauseDialog.getContentPane());
        pauseDialog.getContentPane().setLayout(pauseDialogLayout);
        pauseDialogLayout.setHorizontalGroup(
            pauseDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pauseDialogLayout.createSequentialGroup()
                .addComponent(pdPanelLeft, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(26, 26, 26)
                .addGroup(pauseDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pauseDialogLayout.createSequentialGroup()
                        .addComponent(pdPanelBottom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(29, 29, 29))
                    .addGroup(pauseDialogLayout.createSequentialGroup()
                        .addComponent(pdPanelCenter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(14, 14, 14))
                    .addComponent(pdPanelTop, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(pdPanelRight, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pauseDialogLayout.setVerticalGroup(
            pauseDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pdPanelLeft, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pdPanelRight, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pauseDialogLayout.createSequentialGroup()
                .addComponent(pdPanelTop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(36, 36, 36)
                .addComponent(pdPanelCenter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(35, 35, 35)
                .addComponent(pdPanelBottom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        gradientPanel1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                gradientPanel1ComponentResized(evt);
            }
        });

        answerField.setFont(new java.awt.Font("SOV_Thanamas", 0, 36)); // NOI18N
        answerField.setForeground(new java.awt.Color(255, 255, 255));
        answerField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        answerField.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        answerField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                answerFieldActionPerformed(evt);
            }
        });
        answerField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                answerFieldKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 152, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 110, Short.MAX_VALUE)
        );

        scoreLabel.setFont(new java.awt.Font("Sweet Pea", 1, 24)); // NOI18N
        scoreLabel.setForeground(new java.awt.Color(255, 255, 255));
        scoreLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        scoreLabel.setText("  Score : 0");

        problemLabel.setFont(new java.awt.Font("SOV_Thanamas", 2, 48)); // NOI18N
        problemLabel.setForeground(new java.awt.Color(255, 255, 255));
        problemLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        problemLabel.setText("???");
        problemLabel.setToolTipText("");

        timeLabel.setFont(new java.awt.Font("Sweet Pea", 1, 24)); // NOI18N
        timeLabel.setForeground(new java.awt.Color(255, 255, 255));
        timeLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        timeLabel.setText("Timer");

        javax.swing.GroupLayout gradientPanel1Layout = new javax.swing.GroupLayout(gradientPanel1);
        gradientPanel1.setLayout(gradientPanel1Layout);
        gradientPanel1Layout.setHorizontalGroup(
            gradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gradientPanel1Layout.createSequentialGroup()
                .addGap(162, 162, 162)
                .addComponent(answerField)
                .addGap(160, 160, 160))
            .addGroup(gradientPanel1Layout.createSequentialGroup()
                .addGap(193, 193, 193)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(186, 186, 186))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gradientPanel1Layout.createSequentialGroup()
                .addGap(277, 277, 277)
                .addComponent(problemLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                .addGap(277, 277, 277))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gradientPanel1Layout.createSequentialGroup()
                .addComponent(scoreLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(36, 36, 36)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(162, 162, 162)
                .addComponent(timeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        gradientPanel1Layout.setVerticalGroup(
            gradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gradientPanel1Layout.createSequentialGroup()
                .addGroup(gradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scoreLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(gradientPanel1Layout.createSequentialGroup()
                        .addComponent(timeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(12, 12, 12)))
                .addComponent(problemLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(answerField, javax.swing.GroupLayout.PREFERRED_SIZE, 66, Short.MAX_VALUE)
                .addGap(50, 50, 50)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(gradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(gradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        
    }//GEN-LAST:event_formKeyPressed

    private void gradientPanel1ComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_gradientPanel1ComponentResized
        double component = getWidth()*getHeight();
        double current = 854*480;

        problemLabel.setFont(new Font(problemLabel.getFont().getName(), problemLabel.getFont().getStyle(), (int)(48*(component/current))));
        answerField.setFont(new Font(answerField.getFont().getName(), answerField.getFont().getStyle(), (int)(24*(component/current))));
        scoreLabel.setFont(new Font(scoreLabel.getFont().getName(), scoreLabel.getFont().getStyle(), (int)(24*(component/current))));
        timeLabel.setFont(new Font(timeLabel.getFont().getName(), timeLabel.getFont().getStyle(), (int)(24*(component/current))));

    }//GEN-LAST:event_gradientPanel1ComponentResized

    private void answerFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_answerFieldKeyPressed
//        if(evt.getKeyCode()==KeyEvent.VK_ESCAPE){
//            game.setStatus(true, false);
//            int n = JOptionPane.showConfirmDialog(null, "Back to Main Manu? Really??", "Game Pause", JOptionPane.YES_NO_OPTION);
//            if(n == 0){
//                MainMenu main = new MainMenu();
//                setAlwaysOnTop(true);
//                main.setSize(getSize());
//                main.setLocationRelativeTo(this);
//                main.setVisible(true);
//                game.setStatus(false, true);
//                dispose();
//                //try to discontinue game
//            }else{
//                game.setStatus(false, false);
//            }
//        }
        if(evt.getKeyCode()==KeyEvent.VK_ESCAPE){
            game.setStatus(true, false);
            pauseDialog.setSize(this.getSize());
            pauseDialog.setLocationRelativeTo(this);
            pauseDialog.setVisible(true);
        }      
    }//GEN-LAST:event_answerFieldKeyPressed

    private void answerFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_answerFieldActionPerformed
        try{
            int res = Integer.parseInt(answerField.getText());
            if(game.check(res)){
                scoreLabel.setText("  Score : " + game.getScore());
                answerField.setText("");
                answerField.setBackground(new Color(0, 0, 0, 10));
                problemLabel.setText(game.getProblem1() + " + " + game.getProblem2());
            }else{
                answerField.setBackground(new Color(253, 66, 26, 90));
            }
        }catch(NumberFormatException ex){
            answerField.setBackground(new Color(253, 66, 26, 90));
        }
        
    }//GEN-LAST:event_answerFieldActionPerformed

    private void timeoutDialogComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_timeoutDialogComponentResized
        
        double component = getWidth()*getHeight();
        double current = 854*480;
        double size = Math.log(component / current) + 1;
        
        todscoreBoardBt.setFont(new Font(todscoreBoardBt.getFont().getName(), todscoreBoardBt.getFont().getStyle(), (int)(14*(size))));
        todtimeoutLabel.setFont(new Font(todtimeoutLabel.getFont().getName(), todtimeoutLabel.getFont().getStyle(), (int)(52*(size))));
        todscoreShowLabel.setFont(new Font(todscoreShowLabel.getFont().getName(), todscoreShowLabel.getFont().getStyle(), (int)(36*(size))));
        todmsgLabel.setFont(new Font(todmsgLabel.getFont().getName(), todmsgLabel.getFont().getStyle(), (int)(24*(size))));
        todbackBt.setFont(new Font(todbackBt.getFont().getName(), todbackBt.getFont().getStyle(), (int)(14*(size))));
    }//GEN-LAST:event_timeoutDialogComponentResized

    private void todbackBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_todbackBtActionPerformed
        timeoutDialog.dispose();
        timeoutDialog.setVisible(false);
        MainMenu main = new MainMenu();
        setAlwaysOnTop(true);
        main.setSize(getSize());
        main.setLocationRelativeTo(this);
        main.setVisible(true);
        dispose();
    }//GEN-LAST:event_todbackBtActionPerformed

    private void pdExitBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pdExitBtActionPerformed
        MainMenu main = new MainMenu();
        setAlwaysOnTop(true);
        main.setSize(getSize());
        main.setLocationRelativeTo(this);
        main.setVisible(true);
        game.setStatus(false, true);
        pauseDialog.dispose();
        dispose();
    }//GEN-LAST:event_pdExitBtActionPerformed

    private void pdContinueBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pdContinueBtActionPerformed
        pauseDialog.dispose();
        game.setStatus(false, false);
    }//GEN-LAST:event_pdContinueBtActionPerformed

    private void pauseDialogComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_pauseDialogComponentResized
        double component = getWidth()*getHeight();
        double current = 854*480;
        double size = Math.log(component / current) + 1;
        
        pdMessageLabel1.setFont(new Font(pdMessageLabel1.getFont().getName(), pdMessageLabel1.getFont().getStyle(), (int)(18*(size))));
        pdMessageLabel2.setFont(new Font(pdMessageLabel2.getFont().getName(), pdMessageLabel2.getFont().getStyle(), (int)(18*(size))));
        pdGamepauseLabel.setFont(new Font(pdGamepauseLabel.getFont().getName(), pdGamepauseLabel.getFont().getStyle(), (int)(48*(size))));
        pdContinueBt.setFont(new Font(pdContinueBt.getFont().getName(), pdContinueBt.getFont().getStyle(), (int)(18*(size))));
        pdExitBt.setFont(new Font(pdExitBt.getFont().getName(), pdExitBt.getFont().getStyle(), (int)(18*(size))));

    }//GEN-LAST:event_pauseDialogComponentResized
    

    
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
            java.util.logging.Logger.getLogger(GamePlayScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GamePlayScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GamePlayScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GamePlayScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GamePlayScreen().setVisible(true);
            }
        });
    }{
    
    }
    
    
//	}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected javax.swing.JTextField answerField;
    protected gingermathgame.GradientPanel gradientPanel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JDialog pauseDialog;
    private javax.swing.JButton pdContinueBt;
    private javax.swing.JButton pdExitBt;
    private javax.swing.JLabel pdGamepauseLabel;
    private javax.swing.JLabel pdMessageLabel1;
    private javax.swing.JLabel pdMessageLabel2;
    private javax.swing.JPanel pdPanelBottom;
    private javax.swing.JPanel pdPanelCenter;
    private javax.swing.JPanel pdPanelLeft;
    private javax.swing.JPanel pdPanelRight;
    private javax.swing.JPanel pdPanelTop;
    protected static javax.swing.JLabel problemLabel;
    protected javax.swing.JLabel scoreLabel;
    protected static javax.swing.JLabel timeLabel;
    protected javax.swing.JDialog timeoutDialog;
    private javax.swing.JPanel todPanelBottom;
    private javax.swing.JPanel todPanelCenter;
    private javax.swing.JPanel todPanelLeft;
    private javax.swing.JPanel todPanelRight;
    private javax.swing.JPanel todPanelTop;
    private javax.swing.JButton todbackBt;
    private javax.swing.JLabel todmsgLabel;
    private javax.swing.JButton todscoreBoardBt;
    private javax.swing.JLabel todscoreShowLabel;
    private javax.swing.JLabel todtimeoutLabel;
    // End of variables declaration//GEN-END:variables
}

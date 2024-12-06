/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package projectmanagementproject;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author MiSat0535
 */
public class Quiz extends javax.swing.JFrame {

    ProjectManagementProject firstWindow;
    Question questionsList[] =  new Question[10];
    
    /**
     * Creates new form Quiz
     */
    public Quiz(ProjectManagementProject m) {
        initComponents();
        readFile();
        firstWindow = m;
        lblQNum.setText("Question 1");
        lblQuestion.setText(questionsList[0].getQuestion());
        btnAns1.setText(questionsList[0].getAnswer1());
        btnAns2.setText(questionsList[0].getAnswer2());
        btnAns3.setText(questionsList[0].getAnswer3());
        btnAns4.setText(questionsList[0].getAnswer4());
    }
    
    public void readFile() {
        
        String question, answer1, answer2, answer3, answer4, correctAnswer;
        int i = 0;
        
        try {
            File f = new File("src\\projectmanagementproject\\questionslist.txt");
            Scanner s = new Scanner(f);
            while (s.hasNextLine()) {
                question = s.nextLine();
                answer1 = s.nextLine();
                answer2 = s.nextLine();
                answer3 = s.nextLine();
                answer4 = s.nextLine();
                correctAnswer = s.nextLine();
                questionsList[i] = new Question(question, answer1, answer2, answer3, answer4, correctAnswer);
                i++;
            }
        } catch (FileNotFoundException e)  {
            System.out.println(e);
        }
                
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        btnCheck = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        btnAns1 = new javax.swing.JRadioButton();
        btnAns2 = new javax.swing.JRadioButton();
        btnAns3 = new javax.swing.JRadioButton();
        btnAns4 = new javax.swing.JRadioButton();
        lblQuestion = new javax.swing.JLabel();
        lblQNum = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        lblQuiz = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 153));

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));

        btnCheck.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnCheck.setText("Check Correct");
        btnCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckActionPerformed(evt);
            }
        });

        btnNext.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnNext.setText("Next Question");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        buttonGroup1.add(btnAns1);
        btnAns1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnAns1.setText("Option A");
        btnAns1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAns1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(btnAns2);
        btnAns2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnAns2.setText("Option B");
        btnAns2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAns2ActionPerformed(evt);
            }
        });

        buttonGroup1.add(btnAns3);
        btnAns3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnAns3.setText("Option C");
        btnAns3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAns3ActionPerformed(evt);
            }
        });

        buttonGroup1.add(btnAns4);
        btnAns4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnAns4.setText("Option D");
        btnAns4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAns4ActionPerformed(evt);
            }
        });

        lblQuestion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblQuestion.setText("Question");

        lblQNum.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblQNum.setText("Question #");

        btnBack.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblQuiz.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lblQuiz.setText("Practice MC Quiz");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(265, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lblQuiz)
                        .addGap(287, 287, 287))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnBack)
                        .addGap(47, 47, 47))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(186, 186, 186)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnNext)
                    .addComponent(lblQuestion)
                    .addComponent(lblQNum)
                    .addComponent(btnAns1)
                    .addComponent(btnAns2)
                    .addComponent(btnAns3)
                    .addComponent(btnAns4)
                    .addComponent(btnCheck))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lblQuiz)
                .addGap(57, 57, 57)
                .addComponent(lblQNum)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblQuestion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAns1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAns2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAns3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAns4)
                .addGap(18, 18, 18)
                .addComponent(btnCheck)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnNext)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                .addComponent(btnBack)
                .addGap(43, 43, 43))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        firstWindow.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnAns1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAns1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAns1ActionPerformed

    private void btnCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckActionPerformed

        
        
    }//GEN-LAST:event_btnCheckActionPerformed

    private void btnAns2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAns2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAns2ActionPerformed

    private void btnAns3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAns3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAns3ActionPerformed

    private void btnAns4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAns4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAns4ActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNextActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton btnAns1;
    private javax.swing.JRadioButton btnAns2;
    private javax.swing.JRadioButton btnAns3;
    private javax.swing.JRadioButton btnAns4;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCheck;
    private javax.swing.JButton btnNext;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblQNum;
    private javax.swing.JLabel lblQuestion;
    private javax.swing.JLabel lblQuiz;
    // End of variables declaration//GEN-END:variables
}

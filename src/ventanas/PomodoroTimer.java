
package ventanas;

import java.awt.Toolkit;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Formatter;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javafx.util.Duration.millis;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Edson Antonio
 */

public class PomodoroTimer extends javax.swing.JFrame {
    Timer timer;
    int pomodoroNo;
    boolean paused;
    
    public PomodoroTimer() 
    {   
        initComponents();
        
    }

    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pomodoroPanel = new javax.swing.JPanel();
        pomodoroTimeLabel = new javax.swing.JLabel();
        longBreakLabel1 = new javax.swing.JLabel();
        shortBreakLabel = new javax.swing.JLabel();
        longBreakLabel = new javax.swing.JLabel();
        pause = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        timerLabel = new javax.swing.JLabel();
        pomodoroCounter = new javax.swing.JLabel();
        timeElapsed = new javax.swing.JLabel();
        pomodoroTime = new javax.swing.JTextField();
        shortBreakTime = new javax.swing.JTextField();
        longBreakTime = new javax.swing.JTextField();
        start = new javax.swing.JButton();
        descanso = new javax.swing.JLabel();
        longBreakLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        pomodoroPanel.setBackground(new java.awt.Color(204, 204, 204));
        pomodoroPanel.setToolTipText("");

        pomodoroTimeLabel.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        pomodoroTimeLabel.setForeground(new java.awt.Color(204, 0, 0));
        pomodoroTimeLabel.setText("Tiempo Pomodoro: ");

        longBreakLabel1.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        longBreakLabel1.setForeground(new java.awt.Color(204, 0, 51));
        longBreakLabel1.setText("Pomodoro #");

        shortBreakLabel.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        shortBreakLabel.setForeground(new java.awt.Color(204, 0, 51));
        shortBreakLabel.setText("Tiempo descanzo corto");

        longBreakLabel.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        longBreakLabel.setForeground(new java.awt.Color(204, 0, 51));
        longBreakLabel.setText("Tiempo descanzo largo");

        pause.setFont(new java.awt.Font("Calibri", 1, 11)); // NOI18N
        pause.setText("PAUSA");
        pause.setDoubleBuffered(true);
        pause.setEnabled(false);
        pause.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pauseActionPerformed(evt);
            }
        });

        reset.setFont(new java.awt.Font("Calibri", 1, 11)); // NOI18N
        reset.setText("REINICIAR");
        reset.setEnabled(false);
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        timerLabel.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        timerLabel.setText("Tiempo:");

        pomodoroCounter.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        pomodoroCounter.setText("0");

        timeElapsed.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        timeElapsed.setText("0:00:00");

        pomodoroTime.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pomodoroTime.setText("0:00:10");
        pomodoroTime.setAlignmentY(0.6F);
        pomodoroTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pomodoroTimeActionPerformed(evt);
            }
        });

        shortBreakTime.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        shortBreakTime.setText("0:00:05");
        shortBreakTime.setAlignmentY(0.6F);
        shortBreakTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shortBreakTimeActionPerformed(evt);
            }
        });

        longBreakTime.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        longBreakTime.setText("0:00:15");
        longBreakTime.setAlignmentY(0.6F);

        start.setFont(new java.awt.Font("Calibri", 1, 11)); // NOI18N
        start.setText("INICIO");
        start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startActionPerformed(evt);
            }
        });

        descanso.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        descanso.setText("0");

        longBreakLabel2.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        longBreakLabel2.setForeground(new java.awt.Color(204, 0, 51));
        longBreakLabel2.setText("Descanso");

        javax.swing.GroupLayout pomodoroPanelLayout = new javax.swing.GroupLayout(pomodoroPanel);
        pomodoroPanel.setLayout(pomodoroPanelLayout);
        pomodoroPanelLayout.setHorizontalGroup(
            pomodoroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pomodoroPanelLayout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addGroup(pomodoroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pomodoroPanelLayout.createSequentialGroup()
                        .addGroup(pomodoroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pomodoroPanelLayout.createSequentialGroup()
                                .addComponent(start)
                                .addGap(46, 46, 46)
                                .addComponent(pause)
                                .addGap(76, 76, 76))
                            .addGroup(pomodoroPanelLayout.createSequentialGroup()
                                .addGroup(pomodoroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(pomodoroPanelLayout.createSequentialGroup()
                                        .addGroup(pomodoroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(pomodoroTimeLabel)
                                            .addComponent(longBreakLabel)
                                            .addComponent(shortBreakLabel))
                                        .addGap(30, 30, 30))
                                    .addGroup(pomodoroPanelLayout.createSequentialGroup()
                                        .addComponent(descanso)
                                        .addGap(70, 70, 70))
                                    .addGroup(pomodoroPanelLayout.createSequentialGroup()
                                        .addComponent(timerLabel)
                                        .addGap(41, 41, 41)))
                                .addGroup(pomodoroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(timeElapsed)
                                    .addGroup(pomodoroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(longBreakTime, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(pomodoroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(shortBreakTime, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                                            .addComponent(pomodoroTime, javax.swing.GroupLayout.Alignment.LEADING))))))
                        .addContainerGap(69, Short.MAX_VALUE))
                    .addGroup(pomodoroPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(reset)
                        .addGap(25, 25, 25))
                    .addGroup(pomodoroPanelLayout.createSequentialGroup()
                        .addGroup(pomodoroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(longBreakLabel2)
                            .addGroup(pomodoroPanelLayout.createSequentialGroup()
                                .addComponent(longBreakLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(pomodoroCounter)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        pomodoroPanelLayout.setVerticalGroup(
            pomodoroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pomodoroPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(pomodoroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pomodoroTimeLabel)
                    .addComponent(pomodoroTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pomodoroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(shortBreakLabel)
                    .addComponent(shortBreakTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pomodoroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(longBreakLabel)
                    .addComponent(longBreakTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pomodoroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(longBreakLabel1)
                    .addComponent(pomodoroCounter))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pomodoroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(longBreakLabel2)
                    .addComponent(descanso))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pomodoroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(timerLabel)
                    .addComponent(timeElapsed))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(pomodoroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(reset)
                    .addComponent(pause)
                    .addComponent(start))
                .addGap(20, 20, 20))
        );

        jButton1.setFont(new java.awt.Font("Calibri", 1, 11)); // NOI18N
        jButton1.setText("CANCELAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pomodoroPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(pomodoroPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(23, 23, 23))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    public void setTime(int time) 
    {   
            
            long timeNow = 1000*time;
            long second = (timeNow / 1000) % 60;
            long minute = (timeNow / (1000 * 60)) % 60;
            long hour = (timeNow / (1000 * 60 * 60)) % 24;
            timeElapsed.setText(String.format("%02d:%02d:%02d", hour, minute, second));
    }
    public void pomodoroTimer() 
    {  
        timer = new Timer();
        timer.schedule(new TimerTask()  {
        int counter = 0;
        String [] customTime = pomodoroTime.getText().split(":");
        int counterLimit = Integer.parseInt(customTime[0])*60*60 + Integer.parseInt(customTime[1])*60+
                 Integer.parseInt(customTime[2]);
        
        @Override
        public void run()
            {   
                if(!paused)
                { 
                ++counter;
                setTime(counter);
                if(counter == counterLimit && pomodoroNo < 4) //si se completan menos de 4 pomodoros, tómese un breve descanso

                    {   
                       timer.cancel();
                       Toolkit.getDefaultToolkit().beep();
                       JOptionPane.showMessageDialog(null,"Terminaste un Pomodoro! Toma un descanso");
                       shortBreakTimer();
                       pomodoroNo ++;
                       String pomcon=String.valueOf(pomodoroNo);
                       pomodoroCounter.setText(pomcon);
                       
                    }
           
                else if (counter == counterLimit && pomodoroNo == 4) //si se completan 4 pomodoros, descanso largo
                    {
                        timer.cancel();
                        Toolkit.getDefaultToolkit().beep();
                        JOptionPane.showMessageDialog(null,"Terminaste 4 Pomodoro! Toma un descanso largo");
                        longBreakTimer();
                    }
                }   }},0,1000);
            
    }
    
    

    public void shortBreakTimer() //descanso corto
    {   
        timer = new Timer();
        timer.schedule(new TimerTask()  {
        int counter = 0;
        int shortbreak = 0;
        String [] customTime = shortBreakTime.getText().split(":");
        int counterLimit = Integer.parseInt(customTime[0])*60*60 + Integer.parseInt(customTime[1])*60+
                 Integer.parseInt(customTime[2]);
       
        @Override
        public void run()
            {   
                if (!paused)
                {
                ++counter;
                setTime(counter);
                if(counter == counterLimit) 
                    {  timer.cancel();
                       Toolkit.getDefaultToolkit().beep();
                       JOptionPane.showMessageDialog(null,"Se acabo el tiempo! Continua el trabajo.");
                       pomodoroTimer();
                       shortbreak++;
                       String srtbrk=String.valueOf(shortbreak);
                       descanso.setText(srtbrk);
                       
                    }
                }}},0,1000); 
    }
    
    public void longBreakTimer() //descanso largo
    {
        timer = new Timer();
        timer.schedule(new TimerTask()  {
        int counter = 15;
        String [] customTime = longBreakTime.getText().split(":");
        int counterLimit = Integer.parseInt(customTime[0])*60*60 + Integer.parseInt(customTime[1])*60+
                 Integer.parseInt(customTime[2]);
        @Override
        public void run()
            {  
               if(!paused)
               {
                ++counter;
                setTime(counter);
                if(counter == counterLimit) 
                {   
                    timer.cancel();
                    Toolkit.getDefaultToolkit().beep();
                    JOptionPane.showMessageDialog(null,"Se acabo el tiempo! Continua con el trabajo.");
                    pomodoroNo = 1;
                    pomodoroTimer();
                }
               }}},0,1000);
    } 
    
    private void startActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startActionPerformed
       pause.setEnabled(true);
       reset.setEnabled(true);
       pomodoroTimer();
       pomodoroNo = 1;
       paused = false;
   
    }//GEN-LAST:event_startActionPerformed

    private void pauseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pauseActionPerformed
      
        if(!paused)
        {
            paused = true;
            pause.setText("Despausar");
            reset.setEnabled(false);
        JOptionPane.showMessageDialog(null,"El temporizador está en pausa");    
            
        }
     
        else
        {
            paused = false;
            pause.setText("Pausa");
            reset.setEnabled(true);
        }
    }//GEN-LAST:event_pauseActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
    
        timer.cancel();
        timeElapsed.setText("00:00:00");
        //pomodoroCounter.setText("0");
        pause.setEnabled(false);
        reset.setEnabled(false);
        
    }//GEN-LAST:event_resetActionPerformed

    private void shortBreakTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shortBreakTimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_shortBreakTimeActionPerformed

    private void pomodoroTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pomodoroTimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pomodoroTimeActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
        JFrame2 frm2 = new JFrame2();
        DefaultTableModel model2 = (DefaultTableModel)frm2.jTable1.getModel();
        frm2.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

  
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PomodoroTimer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PomodoroTimer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PomodoroTimer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PomodoroTimer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PomodoroTimer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel descanso;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel longBreakLabel;
    private javax.swing.JLabel longBreakLabel1;
    private javax.swing.JLabel longBreakLabel2;
    private javax.swing.JTextField longBreakTime;
    private javax.swing.JButton pause;
    private javax.swing.JLabel pomodoroCounter;
    private javax.swing.JPanel pomodoroPanel;
    private javax.swing.JTextField pomodoroTime;
    private javax.swing.JLabel pomodoroTimeLabel;
    private javax.swing.JButton reset;
    private javax.swing.JLabel shortBreakLabel;
    private javax.swing.JTextField shortBreakTime;
    private javax.swing.JButton start;
    private javax.swing.JLabel timeElapsed;
    private javax.swing.JLabel timerLabel;
    // End of variables declaration//GEN-END:variables
}

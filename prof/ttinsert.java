/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prof;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import static prof.timetable.d;

/**
 *
 * @author Ankul
 */
public class ttinsert extends javax.swing.JFrame {

    /**
     * Creates new form ttinsert
     */
    timetable TimeTable;
    String dayName;
    String subCode;
    String a=null;
    int flg=1;
    int time;
    int j=8;
    public ttinsert() {
        initComponents();
        this.setLocationRelativeTo(null);
       TimeTable=new timetable();
       jButton2.setVisible(false);
       jButton3.setVisible(false);
       jLabel5.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("DAY NAME:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(30, 40, 90, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("SUBJECT CODE:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(20, 110, 120, 17);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("TIME(24 hrs clock) (ex:13 for1'oclock):");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(10, 170, 280, 40);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1);
        jTextField1.setBounds(170, 40, 220, 30);
        jPanel1.add(jTextField2);
        jTextField2.setBounds(170, 110, 230, 30);

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField3);
        jTextField3.setBounds(320, 180, 110, 30);

        jButton1.setText("SUBMIT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(250, 330, 69, 23);
        jPanel1.add(jLabel4);
        jLabel4.setBounds(180, 370, 210, 30);
        jPanel1.add(jLabel5);
        jLabel5.setBounds(40, 260, 300, 40);

        jButton2.setText("No!!");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(500, 270, 73, 23);

        jButton3.setText("Yes!!");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(430, 270, 57, 23);

        jLabel6.setIcon(new javax.swing.ImageIcon("H:\\SEM 4\\ITW\\PROF\\235493381-wallpaper-backgrounds-blue.jpg")); // NOI18N
        jLabel6.setText("jLabel6");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(0, 0, 710, 460);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 607, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 422, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed
public boolean insert(String Subject_Name, int st,int k)
    {  System.out.println(st);
        boolean ret,x,y=false;
        int flag=1;
        for(int i=0;i<9&&flag==1;i++)
        {
            //System.out.println("abc");
            //System.out.println(s[i].StartTime);
            
            if(d[k].s[i].StartTime==st)
            {
                if(d[k].s[i].assigned==false)
                {
                   System.out.println(st+"k:"+k+" i:"+i);
                   String stest="Slot availabe at "+d[k].s[i].StartTime;
                   jLabel4.setText(stest);
                   //t.setVisible(true);
                   //t.print(stest);
                   
                  
                  //System.out.println("Slot availabe at"+d[k].s[i].StartTime);
                    
                    
                    /*str=str+"Slot availabe at"+s[i].StartTime;
                    ls.add(str);
                    String listString = "";
                    for (String s : ls) {
                        listString += s + "\n";
                    }
                    FileWriter writer = null;
                    try {
                        writer = new FileWriter("midPrint.txt");
                        writer.write(listString);
                        writer.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }*/
                    
                    
                    y=allocate(Subject_Name,st,d[k].s,i);
                    //ret=true;
                    flag=0;
                }
                if(y==false)
                {
                    //System.out.println("No slot available at ")
                    if(j==18)
                    {
                        j=9;
                        System.out.println("Sorry! Reached End of the day!");
                       
                    }
                    else
                    {
                        j++;
                        x=insert(Subject_Name,j,k);
                        
                    }
                     
                }
                
            }
                
        }
        if(y==true)
        {
            ret=true;
        }
        else
        {
            //System.out.println("Sorry! Required slot not available!");
            ret=false;
        }
       return(ret); 
    }


    public void foo()
    {
         System.out.println("You clicked the button");
                                     a="yes";
                                    flg=0;
    }
   public boolean allocate(String Subject_Name, int st, Slots[] x, int i)
         {            
            //System.out.println("allocate"+st);
             boolean ret;
             boolean z=false;
             //Scanner sc=new Scanner(System.in);
            System.out.println("Do you want to take slot available from "+st+" to "+(st+1)+"?");
              
             //str=str+"Do you want to take slot available from "+st+" to "+(st+1)+"?";
            String j ="Do you want to take slot available from "+st+" to "+(st+1)+"?";
            
                    jLabel5.setVisible(true);
                    jButton3.setVisible(true);
                    jButton2.setVisible(true);
                    jLabel5.setText(j); 
                    
                    
                    /*if(a==null)
                    {
                        while(flg==1)
                        {   
                                jButton3.addActionListener(new ActionListener() {

                                public void actionPerformed(ActionEvent e)
                                {
                                    //Perform function when button is pressed
                                    System.out.println("You clicked the button");
                                     a="yes";
                                    flg=0;
                                }                                     
                             }); 
                        }
                    }*/
            
            /*if(a.equals("")&&z==false)
            {
                z=allocate(Subject_Name,st,x,i);
            }*/
            
        /*try {
                jButton3.wait();
                jButton2.wait();
            //t.print(j);
            /*try{
            Thread.sleep(10000);}
            catch(Exception e){
            System.out.print("SSSLLLEEEEPPP");
            }*/
            //to give time for user
            /*try{
            TimeUnit.SECONDS.sleep(5);
            }
            catch (Exception ex){
            System.out.print("ERROR!");
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(ttinsert.class.getName()).log(Level.SEVERE, null, ex);
        }*/
             
             //String catch1 = t.jTextField1.getText();
             
             //String catch1 = t.ret();
            // System.out.println(catch1+"catch:");
             
            String y="yes";
             if(y.equals(a))
             {
                 //notify
                 x[i].SubjectCode=Subject_Name;
                 x[i].assigned=true;
                 x[i].notif=true;
                 //System.out.println("Slot alloted!!");
                 jLabel5.setText("SUCCESSFULLY ALLOTED!!");
                 ret=true;
                 
             }
             else
             {
                 ret=false;
             }
            
           return(ret);
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int flag=1;boolean ret=false;
        dayName=jTextField1.getText();
       subCode=jTextField2.getText();
       //time=jTextField3.Integer.parseInt(getText());
       String text = jTextField3.getText();
       time=Integer.parseInt(text);
       for(int i=0;i<6; i++)
        {
            d[i]= new Day();
       
        }
       TimeTable.reset();
       if(dayName.equals("")||subCode.equals("")||text.equals(""))
       {
           jLabel5.setText("Enter the Fields");
       }
       else
       {
           for (int i=0;i<6&&flag==1;i++)
        {
        //System.out.println("abc");
        if((d[i].DayName).equals(dayName))
        { //System.out.print(time);
            //System.out.println("abc");
            ret=insert(subCode, time,i);
           
            flag=0;
            //Here notif will be called!
            
            
        
       }
       /*for (int i=0;i<6&&flag==1;i++)
       {
        //System.out.println("abc");
        if((d[i].DayName).equals(dayName))
        { System.out.print(time);
            //System.out.println("abc");
            ret=d[i].insert(subCode, time);
           
            flag=0;
        }
      }
       jLabel4.setText("Submitted!");*/
        }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
         a="yes";
        jButton3.notify();    
        jButton2.notify();// TODO add your handling code here:*/
        
       
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        a="no";
        foo();
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed
       
    
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
            java.util.logging.Logger.getLogger(ttinsert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ttinsert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ttinsert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ttinsert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ttinsert().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}

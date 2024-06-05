import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.concurrent.*;

public class Button implements ActionListener {

    JButton a = new JButton();
    JButton b = new JButton();
    public int hours = 0, min = 0, sec = 0;
    public double bill=0;
    public volatile boolean timing;
    public Panel panel = new Panel();
    public Panel.Panel2 panel2 = panel.new Panel2();
   // Button thread = new Button();


    Button(){

        panel.label.setText(hours+" : "+min+" : "+sec);
        panel2.label2.setText("Charges: Ksh"+bill);


        //button a
        a.setBounds(165, 150, 90, 40);
        a.setText("Call");
        a.setFont(new Font("Scan", Font.ROMAN_BASELINE, 20));
        a.setBackground(Color.GREEN);
        a.setForeground(Color.darkGray);
        a.setVisible(true);
        a.setEnabled(true);
        a.setFocusable(false);
        a.addActionListener(this);


        //button b
        b.setBounds(165, 150, 90, 40);
        b.setText("End");
        b.setFont(new Font("Scan", Font.ROMAN_BASELINE, 20));
        b.setBackground(Color.RED);
        b.setForeground(Color.darkGray);
        b.setVisible(false);
        b.setEnabled(false);
        b.setFocusable(false);
        b.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==a){

            System.out.println("On call");
            a.setVisible(false);
            a.setEnabled(false);
            b.setVisible(true);
            b.setEnabled(true);
            hours=min=sec=0;

            timing=true;

             Thread t = new Thread(){
                public void run(){
                        if(timing == true){
                            try{
                                for(hours = 0; timing; hours++){
                                    for(min = 0; min<60; min++){
                                        for(sec = 0; sec < 60 ;sec++){
                                            try{
                                                TimeUnit.MILLISECONDS.sleep(1000);

                                            }catch(InterruptedException x){

                                            }

                                            panel.label.setText(hours+" : "+min+" : "+sec);
                                            System.out.println(hours+" : "+min+" : "+sec);

                                            if(timing == false){
                                                break;

                                            }
                                        }
                                        if(timing == false){

                                            break;
                                        }
                                    }
                                    if(timing == false){
                                        break;
                                    }
                                }
                            }catch(Exception x){

                            }

                        }

                }
            };
            t.start();

        }

        else if(e.getSource()==b){
            System.out.println("Call Ended");

            a.setVisible(true);
            a.setEnabled(true);

            b.setVisible(false);
            b.setEnabled(false);
            timing = false;

            Thread k = new Thread(){
                public void run(){

                    if(timing==false){

                                int total = (hours*3600) + (min * 60) + sec;
                                bill = ((total) * 5);
                                System.out.println("Total sec: "+ total);
                                System.out.println("Charges: Ksh"+ bill);
                        panel2.label2.setText("Charges: Ksh"+bill);
                        }


                }

            };
            k.start();
        }
    }





}

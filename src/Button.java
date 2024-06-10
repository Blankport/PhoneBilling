import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;
import java.util.concurrent.*;

public class Button implements ActionListener {

    JButton a = new JButton();
    JButton b = new JButton();
    JButton a2 = new JButton();
    JButton set = new JButton();
    JButton reset = new JButton();


    public int hours = 0, min = 0, sec = 0;
    public double charges, saf , airt, time;
    public DecimalFormat dp = new DecimalFormat("#.00");
    public double bill=0;
    public volatile boolean timing;
    public Panel panel = new Panel();
    public Panel.Panel2 panel2 = panel.new Panel2();
    public TextArea textArea = new TextArea();



    Button(){

        panel.label.setText(hours+" : "+min+" : "+sec);
        panel2.label2.setText("Charges: Ksh"+bill);
        panel2.setVisible(false);

        //button a
        a.setBounds(110, 150, 90, 40);
        a.setText("Saf");
        a.setFont(new Font("Scan", Font.ROMAN_BASELINE, 20));
        a.setBackground(Color.GREEN);
        a.setForeground(Color.darkGray);
        a.setVisible(true);
        a.setEnabled(true);
        a.setFocusable(false);
        a.addActionListener(this);

        //button airtel
        a2.setBounds(200, 150, 90, 40);
        a2.setText("airt");
        a2.setFont(new Font("Scan", Font.ROMAN_BASELINE, 20));
        a2.setBackground(new Color(0xFA3A3A));
        a2.setForeground(Color.darkGray);
        a2.setVisible(true);
        a2.setEnabled(true);
        a2.setFocusable(false);
        a2.addActionListener(this);


        //button b
        b.setBounds(155, 150, 90, 40);
        b.setText("End");
        b.setFont(new Font("Scan", Font.ROMAN_BASELINE, 20));
        b.setBackground(Color.RED);
        b.setForeground(Color.darkGray);
        b.setVisible(false);
        b.setEnabled(false);
        b.setFocusable(false);
        b.addActionListener(this);

        //setButton
        set.setVisible(true);
        set.setBounds(155, 150, 90, 40);
        set.setText("Set");
        set.setFont(new Font("Scan", Font.ROMAN_BASELINE, 20));
        set.setFocusable(false);
        set.addActionListener(this);


        //resetButton
        reset.setVisible(false);
        reset.setBounds(155, 200, 90, 40);
        reset.setText("Reset");
        reset.setFont(new Font("Scan", Font.ROMAN_BASELINE, 20));
        reset.setFocusable(false);
        reset.addActionListener(this);

        //TextField
        textArea.saf.setVisible(true);
        textArea.airt.setVisible(true);
        textArea.sec.setVisible(true);
        textArea.head.setVisible(true);

        saf = Double.parseDouble(textArea.saf.getText());
        airt = Double.parseDouble(textArea.airt.getText());
        time = Double.parseDouble(textArea.sec.getText());

        b.setVisible(false);
        a.setVisible(false);
        a2.setVisible(false);
        panel2.setVisible(false);
        panel.setVisible(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==a){

            System.out.println("On call");
            panel2.setVisible(true);
            panel2.label2.setText("On Call");

            a.setVisible(false);
            a.setEnabled(false);

            a2.setVisible(false);
            a2.setEnabled(false);

            b.setVisible(true);
            b.setEnabled(true);

            set.setVisible(false);
            reset.setVisible(false);


            textArea.safLabel.setVisible(false);
            textArea.airtLabel.setVisible(false);
            textArea.secLabel.setVisible(false);
            textArea.airt.setVisible(false);
            textArea.sec.setVisible(false);
            textArea.saf.setVisible(false);
            textArea.head.setVisible(false);

            charges = Double.parseDouble(textArea.saf.getText());

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
                                                TimeUnit.MILLISECONDS.sleep(10);

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

        else if(e.getSource()==a2){

            System.out.println("On call");

            panel2.setVisible(true);
            panel2.label2.setText("On Call");

            a.setVisible(false);
            a.setEnabled(false);

            a2.setVisible(false);
            a2.setEnabled(false);

            b.setVisible(true);
            b.setEnabled(true);

            set.setVisible(false);
            reset.setVisible(false);

            textArea.safLabel.setVisible(false);
            textArea.airtLabel.setVisible(false);
            textArea.secLabel.setVisible(false);
            textArea.airt.setVisible(false);
            textArea.sec.setVisible(false);
            textArea.saf.setVisible(false);
            textArea.head.setVisible(false);

            charges =  Double.parseDouble(textArea.airt.getText());

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
                                            TimeUnit.MILLISECONDS.sleep(10);

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

            time = Double.parseDouble(textArea.sec.getText());
            panel2.setVisible(true);

            a.setVisible(true);
            a.setEnabled(true);

            a2.setEnabled(true);
            a2.setVisible(true);

            b.setVisible(false);
            b.setEnabled(false);

            set.setVisible(false);
            reset.setVisible(true);

            textArea.safLabel.setVisible(false);
            textArea.airtLabel.setVisible(false);
            textArea.secLabel.setVisible(false);
            textArea.airt.setVisible(false);
            textArea.sec.setVisible(false);
            textArea.saf.setVisible(false);
            textArea.head.setVisible(false);

            timing = false;

            Thread k = new Thread(){
                public void run(){

                    if(timing==false){

                                int total = (hours*3600) + (min * 60) + sec;
                                bill = ((total/time) * charges);
                                System.out.println("Total sec: "+ total);
                                System.out.printf("Charges: Ksh"+dp.format(bill));
                                panel2.label2.setText("Charges: Ksh"+dp.format(bill));
                        }


                }

            };
            k.start();
        }

        else if (e.getSource() == set){
            saf = Double.parseDouble(textArea.saf.getText());
            airt = Double.parseDouble(textArea.airt.getText());
            time = Double.parseDouble(textArea.sec.getText());

            set.setVisible(false);
            a.setVisible(true);
            a2.setVisible(true);
            reset.setVisible(true);
            panel.setVisible(true);

            textArea.saf.setVisible(false);
            textArea.airt.setVisible(false);
            textArea.safLabel.setVisible(false);
            textArea.airtLabel.setVisible(false);
            textArea.sec.setVisible(false);
            textArea.secLabel.setVisible(false);
            textArea.head.setVisible(false);

        }

        else if(e.getSource() == reset){
            reset.setVisible(false);
            set.setVisible(true);
            b.setVisible(false);
            a.setVisible(false);
            a2.setVisible(false);
            panel2.setVisible(false);
            panel.setVisible(false);


            textArea.safLabel.setVisible(true);
            textArea.airtLabel.setVisible(true);
            textArea.secLabel.setVisible(true);
            textArea.head.setVisible(true);

            textArea.saf.setText("1");
            textArea.saf.setVisible(true);
            textArea.airt.setText("1");
            textArea.airt.setVisible(true);
            textArea.sec.setVisible(true);
            textArea.sec.setText("1");


        }
    }


}

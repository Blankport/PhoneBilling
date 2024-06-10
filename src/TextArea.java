import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class TextArea implements KeyListener {

       public JTextField saf = new JTextField();
       public JTextField airt = new JTextField();
       public JTextField sec = new JTextField();
       String heading = "Set Saf and Airt Charges per how many seconds you want";

       public JLabel safLabel = new JLabel("saf: ");
       public JLabel airtLabel = new JLabel("airt:");
       public JLabel secLabel = new JLabel("Sec");
       public JLabel head = new JLabel(heading);


    TextArea(){

            saf.setBounds(55,100,90,40);
            safLabel.setBounds(55,70,90,40);
            safLabel.setForeground(Color.white);
            saf.addKeyListener(this);
            saf.setText("1");

            airt.setBounds(155, 100, 90,40);
            airtLabel.setBounds(155,70,90,40);
            airtLabel.setForeground(Color.white);
            airt.addKeyListener(this);
            airt.setText("1");

            sec.setBounds(255,100,90,40);
            secLabel.setBounds(255,70,90,40);
            secLabel.setForeground(Color.white);
            sec.addKeyListener(this);
            sec.setText("1");

            head.setBounds(10,10,400, 25);
            head.setForeground(Color.WHITE);
            head.setFont(new Font("nelly", Font.ITALIC, 14));



    }

    @Override
    public void keyTyped(KeyEvent e){
        char c = e.getKeyChar();
        if(!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE || (c == KeyEvent.VK_PERIOD)))){
            e.consume();
        }


    }
    @Override
    public void keyPressed(KeyEvent e){

    }

    @Override
    public void keyReleased(KeyEvent e){

    }
}

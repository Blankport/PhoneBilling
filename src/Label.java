import javax.swing.*;
import java.awt.*;


public class Label extends JLabel{

    class Label2 extends JLabel{
        Label2(){

            this.setFont(new Font("nelly", Font.ITALIC, 20));
            this.setHorizontalTextPosition(JLabel.CENTER);
            this.setVerticalTextPosition(JLabel.CENTER);
            this.setForeground(Color.RED);
        }
    }

    Label(){


        this.setFont(new Font("nelly", Font.ITALIC, 25));
        this.setHorizontalTextPosition(JLabel.CENTER);
        this.setVerticalTextPosition(JLabel.CENTER);
        this.setForeground(Color.blue);


    }

}

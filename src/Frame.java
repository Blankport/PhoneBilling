import javax.swing.*;
import java.awt.*;


public class Frame extends JFrame{

    public Panel panel = new Panel();
    public Panel.Panel2 panel2 = panel.new Panel2();
    public Button button =new Button();


    Frame(){
        this.setTitle("Call Billing");
        this.getContentPane().setBackground(new Color(62, 62, 62));

        this.setSize(400, 400);
        this.setResizable(false);
        this.setLayout(null);

        this.setVisible(true);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //panel add
        this.add(button.panel);
        this.add(button.panel2);

        //TextArea
        this.add(button.textArea.saf);
        this.add(button.textArea.airt);
        this.add(button.textArea.sec);

        this.add(button.textArea.secLabel);
        this.add(button.textArea.airtLabel);
        this.add(button.textArea.safLabel);
        this.add(button.textArea.head);
        //button add

        this.add(button.set);
        this.add(button.reset);
        this.add(button.a);
        this.add(button.a2);
        this.add(button.b);

    }


}

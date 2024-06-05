import javax.swing.*;
import java.awt.*;

public class Panel extends JPanel{

    public Label label = new Label();

    class Panel2 extends JPanel{

        public Label.Label2 label2 = label.new Label2();

        Panel2(){
            this.setVisible(true);
            this.setBounds(100,20,200,40);
            this.setBackground(Color.lightGray);
            this.add(label2);
        }
    }

    Panel(){
        this.setVisible(true);
        this.setBounds(100,70,200,60);
        this.setBackground(Color.white);
        this.add(label);

    }


}

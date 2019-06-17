import javax.swing.*;
import java.awt.*;
import java.util.*;
public class GUI extends JFrame {

    int aW = 1280;
    int aH = 800;

    public GUI(){
        this.setSize(aW+6,aH+29);
        this.setTitle("Zip Code BlackJack");
        this.setVisible(true);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}

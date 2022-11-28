import java.awt.Dimension;
import javax.swing.JFrame;

public class Main extends JFrame {

    public Main(){


        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);

        setPreferredSize(new Dimension(500, 500));

        setTitle("Chess");
        
        GUI gui = new GUI();
        setContentPane(gui);

        pack();

        setVisible(true);

    }



    public static void main(String[] args){

        Main main = new Main();
        main.repaint();
    }
    
}
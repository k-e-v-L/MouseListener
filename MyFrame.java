import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MyFrame extends JFrame implements MouseListener {

    JLabel label;
    ImageIcon smile;
    ImageIcon nervous;
    ImageIcon pain;
    ImageIcon dizzy;

    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(new FlowLayout());

        label = new JLabel();
        label.addMouseListener(this);

        smile = new ImageIcon("smile.png");
        nervous = new ImageIcon("nervous.png");
        pain = new ImageIcon("pain.png");
        dizzy = new ImageIcon("dizzy.png");

        label.setIcon(smile);

        this.add(label);
        this.pack();
        this.setLocationRelativeTo(null); //Will make frame appear in the middle of screen
        this.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {
        // Invoked when the mouse button has been clicked (pressed and released) on a component
        //System.out.println("You clicked the mouse");

    }

    @Override
    public void mousePressed(MouseEvent mouseEvent) {
        // Invoked when a mouse button has been pressed on a component. Move your cursor on the green box.
        label.setIcon(pain);
        System.out.println("You clicked the mouse");
        //label.setBackground(Color.yellow); //Changes color to CYAN when component is pressed

    }

    @Override
    public void mouseReleased(MouseEvent mouseEvent) {
        // Invoked when a mouse button has been released on a component
        label.setIcon(nervous);

        System.out.println("You released the mouse");
        //label.setBackground(Color.BLUE); //Changes the color when button is released
    }

    @Override
    public void mouseEntered(MouseEvent mouseEvent) {
        // Invoked when the mouse enters a component
        label.setIcon(smile);
        System.out.println("You entered the component");
        //label.setBackground(Color.MAGENTA);

    }

    @Override
    public void mouseExited(MouseEvent mouseEvent) {
        // Invoked when the mouse exits the component
        label.setIcon(dizzy);
        System.out.println("You exited the component");
        //label.setBackground(Color.yellow);

    }
}

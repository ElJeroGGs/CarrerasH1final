package vista;
import javax.swing.*;
import java.awt.*;

public class main extends JFrame{
    JLabel iconLabel1;
    JLabel iconLabel2;
    JLabel iconLabel3;
    
    public main(){
        setTitle("Carrera de hilos");
        setSize(800, 600);

        BoxLayout layout = new BoxLayout(getContentPane(), BoxLayout.Y_AXIS); // Use BoxLayout
        setLayout(layout);

        // Create a new label for the title
        JLabel titleLabel = new JLabel("Carrera H1", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Serif", Font.BOLD, 24)); // Set the font to be bold and size 24
        add(titleLabel); // Add the label to the frame

        // Add an icon to each row
        ImageIcon icon = new ImageIcon("src\\imagenes\\checo.jpg"); // Replace with your icon path
        this.iconLabel1 = new JLabel(icon);
        iconLabel1.setAlignmentX(Component.LEFT_ALIGNMENT); // Align to the left
        add(iconLabel1);

        icon = new ImageIcon("src\\imagenes\\verstappen.jpg"); // Replace with your icon path
        iconLabel2 = new JLabel(icon);
        iconLabel2.setAlignmentX(Component.LEFT_ALIGNMENT); // Align to the left
        add(iconLabel2);

        icon = new ImageIcon("src\\imagenes\\hamilton.jpg"); // Replace with your icon path
        iconLabel3 = new JLabel(icon);
        iconLabel3.setAlignmentX(Component.LEFT_ALIGNMENT); // Align to the left
        add(iconLabel3);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
            setLocationRelativeTo(null);
            setVisible(true);
        }

    public void addIcon(String id, int position) {
        this.iconLabel1.setAlignmentX(position);
        revalidate();
        repaint();
    }
    

 

}

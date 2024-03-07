package vista;

import javax.swing.*;
import java.awt.*;
import modelo.resultado; // Add the missing import statement

public class main extends JFrame {
    JLabel iconLabel1;
    JLabel iconLabel2;
    JLabel iconLabel3;

    public main() {
        setTitle("Carrera de hilos");
        setSize(1500, 1000);
        // Use BoxLayout
        this.setLayout(null);

        // Create a new label for the title
        JLabel titleLabel = new JLabel("Carrera H1");
        titleLabel.setFont(new Font("Serif", Font.BOLD, 24)); // Set the font to be bold and size 24
        titleLabel.setBounds(650, 10, 400, 100);
        this.getContentPane().add(titleLabel);

        // Add an icon to each row
        ImageIcon icon = new ImageIcon("src\\imagenes\\checo.jpg");
        this.iconLabel1 = new JLabel(icon);
        iconLabel1.setBounds(10, 50, 300, 300);
        this.getContentPane().add(iconLabel1);

        icon = new ImageIcon("src\\imagenes\\verstappen.jpg"); // Replace with your icon path
        iconLabel2 = new JLabel(icon);
        iconLabel2.setBounds(10, 250, 300, 300);
        this.getContentPane().add(iconLabel2);

        icon = new ImageIcon("src\\imagenes\\hamilton.jpg"); // Replace with your icon path
        iconLabel3 = new JLabel(icon);
        iconLabel3.setBounds(10, 550, 300, 300);
        this.getContentPane().add(iconLabel3);

        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setLocationRelativeTo(null);
    }

    public void pintapanel(modelo.resultado result) { // Update the parameter type to 'resultado'

        int checo = result.getValor(0);
        int max = result.getValor(1);
        int hamilton = result.getValor(2);

        iconLabel1.setBounds(10 + checo, 50, 300, 300);
        iconLabel2.setBounds(10 + max, 250, 300, 300);
        iconLabel3.setBounds(10 + hamilton, 550, 300, 300);

        this.getContentPane().revalidate();
        this.getContentPane().repaint();
    }

}

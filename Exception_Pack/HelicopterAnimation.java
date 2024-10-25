package Exception_Pack;

import javax.swing.*;
import java.awt.*;

public class HelicopterAnimation extends JPanel implements Runnable {

    private int xPosition = -100; // Initial position off-screen to the left
    private int yPosition = 150;  // Vertical position of helicopter

    public HelicopterAnimation() {
        Thread animationThread = new Thread(this);
        animationThread.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Draw helicopter body
        g.setColor(Color.GRAY);
        g.fillRect(xPosition, yPosition, 100, 20); // Helicopter body
        
        // Draw helicopter rotor
        g.setColor(Color.BLACK);
        g.fillRect(xPosition + 10, yPosition - 10, 80, 5); // Rotor on top

        // Draw helicopter tail
        g.fillRect(xPosition + 90, yPosition + 5, 20, 5); // Tail rotor
        
        // Draw helicopter windows
        g.setColor(Color.BLUE);
        g.fillRect(xPosition + 20, yPosition + 5, 20, 10);
        g.fillRect(xPosition + 50, yPosition + 5, 20, 10);
    }

    @Override
    public void run() {
        while (true) {
            xPosition += 5; // Move helicopter to the right
            if (xPosition > getWidth()) {
                xPosition = -100; // Reset position to create looped animation
            }
            repaint(); // Refresh the screen
            try {
                Thread.sleep(50); // Control the speed of animation
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Helicopter Animation");
        HelicopterAnimation animation = new HelicopterAnimation();
        frame.add(animation);
        frame.setSize(800, 400); // Set frame size
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}


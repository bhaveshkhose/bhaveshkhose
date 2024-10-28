package Exception_Pack;


	import javax.swing.*;
	import java.awt.*;
	import java.awt.geom.Ellipse2D;

	public class helicpoter2_O extends JPanel implements Runnable {

	    private int xPosition = -200; // Start position off-screen to the left
	    private int yPosition = 150;  // Helicopter height
	    private int rotorAngle = 0;   // Initial rotor angle for rotation

	    public helicpoter2_O() {
	        Thread animationThread = new Thread(this);
	        animationThread.start();
	    }

	    @Override
	    protected void paintComponent(Graphics g) {
	        super.paintComponent(g);
	        Graphics2D g2d = (Graphics2D) g;

	        // Enable anti-aliasing for smoother graphics
	        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

	        // Draw Helicopter Body
	        g2d.setColor(Color.DARK_GRAY);
	        g2d.fillRoundRect(xPosition, yPosition, 120, 30, 10, 10);  // Main body of helicopter

	        // Draw Helicopter Tail
	        g2d.fillRect(xPosition + 110, yPosition + 10, 40, 8);      // Tail boom

	        // Draw Rotor Blades with rotation
	        g2d.setColor(Color.BLACK);
	        g2d.rotate(Math.toRadians(rotorAngle), xPosition + 60, yPosition - 10); // Rotate around the rotor center
	        g2d.fillRect(xPosition + 10, yPosition - 15, 100, 5); // Rotor blade
	        g2d.fillRect(xPosition + 35, yPosition - 35, 5, 40);  // Tail rotor
	        g2d.rotate(-Math.toRadians(rotorAngle), xPosition + 60, yPosition - 10); // Reset rotation

	        // Draw Cockpit
	        g2d.setColor(Color.CYAN);
	        g2d.fillRoundRect(xPosition + 15, yPosition + 5, 30, 20, 10, 10); // Cockpit window

	        // Draw Helicopter Landing Skids
	        g2d.setColor(Color.GRAY);
	        g2d.fillRoundRect(xPosition + 10, yPosition + 25, 100, 5, 5, 5); // Skid bar

	        // Draw Helicopter Windows
	        g2d.setColor(Color.BLUE);
	        g2d.fillRect(xPosition + 50, yPosition + 5, 20, 15);

	        // Draw Rotor Rotation
	        rotorAngle += 15; // Increase rotor angle to simulate rotation
	    }

	    @Override
	    public void run() {
	        while (true) {
	            xPosition += 5; // Move the helicopter to the right
	            if (xPosition > getWidth()) {
	                xPosition = -200; // Reset position to create continuous loop
	            }
	            repaint(); // Redraw with updated position
	            try {
	                Thread.sleep(30); // Control the speed of the animation
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	        }
	    }

	    public static void main(String[] args) {
	        JFrame frame = new JFrame("High-Graphics Helicopter Animation");
	        helicpoter2_O animation = new helicpoter2_O();
	        frame.add(animation);
	        frame.setSize(800, 400);  // Frame size
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setVisible(true);
	    }
	}




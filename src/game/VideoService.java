package game;

import javax.swing.*;
import java.awt.*;

import game.Director;

public class VideoService extends JFrame {

    public VideoService(int width, int height, String title, Game game) {
        JFrame frame = new JFrame(title);

        // Sets the size of the new JFrame (window).
        frame.setPreferredSize(new Dimension(width, height));
        frame.setMaximumSize(new Dimension(width, height));
        frame.setMinimumSize(new Dimension(width, height));


        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Program will stop when window closed.
        frame.setResizable(false); // User cannot resize the window.
        frame.pack(); // Requires everything to fit in the window dimensions
        frame.setLocationRelativeTo(null); // Centers JFrame in screen
        frame.add(game); // Adds game() to the newly created JFrame
        frame.setVisible(true); // Sets the window visible
    }


}

package game;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Game extends JPanel {

    Random random = new Random();
    private final int DOT_SIZE = 10;
    private final int RAND_POS = 29;
    public static final int WIDTH = 640;
    public static final int HEIGHT = 640;
    // GRID represents the number of items of DOT_SIZE that
    // can fit on the screen.
    private final int GRID = (WIDTH * HEIGHT) / (DOT_SIZE^2);
    // The following x and y represent the (x,y) of the eventual
    // moving dot in the game.
    private int x;
    private int y;

    private int dot;
    private int balls = 10;
    private int dot_x;
    private int dot_y;

    private Image ball;

    public boolean isPlaying = true;


    public Game() {
        new VideoService(WIDTH, HEIGHT, "Cars", this);
        new Director(this);
        setBackground(Color.black);
        loadImages();
        // TODO: Fix Director - Get keyboard input/interaction.

    }

    // These x and y setters and getters are for the purpose
    // of allowing Director access to the location of the
    // main ball which was planned to move.
    @Override
    public int getX() {
        return this.x;
    }

    @Override
    public int getY() {
        return this.y;
    }
    public void setX(int new_x) {
        this.x = new_x;
    }
    public void setY(int new_y) {
        this.y = new_y;

    }

    // loadImages() loads files of images for use with
    // graphics in doDrawing() and paintComponent.
    private void loadImages() {

        ImageIcon iib = new ImageIcon("src/assets/blue_dot.png");
        ball = iib.getImage();
    }
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        doDrawing(g);
    }
    private void doDrawing(Graphics g) {

        if (isPlaying) {
            // Draws the number of balls indicated at random locations
            // across the screen.
            for (int i = 0; i < balls; i++) {
                int rand_x = random.nextInt(0, WIDTH);
                int rand_y = random.nextInt(0, HEIGHT);
                g.drawImage(ball, rand_x, rand_y, this);
            }

        } else {

            gameOver(g);
        }
            Toolkit.getDefaultToolkit().sync();
    }

    // In the case that this game utilizes user input,
    // the gameOver contains the graphics commands to display
    // a game over screen.
    private void gameOver(Graphics g) {
        String msg = "Game Over";
        Font small = new Font("Helvetica", Font.BOLD, 14);
        FontMetrics metr = getFontMetrics(small);

        g.setColor(Color.white);
        g.setFont(small);
        g.drawString(msg, (WIDTH - metr.stringWidth(msg)) / 2, HEIGHT / 2);
    }

    // findDot() has functionality for when objects will be
    // moving around the screen. Its purpose is to find an object
    // on the screen
    private void findDot() {
        int r = (int) (Math.random() * RAND_POS);
        dot_x = ((r * DOT_SIZE));

        r = (int) (Math.random() * RAND_POS);
        dot_y = ((r * DOT_SIZE));
    }

    public static void main(String args[]) {

        JPanel ex = new Game();
    }


}

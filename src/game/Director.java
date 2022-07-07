package game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Director extends JPanel implements ActionListener {

    // The next four booleans set the initial movement in any direction to false.
    public boolean left = false;
    public boolean right = false;
    public boolean up = false;
    public boolean down = false;
    private Game the_game;

    private final int DOT_SIZE = 10;


    public Director(Game game) {
        start();
        the_game = game;


    }
    private Timer timer;
    private Boolean isPlaying = true;
    public static final int DELAY = 200;

    public void start() {
        addKeyListener(new kAdapter());
        setFocusable(true);
        timer = new Timer(DELAY, this);
        timer.start();

    }

    private void move() {
        int x = the_game.getX();
        int y = the_game.getY();

        if (left) {
            x -= DOT_SIZE;

        }
        if (right) {
            x += DOT_SIZE;
        }
        if (up) {
            y -= DOT_SIZE;
        }
        if (down) {
            y += DOT_SIZE;
        }
        the_game.setX(x);
        the_game.setY(y);


    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (isPlaying) {
            move();
        }
        repaint();
    }
    private class kAdapter extends KeyAdapter {

        @Override
        public void keyPressed(KeyEvent e) {

            int key = e.getKeyCode();
            System.out.println("Hi!");

            if ((key == KeyEvent.VK_LEFT) && (!right)) {
                left = true;
                up = false;
                down = false;
            }
            if ((key == KeyEvent.VK_RIGHT) && (!left)) {
                right = true;
                up = false;
                down = false;
            }
            if ((key == KeyEvent.VK_UP) && (!down)) {
                up = true;
                left = false;
                right = false;
            }
            if ((key == KeyEvent.VK_DOWN) && (!up)) {
                down = true;
                right = false;
                left = false;
            }
        }
    }

}





import game.GameMap;


import javax.swing.*;
import java.awt.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class GameM extends JFrame {
    private final Display display;
    private final GameMap map ;


    public GameM() {
        super("Spiel");


        display = new Display(this);
        map = new GameMap(40) {
            @Override
            public int render(Graphics2D g, int tileSize) {
                return 0;
            }
        };

        setSize(1080, 720);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public GameMap getMap(){

        return map;
    }

            public void render(Graphics g2) {
        g2.setColor(Color.black);
        g2.fillRect(0,0, getWidth(),getHeight());


                int tileSize= map.getTileSize();
                map.render(g2, tileSize);
    }

    public static void main(String[] args) {
        new GameM();
    }

    public void render(Graphics2D g2) {
    }
}

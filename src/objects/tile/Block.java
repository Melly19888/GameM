package objects.tile;

import java.awt.*;

public class Block extends Tile{
    public Block(int x, int y) {
        super(x, y);
    }

    @Override
    public int render(Graphics2D g, int tileSize) {
        g.setColor(Color.black);

        g.fillRect(x * tileSize,y *tileSize, tileSize, tileSize);
        return tileSize;
    }
}

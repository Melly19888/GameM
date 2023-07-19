package objects.tile;

import java.awt.*;

public class Air extends Tile {


    public Air(int x, int y) {
        super(x, y);
    }

    @Override
    public int render(Graphics2D g, int tileSize) {
        // Air is invisible

        return tileSize;
    }
}

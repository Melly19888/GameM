package objects.tile;

import java.awt.*;
import java.awt.geom.Ellipse2D;

public class Dot  extends Tile{
protected final double radius;

protected Dot(int x, int y, double radius){
    super(x, y);
    this.radius = radius;

}

public Dot(int x, int y){
    this(x, y, 0.125);
}
    @Override
    public int render(Graphics2D g, int tileSize){
    double centerX = getCenterX() * tileSize;
    double centerY = getCenterY() * tileSize;
    double radiusOn = radius * tileSize;
    double diameterOn = radius * 2.0;

    g.setColor(Color.WHITE);
    g.fill(new Ellipse2D.Double(centerX - radiusOn, centerY - radiusOn, diameterOn, diameterOn));

        return tileSize;
    }
    public double getCenterX(){
    return x + 0.5;
    }

        public double getCenterY(){
        return y + 0.5;
        }

    public double getRadius() {
        return radius;
    }
}

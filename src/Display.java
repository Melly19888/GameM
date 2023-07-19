import javax.swing.*;
import java.awt.*;

public class Display extends JPanel {
    private final GameM gameM;
    public Display(GameM gameM){
    super();
    this.gameM = gameM;
        gameM.add(this);
    }

    public void paint(Graphics g){
        Graphics2D g2 = (Graphics2D) g;

        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BICUBIC);
        g2.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);

        gameM.render(g2);


    }
}

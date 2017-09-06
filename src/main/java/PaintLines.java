import javax.swing.*;
import java.awt.*;

public class PaintLines
        extends JComponent{

    private final int width, height;

    public PaintLines(int width, int height){
        this.width = width;
        this.height = height;
    }

    public void paint(Graphics g) {
        g.setColor(Color.lightGray);
        for (int i = 10; i < width; i += 30) {
            g.drawLine(i, 10, i, height); //vertical lines
        }
        for (int i = 10; i < height + 10; i += 30) {
            g.drawLine(10, i, width - 10, i); //horizontal lines
        }
    }
}
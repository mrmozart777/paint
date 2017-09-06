import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.util.Random;

public class PaintCircle
        extends JComponent
        implements Runnable {

    public int width;
    public int height;
    private boolean k = true;
    private Random randomNumber = new Random();

   // private Graphics2D g0;

    public PaintCircle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        //this.g0 = g2;
        g2.setColor(k ? RandomColor() : getBackground());
        int x = randomNumber.nextInt(width - 10) + 10;
        int y = randomNumber.nextInt(height - 80) + 10;
        //int x = randomNumber.nextInt(width - 1500) + 10;
        //int y = randomNumber.nextInt(height - 800) + 10;
        //System.out.printf(" ; x = %s ; y = %s",x,y);
        g2.fill(new Ellipse2D.Float(x,y,25,25));
        System.out.printf("\n\t.....Draw! " + k);

    }

    private Color RandomColor() {
        return new Color(randomNumber.nextInt(255),
                randomNumber.nextInt(255), randomNumber.nextInt(255));
    }

    @Override
    public void run() {
        try {
            while(true) {
                System.out.printf("\nThread: " + Thread.currentThread().getName());
                repaint();
               /* if (k){
                    k = false;
                }else{
                    k = true;
                }*/
                Thread.sleep(1000);
            }
        } catch (InterruptedException ie){}
    }
}

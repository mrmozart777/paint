import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.util.Random;

public class ThreadsStart
        extends JComponent {

    public int width;
    public  int height;

    public ThreadsStart(int width, int height) {
        this.width = width;
        this.height = height;
        Thread[][] threads = new Thread[(width - 20) / 30][(height - 10) / 30];
/*        for(int i = 0; i < (width - 20)/30; i++){
            for(int j = 0; j < (height - 10)/30; j++){
                threads[i][j] = new Thread(this);
                threads[i][j].start();
                x = i;
                y = j;
            }
        }*/
        for(int i = 0; i < 1; i++){
            for(int j = 0; j < 2; j++){
                threads[i][j] = new Thread(new PaintCircle(width, height));
                threads[i][j].start();
            }
        }
        //Thread thread = new Thread(this);
        //thread.start();
    }
}

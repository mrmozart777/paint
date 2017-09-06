import javax.swing.*;

public class Application {

    public static int width =200; //1700;
    public static int height = 200;//1000;
    public static JFrame frame = new JFrame("Threads");
    public static PaintCircle ps, ps2;

    public static void main(String[] args) {

        //int width = 1700, height = 1000;
        frame.setSize(width + 20, height + 50);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocation(500,300);
        //frame.add(new PaintLines(width,height));
        frame.setVisible(true);
        //frame.add(new ThreadsStart(width,height));
        ThreadsStart();
    }

    public static void ThreadsStart() {
        /*Thread[][] threads = new Thread[(width - 20) / 30][(height - 10) / 30];
        for(int i = 0; i < (width - 20)/30; i++){
            for(int j = 0; j < (height - 10)/30; j++){
                PaintCircle ps = new PaintCircle(width, height);
                frame.add(ps);
                threads[i][j] = new Thread();
                threads[i][j].start();
                //x = i;
                //y = j;
            }
    }*/

        ps = new PaintCircle(width, height);
        frame.add(ps);
        Thread thread = new Thread(ps);
        thread.start();
        ps2 = new PaintCircle(width, height);
        frame.add(ps2);
        Thread thread2 = new Thread(ps2);
        thread2.start();
        //thread.start();
        /*for(int i = 0; i < 1; i++){
            for(int j = 0; j < 2; j++){
                PaintCircle ps = new PaintCircle(width, height);
                frame.add(ps);
                threads[i][j] = new Thread(ps);
                threads[i][j].start();
            }
        }*/

    }
}


import java.util.Scanner;

class Line {

    ////Synchronized Method
    synchronized public void getLine()
    {
        for (int i = 0; i < 3; i++) {
            System.out.println(i);
            try {
                Thread.sleep(400);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        System.out.println("End of Synchronized Method");
    }

    ////Synchronized Block
    /*public void getLine() {
        synchronized (this) {
            for (int i = 0; i < 4; i++) {
                System.out.println(i);
                try {
                    Thread.sleep(400);
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
            System.out.println("End of Synchronized BLock");
        }
    }*/
}

class ThreadSync extends Thread
{

    Line line;

    ThreadSync(Line line)
    {
        this.line = line;
    }

    @Override
    public void run()
    {
        line.getLine();
    }
}
public class MTques2{
    public static void main(String[] args) {
        Line obj = new Line();
        ThreadSync thread1=new ThreadSync(obj);
        ThreadSync thread2=new ThreadSync(obj);
        thread1.start();
        thread2.start();
    }
}

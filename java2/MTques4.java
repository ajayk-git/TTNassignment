class ThreadExmple implements Runnable{
    int count=0;
    @Override
    public synchronized void run() {
        try {
            for (int i = 0; i < 1000; i++) {
                increment();
            }
        }
      catch (Exception e){
          System.out.println(count);
       }
        System.out.println("Current final counter value :" +count);
    }
    public void increment(){
        String threadName= Thread.currentThread().getName();
        System.out.println("threadName : " +threadName +":"+count);
        count++;
    }
}

public class MTques4{
    public static void main(String[] args) {
        ThreadExmple ex = new ThreadExmple();
        Thread t1 = new Thread(ex);
        Thread t2 = new Thread(ex);
        t1.start();
        t2.start();
    }
}


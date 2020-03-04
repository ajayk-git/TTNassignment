//6. Write a program to create a Thread pool of 2 threads where one Thread will print even numbers and other will print odd numbers.


import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

class even implements Runnable{
    @Override
    public void run() {
          for(int i=0;i<15;i=i+2){
              try {
                  Thread.sleep(75);
              } catch (InterruptedException e) {
              }
              System.out.println(Thread.currentThread().getName()+" printing : "+i);
          }
    }
}
class odd implements Runnable{
    @Override
    public void run() {
        for(int i=1;i<=15;i=i+2){
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
            }
            System.out.println(Thread.currentThread().getName()+" printing : "+i);
        }
    }
}
//
//class Counting implements Runnable{
//   int count=0;
//    @Override
//     public void run() {
//        for (int i=0;i<20;i++){
//            increment();
//            System.out.println("value icremented by thread :"+Thread.currentThread().getName()+" : "+count);
//        }
//    }
//    public void increment(){
//        count++;
//    }
//}

public class MTques4pool{
    public static void main(String[] args) {
        Runnable thread1= new even();
        Runnable thread2=new odd();
        ExecutorService pool = Executors.newFixedThreadPool(2);
        pool.execute(thread1);
       // Thread.join(thread1);
        pool.execute(thread2);
        pool.shutdown();

//        Runnable thread1= new Counting();
//        Runnable thread2=new Counting();
//        ExecutorService pool = Executors.newFixedThreadPool(2);
//        pool.execute(thread1);
//        pool.execute(thread2);
//        pool.shutdown();







    }
}

///Implement Thread using thread class.

//class Threadtest extends Thread{
//
//    @Override
//    public void run() {
//        System.out.println("Overriding the run method of Thread class using object of thread class i.e. thread1");
//    }
//}
//
//public class MTques3 {
//    public static void main(String[] args) {
//        Threadtest thread1=new Threadtest();
//        thread1.start();
//    }
//
//
//}



///Implement Thread by implementing the interface "Runnable".


class Threadtest implements Runnable{
    @Override
    public void run() {
        System.out.println("Overriding the run method by implementing the interface Runnable for thread1.");
    }
}
public class MTques3{
    public static void main(String[] args) {
        Runnable thread1=new Threadtest();
        Thread t1 =new Thread(thread1);
        t1.start();
    }
}


//Thread. sleep(long millis) method causes the currently executing thread to sleep for the specified number of milliseconds.

public class MTques1 extends Thread{
        public void run(){
            for(int i=0; i<5; i++){
                try{
                    System.out.println("Value :"+i);
                    Thread.sleep(200);
                }
                catch (Exception e){
                    System.out.println("Exception in thread "+e.getMessage());
                }
            }
        }

        public static void main(String[] args) {
            MTques1 q1 = new MTques1();
            MTques1 q2 = new MTques1();

            q1.start();
            q2.start();
        }
    }




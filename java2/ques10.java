        class Orders {                                             //order class which is used to helps to get the orders,remove the orders and etc functionalies

            void addorder(String orderid,double amount){ }
            void removeorder(String orderid){ }                   //method to get the order from customer
            void completeorder(String orderid){ }                 //method to get the order complete
        }
        class Customer {                                          // this class is used to maintain customer details
            private String name;
            private String token;
            double amount;
            String orderid;
            String customername;

            void placeOrder() {  }                           //method to pay and place the order
            boolean waitingState(){ return true; }                         //method to get the state of waiting i.e. costumer is waiting or not
            boolean drinkingState() { return false;}                      //method to get the state that, customer collected his order or not?
        }
        class Cashier extends Orders {
            String cashiername;
            void addordertoorderqueue(String orderid){ }                                                           //method to add order to cooffe house's order list
            String AcceptOrderAndAddCustomerToCustomerList(String customername,String orderid,double amount){ return "a";}    //method to accept the paymennt from user and
                                                                                                                   // return his token number for his order
}

class Barista extends Orders{                             //this class is used to maintain Barista activity
    String Baristaname;
    String ordertobeprepared;
    void orderidReady(String token){  }                   //method to notify the user his oerder is ready
    void getnextorderfromorderqueue(){ }                 //method to get the new order from order list of coffee house

}

public class ques10 {                               //main class
    public static void main(String[] args) {

    }
}

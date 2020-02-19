class Bank{
    String bankName;
    static int bankId;
    double interestRate;

    void getDetails(){
        System.out.println("Welcome to : "+bankName );
        System.out.println("BankId is : "+bankId);
        System.out.println("Bank Name: "+bankName);
        System.out.println(interestRate);
    }
}

class SBI extends Bank{

    String bankName="SBI";
    String bankId="SBI0012";
    double interestRate=6;
    void getDetails(){
        System.out.println("------------------------");
        System.out.println("Welcome to : "+bankName );
        System.out.println("BankId is : "+bankId);
        System.out.println("Bank Name: "+bankName);
        System.out.println(interestRate);
    }
}

class ICICI extends Bank{
    String bankName="ICICI";
    String bankId="ICICI216";
    double interestRate=2.5;
    void getDetails(){
        System.out.println("------------------------");
        System.out.println("Welcome to : "+bankName );
        System.out.println(bankId);
        System.out.println(bankName);
        System.out.println(interestRate);
    }
}

class BOI extends Bank{
    String bankName="BOI";
    String bankId="BOI2134";
    double interestRate=3.4;
    void getDetails(){
        System.out.println("------------------------");
        System.out.println("Welcome to : "+bankName );
        System.out.println("BankId is : "+bankId);
        System.out.println("Bank Name: "+bankName);
        System.out.println(interestRate);
    }
}





class ques11 {
    public static void main(String[] args) {
     Bank b=new Bank();
     b.getDetails();
     ICICI i=new ICICI();
     BOI boi=new BOI();
     SBI s=new SBI();
     i.getDetails();
     s.getDetails();
     boi.getDetails();
    }
}

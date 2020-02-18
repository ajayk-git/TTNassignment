public class ques7 {
 static  String firstname="Ajay";
  static  String lastname="Kumar";
  static  int age=23;

  //Static Section
  static {
       firstname="Aryan Ajay";
       lastname="kumar jangir";
       age=35;
      System.out.println("-------------------------------------------------");
      System.out.println("Gettig values from Static Block and  Values are:");
      System.out.println("First Name : "+firstname);
      System.out.println("Last Nmae : "+lastname);
      System.out.println("Age : "+age);
  }
   static  void getvalue(){
       firstname="Aryan Ajay krishna ";
       lastname="kumar jangir yadav";
       age=53;
       System.out.println("-------------------------------------------------");
       System.out.println("Getting values from static method  and values are :");
       System.out.println("First Name : "+firstname);
       System.out.println("Last Nmae : "+lastname);
       System.out.println("Age : "+age);
   }


    public static void main(String[] args) {
        System.out.println("-------------------------------------------------");
        System.out.println("Getting Valaues from Static Variable");
        System.out.println(firstname);
        System.out.println(lastname);
        System.out.println(age);
        getvalue();
    }
}

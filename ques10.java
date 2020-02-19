class ques10 {

    void addition(int a,int b)
    {
        System.out.println("Adding two integer numbers");
        System.out.println(a+b);
    }
    void addition(double a,double b)
    {
        System.out.println("Adding two double numbers");
        System.out.println(a+b);
    }
    void multiply(int a,int b)
        {
            System.out.println("Multilying two integer numbers");
            System.out.println(a*b);
        }
    void multiply(float a,float b)
        {
            System.out.println("Multilying two float numbers");
            System.out.println(a*b);
        }
        void concate(String  str1,String str2)
        {
            System.out.println("Adding two strings");
            System.out.println(str1+str2);
        }
        void concate(String  str1,String str2,String str3)
        {
            System.out.println("Adding three strings");
            System.out.println(str1+str2+str3);
        }

    public static void main(String[] args) {
       ques10 q10=new ques10();
       q10.concate("ajay","kumar");
       q10.concate("ajay","kumar","jangir");
       q10.addition(10,12);
       q10.addition(10.1233,12.0030);
       q10.multiply(10,20);
       q10.multiply(10.2f,12.3f);


    }
}

import java.util.Scanner;

class ques1 {
    static void editword(String word,String substring1,String substring2) {
        word=word.replace(substring1, substring2);
        System.out.println("New edited string is : " + word);

    }


    public static void main (String[] args) {
        System.out.println("Enter the word : ");
        Scanner input1=new Scanner(System.in);
        String word=input1.nextLine();
        System.out.println("Enter the substring you want to edit : ");
        Scanner input2=new Scanner(System.in);
        String substring1=input1.nextLine();
        System.out.println("Enter the substring you want to replace : ");
        Scanner input3=new Scanner(System.in);
        String substring2=input2.nextLine();
        editword(word,substring1,substring2);

    }

}

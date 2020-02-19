//8. WAP to read words from the keyboard until the word done is entered.
// For each word except done, report whether its first character is equal to its last character.
// For the required loop, use (a)While loop


import java.util.Scanner;

class Ques8{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str="";
        while(true){
            str = sc.next();
            if(str.equals("done")){
                System.out.println("\nentered Done");
                break;
            }
            else{
                if(str.charAt(0) == str.charAt(str.length()-1)){
                    System.out.println("first character and last character are same: ");
                }
            }
        }
    }
}
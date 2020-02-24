import java.util.HashMap;
import java.util.Scanner;

public class collectionsQues3 {
    public static void main(String[] args) {
        HashMap<Character, Integer> countChar= new HashMap<>();
        String string ;
        System.out.println("Enter a string : ");
        Scanner input=new Scanner(System.in);
        string=input.nextLine();
         char[] word=string.toCharArray();
         for(char c: word){
             if(countChar.containsKey(c)) {
                 countChar.put(c, countChar.get(c) + 1);
             }
             else countChar.put(c,1);
         }
        System.out.println("Count of characters in string are : ");
        System.out.println(countChar);


    }
}

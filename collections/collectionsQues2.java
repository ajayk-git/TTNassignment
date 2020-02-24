//Write a method that takes a string and returns the number of unique characters in the string.


import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class collectionsQues2 {
    public static void main(String[] args) {
        String string;
        char[] word;
        System.out.println("Enter a string : ");
        Scanner input=new Scanner(System.in);
        string=input.nextLine();
        word=string.toCharArray();
        HashSet<Character> hashSet = new HashSet<Character>();
        if(word.length>0){
            for(int index=0;index<word.length;index++){
                hashSet.add(word[index]);
            }
            System.out.println("Total no. of unique characters in strings are :  "+hashSet.size());
            System.out.println("the unique elements in string are : "+hashSet);
        }
        else System.out.println("Please enter a valid String.");

    }
}

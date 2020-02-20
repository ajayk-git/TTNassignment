//WAP to sorting string without using string Methods.

import java.util.Scanner;

public class ques2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to sort");
        String str = sc.nextLine();
        String sortedstring ="";
        int len =str.length();
        char[] ans = new char[len+1];
        for(int i=0; i<len; i++)
        {
            ans[i] = str.charAt(i);
        }
        for(int i=0; i<len-1; i++)
        {
            for(int j=i+1; j<len; j++)
            {
                if(ans[i] > ans[j])
                {
                    char temp =ans[i];
                    ans[i] = ans[j];
                    ans[j] = temp;
                }
            }
        }
        for(int i=0; i<len; i++)
        {
            sortedstring = sortedstring+ans[i];
        }
        System.out.println("Sorted String is : "+sortedstring);

    }
}
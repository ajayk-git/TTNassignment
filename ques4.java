import java.util.Scanner;

class ques4 {
    public static void countOccurence(String sentence) {
        String temp = sentence;
        int upperCase = 0;
        int lowerCase = 0;
        int digit = 0;
        int specChar = 0;
        int totalChar=0;


        for (int index = 0; index < temp.length(); index++) {
            if (temp.charAt(index) >= 97 && temp.charAt(index) <= 122) {
                lowerCase++;
            }
            else if (temp.charAt(index) >= 65 && temp.charAt(index) <= 90) {
                upperCase++;
            }
            else if (temp.charAt(index) >= 48 && temp.charAt(index) <=57) {
                digit++;
            } else
                specChar++;
        }
        System.out.println("Uppercase Letters :" + upperCase);
        System.out.println("Lowercase Letters :" + lowerCase);
        System.out.println("Special Character :" + specChar);
        System.out.println("Digits :" + digit);
        System.out.println();
    }

    public static void main(String[] args) {
        String sentence;
        Scanner input = new Scanner(System.in);
        sentence = input.nextLine();
        countOccurence(sentence);

    }


}
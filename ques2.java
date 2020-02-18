import java.util.Scanner;

class ques2 {

    private static void getRepWords(String sentence) {
        sentence = sentence.toLowerCase();

        String words[] = sentence.split(" ");


        for (int index = 0; index < words.length; index++) {

            int count =1;
            for (int j = index + 1; j < words.length; j++) {


                if ( words[index].equals(words[j])) {

                    count++;
//                    System.out.println("hello");
                    words[j] = "1";
                }


            }
            if (count > 1 && words[index] != "1")
                System.out.println(words[index]);


        }

    }


    public static void main(String[] args) {
        String sentence;
        System.out.println("Enter a sentence :");
        Scanner input = new Scanner(System.in);
        sentence = input.nextLine();
        System.out.println("Repeated words are : ");
        getRepWords(sentence);
    }
}
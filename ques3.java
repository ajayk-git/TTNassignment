import java.util.Scanner;

class ques3 {
 public static void occurenceOfCharacter(String string,int indexfile[], int index){
       if(index==(string.length()))
           return;
       else {
           int ascii=string.charAt(index);
           indexfile[ascii]++;
           occurenceOfCharacter(string, indexfile, index + 1);
       }
 }

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        String string=input.nextLine();

        int indexFile[] = new int[255];

        int index=0;
        occurenceOfCharacter(string, indexFile, index);

        for(int i=0;i<indexFile.length;i++){
            if(indexFile[i]>1){


                System.out.println((char)i+":"+indexFile[i]);

            }
        }


    }
}


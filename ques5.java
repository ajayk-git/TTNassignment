import java.util.ArrayList;

class ques5 {
        static void commonElements(int array1[],int array2[])
        {

                for(int i =0; i <array1.length;i++)
                {
                        for(int j =0;j<array2.length;j++)
                        {
                                if(array1[i]==array2[j])
                                {
                                        System.out.println(array1[i]);;
                                }
                        }
                }

        }

public static void main(String[] args) {

        int array1[] = {31, 2, 3, 4, 2, 6, 4, 17, 6};
        int array2[] = {31, 43, 45, 4, 76, 6, 87, 3, 6};
        System.out.println("Common elements are :");
        commonElements(array1,array2);

        }
        }
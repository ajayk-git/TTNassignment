
class ques6 {
    public static int repeatedElement(int array[]) {
        int repeatedElement = 0;
        for (int index = 0; index < array.length; index++) {
            repeatedElement = repeatedElement ^ array[index];
        }
        return repeatedElement;
    }

    public static void main(String[] args) {
        int array[] = {31, 2, 3, 4, 2, 6, 4, 3, 6};
        System.out.println("Repeated element in Array is :" + repeatedElement(array));

    }
}
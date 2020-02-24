//Print the elements of an array in the decreasing frequency if 2 numbers have same frequency then print the one which came first.

import java.util.*;

public class collectionsQues7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size");
        int size= sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter Array");
        for (int index = 0; index < size; index++) {
            arr[index] = sc.nextInt();
        }
        TreeMap<Integer, Integer> numbers = new TreeMap<Integer, Integer>();
        for (int a : arr) {
            if (numbers.containsKey(a)) {
                numbers.put(a, numbers.get(a) + 1);
            } else
                numbers.put(a, 1);
        }

        System.out.println("Before Sorting: ");
        for (Map.Entry entry : numbers.entrySet()) {
            System.out.println(entry.getKey() + "\t" + entry.getValue());
        }
        sortMapByValue(numbers);
    }

    static void sortMapByValue(TreeMap<Integer, Integer> m) {
        List<Map.Entry<Integer, Integer>> ll = new LinkedList<Map.Entry<Integer, Integer>>(m.entrySet());
        Collections.sort(ll, new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                if (o1.getValue() > o2.getValue())
                    return -1;
                else if (o1.getValue() < o2.getValue())
                    return 1;
                else
                    return 0;
            }
        });

        //  System.out.println("safsafsdf"+ll);
        System.out.println("After Sorting: ");
        for (Map.Entry entry : ll) {
            System.out.println(entry.getKey() + "\t" + entry.getValue());
        }

    }
}
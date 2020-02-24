import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class collectionsQues8
{
    static int top=-1;
    static int size=5;
    static int top_one=-1;
    static int i;
    int minimum=0;
    ArrayList<Integer> list = new ArrayList<>();
    ArrayList<Integer> minlist = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    public void push(int x)
    {
        if (isFull())
            System.out.println("stack is already full,cannot add more elements");
        else {
            top++;
            list.add(top,x);
            System.out.println(x+" is added to the stack");
            System.out.println();
        }
    }
    public void pop()
    {
        if (isEmpty())
        {
            System.out.println("stack is already empty,cannot remove elements");
        }
        else
        {
            System.out.println(list.get(top)+" is removed from the stack");
            list.remove(top);
            top--;

        }

    }

    public boolean isEmpty()
    {
        if(top==-1)
            return true;
        else
            return false;
    }
    public boolean isFull()
    {
        if (top==size-1)
            return true;
        else
            return false;
    }


    public void getMinimun()
    {
        if(list.isEmpty())
        {
            System.out.println("stack is already empty");

        }
        else {
            //Collections.copy(minlist,list);
            //Collections.sort(minlist);
            //System.out.println(minlist.get(0));
            System.out.println("Minimum Element in Stack is : "+Collections.min(list));
        }
    }

    public void menu() {
        do {
            System.out.println("----------------------------");
            System.out.println("Enter 1 to Push: ");
            System.out.println("Enter 2 to Pop: ");
            System.out.println("Enter 3 for isEmpty : ");
            System.out.println("Enter 4 for isFull: ");
            System.out.println("Enter 5 to getMin: ");
            System.out.println("Enter any to break: ");
            System.out.print("Enter value: ");
            i = sc.nextInt();

            sc.nextLine();

            switch (i) {
                case 1:
                    System.out.print("Enter value to push: ");
                    int x = sc.nextInt();
                    push(x);
                    break;
                case 2:
                    pop();
                    break;
                case 3:
                    if (isEmpty())
                        System.out.println("stack is empty");
                    else System.out.println("stack is not empty");
                    break;
                case 4:
                    if (isFull())
                        System.out.println("stack is full");
                    else System.out.println("stack is not full");
                    break;
                case 5:
                    getMinimun();
                    break;
                default:
                    break;
            }

        }while(i<6);
    }
    public static void main (String[]args)
    {
        collectionsQues8 q = new collectionsQues8();
        System.out.println("Enter size of the stack : ");
        size = sc.nextInt();
        q.menu();
    }

}
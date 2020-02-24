import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student{
    String name;
    Double Age;
    Double Score;
    Student(String name, Double score, Double age){
        this.name=name;
        this.Score=score;
        this.Age=age;
    }
    public String toString(){
        return name+" "+Score+" "+Age;
    }
}
public class collectionQues6{
    public static void main(String[] args) {
        ArrayList<Student> studentList=new ArrayList<Student>();
        studentList.add(new Student("Ajay",87.0, 23.0));
        studentList.add(new Student("Vijay",90.0, 21.0));
        studentList.add(new Student("Sonam",98.0, 23.0));
        studentList.add(new Student("Ritu",93.0, 25.0));
        studentList.add(new Student("Shreya",67.0, 16.0));
        studentList.add(new Student("Nikhil",93.0, 25.0));
        studentList.add(new Student("Yashika", 89.0, 18.0));
        System.out.println("Students list before sorting : ");
        System.out.println("--------------------------------------");
        for(int index=0;index<studentList.size();index++){
            System.out.println(studentList.get(index));
        }
        Collections.sort(studentList, new CompareByScore());
        System.out.println("Students list after sorting mentioned in question : ");
        System.out.println("--------------------------------------");
        for(int index=0;index<studentList.size();index++){
            System.out.println(studentList.get(index));
        }
    }
}

class CompareByScore implements Comparator<Student> {
    public int compare(Student e1, Student e2){
        if(e1.Score>e2.Score)
            return -1;
        else if(e1.Score<e2.Score)
            return 1;
        else
            return new NameComparator().compare(e1, e2);
    }
}
class NameComparator implements Comparator<Student> {
    public int compare(Student e1, Student e2){
        return e2.name.compareTo(e1.name);
    }
}
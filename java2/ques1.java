abstract class Abstract
{
    abstract void setDetails();
    abstract void getDetails();
}

class Library extends Abstract
{
    public String Library_Name;
    public int Library_id;

    @Override
    void setDetails()
    {
        Library_Name="THE ROYALLIBRARY";
        Library_id=1001;
    }

    @Override
    void getDetails()
    {
        System.out.println("Library Name : "+Library_Name);
        System.out.println("Library ID : "+Library_id);
    }
}

class user extends Abstract
{
    public String user_name;
    public int user_id;
    public String user_address;
    @Override
    public void setDetails() {
        user_name="Manish";
        user_id=4125;
        user_address="Dwarka West Delhi";

    }
    @Override
    public void getDetails() {
        System.out.println("User Name : "+user_name);
        System.out.println("User Id : "+user_id);
        System.out.println("Address : "+user_address);

    }
}

public class ques1
{
    public static void main(String arg[])
    {
        Library l=new Library();
        user u=new  user();
        System.out.println("************LIBRARY*************");
        l.setDetails();
        l.getDetails();
        System.out.println("*************USER***************");
        u.setDetails();
        u.getDetails();

    }
}



//when we complied the code two classfile are created named as "ABC" and "ques3".When i deleted classfile "ABC".
// and again run the code then i got "NoClassDefFoundError".
//It occures when we have class file compile time but not file is not present at run time.

//"error shown as follows :"

//Exception in thread "main" java.lang.NoClassDefFoundError: ABC
//        at ques3.main(ques3.java:12)
//        Caused by: java.lang.ClassNotFoundException: ABC
//        at java.base/jdk.internal.loader.BuiltinClassLoader.loadClass(BuiltinClassLoader.java:581)
//        at java.base/jdk.internal.loader.ClassLoaders$AppClassLoader.loadClass(ClassLoaders.java:178)
//        at java.base/java.lang.ClassLoader.loadClass(ClassLoader.java:521)
//        ... 1 more


class ABC{
    private String name;
    private int id;

}


public class ques3
{
    public static void main(String[] args)
    {
        ABC abc=new ABC();
        try
        {
            System.out.println(abc);

        }
        catch (NoClassDefFoundError e)
        {
            e.printStackTrace();
        }
    }
}
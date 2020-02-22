
//ClassNotFoundException: It is an exception,when we try to load a class at run time which is not updated in the class path then it occurs.
//when we run the following code ,the orcale druver wasnt present in classpath thats why this exception occured and following exception is thrown.

//java.lang.ClassNotFoundException: Oracle.jdbc.driver.OracleDriver
//        at java.base/jdk.internal.loader.BuiltinClassLoader.loadClass(BuiltinClassLoader.java:581)
//        at java.base/jdk.internal.loader.ClassLoaders$AppClassLoader.loadClass(ClassLoaders.java:178)
//        at java.base/java.lang.ClassLoader.loadClass(ClassLoader.java:521)
//        at java.base/java.lang.Class.forName0(Native Method)
//        at java.base/java.lang.Class.forName(Class.java:315)
//        at ques3A.main(ques3A.java:7)


public class ques3A {
    public static void main(String[] args) {
        try{
            Class.forName("Oracle.jdbc.driver.OracleDriver");
        }
        catch (ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}

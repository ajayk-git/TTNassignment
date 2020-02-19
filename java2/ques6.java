//WAP showing try, multi-catch and finally blocks.

class ques6{
    public static void main(String[] args) {
        int[] arr =new int[5];
        try{
            int division = 98/0;
            int result = arr[7];
        }
        catch (ArrayIndexOutOfBoundsException ioe){
            ioe.printStackTrace();
            System.out.println("\nArrayIndexOutOfBoundsException:");

        }
        catch(ArithmeticException   Ae){
            Ae.printStackTrace();
            System.out.println("\nDivide by zero exception :");

        }
        catch(Exception e){
            e.printStackTrace();
            System.out.println("\nAnykind of Exception:");

        }
        finally{
            System.out.println("\nFinally block Executed:");
        }
    }
}
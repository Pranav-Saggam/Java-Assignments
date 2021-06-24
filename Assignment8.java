import java.util.ArrayList;

public class Assignment8 {
    public static void callExceptionMethod(int []a)
            throws ArrayIndexOutOfBoundsException,ArithmeticException,NullPointerException{
        int sum=0,div=0;
        int[] a1=null;
        try{
            // ArrayIndexOutOfBound Exception
            for(int i=0;i<5;i++){
                sum+=a[i];
            }
            // ArithmeticException
            div=sum/0;
            //NullPointerException:
            if(a1.equals(a)){
                System.out.println("Both arrays are equal");
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("The final block is executed");
        }
    }
    public static void main(String[] args){
        int[] a={1,2,3,4};
        Assignment8.callExceptionMethod(a);
    }

}

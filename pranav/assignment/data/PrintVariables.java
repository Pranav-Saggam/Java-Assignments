package pranav.assignment.data;

public class PrintVariables {
    int var1;
    char var2;
    // Instance variables are initialized by default constructor.so it doesnot generate any error
    public void printInstanceVariables(){
        System.out.println(var1);
        System.out.println(var2);
    }

    //local variables are not initialized here.so it generates error.
    public void printLocalVariables(){
        int localVar1;
        char localVar2;
        System.out.println(localVar1);
        System.out.println(localVar2);
    }
}

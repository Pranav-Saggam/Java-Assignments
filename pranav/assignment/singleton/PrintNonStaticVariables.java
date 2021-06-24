package pranav.assignment.singleton;

public class PrintNonStaticVariables {
    String s;
    // Static methods cannot call non-static methods and cannot use instance variables
    public static  PrintNonStaticVariables initializeVariable(String s){
        this.s=s;
        return this;
    }
    public void printInstanctVariable(){
        System.out.print(s);
    }
}

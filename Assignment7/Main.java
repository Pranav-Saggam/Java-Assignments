public class Main {
    public static void main(String[] args){
        Implementation implementation=new Implementation();
        implementation.passingInterfaceA(implementation);
        implementation.passingInterfaceB(implementation);
        implementation.passingInterfaceC(implementation);

        SecondClass.SecondInnerClass secondInnerClass1=new SecondClass.SecondInnerClass();
    }

}

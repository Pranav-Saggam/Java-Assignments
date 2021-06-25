public class Implementation extends Concrete implements InterfaceA,InterfaceC,InterfaceB{
    @Override
    public void methodA1() {
        System.out.println("Implementing metodA1");
    }

    @Override
    public void methodA2() {
        System.out.println("Implementing metodA2");
    }

    @Override
    public void methodB1() {
        System.out.println("Implementing metodB1");
    }

    @Override
    public void methodB2() {
        System.out.println("Implementing metodB2");
    }

    @Override
    public void methodC1() {
        System.out.println("Implementing metodC1");
    }

    @Override
    public void methodC2() {
        System.out.println("Implementing metodC2");
    }

    public void passingInterfaceA(InterfaceA interfaceA){
        interfaceA.methodA1();
    }

    public void passingInterfaceB(InterfaceB interfaceB){
        interfaceB.methodB1();
    }


    public void passingInterfaceC(InterfaceC interfaceC){
        interfaceC.methodC1();
    }
}

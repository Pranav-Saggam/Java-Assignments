class Cycle{
    Cycle(){
        System.out.println("Cycle constructor is called");
    }
}
class UniCycle extends Cycle{
    UniCycle(){
        System.out.println("UniCycle constructor is called");
    }
    public void balance(){
        System.out.print("Balance method in Unicycle class is called");
    }
}
class BiCycle extends Cycle{
    BiCycle(){
        System.out.println("BiCycle constructor is called");
    }
    public void balance(){
        System.out.print("Balance method in Bicycle class is called");
    }
}
class TriCycle extends Cycle{
    TriCycle(){
        System.out.println("TriCycle constructor is called");
    }
}
public class CycleInheritance {
    public static void main(String[] args){
        UniCycle uniCycle=new UniCycle();
        BiCycle biCycle=new BiCycle();
        TriCycle triCycle=new TriCycle();
        Cycle[] cycles=new Cycle[3];
        cycles[0]=uniCycle;
        cycles[1]=biCycle;
        cycles[2]=triCycle;
        uniCycle.balance();
        biCycle.balance();
    //    triCycle.balanace();
        UniCycle cycle1 = (UniCycle)cycles[0];
        BiCycle cycle2 =  (BiCycle)cycles[1];
        TriCycle cycle3 = (TriCycle)cycles[2];

        cycle1.balance();
        cycle2.balance();


    }

}

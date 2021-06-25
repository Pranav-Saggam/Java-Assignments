class Rodent
{
    Rodent(){
        System.out.println("Rodent constructor is called");
    }
    void eat()
    {
        System.out.println("Rodent is eating");
    }
    void run()
    {
        System.out.println("Rodent is running");
    }
}
class Mouse extends Rodent
{    Mouse(){
    System.out.println("Mouse constructor is called");
}
    void eat()
    {
        System.out.println("Mouse is eating");
    }
    void run()
    {
        System.out.println("Mouse is running");
    }
}
class Gerbil extends Rodent
{    Gerbil(){
    System.out.println("Gerbil constructor is called");
}
    void eat()
    {
        System.out.println("Gerbil is eating");
    }
    void run()
    {
        System.out.println("Gerbil is running");
    }
}
class Hamster extends Rodent
{    Hamster(){
    System.out.println("Hamster constructor is called");
}
    void eat()
    {
        System.out.println("Hamster is eating");
    }
    void run()
    {
        System.out.println("Hamster is running");
    }
}
class RodentsInheritance
{
    public static void main(String args[])
    {
        Rodent r[] = new Rodent[3];
        r[0] = new Mouse();
        r[1] = new Gerbil();
        r[2] = new Hamster();

        r[0].eat();
        r[0].run();

        r[1].eat();
        r[1].run();

        r[2].eat();
        r[2].run();
    }
}
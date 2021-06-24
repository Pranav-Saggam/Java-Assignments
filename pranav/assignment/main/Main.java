package pranav.assignment.main;

import pranav.assignment.data.PrintVariables;
import pranav.assignment.singleton.PrintNonStaticVariables;

public class Main {
    public static void main(String[] args){
        PrintVariables printVariables=new PrintVariables();
        printVariables.printInstanceVariables();
        printVariables.printLocalVariables();
        PrintNonStaticVariables printNonStaticVariables=PrintNonStaticVariables.initializeVariable("Pranav");
        printNonStaticVariables.printInstanctVariable();

    }
}

package secondPackage;

import firstpackage.A;
import firstpackage.B;

public class D extends B {
    void printMessageFromD(){
        A a = new A();
        a.publicVariableInA = 60;
        //a.protectedVariableInA = 20;
        //a.printMessageFromA();
        // a.defaultVariableInA = 400;


        B b = new B();
        b.publicVariableInB = 60;
        printMessageFromB();
        protectedVariableInB = 100;
       // b.defaultVariableInB = 50;
    }
}

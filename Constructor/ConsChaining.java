import java.lang.*;

class A {
    A(){
        System.out.println("I'm from class A");
    }
}
class B extends A{
    B(){
        System.out.println("I'm from class B");
    }
}
class C extends B{
    C(){
        System.out.println("I'm from class C");
    }
}
class D extends C{
    D(){
        System.out.println("I'm from class D");
    }
}

class ConsChaining extends D{
    ConsChaining(){
        System.out.println("I'm from lower base class");
    }

    public static void main(String[] args){
        A a = new A();
        // Only memeber of class A got intialized and constructor of A get called.
        B b = new B();
        // it can intialize the member itself and its parent class and also called the constructor of both the classes.
        C c = new C();
        // It will intialized the members and call the constructors of itself and all its parent classes
        D d = new D();
        // Constructor of class A, B, C, and D get called by it and their member's also get memory.
        ConsChaining cc = new ConsChaining();
        // Call the constructor of all itself and parent classes and intialize memory to their member's
    }
}
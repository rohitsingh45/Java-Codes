class Parent {
    void method1() {
        System.out.println("I'm parent method");
    }
}

class Child extends Parent {
    void method1() {
        System.out.println("I'm child method inherited from parent");
        // Calling of super class method
        super.method1();

        // Calling of self class method
        this.method2();
    }

    void method2() {
        System.out.println("I'm child personal method");
    }
}

/* Upcasting:- Upcasting is casting a subtype to a super type in an upward direction to the inheritance tree. It is an automatic procedure for which there are no efforts poured in to do so where a sub-class object is referred by a superclass reference variable. One can relate it with dynamic polymorphism. */

public class Upcasting {
    public static void main(String[] args) {
        // Casting of object of child class into parent class type
        // Upcasting
        Parent p1 = new Child();
        p1.method1();       // Calling of child class method.

        // p1.method2();    
        // It cause error because we are trying to calling personal method of child class with parent class object. Method2 is un-known for parent class.

        // No error....
        // Child cc = new Child();
        // cc.method1();
        // cc.method2();

    }
}

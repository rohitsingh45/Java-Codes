class superClass {
    void m1() {
        System.out.println("Super class method");
    }
}

class subClass extends superClass {
    void m1() {
        System.out.println("Sub class method");
    }

    void m2() {
        System.out.println("Sub class personal method");
    }
}
public class DownCasting {
    public static void main(String[] args)throws ClassCastException {
        superClass sc = new subClass();
        sc.m1();
        // sc.m2();     
        // It cause error because sc is type of superClass which isn't any information regarding personal methods of subClass.

        // Downcasting method 1:- But got exception
        // superClass sc2 = new superClass();
        // subClass sb2 = (subClass) sc2;  // Exception because of this line. 
        // sb2.m1();                    // We are getting exception that means we can downcast but not by this way.
        // sb2.m2();

        // Solution of above problem of downcasting....
        // Now perform downcasting
        subClass sb = (subClass)sc;
        sb.m1();
        sb.m2();
    }
}

class NestedClass {
    public class InnerClass1 {
        public void innerClassMethod() {
            System.out.println("I'm instance method from non-static inner class");
        }

        public static void innerStaticMethod() {
            System.out.println("I'm static method from non-static inner class");
        }
    }

    public static class staticInnerClass {
        public static void staticInnerClassMethod() {
            System.out.println("I'm static methods from static inner class");
        }

        public void staticInstanceMethod() {
            System.out.println("I'm instance method from static inner's class");
        }
    }
}

class innerClass {
    public static void main(String[] args) {
        
        // For instance inner class's methods call...
        NestedClass nc = new NestedClass();
        NestedClass.InnerClass1 nic = nc.new InnerClass1();
        nic.innerClassMethod();

        // For inner class's static methods calls...
        NestedClass.InnerClass1.innerStaticMethod();
        
        // Calling static methods of static inner class..
        // Similar to inner classes static methods call..
        NestedClass.staticInnerClass.staticInnerClassMethod();

        // Calling instance methods of static inner class...
        NestedClass.staticInnerClass nsi = new NestedClass.staticInnerClass();
        nsi.staticInstanceMethod();
    }
}
class funci {

    static void func() {
        int a, b;
        a = 23;
        b = 76;
    }

    public static void main(String args[]) {
        funci f1 = new funci();
        f1.func();
        // System.out.println(f1.a);  
        // Compile time error because trying to access local variable of method.

    }
}
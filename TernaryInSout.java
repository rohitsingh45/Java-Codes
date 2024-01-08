class TernaryInSout {
    static int v, c;

    void value() {
        v = 32;
        c = 43;
        operation();
    }

void operation()
{  
    // v>c?System.out.println(v);	: System.out.println(c);

    System.out.println(v>c?v:c + " ");
   
}

    public static void main(String[] args) {
        TernaryInSout tis = new TernaryInSout();
        tis.value();
    }
}
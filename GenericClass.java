class General<T> {
    T obj1;
    T obj2;
    T obj3;

    void setVariable(T var1, T var2, T var3) {
        this.obj1 = var1;
        this.obj2 = var2;
        this.obj3 = var3;
    }

    public void getSum() {
        System.out.println(this.obj1 + " " + " " + this.obj2 + " " + this.obj3 + " are variables of generic class");
    }
}

public class GenericClass {
    public static void main(String[] args) {

        // Integer type generic class....
        General <Integer> g1 = new General<>();
        g1.setVariable(10, 20, 30);
        g1.getSum();

        // String type generic class.....
        General <String> g2 = new General<>();
        g2.setVariable("String 10", "String 20", "String 30");
        g2.getSum();

        // Object type generic class...
        // It permits to take all types of values in it.
        General <Object> g3 = new General<>();
        g3.setVariable( 10, "String 20", false);
        g3.getSum();
    }
}

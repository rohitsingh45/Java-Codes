// GenericsMethod
// Syntax :-  
// accessModifiers <T> returnType MethodName(parameters){//Method Body}
// <T> here we can write any valid identifier which is supported by java.

class Generic {
    public <T> void nonReturnedMethod(T var1, T var2) {
        System.out.println(var1 + " " + var2 + " are generic type variable");
    }

    public <T extends Comparable<T>> T maxiMethod(T var1, T var2, T var3) {
        System.out.println("Maximum of " + var1 + " " + var2 + " " + var3 + " is:- ");
        T maxi = var1;
        if (var2.compareTo(maxi) > 0)
            maxi = var2;

        if (var3.compareTo(maxi) > 0)
            maxi = var3;

        return maxi;
    }
}

public class GenericsMethods {
    public static void main(String[] args) {
        Generic g1 = new Generic();

        // Generic methods with parameters & return type........

        // Integer i1[] = { 10, 20, 30 };
        // String str1[] = { "Rohit", "Ronit", "Ropit" };
        // Double db[] = { 10.20, 23.32, 23.31 };

        // Finding maximum for different types variables...
        // System.out.println(g1.maxiMethod(i1[0],i1[1],i1[2]));
        // System.out.println(g1.maxiMethod(str1[0],str1[1],str1[2]));
        // System.out.println(g1.maxiMethod(db[0], db[1], db[2]));

        // Generics methods with only parameters no return type....
        g1.nonReturnedMethod(10, 20);
        g1.nonReturnedMethod(10.10, 20.02);
        g1.nonReturnedMethod("Khiladi", "Bhaiya");
        g1.nonReturnedMethod(false, true);
        g1.nonReturnedMethod('A', 'B');
    }
}

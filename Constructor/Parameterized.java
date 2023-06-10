import java.lang.*;

class parent{
    int a;
    double b;
    boolean c;
    parent(int integer, double decimal, boolean binary){
        this.a = integer;
        this.b = decimal;
        this.c = binary;
    }
}


class Parameterized extends parent{
    int num1;
    double dec1;
    boolean bin1;

    Parameterized(int a, int b, boolean c){
        super(a,45.45,c);
        this.num1 = a;
        this.dec1 = b;
        this.bin1 = c;
    }

    void display(){
        System.out.println("The value of variables are:- " + num1 + dec1 + bin1);
        System.out.println("The value of parent class variables are:- " + super.a + super.b + super.c);
    }

    public static void main(String[] args){
        Parameterized prm = new Parameterized(12,23,false);
        prm.display();
    }
}


class superClass {
    int var1;
    double var2;
    String myName;

    superClass() {
        this.var1 = 23;
        this.var2 = 34.34;
        this.myName = "Rohit Kumar";
    }
}

class base extends superClass {
    int var1;
    double var2;
    String myName;

    base() {
        this.var1 = 43;
        this.var2 = 43.43;
        this.myName = "Prince Kumar Singh";
    }

    void display() {
        System.out.println(
                "This value of variables in parent class is:- " + super.var1 + " " + super.var2 + " " + super.myName);
        System.out.println(
                "The value of variables in base class is:- " + this.var1 + " " + this.var2 + " " + this.myName);
    }

    public static void main(String[] args) {
        base b1 = new base();
        b1.display();
    }
}
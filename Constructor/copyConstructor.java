class Student implements Cloneable{
    String name;
    int id;

    Student(String name, int id){
        this.name = name;
        this.id = id;
    }

    Student(Student ss){
        this.name = ss.name;
        this.id = ss.id;
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        return (Student)super.clone();
    }

}

class copyConstructor{

    public static void main(String[] arsg) throws CloneNotSupportedException{
        // System.out.println("Hello World!");
        Student s1 = new Student("Rohit",10820);

        // Shallow copy of object.
        // Only fields value get copied and no extra (indepedent) memory assigned to it.
        // Only s2 is pointing out the reference object pointed by s1
        Student s2 = s1;

        // Changes will reflect in both s1 & s2
        s1.name = "prince";

        System.out.println(s2.name);   // Same value 'Prince'
        System.out.println(s1.name);    // Same value 'Prince'

        // Deep copy using copy-constructor...
        Student s3 = new Student("Rahul",1121);
        Student s4 = new Student(s3);

        // Only changes reflect in object s3.
        s3.name = "Vishal";

        System.out.println(s3.name);
        System.out.println(s4.name);

        // Deep copy
        // Using cloneable interface...
        Student s5 = new Student("Md",11217);
        Student s6 = (Student)s5.clone();

        s5.name = "Manas";

        System.out.println(s5.name);
        System.out.println(s6.name);
    }
}
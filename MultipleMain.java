class MultipleMain {
    public static void main(String[] args) {
        System.out.println("Hellow");

        main("Rohit", 10820);
    }

    public static void main(String name, int uid) {
        System.out.println(name + " " + uid);
    }
}
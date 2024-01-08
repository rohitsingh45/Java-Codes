import java.util.Scanner;

public class dy_excep {
    String vote(int a) {
        if (a < 18) {
            return "Sorry! You are not eligible for vote";
        } else
            return "Your Welcome ";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age in number");
        int age = sc.nextInt();
        dy_excep dy = new dy_excep();
        String output = dy.vote(age);
        System.out.println(output);
    }
}

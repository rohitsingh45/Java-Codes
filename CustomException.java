import java.util.Scanner;

class InvalidAgeCustomException extends Throwable {
    InvalidAgeCustomException(String msg) {
        super(msg);
    }
}

public class CustomException  {
    public static void main(String[] args) throws InvalidAgeCustomException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age ->");
        int age = sc.nextInt();

        if(age<18) throw new InvalidAgeCustomException("You're not eligible yet");
        else System.out.println("Welcome to the politics!");
    }
}

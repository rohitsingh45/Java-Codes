import java.util.*;

class MyException extends Exception{
    MyException(String msg){
        super(msg);
    }
}

class userDefinedException{
    public static void main(String[] ram){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your height in cm");
        int height;
        height = sc.nextInt();
        if(height<150){
            try{
            throw (new MyException("You are not young"));
            }
            catch(MyException me){
                System.out.println("User exceptions handled\n" + me);
            }
        }
        else{
            System.out.println("you are young");
        }

    }
}
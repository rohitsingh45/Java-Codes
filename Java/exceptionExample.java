import java.lang.Object;

class exceptionExample{

    public static void main(String[] args){
        try{
            System.out.println(10/0);
        }
        catch(Exception ee){
            System.out.println("I'm inside the cathch");
        }
        catch(ArithmeticException ar){
            System.out.println("I'm in arithmetic exception");
        }
        finally{
            System.out.println("I'm inside the finally");
        }
        System.out.println("I'm normal code");
    }
}
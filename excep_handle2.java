import java.lang.*;
import java.util.Scanner;
public class excep_handle2{
void vote(int a){
if(a<18){
throw new ArithmeticException("Not Valid");}
else
System.out.println("Welcome in the Vote");
}
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the age in number");
int age=sc.nextInt();
excep_handle2  dy = new excep_handle2();
try{
dy.vote(age);
}
catch( Exception ee){
System.out.println("This is not executed");}}
}

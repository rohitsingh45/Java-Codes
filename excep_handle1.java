import java.lang.*;
import java.util.Scanner;
public class excep_handle1{
void vote(int a){
if(a<18){
	try{
	throw new ArithmeticException("Not Valid");}
	catch(ArithmeticException ee){
		System.out.println("Hello this is me");
	}}
else
System.out.println("Welcome in the Vote");
}
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the age in number");
int age=sc.nextInt();
excep_handle1  dy = new excep_handle1();
// try{
dy.vote(age);
// }
// catch( excep_handle1tion ee){
System.out.println("This is not executed"); //}
}
}

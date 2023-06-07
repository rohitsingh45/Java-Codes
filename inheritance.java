import java.lang.*;
import java.util.Scanner;
class Main{
	Main(){
		System.out.println("Hello This is Rohit");
	}
  void output(){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Digit which table want to print");
	int var=sc.nextInt();
			System.out.println("The table of "+var +" is=");
	for(int i=1; i<=10; i++){
		System.out.println(i*var);
	}
}
}
class inheritance extends Main{
	 void output(){
		System.out.println("Enter the number which factorial wants to find");
		Scanner sc=new Scanner(System.in);
		int var=sc.nextInt();
		int fact=1;
		for(int i=var; i>0; i--){
			fact=fact*i;
		}
	System.out.println("The factorial of "+var + " is equal to " + fact);
	this.output();
	}
	public static void main(String[] args){
		Main ii=new Main();
		ii.output();
	}
}



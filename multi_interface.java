import java.lang.*;
import java.util.Scanner;
interface i1{
	void method1();
}
interface i2{
	void method2();
}
interface i3{
	void method3();
}

class multi_interface implements i1, i2, i3 {
	int flag;
	Scanner sc = new Scanner(System.in);
	public void method1(){
		System.out.println("Enter the range of number for find odd");
		System.out.println("Enter first number");
		int first=sc.nextInt();
		System.out.println("Enter the last number");
		int last= sc.nextInt();
		System.out.println("The Odd numbers are");
		for(int i=first; i<last; i++){
			if(i%2==0){
				continue;
			}
			else{
				System.out.println(i);
			}
		}
	}
	public void method2(){
		System.out.println("Enter the range of number for find even");
		System.out.println("Enter first number");
		int first=sc.nextInt();
		System.out.println("Enter the last number");
		int last= sc.nextInt();
		System.out.println("The Even numbers are");
		for(int i=first; i<=last; i++){
			if(i%2==0){
				System.out.println(i);
			}
		}
	}
	public void method3(){
			System.out.println("Enter the range of number for find prime");
		System.out.println("Enter first number");
		int first=sc.nextInt();
		System.out.println("Enter the last number");
		int last= sc.nextInt();
		System.out.println("The Prime numbers are");
	for(int n=first; n<=last; n++){
		for(int i=2; i<=n/2; i++){
			if(n%i==0){
				 flag=1;
				 System.out.println("The number "+first+" is not prime");
				 break;
		}
		}
			if(n==1){
	System.out.println("The number "+n +" is neither prime nor non-prime"); 
			}
			else if(flag==0){
 	System.out.println("The number "+n +" is  prime number"); 
			}
		}
	}
	public static void main(String[] args){
		multi_interface m1=new multi_interface();
		m1.method1();
		m1.method2();
		m1.method3();
	}
}
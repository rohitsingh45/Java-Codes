package first;
import java.util.Scanner;
public class all {
	Scanner Sc=new Scanner (System.in);
	void triangle()
	{
		int l,b,i,j,n,m;
		
		System.out.println("enter length of trangle");
		 l= Sc.nextInt();
		
		 b=2*l-1;
		for(i=0;i<l-1;i++)
		{
			for(j=0;j<b;j++)
			{
				m=l+i-1;
				n=l-i-1;
				if(j==m ||j==n)
					System.out.print("*");
				else
					System.out.print(" ");
				
			}
			System.out.println();
		}
		i=0;
		while(i<l)
		{
			System.out.print("* ");
			i++;
		}
		
		
	}
	

	void count()
	{
		int i=1,user;
		System.out.println("Enter number");
		user=Sc.nextInt();
		while(i<=user)
		{
			System.out.println(i);
			i++;
			
		}
	}
	
	void fraction()
	{

		float num,dnum;
		System.out.println("Enter num");
		num=Sc.nextInt();
		System.out.println("Enter Dnum");
		dnum=Sc.nextInt();
		float result=num/dnum;
		System.out.println("Fraction is " + result);
		
	}
	
	void table()
	{

		int num,dnum;
		System.out.println("Enter number");
		num=Sc.nextInt();
		for(dnum=1;dnum<=10;dnum++)
		{
			System.out.println(num+ " * "+ dnum+ " = " + num*dnum );
		}
	
	}

	
	void check()
	{

		int num,dnum;
		System.out.println("Enter number");
		num=Sc.nextInt();
		if(num%2==0)
		System.out.println("Number is even");
		else
			System.out.println("Number is odd");
	}
	
	public static void main(String[] args) {
		Scanner Sc=new Scanner (System.in);
		boolean loop=true;
		
		while(loop)
		{
			System.out.println();
			System.out.println("Press 0 for end program");
			System.out.println("Press 1 for print 1 to infinte");
			System.out.println("Press 2 for print triangle using  * symbol ");
			System.out.println("Press 3 for find out fraction ");
			System.out.println("Press 4 for check number odd or even ");
			System.out.println("Press 5 for print table ");
			int input =Sc.nextInt();
			all fun =new all();
			
		switch(input)
		{
		
		case 1:
			fun.count();
			break;
			
		case 2:
			fun.triangle();
				break;
				
		case 3:
			fun.fraction();
					break;
					
		case 4:
			fun.check();
						break;
						
		case 5:
			fun.table();
							break;
							
		case 0:
				loop=false;
				break;
				
				default:
					System.out.println("Invalid choice");
			
		}
		
		
		
	
		}
	}
		
	}
		
		
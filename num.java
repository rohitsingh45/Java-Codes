import java.util.Scanner;
class num 	{
int number;
Scanner s1=new Scanner(System.in);
void even()		{
System.out.println("Enter the number");
number=s1.nextInt();
if(number%2==0)
	System.out.println("The number "+ number +" is even.");
else
	System.out.println("The number"+number+"is odd");
			}
public static void main(String vishu[])
{ num n1=new num();
	n1.even();
}
		}
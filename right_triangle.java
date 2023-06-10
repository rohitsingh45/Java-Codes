import java.util.Scanner;
class right_triangle{
Scanner s1=new Scanner(System.in);
int i,j,k,rows;
void right()
{System.out.printf("Enter the value of rows"); 
rows=s1.nextInt(); 
System.out.println("Now your right-right_triangle is:");
for(i=1;i<=rows;i++)
	{ for(j=0;j<i;j++)
		{System.out.print("*");
	        }

System.out.print("\n");}
}
public static void main(String pyramid[])
	{
right_triangle t1=new right_triangle();
t1.right();
	}
	     }
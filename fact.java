import java.util.Scanner;
class fact
	{Scanner f1=new Scanner(System.in);
int num,facto=1,i;
void factorial()
{System.out.println("Enter the value of num which find the factorial"); 
i=f1.nextInt();
for(num=i;num>0;num--)
 { facto=facto*num;
	}
System.out.println("The factorial of"+i+"is:"+facto);
}
	public static void main(String rahul[])
	{ fact f2=new fact();
		f2.factorial();
	}
		}
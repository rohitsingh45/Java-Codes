import java.util.Scanner;
class tri_angle
		{ int i,j,k,rows;
Scanner r1=new Scanner(System.in);
void triangle()
{ System.out.println("Enter the value of rows");
rows=r1.nextInt();
System.out.println("Now our triangle:");
for(i=1;i<rows;i++)
{ for(j=0;j<rows-i;j++)
	{ System.out.print(" ");
		} 
           
for(k=0;k<2*i-1;k++)
{  System.out.print("*");
} 
System.out.print("\n");
	}
}
public static void main(String simple[])
{ tri_angle t1=new tri_angle();
 t1.triangle();
}
		}

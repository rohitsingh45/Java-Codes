class cmdLine{ static int c,r,z;
public static void main(String tea[])
{	cmdLine l1=new cmdLine();
System.out.println("The first number is");
 z=Integer.parseInt(tea[0]);
r=Integer.parseInt(tea[1]);
System.out.println(z+"\nThe second number is\n"+ r);
l1.shuman();
l1.shubham();
}		
void shuman()	{
c=z;
z=r;
r=c;
}
void shubham()		{
System.out.println("The number will be swapped out and they are" + z +" " +r);
				}
}

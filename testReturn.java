class testReturn	{
int[] f1()	{
System.out.println("The returned array will be");
return new int[]{23,43,22,53,32};
		}
public static void main(String[] rohit)
{ testReturn r1=new testReturn();
int a[]=r1.f1();
for(int i : a)
{	System.out.println(i);
}	
}
}

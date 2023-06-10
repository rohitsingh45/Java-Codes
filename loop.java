class loop {
static int a,b;
void assigh()
{
 a=3;
 b=32;

loop.looping();}
static void looping()
{ while(a<=b)
	{	
System.out.println(a);
        a++; }
}
public static void main(String ram[])
{ loop l1=new loop();
l1.assigh();
}
}
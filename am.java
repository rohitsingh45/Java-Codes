class am{
int a,b,c;
int initialize()
{
a=23; b=22;
c=a+b;
return c;}
public static void main (String args[])
{
am r1 =new am();
int d;
d=r1.initialize();
System.out.println("The sum of both number is " + d);
}
}

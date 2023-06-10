class ramesh {
static int v,c;
void value()
{
v=32;
c=43;
operation();
}
void operation()
{   if(v>c)
	System.out.println(v + "is greatest number");
    else if(c>v)
	System.out.println(c + "is greatest number");
     else
	System.out.println("numbers" + v + c + "Are same");
} 
public static void main(String[] args)
{ ramesh r1=new ramesh();
r1.value();
}
}
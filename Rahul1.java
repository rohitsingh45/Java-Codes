	class Rahul1 {
 static int a,b;

void assign()
{ a=23;
b=98;
}
void compare()
{ if(a>b)
	{System.out.println(" The greatest number is:"+a);
}
else if(b>a)
{System.out.println("The greatest number is:"+b);
}
else 
{System.out.println("The numbers are same");
}
}
public static void main(String vishal[])
{ Rahul1 r1=new Rahul1();
r1.assign();
r1.compare();
}
};

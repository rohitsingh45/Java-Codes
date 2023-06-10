	class pp { static int a,b,c;
	void f1()		//Instance member method
	{  a=32;
	b=35;
	pp.f2();		//calling of static method
	}
	static void f2()		//static method
	{
	c=a+b;
	System.out.println("The value of c is:"+c);
	}
public static void main(String [] args)
	{ pp p1=new pp();
	p1.f1();
	}
}

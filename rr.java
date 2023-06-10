class rr 	{ int a,b,c;
	void f1()		// Instance method
{ a=32;
b=43;
value();
}
void value()	//Instance method
{ c=a+b;
System.out.println("The value of c is"+c);
}
public static void main(String ram[])		//Static method
	{	rr r1=new rr();	// Object creation
	r1.f1();	// calling of instance method f1
	}
}

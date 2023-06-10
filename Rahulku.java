
 class Rahulku { int a,b,c;
	void value()
	{
		a=25;
		b=56;
	}
	void calculate()
	{
		c=a+b;
	}
	void display()
	{
		System.out.println("The value of addition is"+"-"+c);
	}
	public static void main(String rohit[])
	{
		Rahulku r1=new Rahulku();
		r1.value();
		r1.calculate();
		r1.display();
	}
}
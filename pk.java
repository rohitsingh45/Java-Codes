class pk {
	int a, b, c;

	void setvalue() {
		a = 10;
		b = 20;
	}

	void calculate() {
		c = a + b;
	}

	void display() {
		System.out.println("Value of c is" + c);
	}

	public static void main(String vishu[])
	{
		pk t1=new pk();
		t1.setvalue();
		t1.calculate();
		t1.display();
	}
}
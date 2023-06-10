 class qa {
int a,b,c,tables;
void f1() 	{System.out.println("Program for tables");
	a=17;
	b=10;
}
void table(){ tables=0;
for(c=1; c<b; c++)
{tables=a*c;
System.out.println(a+"*"+b+"="+tables);
}
}
class Main extends qa {
	int x,y,z,fact;
	void f2() { System.out.println("The program for factorial of 5");
		x=5;
	fact=0;
	}
	void fac5() { 
		for(y=x; y!=0; y--) {
			fact=fact*y;
		}
	}
	void display() {
		System.out.println("The factorial of "+x+ "="+fact);
	}
	public  void main (String[] args) {
		Main m1=new Main();
		m1.f2();
		m1.fac5();
		m1.display();
		qa q1=new qa();
		q1.f1();
		q1.table();
	}
}
}
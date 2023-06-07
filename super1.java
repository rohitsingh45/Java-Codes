class ram{
	int a;

}
class super1 extends ram{
	int a,b;
	void thi(int x, int y){
	super.a=x;
				System.out.println(super.a);
	b=y;
				System.out.println(b);
	this.a=y;
			System.out.println(a);
			add();
			}
			void add(){
				int c=this.a+super.a+b;
							System.out.println(c);
			}
	public static void main(String args[]){
		super1 ss=new super1();
		ss.thi(24,65);
		
	}
}
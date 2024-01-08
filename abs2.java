class abs2{
	abs2(){
		System.out.println("Hello Ramu");
	}
	void hello(){
		System.out.println("Hello Jee");
	}
	void hello(int kk){
		boolean jj=true;
		System.out.println("Hello sir"+jj);
	}
	public static void main(String[] args){
		abs2 aa=new abs2();
		aa.hello();
		aa.hello(4);
		System.out.println();
	}
}
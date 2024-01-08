class ccc {

	ccc(int a) {
		System.out.println("Shyam Kumar");
	}

}

class const1 extends ccc {
	const1(int temp, String ss) {
		super(temp);
		System.out.println("hii " + ss);
	}

	public static void main(String[] args) {

		ccc cc2 = new ccc(10);

		const1 c1 = new const1(22, "rohit");

	}
}
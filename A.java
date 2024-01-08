class A {
	int xyz;

	void kali(int xyz) {
		int mn;
		this.xyz = xyz;
		System.out.println(this.xyz);
	}

	public static void main(String[] args) {
		A obj1 = new A();
		obj1.kali(23);
	}
}

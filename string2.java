class abs {
	void m1() {
	};
}

class string2 extends abs {
	void m1() {
		String s1 = "yes";
		String s2 = "yes";
		if (s1 != s2)
			System.out.println(s1 = s2 + "\n");
		System.out.println(13 & 25);
	}

	int a = 54; // (1)
	// static int a; //(2)
	// int f() { return a; } //(3)

	 int f() {
		return a;
	} // (4)

	public static void main(String[] args) {
		string2 s = new string2();
		s.m1();
		System.out.println(s.f());
	}
}

class Main {
	Main()
	// We can't use final modifier before the contructor it may generate compile
	// time // error.
	{
		int data = 234;
		int c = 45 * 3 - 45 / 3;
		System.out.println(c);
	}

}

class final_features3 extends Main {
	public static void main(String[] args) {
		Main mm = new Main();
	}
}
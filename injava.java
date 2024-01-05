import java.util.Scanner;

class injava {
	public static void main(String ram[]) {
		int i;
		int[] arr = new int[4];
		Scanner sc = new Scanner(System.in);
		for (i = 0; i < 4; i++) {
			System.out.println("Enter the array value");
			arr[i] = sc.nextInt();
		}
		System.out.println("Entered array value are");
		for (i = 0; i < 4; i++) {
			System.out.println(arr[i]);
		}
		sc.close();
	}
}

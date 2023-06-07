import java.util.Scanner;
class abbreviation{
	public static void main(String[] args){
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter the Sentence which abbreviation need");
		String str1= " "+Sc.nextLine();
		int st2=(int)str1.length();
		for(int i=0; i<st2; i++){
			if(str1.charAt(i) == ' ') {
			System.out.print(str1.charAt(i+1) +".");
			}
			
			}
			}
		}
	
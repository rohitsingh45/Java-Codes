import java.lang.*;

 class  Main{ 
// This class can't take part in inheritance because it is final type
	final int data=234;
	int c=45*3-45/3;
	void answer(){
		System.out.println(c);
	}
	
}
class  final_features2 extends Main{
	public static void main(String[] args){
		final_features2 ff= new final_features2();
	
		ff.answer();
	}
}
class copy{
public static void main(String[] args){
	System.out.println("Main Array");
	int []Main={23,54,53,23,55};
	for(int i=0; i<Main.length; i++){
		System.out.println(Main[i]);
	}
	int []refer=new int[5];
	System.arraycopy(Main,0,refer,0,5);
	System.out.println("The Copied Array");
	for(int i=0; i<refer.length; i++){
		System.out.println(refer[i]);
	}
}
}
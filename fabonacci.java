package Java;
class fabonacci{
	public static void main(String[] args){
		int var1=0,var2=1,var3;
		System.out.println( var1);
		for(int i=3; i<20; i++){
			var3=var2+var1;
			var2=var1;
			var1=var3;
			System.out.println(var3);
		}
	}
}
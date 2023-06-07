class example{
	public static void main(String[] args){
		String str1=getClassLoader();
		System.out.println(str1);
		int var1=0, var2=1, var3;
		System.out.println("The fabonacci series are " + var1);
		for(int i=3; i<20; i++){
			var3=var1+var2;
			System.out.println(var3);
			var2=var1;
			var1=var3;
		}
	}
}
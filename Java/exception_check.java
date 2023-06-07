class exception_check{
	public static void main(String[] args){
		try{
			
			int a= 23/0;
			
		}catch(Exception ee){
			System.out.println("It throws arithmetic exception due to integer type");
		}
		
		double b=23.0/0.0;
		double e=0.0/0.0;
		double c=0.0/6.0;
		System.out.println("Not generate exception bcz float type\n" + b+"\n"+e+"\n"+c);
	}
}
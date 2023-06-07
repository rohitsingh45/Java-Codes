interface i{
	void shyam();
}
interface j{
	void sita();
}
interface k extends i,j{
	void rava();
}
class ram implements k{
	public void shyam(){
		System.out.println("Hell");
	}
	public void sita(){
		System.out.println("Hel");
	}
	public void rava(){
		System.out.println("He");
	}
	   // ram(int x){
		// int a=2,b=3,c=4,d=5;
	        // int e = a- -  +b + -c ;
	// System.out.println(10+" "+20);
	// }

}



class calcu{
	
public static void main(String[] args){
	
	ram r1=new ram();
	r1.shyam();
	r1.sita();
	r1.rava();

}
}

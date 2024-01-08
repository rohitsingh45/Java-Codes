
class Main extends Thread{
	@Override
	public void run(){
		for(int i=10; i<15; i++){
			System.out.println(getName()+"  "+i);
			
		}
		setName("Rohit");
		int a=getPriority();
  System.out.println(a +" --> It is previous thread_priority value Now priority of"+getName()+" Will be");
setPriority(8);
System.out.println(getPriority());
		for(int i=10; i<15; i++){
			System.out.println(getName()+"  "+i);
		}
}
}

class Main1 extends Thread{
	@Override
	public void run(){
		System.out.println("Hello World");
	}
}

class thread {
	public static void main(String[] args){
	Main mm=new Main();
	Main1 mm1=new Main1();
	mm.start();
	// mm.suspend();
	mm1.start();
	// mm.resume();
	
	
	}
}
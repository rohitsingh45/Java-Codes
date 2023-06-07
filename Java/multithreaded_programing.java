    class newthread extends Thread
    {
	Thread t1,t2;
	newthread()
        {
	    t1 = new Thread(this,"Thread_1");
	    t2 = new Thread(this,"Thread_2");
				t2.setPriority(Thread.MAX_PRIORITY);
	    t1.start();
	    t2.start();
	}
	public void run()
        { 
			System.out.print(t1);
        }    
    }
    class multithreaded_programing
    {
        public static void main(String args[])
        {
            new newthread();        
        }
    }
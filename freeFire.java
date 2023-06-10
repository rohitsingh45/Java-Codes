class freeFire{
	int[][] sere=new int[5][];
	void decl()
	{
		sere[0] = new int[1];
		sere[1] =new int[2];
		sere[2] = new int[3];
		sere[3] = new int[4];
		sere[4]= new int[5];
		//initial();
	}
	void initial()
	{
		int count=0;
		for(int i=0; i<sere.length; i++)
		{	for(int j=0; j<sere[i].length; j++)
			{ sere[i][j]=count++;
			}
		} //output();
	}
	void output()
	{
		for(int i=0; i<sere.length; i++)
		{	for(int j=0; j<sere[i].length; j++)
			{ System.out.print(sere[i][j]);
			} System.out.println();
		}
	}
	
	public static void main(String[] ars)
	{
		freeFire f1=new freeFire();
		f1.decl();
		f1.initial();
		f1.output();
	}
}
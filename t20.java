class t20{
int[][] twoD={{45,74,87},{78,47,10}};
void access_Granted()
{ for(int i=0; i<2; i++)
	{ 	for(int j=0; j<3; j++)
		{
		System.out.print(twoD[i][j]+" ");
		}System.out.print("\n");
	} 
}
public static void main(String args[])
{ t20 MI =new t20();
MI.access_Granted();
}
};

class Doubl {
	public static void main(String[] args){
		int main2D[][]={{45,56,54},{23,43,22},{11,52,66}};
		for(int i=0; i<main2D.length; i++){
			for (int j=0; j<main2D[0].length; j++){
				System.out.print(main2D[i][j] +" ");
			}System.out.println();
		}
		int duplicateArray[][]= new int[2][2];
		System.out.println("The copied array will be");
		System.arraycopy(main2D,0,duplicateArray,0,2);
		for(int i=0; i<duplicateArray.length; i++){
			for(int j=0; j<duplicateArray[1].length; j++){
				System.out.print(duplicateArray[i][j]+" ");
			}System.out.println();
		}
	}
}
class arr {
	int ram[] = {};

	void bhi() {
		System.out.println(ram.getClass().getName());
	}

	public static void main(String[] rag) {
		// int ram[]={234,543,23};

		arr ar = new arr();
		ar.bhi();
		//Checked this error at Online  
		//arr.java:5: error: bad operand types for binary operator '+'

	}
}
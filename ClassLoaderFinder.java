class ClassLoaderFinder {

	/* The Java Class Loader is a part of the Java Runtime Environment that dynamically loads Java classes into the Java Virtual Machine. Usually classes are only loaded on demand. The virtual machine will only load the class files required for executing the program. */
	public static void main(String[] args) throws ClassNotFoundException {
		Class myClass = Class.forName("ClassLoaderFinder");
		String str1 = myClass.toString();
		System.out.println(str1);
		
		System.out.println(myClass.getClassLoader());
		// getClassLoader() used to get the classLoader of this entity.
		// This entity might be a class, interface, array etc.
	}
}
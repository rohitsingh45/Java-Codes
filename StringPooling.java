public class StringPooling {
    public static void main(String[] args) {
        // String creating using literals...
        String s1 = "Rohit";    // Creating a string in string pool.
        String s2 = "Rohit"; // Pointing to the reference of above string pool.
        
        System.out.println(s1 == s2);
        // Generally '==' operators used to compare the references of strings.
        // But Strings created using the string literals are getting values comparision when using ==
        
        // Comparing the content of strings...
        System.out.println(s1.equals(s2));

        // String creation using new
        String s3 = new String("Vishal");
        String s4 = new String("Vishal");
        
        // Strings content comparision...
        System.out.println(s3.equals(s4));
        // String reference comparision...
        System.out.println(s3 == s4);
    }
}

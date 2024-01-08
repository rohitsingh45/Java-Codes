import java.util.ArrayList;

/**
 * ObjectTypeArrayList
 */
public class ObjectTypeArrayList {

    public static void main(String[] args) {
        // Same as ArrayList arr = new ArrayList();
        // Means when we don't specify the type of genric then that automatically get assigned
        // of type Object because as we know Object is parent class of all the java class.
        ArrayList<Object> arr = new ArrayList<>();
        arr.add(10);
        arr.add(10.20);
        arr.add("Hola");
        arr.add(false);
    }
}
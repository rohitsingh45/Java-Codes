interface Function{
    int evaluate(int parameter1);
}

class interfaceQ1 implements Function{
    public int evaluate(int parameter1){
        return parameter1/2;
    }

    int[] arrayManipulation(int arr1[]){
        int size = arr1.length;
        int arr2[] = new int[size];
        for(int i=0; i<arr1.length; i++){
            arr2[i] = arr1[i]/2;
        }
        return arr2;
    }

    public static void main(String[] args){
        interfaceQ1 i1 = new interfaceQ1();
        System.out.println("The value return by evaluate is:- " + i1.evaluate(45));
        
        int arr[] = {12, 13, 14, 15, 16};

        int array[] = new int[5];
        array = i1.arrayManipulation(arr);
        for(int i=0; i<5; i++){
            System.out.print(array[i] + " ");
        }

        
    }
}
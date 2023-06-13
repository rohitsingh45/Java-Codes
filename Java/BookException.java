class BookException{
    public static void main(String[] args){

        try{
            double x=0.0;
            throw new Exception("Thrown");
        }
        catch(Exception ee){
            System.out.println("Exception caught");
            return;
        }
        finally{
            System.out.println("Finally");
        }
    }
}
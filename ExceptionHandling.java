

class ExceptionHandling {
    public static void main(String[] args) {
        int a=10;
        int b=49;
        try {
            System.out.println(b/a);
            int []c = {2,3};
            int i = c[1];
            String s ="4bc";
            System.out.println("\n");
        }catch(java.lang.ArithmeticException e) {
            System.out.println("Arithmetic exception occur " + e);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array exception "+e);
        }catch (Exception e){
            System.out.println("Some thing occur "+e);
        }
    }
}


class ExceptionHandlingFinallyKeyword {
    public static void main(String[] args) {
        try{
            int x = 49/0;
            System.out.println(x);
        }catch (ArithmeticException e){
            System.out.println(e);
        }finally {
            // Exception is catch or not finally block will always run
            System.out.println("Execution Done...");
        }
        System.out.println("Out of Try Catch and Finally Block");
    }
}
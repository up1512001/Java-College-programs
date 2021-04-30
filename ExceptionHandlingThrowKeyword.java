

class ExceptionHandlingThrowKeyword {
    public static void main(String[] args) {
        v1(20);
        v1(18);
        v1(17);
    }
    static void v1(int age){
        if(age < 18){
            throw new ArithmeticException("Age is Not Valid...");
        }else{
            System.out.println("Age is Valid...");
        }
    }
}
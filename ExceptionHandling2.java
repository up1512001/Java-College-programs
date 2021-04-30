


class ExceptionHandling2 {
    public static void main(String[] args) {
        try{
            try{
                System.out.println("First Try Block In Side Main Try");
                int x = 49/0;
            }catch (ArithmeticException e){
                System.out.println("Arithmetic Exception :"+e);
            }

            try{
                System.out.println("Second Try Block In Side Main Try");
                int []a = new int[5];
                a[5]=4;
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println(e);
            }
            System.out.println("In Side Main Try Block");
        }catch (Exception e){
            System.out.println(e);
        }
        System.out.println("Out Of Try And Catch Block");
    }
}
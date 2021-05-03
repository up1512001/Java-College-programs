import java.io.IOException;

class ExceptionHandlingThrowsKeyword2 {
    public static void main(String[] args) {
        ExceptionHandlingThrowsKeyword2 a = new ExceptionHandlingThrowsKeyword2();
        a.m3();
    }
    void m1()throws IOException{
        System.out.println("Done");
        throw new IOException("Input Output Exception...");

    }
    void m2()throws IOException{
        m1();
    }
    void m3(){
        try{
            m2();
        }catch (Exception e){
            System.out.println("Got ::->"+e);
        }
    }
}
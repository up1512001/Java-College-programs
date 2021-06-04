import java.io.*;

class bufferReaderString {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String  s;
        System.out.println("Enter String:");

        do{
            s = br.readLine();
            System.out.println("Char ->"+s);
        }while(!s.equals("u"));
    }
}
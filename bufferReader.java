import java.io.*;

class bufferReader {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String c;
        System.out.println("Enter string:");

        do{
            c = br.readLine();
            System.out.println("Char ->"+c);
        }while(!c.equals("u"));
    }
}
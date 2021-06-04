import java.io.*;

class bufferReader {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char c;
        System.out.println("Enter characters:");

        do{
            c = (char)br.read();
            System.out.println("Char ->"+c);
        }while(c != 'u');
    }
}
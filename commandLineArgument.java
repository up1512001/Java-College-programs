import java.util.Scanner;


class commandLineArgument {
    public static void main(String[] args) {
        //Scanner s = new Scanner(System.in);

        for (String arg : args) {
            System.out.println("command line argument value is :" + arg);
        }

    }
}

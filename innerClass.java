import java.util.Scanner;

class innerClass {
    private int data;
   /* class inner{
        void message(){
            System.out.println("Value of data:"+data);
        }
    }
*/
    void display(){
        //int val = 49;
        class loc{
            void mes(){
                System.out.println("Value:"+data);
            }
        }
        loc l = new loc();
        l.mes();
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
       // innerClass i = new innerClass();
       // i.data = s.nextInt();
      //  innerClass.inner in = i.new inner();
       // in.message();

        innerClass i = new innerClass();
        i.data = s.nextInt();
        i.display();

    }
}
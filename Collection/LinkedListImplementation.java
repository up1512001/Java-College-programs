package Collection;
import java.util.LinkedList;
public class LinkedListImplementation {
    public static void main(String[] args){
        LinkedList<String> list = new LinkedList<>();
        list.add("Utsav");
        list.add("Patel");
        list.add("Xyz");
        System.out.println("LinkedList -> "+list);
        for (String s : list){
            System.out.println(s);
        }
    }
}

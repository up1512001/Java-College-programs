package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Array {
    public static void main(String[] args){
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(10);
        arr.add(20);
        System.out.println("arr = " + arr);
//        for (Integer integer : arr) {
//            System.out.println(integer);
//        }
        List<String> list = new ArrayList<>();
        list.add("Utsav");
        list.add("Patel");
        list.add("Utsav");
        System.out.println("List ->"+list);
        Iterator<String> it= list.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}

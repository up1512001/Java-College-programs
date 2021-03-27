import java.util.Scanner;
class stu{
    int id;
    String name;

    stu(){
        id=0;
        name=null;
    }
    stu(int id,String name){
        this.id=id;
        this.name=name;
    }
    stu(int id){
        this.id=id;
        this.name="Default";
    }
    stu(String name){
        this.name = name;
        this.id=0;
    }
}
class studentOverloading {
    public static void main(String[] args) {
        stu s = new stu();
        Scanner sc = new Scanner(System.in);
        System.out.println("name:"+s.name+" id:"+s.id);
        stu s1 = new stu(sc.nextInt(),sc.nextLine());
        System.out.println("name:"+s1.name+" id:"+s1.id);
        stu s2 = new stu(sc.nextInt());
        System.out.println("name:"+s2.name+" id:"+s2.id);
        stu s3 = new stu(sc.next());
        System.out.println("name:"+s3.name+" id:"+s3.id);
    }
}
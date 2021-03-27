class student{
    int id;
    String name;
    static String college="LDRP-ITR";

    student(int id,String name){
        this.id=id;
        this.name=name;
    }
    void dis(){
        System.out.println("id :"+id+" name:"+name+" college name:"+college);
    }
    static void change(){
        college = "LDRP";
    }
}

class staticUse {
    static int a=200;
    int n=300;
    static void ma(){
        System.out.println("before value of a:"+a);
        int a=400;
        System.out.println("after a value"+a);
        System.out.println("Inside method 1 ...");
    }
    void m2(){
        System.out.println("before value of n:"+n);
        n=200;
        System.out.println("after value of n:"+n);
        System.out.println("Method 2...");
    }
    public static void main(String[] args) {
        student s = new student(49,"Utsav");
        s.dis();
        student.change();
        s.dis();

        ma();
        staticUse s1 = new staticUse();
        s1.m2();
    }
}
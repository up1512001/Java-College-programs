/*
class animal{
    animal(){
        System.out.println("Animal class constructor called");
    }
}
class dog extends animal{
    dog(){
        //super();
        System.out.println("Dog class constructor called");
    }
}
class methodOverriding {
    public static void main(String[] args) {
        new dog();

    }
}*/

class a{
    int i,j;
    a(int i,int j){
        this.i=i;
        this.j=j;
    }
    void show(){
        System.out.println("Value of i:"+i+" value of j:"+j);
    }
}
class b extends a{
    int k;
    b(int a,int b,int c){
        super(a,b);
        this.k=c;
    }
    void show(){
        super.show();
        System.out.println("Value of K:"+k);
    }
}
class methodOverriding {
    public static void main(String[] args) {
        b b1 = new b(10,20,30);
        b1.show();
    }

}




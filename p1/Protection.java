package p1;

public class Protection {
    int a = 200;
    private int b = 300;
    protected int c = 400;
    public int d = 500;

    public Protection(){
        System.out.println("this is Protection class constructor...");
        System.out.println("Default value:"+a);
        System.out.println("Private Value:"+b);
        System.out.println("Protected Value:"+c);
        System.out.println("Public Value:"+d);
    }

}

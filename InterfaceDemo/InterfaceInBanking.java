package InterfaceDemo;

interface Bank{
    float rateofinterest();
}
class PNB implements Bank{
    @Override
    public float rateofinterest() {
        return 8.23f;
    }
}
class SBI implements Bank{
    @Override
    public float rateofinterest() {
        return 6.78f;
    }
}
public class InterfaceInBanking {
    public static void main(String[] args) {
        PNB p = new PNB();
        System.out.println("Rate of interest of PNB is " + p.rateofinterest());
        SBI s = new SBI();
        System.out.println("Rate of interest of SBI is " + s.rateofinterest());
    }
}

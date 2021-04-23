package InterfaceDemo;

public interface Demo {
    void area();
    default void def(){
        System.out.println("Hello from interface");
    }
}

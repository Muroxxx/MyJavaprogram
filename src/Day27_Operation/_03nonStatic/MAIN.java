package Day27_Operation._03nonStatic;

public class MAIN {
    public static void main(String[] args) {
        
        
        A a=new A();
        System.out.println("a.message = " + a.message);
        
        B b=new B();
        System.out.println("b.message = " + b.message);
        
        A a2=new A();
        System.out.println("a2.message = " + a2.message);
        
        
        
    }
}

package Day27_Operation._04;
class  C{  //base
    public C() {
        System.out.println("c");
    }
}
class B extends C{  //base of A
    public B() {
        System.out.println("b");
    }
}
class A extends B{
    public A() {
        System.out.println("a");
    }
}




public class eXmpl {
    public static void main(String[] args) {

        A a=new A();




    }
}

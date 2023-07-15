package lambda_exp;


public class Example1 {
    public static void main(String[] args) {
        FuncInterface fobj = (int x) -> System.out.println(2*x);
        fobj.abstractFun(2);
        fobj.normFun();
    }
}

interface FuncInterface {
    void abstractFun(int x);
    default void normFun(){
        System.out.println("hello");
    }
}

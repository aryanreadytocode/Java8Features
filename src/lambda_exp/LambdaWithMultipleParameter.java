package lambda_exp;

public class LambdaWithMultipleParameter {

    public static void main(String[] args) {
        Function1 add = (x, y) ->  x+y;
        Function1 multiply = (x, y) -> x*y;

        System.out.println(add.operate(5,9));
        System.out.println(multiply.operate(5,6));

        Function2 message = (msg) -> msg+" JI";
        System.out.println(message.message("Aryan"));
    }
}

interface Function1{
    int operate(int x, int y);
}

interface Function2{
    String message(String msg);
}

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        call(13);

        // 斐波那契数列计算
        int result = fib(10);
        System.out.println("Fibonacci number: " + result);
    }


    public static void call(int n){
        System.out.println("Current Value: " + n);

        // 递归需要有一个结束位置
        if (n == 1){
            return;
        }else {
            // 递归调用
            call(n - 1);
        }
    }

    public static int fib(int n){
        // 方式一:
//        if (n == 1){
//            return 1;
//        }else if(n == 2){
//            return 1;
//        }else {
//            return fib(n - 1) + fib(n - 2);
//        }

        // 方式二:
        if (n == 1 || n == 2){
            return n;
        }else{
            return fib(n - 1) + fib(n - 2);
        }
    }

}
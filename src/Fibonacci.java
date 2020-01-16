public class Fibonacci {

    public static void main(String[] args) {
        int result = fibonacci(5);
        System.out.println(result);
    }

    static int fibonacci(int number) {
        if(number < 3) {
            return 1;
        }
        return fibonacci(number - 2) + fibonacci(number - 1);
    }

}

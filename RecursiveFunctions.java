public class RecursiveFunctions {

    
    static int factorial(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    
    static int fibonacci(int n) {
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        int num = 5; 

        
        int factorialResult = factorial(num);
        System.out.println("Factorial of " + num + " is: " + factorialResult);

        
        int fibonacciResult = fibonacci(num);
        System.out.println("The " + num + "th Fibonacci term is: " + fibonacciResult);
    }
}

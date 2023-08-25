public class MethodOverloadingExample {

    
    public int add(int a, int b) {
        return a + b;
    }

  
    public int add(int a, int b, int c) {
        return a + b + c;
    }

   
    public double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        MethodOverloadingExample calculator = new MethodOverloadingExample();

        int result1 = calculator.add(2, 3);
        System.out.println("Result of add(int, int): " + result1);

        int result2 = calculator.add(2, 3, 4);
        System.out.println("Result of add(int, int, int): " + result2);

        double result3 = calculator.add(2.5, 3.5);
        System.out.println("Result of add(double, double): " + result3);
    }
}

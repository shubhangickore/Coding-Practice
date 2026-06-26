//Method Overloading

public class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }

    public static void main(String args[]) {
        Calculator c = new Calculator();

        System.out.println(c.add(10, 20)); // 30
        System.out.println(c.add(10, 20, 30)); // 60
        System.out.println(c.add(10.5, 20.5)); // 31.0
    }
}
/*
 * How it works?
 * 
 * When you call:
 * 
 * c.add(10, 20);
 * 
 * Java checks the parameters and chooses:
 * 
 * int add(int a, int b)
 * 
 * This decision is made during compilation.
 */
//this is the method overloading probllem 
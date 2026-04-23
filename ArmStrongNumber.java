import java.util.Scanner;
//An Armstrong number (also called a narcissistic number) is a number that is 
//equal to the sum of its own digits each raised to the power of the number of digits. For example : 153 = 1^3+5^3+3^3

public class ArmStrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int originalNum = num;
        int result = 0;
        int n = String.valueOf(num).length(); // number of digits

        while (num > 0) {
            int digit = num % 10; // extract last digit
            result += Math.pow(digit, n); // add digit^n
            num /= 10; // remove last digit
        }

        if (result == originalNum)
            System.out.println(originalNum + " is an Armstrong number.");
        else
            System.out.println(originalNum + " is NOT an Armstrong number.");
    }
}

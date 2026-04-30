public class AddDigit {
    public int addDigits(int num) {
        while (num >= 10) { // keep going until single digit
            int sum = 0;
            while (num > 0) {
                sum += num % 10; // add last digit
                num /= 10; // remove last digit
            }
            num = sum; // update num with sum of digits
        }
        return num;
    }

    public static void main(String[] args) {
        AddDigit sol = new AddDigit();
        System.out.println(sol.addDigits(38)); // Output: 2
    }
}

/*
 * Example with num = 347
 * Iteration 1: 347 % 10 = 7 → sum = 7; then 347 / 10 = 34.
 * 
 * Iteration 2: 34 % 10 = 4 → sum = 11; then 34 / 10 = 3.
 * 
 * Iteration 3: 3 % 10 = 3 → sum = 14; then 3 / 10 = 0.
 * 
 * Inner loop ends → num = 14.
 * 
 * Outer loop runs again because 14 >= 10.
 * 
 * Next round: 1 + 4 = 5.
 * 
 * Now num = 5, single digit → stop.
 * 
 * Final result = 5.
 */
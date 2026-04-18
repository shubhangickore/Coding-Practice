public class AddDigits {
    public static void main(String args[]) {

        System.out.println(adddigits(37));

    }

    public static int adddigits(int num) {
        if (num == 0) {
            return 0;
        }
        // Digital Root Shortcut
        return 1 + (num - 1) % 9; // % 9 as the “digit sum wheel.” Every time you cross a multiple of 9, the cycle
                                  // restarts at 1.
    }
}

/*
 * (num - 1) → shifts the number so multiples of 9 align correctly.
 * 
 * % 9 → finds remainder when dividing by 9 (values cycle 0–8).
 * 
 * + 1 → shifts result into range 1–9.
 */
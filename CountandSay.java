public class CountandSay {
    public static String countsay(int n) {
        if (n == 1) {
            return "1";
        }

        String say = countsay(n - 1);
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < say.length(); i++) {
            int count = 1;
            char ch = say.charAt(i);

            while (i < say.length() - 1 && say.charAt(i) == say.charAt(i + 1)) {
                count++;
                i++;
            }

            result.append(count).append(ch);
        }
        return result.toString();
    }

    public static void main(String args[]) {
        int n = 4;
        System.out.println(countsay(n));
    }

}
/*
 * 🔹 Example: n = 4
 * Start: n=1 → "1"
 * 
 * n=2 → "11" (one 1)
 * 
 * n=3 → "21" (two 1s)
 * 
 * n=4 → "1211" (one 2, one 1)
 */
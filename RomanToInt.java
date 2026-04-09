import java.util.*;

public class RomanToInt {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        System.out.println(romantoInt(s));

    }

    public static int romantoInt(String s) {
        Map<Character, Integer> map = new HashMap<>();

        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            int value = map.get(s.charAt(i));

            if (i + 1 < s.length() && value < map.get(s.charAt(i + 1))) { // i + 1 < s.length() → ensures there is a
                                                                          // next character (to avoid going out of
                                                                          // bounds).
                // value < map.get(s.charAt(i + 1)) → compares current value with the next
                // character’s value.
                sum -= value;
            }

            else {
                sum += value;
            }
        }

        return sum;

    }

}

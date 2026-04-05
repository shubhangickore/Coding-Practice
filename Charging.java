import java.util.*;

public class Charging {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int threshold = sc.nextInt();
        sc.nextLine();

        // Read battery percentages as string
        String input = sc.nextLine();

        // Convert string → array
        String parts[] = input.split(" ");

        int count = 0;

        for (int i = 0; i < parts.length; i++) {
            int value = Integer.parseInt(parts[i]);

            if (value > threshold) {
                count++;
            }
        }

        System.out.println(count);
    }
}
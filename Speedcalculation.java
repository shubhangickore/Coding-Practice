import java.util.*;

public class Speedcalculation {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        Double distance = sc.nextDouble(); // in KM
        int timeMin = sc.nextInt(); // in Minutes

        if (timeMin < 1 || timeMin > 60) {
            System.out.println("Invalid input");
            return; // It stops execution of the program immediately.
        }

        double timehour = timeMin / 60.0; // Ensures decimal calculation
        double speed = distance / timehour;

        System.out.println("speed is" + speed + "km/hr");
    }
}
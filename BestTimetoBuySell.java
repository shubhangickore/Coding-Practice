import java.util.*;

public class BestTimetoBuySell {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int prices[] = new int[n];

        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();
        }

        System.out.println(maxProfit(prices));

    }

    public static int maxProfit(int prices[]) {
        int minprice = Integer.MAX_VALUE;
        int profit = 0;

        for (int price : prices) {
            if (price < minprice) {
                minprice = price;
            }

            else if (price - minprice > profit) {
                profit = price - minprice;
            }
        }
        return profit;
    }
}
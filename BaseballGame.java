import java.util.*;

public class BaseballGame {
    public int calpoints(String[] ops) {
        Stack<Integer> stack = new Stack<>();

        for (String op : ops) {
            if (op.equals("+")) {
                int last = stack.pop();
                int newscore = last + stack.peek();
                stack.push(last);
                stack.push(newscore);
            } else if (op.equals("D")) {
                stack.push(2 * stack.peek());

            }

            else if (op.equals("C")) {
                stack.pop();
            } else {
                stack.push(Integer.parseInt(op));

            }
        }

        int sum = 0;
        for (int score : stack) {
            sum += score;
        }

        return sum;
    }

    public static void main(String args[]) {
        BaseballGame bg = new BaseballGame();
        String ops[] = { "5", "2", "C", "D", "+" };
        System.out.println("Total points :" + bg.calpoints(ops));
    }

}
public int fib(int n) { // The Fibonacci sequence is a classic concept in mathematics where each number
                        // is the sum of the two preceding ones.
    // Step 1: Handle base cases directly
    if (n == 0)
        return 0; // F(0) = 0
    if (n == 1)
        return 1; // F(1) = 1

    // Step 2: Create DP array to store Fibonacci values up to n
    int[] dp = new int[n + 1]; // size n+1 because we include index 0..n

    // Step 3: Initialize base cases
    dp[0] = 0; // F(0) = 0
    dp[1] = 1; // F(1) = 1

    // Step 4: Fill the array using the recurrence relation
    for (int i = 2; i <= n; i++) {
        dp[i] = dp[i - 1] + dp[i - 2]; // F(i) = F(i-1) + F(i-2)
    }

    // Step 5: Return the nth Fibonacci number
    return dp[n];
}

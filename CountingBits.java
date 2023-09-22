/* 
338. Counting Bits
Given an integer n, return an array ans of length n + 1 such that for each i (0 <= i <= n), ans[i] is the number of 1's in the binary representation of i.

Example 1: Input: n = 2 Output: [0,1,1] Explanation: 0 --> 0 1 --> 1 2 --> 10

Example 2: Input: n = 5 Output: [0,1,1,2,1,2] Explanation: 0 --> 0 1 --> 1 2 --> 10 3 --> 11 4 --> 100 5 --> 101

Constraints: 0 <= n <= 105
*/
class CountingBits {
    public int[] countBits(int n) {
        int res [] = new int [n + 1];

        for (int i = 0; i <= n; i++) {
            res[i] = solve(i, res);
        }

    return res;
    }


    public int solve(int n, int memo []) {

        if (n == 0) return 0;
        if (n == 1) return 1;

        if (memo[n] != 0) return memo[n];

        if (n % 2 == 0) {
            memo[n] = solve(n / 2, memo);
            return solve(n / 2, memo);
        }
        else {
            memo[n] = 1 + solve(n/2, memo);
            return 1 + solve(n / 2, memo);
        }
    }
}

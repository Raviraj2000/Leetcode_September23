const MOD = 1000000007
var memo = map[int]int{}

func countOrders(n int) int {
    if n == 1 {
        return 1
    }

    if val, exists := memo[n]; exists {
        return val
    }

    count := (countOrders(n - 1) * (2 * n - 1) * n) % MOD
    memo[n] = count
    return count
}

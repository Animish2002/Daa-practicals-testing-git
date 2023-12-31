public class coin_change_using_dp {
        static long count(int[] coins, int n, int sum)
        {
            int[] table = new int[sum + 1];

            table[0] = 1;

            for (int i = 0; i < n; i++)
                for (int j = coins[i]; j <= sum; j++)
                    table[j] += table[j - coins[i]];

            return table[sum];
        }

        public static void main(String[] args)
        {
            int[] coins = { 1, 5, 7 };
            int n = coins.length;
            int sum = 18;
            System.out.println(count(coins, n, sum));
        }
    }


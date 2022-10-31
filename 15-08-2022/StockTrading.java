
public class StockTrading {
    public static void main(String[] args) {
        int prices[] = { 7, 6, 4, 3, 1 };
        int temp = prices[0];
        int profit = 0;
        int selisih = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] <= temp) {
                temp = prices[i];
            }
            selisih = prices[i] - temp;
            if (profit < selisih) {
                profit = selisih;
            }
        }
        System.out.println(profit);
    }
}

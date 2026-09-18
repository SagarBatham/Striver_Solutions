// Problem Link: https://takeuforward.org/arrays/stock-buy-and-sell/
// Maximize profit by buying and selling a stock once.
// Example: prices = [7, 1, 5, 3, 6, 4] -> 5
public class StockBuyAndSell {
    public static void main(String[] args) {
        int[] nums={7, 1, 5, 3, 6, 4};
        System.out.println(stockBuySell(nums));
    }

    public static int stockBuySell(int[] arr) {
       int min=Integer.MAX_VALUE;
       int profit=0;
       for (int i = 0; i < arr.length; i++) {
            if(min>arr[i]){
                min=arr[i];
            }
            profit=Math.max(profit, arr[i]-min);
       }
       return profit;
    }
}

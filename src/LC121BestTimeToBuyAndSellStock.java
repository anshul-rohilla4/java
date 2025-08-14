public class LC121BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        int[] prices = {7,6,4,3,1};
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {
        int profit=0;
        int buy=0;
        for (int i = 1; i <prices.length; i++) {
            if(prices[i]<prices[buy]){
                buy=i;
            }
            if(profit>(prices[buy]-prices[i])){
            profit=prices[buy]-prices[i];
                    }

        }
        System.out.println(prices[buy]);
        return -profit;
    }
}

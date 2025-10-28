public class LC121BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        int[] prices = {5,8,0,10,5};
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {
//        int profit=0;
//        int buy=0;
//        for (int i = 1; i <prices.length; i++) {
//            if(prices[i]<prices[buy]){
//                buy=i;
//            }
//            if(profit<(prices[i]-prices[buy])){
//            profit=prices[i]-prices[buy];
//            }
//
//        }
//        System.out.println(prices[buy]);
//        return profit;

        int maxP=0;
        int minBuy=prices[0];
        for(int i=0;i<prices.length;i++){
            minBuy=Math.min(minBuy,prices[i]);
            maxP=Math.max(maxP,(prices[i]-minBuy));
        }
        return maxP;
    }
}

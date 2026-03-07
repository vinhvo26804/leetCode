package Array_HashMap_String_Week1.Array;

public class BestTimeToBuyAndSellStock {
    public static int maxProfit(int[] prices) {
        int minPrices = prices[0];
        int maxProfit = 0;
        for (int i =0; i< prices.length;i++){
            if(prices[i]<minPrices)
                minPrices = prices[i];
            int profit = prices[i] -minPrices;
            if(profit >maxProfit)
                maxProfit = profit;

        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices = {7,1,3,5,6,8};
        int res = maxProfit(prices);
        System.out.println(res);
    }

}

package GRIND_75;

public class Q4_BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {

        if (prices == null || prices.length == 0){
            return 0;
        }

        int minPrice = prices[0]; // O(1) - space
        int maxProfit = 0; // O(1) - space

        for (int i = 0; i < prices.length; i++){ // O(n) - time, O(1) - space
            maxProfit = Math.max(maxProfit, prices[i] - minPrice);
            minPrice = Math.min(minPrice, prices[i]);
        }

        return maxProfit;

    }

    public static void main(String[] args){

        int[] arr = {7,1,5,3,6,4};
        int[] arr2 = {7,6,4,3,1};
        int[] arr3 = {2,4,1};

        Q4_BestTimeToBuyAndSellStock obj = new Q4_BestTimeToBuyAndSellStock();

        System.out.println(obj.maxProfit(arr));
        System.out.println(obj.maxProfit(arr2));
        System.out.println(obj.maxProfit(arr3));
    }
}

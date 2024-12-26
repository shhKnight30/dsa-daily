class Solution {
    public int maxProfit(int[] prices) {
       int buy = prices[0];
       int max = 0;
       for(int price:prices){
        if(price>buy)max = Math.max(max, price-buy);
        else {
            buy = price;
        }
       }
       return max;
    }
}

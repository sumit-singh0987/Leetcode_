class Solution {
    public int[] finalPrices(int[] prices) {
        int[] nums = new int[prices.length];
        for(int i = 0; i < prices.length; i++) {

            nums[i] = prices[i];

            for(int j = i + 1; j < prices.length; j++) {

                if(prices[i] >= prices[j]) {
                    nums[i] = prices[i] - prices[j];
                    break;
                }
            }
        }
        return nums;
    }
}
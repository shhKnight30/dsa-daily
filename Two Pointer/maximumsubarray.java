class Solution {
    public int maxSubArray(int[] nums) {
        int sum = 0, maxSum = nums[0];
        for(int num:nums){
            sum+=num;
            maxSum = sum>maxSum ? sum : maxSum;
            // sum = sum>0 ? sum : 0; // if else both conditions so slower
            if(sum<0)sum=0; // only if conndition thats why faster
        }
        return maxSum;
    }
}
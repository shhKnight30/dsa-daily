class Solution {
    // Function to find pair with maximum sum
    public int pairWithMaxSum(int arr[]) {
        // Your code goes here 
        int max = 0;
        for(int i =1;i<arr.length;i++){
            max = Math.max(max, arr[i]+arr[i-1]);
        }
        return max;
    }
}
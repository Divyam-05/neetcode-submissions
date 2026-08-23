class Solution {
    public int rob(int[] nums) {
        //base case
        if(nums.length<2){
            return nums[0];
        }
        //create array to store maxloot
        int[]dp = new int [nums.length];

        //Memoise max loot at first 2 indexis
        dp[0] = nums[0];
        dp[1] = Math.max(nums[1], nums[0]);

        for(int i =2 ; i<nums.length ; i++){
            dp[i] = Math.max(dp[i-2]+nums[i], dp[i-1]);

        }


        return dp[nums.length-1];

        
    }
}

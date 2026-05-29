class Solution {
    public int[] twoSum(int[] nums, int target) {
        int a = nums.length;
        for(int i=0; i<=a ; i++){
          int b =   target - nums[i] ;
          for(int j = 0 ; j<i ; j++){
          if(  b == nums[j]){

          
             return new int[]{j,i} ;
          }
           
          }
        }

       return new int[]{} ;

    }
}

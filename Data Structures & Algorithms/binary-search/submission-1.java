class Solution {
    public int search(int[] nums, int target) {
        int L = 0;
        int R = nums.length-1;
        int a = 0;
        while(L<=R){
a =  (L+R)/2;
        if( nums[a] == target){
        
            return a;
        }    
        else if (  nums[a] < target){
          
            L = a+1;
        }
else{
    R = a-1;
}


        }

        return -1;
    }
}


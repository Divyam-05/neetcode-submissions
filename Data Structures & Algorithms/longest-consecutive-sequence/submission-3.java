class Solution {
    public int longestConsecutive(int[] nums) {
         HashSet<Integer> set = new HashSet<>();
         int res = 1;
        int len = nums.length;

        if(len == 0){
            res = 0;
            return res;
        }

        
        for(int i = 0 ; i<nums.length ; i++){
            set.add(nums[i]);

        }

for(int i = 0 ; i<nums.length ; i++){


        int count = 1;

        for(int j = nums[i]+1 ; j< nums[i] + len  ; j++){

            if(set.contains(j)){
                count = count +1;
            }
            else{
                break;
            }
            if(count> res){

                res = count;
            }
            
            
        }

        
}
return res;
    }
}

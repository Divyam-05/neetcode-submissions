class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        dfs(0,target,nums, path , res);

        return res;
        
    }


    private void dfs (int start ,int remaningTarget, int[] nums ,List<Integer> path,List<List<Integer>> res  ){

        if(remaningTarget == 0){
            res.add(new ArrayList<>(path));

            return;
        }
        if(remaningTarget < 0){
            return;
        }

        for(int i = start ; i<nums.length; i++){
            path.add(nums[i]);

            dfs(i,remaningTarget - nums[i], nums, path , res );

            path.remove(path.size()-1);
            
        }


    }
}

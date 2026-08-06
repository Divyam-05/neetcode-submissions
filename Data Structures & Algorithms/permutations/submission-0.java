class Solution {
    public List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> res = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        boolean[] visited = new boolean[nums.length];
        dfs(nums , visited, path , res);

        return res;
        
    }

    private void dfs(int[]nums ,boolean[] visited, List<Integer> path, List<List<Integer>> res ){
         if(path.size() == nums.length){
            res.add(new ArrayList<>(path));
            return;
        }
for(int i=0 ; i<nums.length ; i++){


   if (visited[i]) {
                continue; // Skip already used numbers
            }
        visited[i] = true;
        path.add(nums[i]);
        dfs(nums , visited, path , res);

        path.remove(path.size()-1);
        visited[i] = false;
}

    }
}

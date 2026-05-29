

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            // if current number is a key in the map, we found the pair
            if (map.containsKey(nums[i])) {
                return new int[]{map.get(nums[i]), i}; 
                // map.get(nums[i]) = index of earlier number
                // i = current index
            }
            
            // otherwise, save (target - nums[i]) as key, index as value
            map.put(target - nums[i], i);
        }
        
        return new int[]{}; // no solution
    }
}
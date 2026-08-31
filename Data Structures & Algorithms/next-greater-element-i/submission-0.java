class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();
        int res [] = new int[nums1.length];

        // Store nums1 value -> its index in nums1
        for(int i = 0 ; i<nums1.length ; i++){
            map.put(nums1[i], i);
            res[i] = -1;

        }

        //process nums2
        for(int i = 0 ; i<nums2.length ; i++){
            while(!stack.isEmpty() && stack.peek()< nums2[i]){
                int element = stack.pop();
                 if (map.containsKey(element)){
                    int index = map.get(element);
                    res[index] = nums2[i];
                 }
            }
            stack.push(nums2[i]);
        }

    
        return res;
    }
}
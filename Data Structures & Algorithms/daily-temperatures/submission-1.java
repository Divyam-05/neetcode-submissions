class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int result[] = new int[n];
    Stack<Integer> stack = new Stack<>();
    for(int currentDay = 0; currentDay<n ; currentDay++){

        while(!stack.isEmpty()&& temperatures[currentDay]>temperatures[stack.peek()]){
            int prevDay = stack.pop();
            result[prevDay] = currentDay - prevDay;

        }

        stack.push(currentDay);

    }
return result;






    }
}

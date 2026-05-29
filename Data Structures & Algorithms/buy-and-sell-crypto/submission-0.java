class Solution {
    public int maxProfit(int[] prices) {
        
        int i = 0;
        int profit =0;

      
        for(int j = 0 ; j<=prices.length-1; j++ ){
            if(prices[j]< prices[i]){
                i = j;
            }

            else if( prices[j]-prices[i]>profit ){
                profit = prices[j] - prices [i];
            }

        }
     return profit;  } 

      
    }

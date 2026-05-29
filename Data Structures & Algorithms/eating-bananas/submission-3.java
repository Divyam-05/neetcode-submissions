class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        
        int L = 1;
        int R =Arrays.stream(piles).max().getAsInt();

       int sum =0 ;
       int res =R;


        while(L<=R){
             int k = (L+R)/2;
            
          for(int i =0 ; i<piles.length ; i++){

            int hours = (int) Math.ceil( (double)piles[i]/k);
            sum = sum+hours;

          }
         
            
           if(sum<=h){
            res = k;

            R = k-1;
           }

           else{
            L =k+1;
           }

sum =0;







            }

            return res; 

        }


    }

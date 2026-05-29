class Solution {
    public int maxArea(int[] heights) {
int area = 0;;
int a = 0;
   for(int i=0; i<heights.length ; i++){

    for(int j=i+1; j<heights.length; j++){

        int H = Math.min(heights[i] , heights[j]);
        int W = j-i;
         a = W*H;

if (a>area){
    area =a;



}



    }



   }     




return area;




    }
}

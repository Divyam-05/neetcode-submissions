class Solution {
    public int maxArea(int[] heights) {
        
    int L = 0;
    int R = heights.length -1;
    int Area = 0;
    
while(L!=R){
int a =0;

a = (R-L)*(Math.min(heights[L], heights[R]));

if(a> Area){

    Area = a;
}

if(heights[L]<heights[R]){

    L++;

}

else if (heights[L]>heights[R]){

    R--;
}

else{
    L++;
}



}
return Area;


    }
}

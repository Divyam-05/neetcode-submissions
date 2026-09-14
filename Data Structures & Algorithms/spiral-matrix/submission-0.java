class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        int bottom = matrix.length;
        int right = matrix[0].length;
        int left = 0;
        int top = 0;
    while(left<right && top<bottom){
        right(bottom, left, right, top, res, matrix );
    
    top++;
    if(top<bottom){
        down(bottom, left, right, top, res, matrix);
        right--;
    
    
    if (left<right){
        left(bottom, left, right, top, res, matrix);
    bottom--;
    
if(top<bottom){
        top(bottom, left, right, top, res, matrix);
    left++;
}
}
    }
    }
return res;
    }

}
    private void right ( int bottom , int left , int right , int top ,  List<Integer> res , int[][] matrix){
        for(int i = left ; i<right ; i++){
            res.add(matrix[top][i]);
        }
    }

    private void down(  int bottom , int left , int right , int top ,  List<Integer> res , int[][] matrix){
        for(int i = top ; i<bottom ; i++){
            res.add(matrix[i][right-1]);
        }
        
    }
    private void left(  int bottom , int left , int right , int top ,  List<Integer> res , int[][] matrix){
        for(int i = right-1 ; i>=left ; i--){
            res.add(matrix[bottom-1][i]);
        }
    
        
    }
    private void top( int bottom , int left , int right , int top ,  List<Integer> res , int[][] matrix){
        for(int i = bottom-1 ; i>=top ; i--){
            res.add(matrix[i][left]);
        }
    }

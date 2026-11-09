class Solution {
    public void rotate(int[][] matrix) {
        for(int col = 0; col<matrix.length;col++){
            int top =0;
            int bottom = matrix.length-1;
            while(top<bottom){
                int temp = matrix[top][col];
                matrix [top][col]= matrix [bottom][col];
                matrix [bottom][col] = temp;
                top++;
                bottom--;
            }
        }

        for(int r = 0; r<matrix.length;r++){
            for(int c = r+1; c<matrix.length;c++){
                int temp = matrix[r][c];
                matrix[r][c]=matrix[c][r];
                matrix[c][r]=temp;
            }
        }
        
    }
}

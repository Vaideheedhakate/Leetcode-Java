public class LC240_SearchA2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length; //rows
        int n = matrix[0].length; //columns

        //start from top right corner
        int i=0, j=n-1;

        //run loop until we stay inside matrix boundaries
        while( i<=m-1 && j>=0){
            if(matrix[i][j]==target) return true;  // found the target
            else if(matrix[i][j]>target) j--;   // move left (because values decrease to left)
            else i++;    // move down (because values increase downward)
        }
        return false;   //target not found
    }
}

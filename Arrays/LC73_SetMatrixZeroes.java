public class LC73_SetMatrixZeroes {
    public void setZeroes(int[][] arr) {
        int m=arr.length, n=arr[0].length;
        boolean zeroRow = false;
        boolean zeroColn = false;
        //Check 0th Row
        for(int j=0;j<n;j++){
            if(arr[0][j]==0){
                zeroRow = true;
                break;
            }
        }
        //Check 0th coln
        for(int i=0; i<m; i++){
            if(arr[i][0]==0){
                zeroColn = true;
                break;
            }
        }
        //traverse submatrix without 0th row & 0th coln.
        for(int i=1; i<m; i++){
            for(int j=1; j<n; j++){
                if(arr[i][j]==0){
                    arr[0][j]=0;
                    arr[i][0]=0;
                }
            }
        }
        // set rows to zero
        for(int i=1; i<m; i++){
            if(arr[i][0]==0){
                for(int j=0; j<n; j++){
                    arr[i][j]=0;
                }
            }
        }
        //set colns zero
        for(int j=1; j<n; j++){
            if(arr[0][j]==0){
                for(int i=0; i<m; i++){
                    arr[i][j]=0;
                }
            }
        }
        //Check row & coln already has zero or not
        if(zeroRow){
            for(int j=0; j<n; j++){
                arr[0][j]=0;
            }
        }
        if(zeroColn){
            for(int i=0; i<m; i++){
                arr[i][0]=0;
            }
        }
    }
}

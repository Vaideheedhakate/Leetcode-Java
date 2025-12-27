public class LC861_ScoreAfterFlippingMatrix {
    public int matrixScore(int[][] arr) {
        int m = arr.length, n = arr[0].length;

        // Step 1: Ensure first column of every row becomes 1 (flip row if first element is 0)
        for(int i=0;i<m;i++){
            if(arr[i][0]==0){
                // Flip entire row
                for(int j=0;j<n;j++){
                    arr[i][j] = arr[i][j] == 0 ? 1 : 0;
                }
            }
        }

        // Step 2: Flip column if 0s are greater than 1s to maximize score
        for(int j=1;j<n;j++){
            int zero=0, one=0;
            for(int i=0;i<m;i++){
                if(arr[i][j]==0) zero++;
                else one++;
            }
            if(zero > one){ // flipping increases column value
                for(int i=0;i<m;i++){
                    arr[i][j] = arr[i][j] == 0 ? 1 : 0;
                }
            }
        }

        // Step 3: Calculate final score (binary to decimal conversion)
        int score=0, mul=1;
        for(int j=n-1;j>=0;j--){  // traverse from LSB → MSB
            for(int i=0;i<m;i++){
                score += arr[i][j] * mul;   // add column contribution
            }
            mul *= 2;    // binary place value
        }
        return score;
    }
}

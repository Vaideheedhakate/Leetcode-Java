public class LC48_RotateImage {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        //transpose
        for(int i=0; i<n; i++){
            for(int j=0;j<i;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        //reverse
        for(int i=0; i<n; i++){
            swap(matrix[i]);
        }
    }
    public void swap(int[] arr){
        int i = 0, j = arr.length-1;
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++; j--;
        }
    }
}

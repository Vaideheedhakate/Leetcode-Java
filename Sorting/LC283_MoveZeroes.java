public class LC283_MoveZeroes {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int noz = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==0) noz++;
        }
        for(int i=0; i<noz; i++){
            for(int j=0; j<n-i-1; j++){
                if(nums[j]==0){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
    }
}

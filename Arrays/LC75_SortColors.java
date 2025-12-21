class LC75_SortColors {
    public void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public void sortColors(int[] arr) {
        //Dutch flag Algo
        int n = arr.length;
        int low = 0, mid = 0, high = n-1;
        while(mid<=high){
            if(arr[mid]==0){
                swap(arr,mid,low);
                low++;
                mid++;
            }
            else if(arr[mid]==1) mid++;
            else{// arr[mid]==2
                swap(arr,mid,high);
                high--;
            }
        }
    }
}
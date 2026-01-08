public class LC34_FirstAndLastPosition {
    public int[] searchRange(int[] arr, int target) {

        int n = arr.length;
        int[] ans = {-1, -1}; // default answer if target not found

        // FIND FIRST POSITION
        int start = 0, end = n - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                ans[0] = mid;      // store index as possible first position
                end = mid - 1;     // move left to find earlier target
            } else if (arr[mid] > target)
                end = mid - 1;     // target can be on left side
            else
                start = mid + 1;   // target can be on right side
        }

        // If first not found → no need to search last
        if (ans[0] == -1) return ans;

        // FIND LAST POSITION
        start = 0;
        end = n - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;

            if(arr[mid] == target){
                ans[1] = mid;      // store index as possible last position
                start = mid + 1;   // move right to find later target
            }
            else if(arr[mid] > target)
                end = mid - 1;     // target might be left
            else
                start = mid + 1;   // target might be right
        }
        return ans; //Return first & last position
    }
}
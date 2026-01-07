import java.util.*;
public class LC658_KClosestElements {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> ans = new ArrayList<>();
        int n = arr.length;
        if (x < arr[0]) {
            for (int i = 0; i < k; i++) ans.add(arr[i]);
            return ans;
        }
        if (x > arr[n - 1]) {
            for (int i = n - 1; i >= n - k; i--) ans.add(arr[i]);
            Collections.sort(ans);
            return ans;
        }
        return ans;
    }
}

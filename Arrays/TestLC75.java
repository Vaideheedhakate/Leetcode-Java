import java.util.Arrays;

public class TestLC75 {
    public static void main(String[] args) {

        System.out.println("=== LC75 – Sort Colors ===");

        LC75_SortColors sol = new LC75_SortColors();

        // Test Case 1
        int[] nums1 = {2,0,2,1,1,0};
        sol.sortColors(nums1);
        System.out.println(Arrays.toString(nums1));

        // Test Case 2
        int[] nums2 = {2,0,1};
        sol.sortColors(nums2);
        System.out.println(Arrays.toString(nums2));
        
    }
}

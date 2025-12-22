import java.util.Arrays;

public class TestLC75 {
    public static void main(String[] args) {

        LC75_SortColors sol = new LC75_SortColors();

        // Test Case
        int[] nums1 = {2,0,2,1,1,0};
        sol.sortColors(nums1);
        System.out.println(Arrays.toString(nums1));

    }
}

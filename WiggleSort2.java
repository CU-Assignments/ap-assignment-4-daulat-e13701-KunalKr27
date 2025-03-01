import java.util.Arrays;

class Solution {
    public void wiggleSort(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int[] temp = Arrays.copyOf(nums, n);

        int mid = (n - 1) / 2, end = n - 1;
        for (int i = 0; i < n; i++) {
            nums[i] = (i % 2 == 0) ? temp[mid--] : temp[end--];
        }
    }
}

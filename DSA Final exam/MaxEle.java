public class MaxEle {
    public static int findMax(int[] nums) {
        if (nums == null || nums.length == 0) {
            throw new IllegalArgumentException("Array is empty or null");
        }
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
           
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = {16, 14, 34, 24, 15,39,85};
        int maxElement = findMax(nums);
        System.out.println("The maximum element in the array is: " + maxElement);
    }
}

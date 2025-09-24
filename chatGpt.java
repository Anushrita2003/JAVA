public class chatGpt {
    public static void main(String[] args) {
        // Sample input array
        int[] nums = {1,6,7,2};

        // Create an object of the Solution class
        Solution sol = new Solution();

        // Call the productExceptSelf method
        int[] result = sol.productExceptSelf(nums);

        // Print the result
        System.out.print("Output: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println(); // Move to next line after output
    }
}

// Your optimized Solution class
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        // Step 1: Left product
        result[0] = 1;
        for (int i = 1; i < n; i++) {
            result[i] = result[i - 1] * nums[i - 1];
        }

        // Step 2: Right product (stored in variable)
        int right = 1;
        for (int i = n - 1; i >= 0; i--) {
            result[i] = result[i] * right;
            right *= nums[i];
        }

        return result;
    }
}

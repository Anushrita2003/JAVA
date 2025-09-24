public class produst_Ex_self {
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
    }
}

// Your original Solution class
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            int p = 1;
            for (int j = 0; j < n; j++) {
                if (i == j)
                    continue;
                else
                    p = p * nums[j];
            }
            arr1[i] = p;
        }
        return arr1;
    }
}

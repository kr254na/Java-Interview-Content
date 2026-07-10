package DSA.Array.PrefixSum;

class PivotIndex {
    public int pivotIndex(int[] nums) {
        // Step 1: build prefix sum
        for (int i = 1; i < nums.length; i++) {
            nums[i] = nums[i - 1] + nums[i];
        }

        int totalSum = nums[nums.length - 1];

        // Step 2: check pivot index
        for (int i = 0; i < nums.length; i++) {
            int leftSum = (i == 0) ? 0 : nums[i - 1];
            int rightSum = totalSum - nums[i];

            if (leftSum == rightSum) {
                return i;
            }
        }

        return -1;
    }
}

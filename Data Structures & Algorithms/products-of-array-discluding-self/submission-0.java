class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int prod[] = new int[n];
        for (int i = 0; i < n; i++) {
            int ans = 1;
            for (int j = 0; j < n; j++) {
                if (i != j) {
                    ans *= nums[j];
                }
            }
            prod[i] = ans;
        }
        return prod;
    }
}

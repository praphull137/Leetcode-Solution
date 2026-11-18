class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int i = 0, j = 0;
        int sum = 0;
        int min = Integer.MAX_VALUE;
        int n = nums.length;
        while(i <=n && j<n){
            sum += nums[j++];
            while(sum >= target){
                sum -= nums[i++];
                min = Math.min(min, j-i + 1);
            }
        }
        return min == Integer.MAX_VALUE ? 0: min;
    }
}
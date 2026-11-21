
class Solution {
    public int[] pivotArray(int[] nums, int pivot) {

        int i = 0, j = 0, k = 0, m = 0;

        int[] res = new int[nums.length];
        int[] t1 = new int[nums.length];
        int[] t2 = new int[nums.length];
        int[] t3 = new int[nums.length];

        while(k < nums.length) {

            if(nums[k] < pivot) {
                t1[i++] = nums[k];
            }
            else if(nums[k] == pivot) {
                t3[m++] = nums[k];
            }
            else {
                t2[j++] = nums[k];
            }

            k++;
        }

        int l = 0;

        //smaller than pivot
        for(int p = 0; p < i; p++) {
            res[l++] = t1[p];
        }

        // equal to pivot
        for(int p = 0; p < m; p++) {
            res[l++] = t3[p];
        }

        // greater than pivot
        for(int p = 0; p < j; p++) {
            res[l++] = t2[p];
        }

        return res;
    }
}

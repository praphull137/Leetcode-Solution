class Solution {
    public int[] transformArray(int[] nums) {
        int ecnt = 0, j = 0;
        int[] res = new int[nums.length];
        for(int i =0; i<nums.length; i++){
            if(nums[i] % 2 == 0) ecnt++;
        }
        for(int i =0; i<ecnt; i++){
            res[j++] =0;
        }
        while(j<nums.length){
            res[j++] = 1;
        }
        return res;
    }
}
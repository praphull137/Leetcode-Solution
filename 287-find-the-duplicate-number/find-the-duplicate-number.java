class Solution {
    public int findDuplicate(int[] nums) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        boolean[] flag = new boolean[nums.length];
        for(int i =0; i<nums.length; i++){
            if(flag[nums[i]] == true) return nums[i];
            if(flag[nums[i]] == false){
                flag[nums[i]] =  true;
            }
        }
        return -1;
    }
}
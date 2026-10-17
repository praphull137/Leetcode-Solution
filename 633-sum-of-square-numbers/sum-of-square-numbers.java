class Solution {
    public boolean judgeSquareSum(int c) {
        int left = 0, right =(int) Math.sqrt(c);
        while(left <= right){
            long sq =(long) left*left + (long) right*right;
            if(sq == c) return true;
            else if(sq > c) right--;
            else left++;
        }
        return false;
    }
}
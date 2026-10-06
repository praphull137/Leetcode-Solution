class Solution {
    public boolean isPalindrome(String input) {
        //remove all spaces 
        // input = input.replace(" ", "");
        input = input.replaceAll("[^a-zA-Z0-9]", "");
        //convert to lowercase
        input = input.toLowerCase();
        int left = 0;
        int right = input.length()-1;
        while(left <= right){
            if(input.charAt(left) != input.charAt(right)){
                return false;
            } 
            left++;
            right--;
        }
        return true;
    }
}
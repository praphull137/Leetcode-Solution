class Solution {
    public int strStr(String haystack, String needle) {
         int ans =0;
        int n =  haystack.indexOf(needle);
       
            if(haystack.contains(needle)){
                return n;
            
        }
        return -1;
    }
}
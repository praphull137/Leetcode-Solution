class Solution {
    public void moveZeroes(int[] arr) {
    int write = 0;

    for (int read = 0; read < arr.length; read++) {
        if (arr[read] != 0) {
            arr[write++] = arr[read];
        }
    }
    while(write < arr.length){
            arr[write++] = 0;
                }
    }
}
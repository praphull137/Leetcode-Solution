class Solution {
    public int removeElement(int[] arr, int val) {
        if (arr.length == 0) {
        return 0;
    }

    int write = 0;

    for (int read = 0; read < arr.length; read++) {
        if (arr[read] != val) {
            arr[write] = arr[read];
            write++;
        }
    }

    return write;
    }
}
class Solution {
    public int sumOfSquaresOfDigits(int n){
         int sq =0;
          while(n > 0){
            int rem = n % 10;
            sq += rem * rem;
            n /= 10;
          }
          return sq;
    }
    public boolean isHappy(int n) {
        int slow = n, fast = n;
        do{
            slow = sumOfSquaresOfDigits(slow);
            fast = sumOfSquaresOfDigits(sumOfSquaresOfDigits(fast));
        }while(slow != fast);
        return slow == 1;
    }
}
class Solution {
    public boolean isPowerOfTwo(int n) {
        int r = 0;

        if (n <= 0){
            return false;
        }

        while(n > 2){
            
            r  = n%2;
            n = n / 2;
            if(r!=0){
                return false;
            }
        }
        return true;

    }
}
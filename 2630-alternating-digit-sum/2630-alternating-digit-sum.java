class Solution {
    public int alternateDigitSum(int n) {

        boolean flag = true;

        int n_size = String.valueOf(n).length();
        if(n_size % 2 == 1){
            flag = true;
        }
        else{
            flag = false;
        }
        int rem  =0;
        int sum = 0;

        while(n > 0){
            rem = n % 10;
            if(flag){
                sum += rem;
                flag = !flag;
            }
            else{
                sum -= rem;
                flag = !flag;
            }
            n /= 10;
            
        }
        return sum;
        
    }
}
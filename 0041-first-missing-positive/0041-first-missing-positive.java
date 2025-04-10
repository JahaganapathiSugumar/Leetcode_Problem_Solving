class Solution {
    public int firstMissingPositive(int[] nums) {
        int num = nums.length;
        int curr;
        boolean[] arr = new boolean[num + 1];

        for(int i = 0;i < num;i++){
            curr = nums[i];
            if(nums[i] > 0 && nums[i] <= num){
                arr[curr] = true;
            }
        }

        for(int j = 1;j <= num;j++){
            if(!arr[j]){
                return j;
            }
        }

        return num+1;
    }
}
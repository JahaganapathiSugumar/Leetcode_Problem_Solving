class Solution {
    public int[] applyOperations(int[] nums) {
        for(int i = 0;i<nums.length-1;i++){
            if(nums[i] == nums[i+1]){
                nums[i] *= 2;
                nums[i+1] = 0;
            }
        }

        int high = 0;
        int low = 0;
        for(high = 0;high < nums.length;high++){
            if(nums[high] != 0){
                int temp = nums[high];
                nums[high] = nums[low];
                nums[low] = temp;
                low++;
            }
        }
        return nums;
    }
} 
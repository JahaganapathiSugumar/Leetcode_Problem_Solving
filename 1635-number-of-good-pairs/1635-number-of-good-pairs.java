class Solution {
    public int numIdenticalPairs(int[] nums) {
        int arr[] = new int[102];
        for(int each : nums){
            arr[each] += 1;
        }

        int res = 0;
        for(int i = 0;i<arr.length;i++){
            res += (arr[i] * (arr[i] - 1))/2;
        }

        return res;
    }
}
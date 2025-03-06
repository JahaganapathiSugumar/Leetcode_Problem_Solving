class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {

        int n = grid.length;
        int size = n * n;

        int[] freq = new int[size + 1];

        for(int[] each : grid){
            for(int ele : each){
                freq[ele]++;
            }
        }

        int repeated = -1;
        int missing = -1;

        for(int nums = 1;nums<=size;nums++){
            if(freq[nums] == 2){
                repeated = nums;
            }

            if(freq[nums] == 0){
                missing = nums;
            }
        }

        return new int[] {repeated,missing};

    }
}
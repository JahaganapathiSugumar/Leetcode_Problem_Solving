class Solution {
    public int minimumRecolors(String blocks, int k) {
        int n = blocks.length();
        int minoper = Integer.MAX_VALUE;

        for(int i = 0;i <= n - k;i++){
            
            int whitecount = 0;

            for(int j = i;j < i + k;j++){
                if(blocks.charAt(j) == 'W'){
                    whitecount++;
                }
            }

            minoper = Math.min(minoper,whitecount);
        }
        return minoper;
    }
}
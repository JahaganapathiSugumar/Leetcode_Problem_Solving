class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> h = new HashMap<>();
        int res = 0;
        int majority = 0;

        for(int num : nums){
            h.put(num,1 + h.getOrDefault(num,0));
            if(h.get(num) > majority){
                res = num;
                majority = h.get(num);
            }
        }
        return res;
    }
}
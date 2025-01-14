class Solution {
    public int minimumLength(String s) {

        int res = 0;

        HashMap<Character,Integer> counter = new HashMap<>();

        for(char c : s.toCharArray()){
            counter.put(c,counter.getOrDefault(c,0) + 1);
        }
        

        for(int cnt : counter.values()){
            if(cnt % 2 == 0){
                res+=2;
            }else{
                res+=1;
            }
        }
        return res;
    }
}
class Solution {
    public int distributeCandies(int[] candyType) {

        HashSet<Integer> h = new HashSet<>();

        for(int each : candyType){
            h.add(each);
        }

        int n = candyType.length/2;
        if(n <= h.size()){
            return n;
        }
        return h.size();


        
    }
}
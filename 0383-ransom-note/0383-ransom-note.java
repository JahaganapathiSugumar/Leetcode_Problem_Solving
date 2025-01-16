class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        
        HashMap<Character,Integer> h = new HashMap<>();

        for(char each:magazine.toCharArray()){
            h.put(each,h.getOrDefault(each,0) + 1);
        }

        for(char each : ransomNote.toCharArray()){
            if(!h.containsKey(each) || h.get(each) <= 0){
                return false;
            }
            h.put(each,h.get(each) - 1);
        }
        return true;

    }
}
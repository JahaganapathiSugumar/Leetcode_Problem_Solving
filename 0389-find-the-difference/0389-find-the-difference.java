class Solution {
    public char findTheDifference(String s, String t) {
        HashMap<Character,Integer> h = new HashMap<>();
        
        for(char c : s.toCharArray()){
            h.put(c,h.getOrDefault(c,0) + 1);
        }

        for(char d : t.toCharArray()){
            h.put(d,h.getOrDefault(d,0) - 1);
            if(h.get(d) == 0){
                h.remove(d);
            }
        }

        return (char) h.keySet().toArray()[0];
    }
}
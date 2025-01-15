class Solution {
    public String reverseWords(String s) {
        String []words = s.split("\\s+");
        StringBuilder reversed = new StringBuilder();
        for(String word : words){
            StringBuilder reverseword = new StringBuilder(word);
            reverseword.reverse();
            reversed.append(reverseword).append(" ");
        }

        return reversed.toString().trim();
    }
}
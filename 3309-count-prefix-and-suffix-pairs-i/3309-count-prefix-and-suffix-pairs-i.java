class Solution {
    public int countPrefixSuffixPairs(String[] words) {

        int res = 0;

        for(int i = 0;i<words.length;i++){
            for(int j = 0;j<words.length;j++){
                if(i == j){
                    continue;
                }

                if(i<j){
                    if(words[j].startsWith(words[i]) && words[j].endsWith(words[i])){
                        res++;
                    }
                }
            }
        }
        return res;
        
    }
}
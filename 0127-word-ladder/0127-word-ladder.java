class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {


        Set<String> s = new HashSet<>(wordList);
        Queue<String> q = new LinkedList<>();

        if(!s.contains(endWord)){
            return 0;
        }

        int res = 0;

        q.offer(beginWord);

        while(!q.isEmpty()){
            res++;
            int lsize = q.size();


            for(int i = 0;i<lsize;i++){
                String curr = q.poll();

                for(int ii = 0;ii<curr.length();ii++){
                    StringBuffer temp = new StringBuffer(curr);
                    for(char j = 'a';j <= 'z';j++){
                        temp.setCharAt(ii,j);
                        String temp1 = new String(temp.toString());

                        if(temp1.equals(curr)){
                            continue;
                        }

                        if(temp1.equals(endWord)){
                            return res+1;
                        }

                        if(s.contains(temp1)){
                            q.offer(temp1);
                            s.remove(temp1);
                        }
                    }
                }
            }
        }
        return 0;
    }
}
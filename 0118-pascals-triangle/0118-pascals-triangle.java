class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        if(numRows == 0){
            return res;
        }

        List<Integer> FirstRow = new ArrayList<>();
        FirstRow.add(1);
        res.add(FirstRow);

        if(numRows == 1){
            return res;
        }

        for(int i = 1;i<numRows;i++){
            List<Integer> prev = res.get(i-1);

            List<Integer> curr = new ArrayList<>();
            curr.add(1);
            for(int j = 0;j< i-1;j++){
                curr.add(prev.get(j) + prev.get(j+1));
            }
            curr.add(1);

            res.add(curr);
        }

        return res;
    }
}
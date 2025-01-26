class Solution {
    public List<Integer> getRow(int rowIndex) {

        List<Integer> res = new ArrayList<>();
        res.add(1);


        if(rowIndex == 0){
            return res;
        }

        res.add(1);

        if(rowIndex == 1){
            return res;
        }

        for(int i = 2;i<rowIndex+1;i++){
            List<Integer> newRow = new ArrayList<>();

            newRow.add(1);
            for(int j = 0;j<i-1;j++){
                newRow.add(res.get(j)+res.get(j+1));
            }
            newRow.add(1);

            res = newRow;


        }

        return res;
        
        
    }
}
class Solution {

    Map<String, Integer> map = new HashMap<>();

    public int Helper(int row, int col){
        if(col == 0 || row == col)return 1;

        String key = Integer.toString(row) + " " + Integer.toString(col);

        if(map.containsKey(key))return map.get(key);
        
        int res = Helper(row-1 , col-1) + Helper(row-1 , col);

        map.put(key,res);
        return map.get(key);
    }
    public List<Integer> getRow(int rowIndex) {
        List<Integer> res = new ArrayList<>();
        int row = rowIndex;
        for(int col = 0; col <= rowIndex; col++){
            res.add(Helper(row,col));
        }
        return res;
    }
}
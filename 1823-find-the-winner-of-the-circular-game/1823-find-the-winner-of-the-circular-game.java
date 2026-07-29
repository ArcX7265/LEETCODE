class Solution {
    private int x = 0;

    public int recursive(int n, int k, List<Integer> list){
        if(list.size() == 1)return list.get(0);
        
        int removeIndex = (x + k - 1) % list.size();
        list.remove(removeIndex);

        x = removeIndex % list.size();
        return recursive(n,k,list);
    }

    public int findTheWinner(int n, int k) {
        List<Integer> list = new ArrayList<>();
        for(int i=1;i<=n;i++){
            list.add(i);
        }
        return recursive(n,k,list);
        
    }
}
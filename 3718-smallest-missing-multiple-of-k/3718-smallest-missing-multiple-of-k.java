class Solution {
    public int missingMultiple(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        int i = 1;
        while(k*i <= 200){
            if(set.contains(k * i))i++;
            else return k * i;
        }
        return -1;
    }
}
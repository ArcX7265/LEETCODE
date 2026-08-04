class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> res = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        
        Arrays.sort(nums);
        int n = nums.length;
        for(int i=0;i<n;i++){
            set.add(nums[i]);
        }
        int min = nums[0];
        int max = nums[n-1];
        for(int i=min;i<=max;i++){
            if(set.contains(i))continue;
            else{
                res.add(i);
            }
        }
        return res;
    }
}
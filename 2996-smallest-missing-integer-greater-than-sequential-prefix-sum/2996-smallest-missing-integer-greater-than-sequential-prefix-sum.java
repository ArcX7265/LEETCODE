class Solution {
    public int missingInteger(int[] nums) {
        int n = nums.length;
        int sum = nums[0];

        Set<Integer> set = new HashSet<>();

        for(int i=0;i<n;i++)set.add(nums[i]);
        for(int i=1;i<n;i++){
            if(nums[i] == nums[i-1] + 1){
                sum += nums[i];
            }
            else{
                break;
            }
        }
        int x = sum;
        while(set.contains(x)){
            x++;
        }
        return x;
    }
}
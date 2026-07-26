class Solution {
    public int maximumProduct(int[] nums) {
        int n = nums.length;
        if(n<3)return -1;
        Arrays.sort(nums);
       
        int maxi=Math.max(nums[n-3]*nums[n-2]*nums[n-1],nums[0]*nums[1]*nums[n-1]);
        return maxi;

    }
}
class Solution {

    static int gcd(int a, int b){
        while(a>0 && b>0){
            if(a>b)a = a%b;
            else b = b%a;
        }
        if(a == 0)return b;
        return a;
    }
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        return gcd(nums[0],nums[nums.length-1]);
    }
}
class Solution {
    public int maxProduct(int n) {
        int max = 0;
        int max2 = 0;
        int lastDig;

        while(n>0){
            lastDig = n%10;
            if(lastDig >= max){
                max2 = max;
                max = lastDig;
            }
            else if(lastDig > max2)max2 = lastDig;
            n /= 10;
        }
        return max * max2;
    }
}
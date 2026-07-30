class Solution {
    public int minimumPushes(String word) {
        int n = word.length();
        int x = 1;
        int ans = 0;
        while(n > 0){
        if(n-8 > 0){

            ans += x * 8;
            x ++;
            n -= 8;
        }
        else{
            ans += x * n;
            break;
        }

        }
        return ans;
    }
}
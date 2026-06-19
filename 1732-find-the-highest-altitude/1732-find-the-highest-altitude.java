class Solution {
    public int largestAltitude(int[] gain) {
        int maxAlt = 0;
        int var = 0;
        for(int i=0;i<gain.length;i++){
            var = var + gain[i];
            maxAlt = Math.max(var,maxAlt);
        }
        return maxAlt;
    }
}
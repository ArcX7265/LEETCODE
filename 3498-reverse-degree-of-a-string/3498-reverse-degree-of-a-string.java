class Solution {
    public int reverseDegree(String s) {
       int i = 1;
       int sum = 0;
       int n = s.length();
       for(int j=0;j<n;j++){
        sum += i*(26 - (s.charAt(j)-'a'));
        i++;
       } 
       return sum;
    }
}
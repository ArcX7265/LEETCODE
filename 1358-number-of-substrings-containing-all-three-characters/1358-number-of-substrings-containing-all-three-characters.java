class Solution {
    public int numberOfSubstrings(String s) {
        int n = s.length();
        int result = 0;

        Map<Character,Integer> map = new HashMap<>();

        int i = 0;
        int j = 0;
        while(j<n){
            char ch = s.charAt(j);
            map.put(ch,map.getOrDefault(ch,0)+1);

            while(map.getOrDefault('a',0)>0 && map.getOrDefault('b',0)>0 && map.getOrDefault('c',0)>0){
                result += (n-j);
                char left = s.charAt(i);
                map.put(left,map.get(left)-1);
                i++;
            }
            j++;
        }
        return result;
    }
}
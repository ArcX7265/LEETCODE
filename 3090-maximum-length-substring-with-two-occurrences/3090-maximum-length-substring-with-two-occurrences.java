class Solution {
    public int maximumLengthSubstring(String s) {
        int n = s.length();
        int ans = 0;
        int left = 0;
        int right = 0;

        Map<Character, Integer> map = new HashMap<>();

        while (right < n) {
            char c = s.charAt(right);
            map.put(c, map.getOrDefault(c, 0) + 1);

            while (map.get(c) > 2) {
                char leftChar = s.charAt(left);
                map.put(leftChar, map.get(leftChar) - 1);
                left++;
            }

            ans = Math.max(ans, right - left + 1);
            right++;
        }

        return ans;
    }
}
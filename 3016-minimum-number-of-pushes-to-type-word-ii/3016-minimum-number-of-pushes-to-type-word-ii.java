class Solution {
    public int minimumPushes(String word) {

        Map<Character, Integer> map = new HashMap<>();
        for (char ch : word.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        List<Integer> freqs = new ArrayList<>(map.values());
        Collections.sort(freqs, Collections.reverseOrder());

        int num = freqs.size();
        int idx = 0;
        int x = 1;
        int ans = 0;

        while (num > 0) {
            if (num - 8 > 0) {
                for (int i = 0; i < 8; i++) {
                    ans += x * freqs.get(idx);
                    idx++;
                }
                x++;
                num -= 8;
            } else {
                for (int i = 0; i < num; i++) {
                    ans += x * freqs.get(idx);
                    idx++;
                }
                break;
            }
        }

        return ans;
    }
}
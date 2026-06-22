class Solution {
    public int maxNumberOfBalloons(String text) {
        HashMap<Character, Integer> freq = new HashMap<>();
        for (char c : text.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }

        return Math.min(
            Math.min(freq.getOrDefault('b', 0), freq.getOrDefault('a', 0)),
            Math.min(freq.getOrDefault('l', 0) / 2,
                Math.min(freq.getOrDefault('o', 0) / 2, freq.getOrDefault('n', 0)))
        );
    }
}
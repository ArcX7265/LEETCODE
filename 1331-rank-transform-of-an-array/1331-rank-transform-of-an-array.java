class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int n = arr.length;
        int[] sorted = Arrays.copyOf(arr, n);
        Arrays.sort(sorted);

        Map<Integer, Integer> rankMap = new HashMap<>();
        int rank = 1;
        for(int i = 0; i < n; i++){
            if(!rankMap.containsKey(sorted[i])){
                rankMap.put(sorted[i], rank);
                rank++;
            }
        }

        for(int i = 0; i < n; i++){
            arr[i] = rankMap.get(arr[i]);
        }
        return arr;
    }
}
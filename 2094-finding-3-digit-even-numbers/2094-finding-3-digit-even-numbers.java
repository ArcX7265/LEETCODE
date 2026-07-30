class Solution {
    public int[] findEvenNumbers(int[] digits) {
        int[] count = new int[10];
        for (int d : digits) {
            count[d]++;
        }

        List<Integer> result = new ArrayList<>();

        for (int i = 100; i < 1000; i++) {
            if (i % 2 == 0) {
                int[] need = new int[10]; 
                int x = i;
                boolean valid = true;

                while (x > 0) {
                    int lastDig = x % 10;
                    need[lastDig]++;
                    if (need[lastDig] > count[lastDig]) {
                        valid = false;
                        break;
                    }
                    x /= 10; 
                }

                if (valid) {
                    result.add(i);
                }
            }
        }

        int[] answer = new int[result.size()];
        for (int j = 0; j < answer.length; j++) {
            answer[j] = result.get(j);
        }
        return answer;
    }
}
import java.util.*;

class Solution {
    public int minSumOfLengths(int[] arr, int target) {
        int n = arr.length;
        int INF = n + 1;

        int[] best = new int[n];
        Arrays.fill(best, INF);

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);

        int prefix = 0;
        int answer = INF;

        for (int i = 0; i < n; i++) {
            prefix += arr[i];

            // Carry forward the best subarray found so far
            if (i > 0) {
                best[i] = best[i - 1];
            }

            // Look for a subarray ending at i with sum = target
            if (map.containsKey(prefix - target)) {
                int j = map.get(prefix - target);
                int length = i - j;

                // Combine with a previous non-overlapping subarray
                if (j >= 0 && best[j] != INF) {
                    answer = Math.min(answer, best[j] + length);
                }

                // This is the best subarray ending at i
                best[i] = Math.min(best[i], length);
            }

            // Store the latest index for this prefix sum
            map.put(prefix, i);
        }

        return answer == INF ? -1 : answer;
    }
}
class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
	return bellmanFord(k, n, times);
}

public int bellmanFord(int source, int n, int[][] connections) {

	int max = -1;
	int[] ans = new int[n + 1];
	Arrays.fill(ans, Integer.MAX_VALUE);
	ans[source] = 0;
	for (int i = 1; i < n; i++) {
		for (int[] connection : connections) {
			int src = connection[0];
			int dest = connection[1];
			int cost = connection[2];
			if (ans[src] != Integer.MAX_VALUE) {
				if (ans[src] + cost < ans[dest])
					ans[dest] = ans[src] + cost;
			}
		}
	}

	for (int i = 1; i <= n; i++) {
		if (ans[i] == Integer.MAX_VALUE)
			return -1;
		max = Math.max(max, ans[i]);
	}

	return max;
}
}
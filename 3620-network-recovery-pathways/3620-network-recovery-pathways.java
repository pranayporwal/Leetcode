import java.util.*;

class Solution {
    public int findMaxPathScore(int[][] edges, boolean[] online, long k) {
        int n = online.length;

        List<List<int[]>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        int maxEdge = 0;
        for (int[] edge : edges) {
            graph.get(edge[0]).add(new int[]{edge[1], edge[2]});
            maxEdge = Math.max(maxEdge, edge[2]);
        }

        int low = 0, high = maxEdge;
        int ans = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (canReach(mid, graph, online, k, n)) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return ans;
    }

    private boolean canReach(int minEdgeCost, List<List<int[]>> graph,
                             boolean[] online, long k, int n) {

        long[] dist = new long[n];
        Arrays.fill(dist, Long.MAX_VALUE);
        dist[0] = 0;

        PriorityQueue<long[]> pq = new PriorityQueue<>((a, b) -> Long.compare(a[1], b[1]));
        pq.offer(new long[]{0, 0});

        while (!pq.isEmpty()) {
            long[] curr = pq.poll();
            int node = (int) curr[0];
            long cost = curr[1];

            if (cost > dist[node]) continue;

            for (int[] next : graph.get(node)) {
                int v = next[0];
                int w = next[1];

                // Ignore edges whose cost is smaller than the required score.
                if (w < minEdgeCost) continue;

                // Intermediate nodes must be online.
                if (v != n - 1 && !online[v]) continue;

                long newCost = cost + w;
                if (newCost < dist[v] && newCost <= k) {
                    dist[v] = newCost;
                    pq.offer(new long[]{v, newCost});
                }
            }
        }

        return dist[n - 1] <= k;
    }
}
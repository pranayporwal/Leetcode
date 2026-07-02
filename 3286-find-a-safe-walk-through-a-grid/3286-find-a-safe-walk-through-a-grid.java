import java.util.*;

class Solution {

    static class State {
        int row, col, health;

        State(int row, int col, int health) {
            this.row = row;
            this.col = col;
            this.health = health;
        }
    }

    public boolean findSafeWalk(List<List<Integer>> grid, int health) {

        int m = grid.size();
        int n = grid.get(0).size();

        int[][] dirs = {
            {0, 1},
            {1, 0},
            {0, -1},
            {-1, 0}
        };

        int startHealth = health - grid.get(0).get(0);

        if (startHealth <= 0)
            return false;

        Queue<State> q = new LinkedList<>();
        q.offer(new State(0, 0, startHealth));

        boolean[][][] visited = new boolean[m][n][health + 1];
        visited[0][0][startHealth] = true;

        while (!q.isEmpty()) {

            State curr = q.poll();

            if (curr.row == m - 1 && curr.col == n - 1)
                return true;

            for (int[] dir : dirs) {

                int nr = curr.row + dir[0];
                int nc = curr.col + dir[1];

                if (nr < 0 || nr >= m || nc < 0 || nc >= n)
                    continue;

                int nextHealth = curr.health - grid.get(nr).get(nc);

                if (nextHealth <= 0)
                    continue;

                if (visited[nr][nc][nextHealth])
                    continue;

                visited[nr][nc][nextHealth] = true;
                q.offer(new State(nr, nc, nextHealth));
            }
        }

        return false;
    }
}
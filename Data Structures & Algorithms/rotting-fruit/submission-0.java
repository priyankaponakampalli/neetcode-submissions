class Solution {
    public int orangesRotting(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        int minutes = 0;

        while (true) {
            int[][] newGrid = new int[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    newGrid[i][j] = grid[i][j];
                }
            }

            boolean madeChange = false;

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (grid[i][j] == 2) {
                        if (j - 1 >= 0 && grid[i][j - 1] == 1) {
                            newGrid[i][j - 1] = 2;
                            madeChange = true;
                        }
                        if (j + 1 < m && grid[i][j + 1] == 1) {
                            newGrid[i][j + 1] = 2;
                            madeChange = true;
                        }
                        if (i - 1 >= 0 && grid[i - 1][j] == 1) {
                            newGrid[i - 1][j] = 2;
                            madeChange = true;
                        }
                        if (i + 1 < n && grid[i + 1][j] == 1) {
                            newGrid[i + 1][j] = 2;
                            madeChange = true;
                        }
                    }
                }
            }

            grid = newGrid;

            if (!madeChange)
                break;

            minutes++;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 1) {
                    return -1;
                }
            }
        }

        return minutes;
    }
}

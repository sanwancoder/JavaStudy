package com.wyfdc.go.leetcode.unionFind;

/**
 * https://leetcode.com/problems/surrounded-regions/
 *
 * https://leetcode.com/problems/surrounded-regions/discuss/441194/Java-Union-Find
 */
public class SurroundedRegions_M1 {

    public static void main(String[] args) {
        char[][] board = {{'X','X', 'X', 'X'},
            {'X', 'O', 'O', 'X'},
            {'X', 'X', 'O', 'X'},
            {'X' ,'O', 'X', 'X'}};
        solve(board);
    }

    static int[][] dir = {{1,0}, {0,1}, {-1,0}, {0,-1}};

    public static void solve(char[][] board) {
        int m = board.length;
        if(board == null || board.length == 0) {return;}
        int n = board[0].length;
        int border = m * n;
        UnionFindSet uf = new UnionFindSet(border + 1);
        for(int x = 0; x < m; x++) {
            for(int y = 0; y < n; y++) {
                if(board[x][y] != 'O') {continue;}
                int cur = x * n + y;

                if(x == 0 || x == m - 1 || y == 0 || y == n - 1) {
                    uf.union(border, cur);
                    continue;
                }

                for(int[] d: dir) {
                    int nextX = x + d[0];
                    int nextY = y + d[1];
                    if(nextX >= 0 && nextX < m && nextY >= 0 && nextY < n && board[nextX][nextY] == 'O') {
                        int next = nextX * n + nextY;
                        uf.union(next, cur);
                    }
                }
            }
        }

        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(board[i][j] == 'O' && uf.find(i * n + j) != uf.find(border)) {
                    board[i][j] = 'X';
                }
            }
        }
        //输出
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }

    }

    static class UnionFindSet {
        int[] parents;
        int[] ranks;

        public UnionFindSet(int n) {
            parents = new int[n];
            ranks = new int[n];
            for(int i = 0; i < n; i++){ parents[i] = i;}
        }

        private int find(int x) {
            if(x != parents[x]) {x = find(parents[x]);}
            return parents[x];
        }

        private boolean union(int x, int y) {
            int px = find(x);
            int py = find(y);
            if(px == py) {return false;}
            if(ranks[px] > ranks[py]) {
                parents[py] = px;
                ranks[px] ++;
            } else{
                parents[px] = py;
                ranks[py] ++;
            }
            return true;
        }
    }
}

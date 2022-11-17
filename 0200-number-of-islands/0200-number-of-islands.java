class Solution {
    Deque<int[]> dq = new LinkedList<>();

    public int numIslands(char[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int islands = 0;
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                if(grid[i][j] == '1'){
                    dq.offer(new int[]{i, j});
                    bfs(i, j, grid);
                    islands++;
                }
            }
        }
        return islands;
    }
    int[][] dirs = {{0,1}, {1,0}, {0, -1}, {-1, 0}};
    
    private void bfs(int i, int j, char[][] grid){
        grid[i][j] = '0';
        int row = grid.length;
        int col = grid[0].length;
        
        while(!dq.isEmpty()){
            int[] cur = dq.poll();
            
            for(int[] dir : dirs){
                int a = cur[0] + dir[0];
                int b = cur[1] + dir[1];
                
                if(a >= row || b >= col || a < 0 || b < 0 || grid[a][b] == '0'){
                    continue;
                }
                grid[a][b] = '0';
                dq.offer(new int[]{a, b});
            }
        }
        
    }
}
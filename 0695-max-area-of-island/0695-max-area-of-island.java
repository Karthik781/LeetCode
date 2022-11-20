class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        Deque<int[]> dq = new LinkedList<>();
        int maxArea = 0;
        
        for(int i = 0; i < grid.length; i++){
            for(int  j = 0; j < grid[0].length; j++){
               if(grid[i][j] == 1){
                    dq.offer(new int[]{i, j});
                    int area = bfs(grid, dq);
                    maxArea = Math.max(maxArea, area);
               }
            }
        }
        return maxArea;
    }
    
    int[][] dirs = new int[][]{{1,0}, {0, 1}, {-1, 0}, {0, -1}};
    private int bfs(int[][] grid, Deque<int[]> dq){
        int area = 1;
        
        while(!dq.isEmpty()){
            int[] cur = dq.poll();
            grid[cur[0]] [cur[1]] = 0;
            
            for(int[] dir : dirs){
                int x = cur[0] + dir[0];
                int y = cur[1] + dir[1];
                
                if(x >= 0 && y >= 0 && x < grid.length && y < grid[0].length && grid[x][y] == 1){
                    dq.offer(new int[]{x, y});
                    grid[x] [y] = 0;
                    area++;
                }
            }
        }
        return area;
    }
}
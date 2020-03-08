package cn.gdut.leetcode.sousuo.DFS;

/**
 * @ClassName FindCircleNum
 * @Desctiption 找朋友圈的个数
 * @Date 2020/3/8 10:15
 */
public class FindCircleNum {
    private int n;
    public int findCircleNum(int[][] M) {
        if (M == null || M.length == 0){
            return 0;
        }
        n = M.length;
        int cirNum = 0;
        // 访问标记数组
        boolean [] hasVisited = new boolean[n];
        for(int i = 0; i < M.length; i++){
            if (!hasVisited[i]){
                dfs(M, i, hasVisited);
                cirNum++;
            }
        }
        return cirNum;
    }
    private void dfs(int [][] M, int i, boolean [] hasVisited){
        // 标记访问
        hasVisited[i] = true;
        for (int k = 0; k < n; k++){
            if (M[i][k] == 1 && !hasVisited[k]){
                dfs(M,k,hasVisited);
            }
        }
    }
}

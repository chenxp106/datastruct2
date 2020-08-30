package cn.gdut.bishi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * @ClassName jingdong
 * @Desctiption TODO
 * @Date 2020/8/28 9:18
 */
public class jingdong {
    static int [] vis = new int[100];
    public static void main(String[] args) {
        int [] arr = solve();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(arr[n-1]);

    }

    private static int [] solve(){
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; arr.size() <= 1000; i++){
            dfs(0, i, arr);
        }
        int [] res = new int[arr.size()];
        for (int i  = 0; i < arr.size(); i++){
            res[i] = arr.get(i);
        }
        Arrays.sort(res);
        return res;
    }

    private static void dfs(int k, int n, List<Integer> arr){
        if (k == n){
            int val = 0;
            for (int i = 0;i < n; i++){
                val = val * 10 + vis[i];
            }
            arr.add(val);
            return;
        }

        vis[k] = 2;
        dfs(k+1, n, arr);
        vis[k] = 3;
        dfs(k + 1, n, arr);
        vis[k] = 5;
        dfs(k +1, n, arr);

    }
}
























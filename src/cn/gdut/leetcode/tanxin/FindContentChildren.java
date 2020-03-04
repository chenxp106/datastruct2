package cn.gdut.leetcode.tanxin;

import java.util.Arrays;

/**
 * @ClassName FindContentChildren
 * @Desctiption TODO
 * @Date 2020/3/4 9:24
 */
public class FindContentChildren {
    public int findContentChildren(int[] g, int[] s) {
        // 先对两个数组排序；
        Arrays.sort(g);
        Arrays.sort(s);
        int gi = 0, si = 0;
        while (gi <= g.length -1 && si <= s.length - 1) {
            if (g[gi] <= s[si]) {
                gi++;
            }
            si++;
        }
        return gi;
    }

    public static void main(String[] args) {
        int [] g = {1,2};
        int [] s = {1,2, 3};
        FindContentChildren findContentChildren = new FindContentChildren();
        System.out.println(findContentChildren.findContentChildren(g,s));
    }
}

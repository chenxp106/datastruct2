package cn.gdut.leetcode.tanxin;

/**
 * @ClassName CanPlaceFlowers
 * @Desctiption TODO
 * @Date 2020/3/6 9:41
 */
public class CanPlaceFlowers {
    public boolean canPlaceFlowers(int [] flowerbed, int n) {

        int cnt = 0;
        int len = flowerbed.length;
        for(int i = 0; i < len && cnt < n; i++) {
            // 如果种了树，continue
            if (flowerbed[i] == 1) {
                continue;
            }
            // 只有为0时，才考虑种树。条件表达式，处理第一个和最后一个元素
            int pre = flowerbed[i-1];
            int next = i == len - 1 ? 0 : flowerbed[i+1];
            // 只有前后都没有种树时，才种
            if (pre ==0 && next == 0){
                cnt++;
                // 种树
                flowerbed[i] = 1;
            }
        }
        // 种的树是否>=n;
        return cnt >= n;
    }
}

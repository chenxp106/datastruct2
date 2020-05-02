package cn.gdut.jianzhi;

/**
 * @Desctiption 数组中超过一半的数字
 * @Date 2019/11/22/022
 **/
public class Test39 {

    public int  MoreThanHalfNum_Solution(int [] array){
/*        if (array == null || array.length == 0){
            return 0;
        }
        // 标记第一个数
        int cnt = 1;
        int cur = array[0];
        int n = array.length;
        for (int i = 1 ;i < n;i++){
            // 小于等于0
            if (cnt <= 0){
                // 重新标记
                cur = array[i];
                cnt = 1;
            }
            //
            if (array[i] == array[i-1]){
                cnt++;
            }
            else {
                cnt--;
            }
        }
        cnt=0;
        // 统计个数
        for (int x : array){
            if (x == cur){
                cnt++;
            }
        }
        if (cnt <= n / 2){
            return 0;
        }
        return cur;*/

        if (array == null || array.length == 0){
            return 0;
        }
        int cnt = 1;
        int cur = array[0];
        for (int i = 1;i < array.length;i++){
            cnt = array[i] == cur ? cnt + 1 : cnt - 1;
            if (cnt == 0){
                cur = array[i];
                cnt = 1;
            }
        }
        cnt = 0;
        for (int x : array){
            if (x == cur){
                cnt++;
            }
        }
        return cnt > (array.length / 2 ) ? cur : 0;
    }
}

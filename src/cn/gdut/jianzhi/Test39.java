package cn.gdut.jianzhi;

/**
 * @Desctiption 数组中超过一半的数字
 * @Date 2019/11/22/022
 **/
public class Test39 {

    public int  MoreThanHalfNum_Solution(int [] array){
        if (array == null || array.length == 0){
            return 0;
        }
        // 个数
        int cnt = 1;
        // 当前的众数
        int cur = array[0];
        for (int i = 1;i < array.length;i++){
            if (cnt <= 0){
                cur = array[i];
                cnt = 1;
            }
            // 判断当前值是否相等
            if (array[i] == cur){
                cnt++;
            }
            else {
                cnt--;
            }
        }
        cnt=0;
        for (int x : array){
            if (x == cur){
                cnt++;
            }
        }
        if (cnt <= array.length / 2){
            return 0;
        }
        return cur;
    }
}

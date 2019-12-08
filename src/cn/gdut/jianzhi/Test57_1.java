package cn.gdut.jianzhi;

import java.util.ArrayList;

/**
 * @Desctiption TODO
 * @Date 2019/12/7/007
 **/
public class Test57_1 {
    public ArrayList<Integer> FindNumbersWithSum(int [] array, int sum){
        /*ArrayList<Integer> res = new ArrayList<>();
        if (array == null || array.length == 0){
            return res;
        }
        //
        // 用双指针
        int i = 0, j = array.length - 1;
        while (i < j){
            int tmp = array[i] + array[j];
            if (tmp == sum){
                // 如果res不为空，并且两数积比原来的积要小，则替换
                if (!res.isEmpty() && (res.get(0) * res.get(1) > array[i]*array[j])){
                    res.remove(0);
                    res.remove(1);
                    res.add(array[i]);
                    res.add(array[j]);
                }
                // 如果不为空，但是积并没有更小，则直接i--,j++
                else if (!res.isEmpty() && (res.get(0) * res.get(1) <= array[i]*array[j])){
                    i++;j--;
                    continue;
                }
                // 没有元素则，将新的元素添加进去
                else {
                    res.add(array[i]);
                    res.add(array[j]);

                }
                i++;
                j--;
            }
            else if (tmp > sum){
                j--;
            }
            else {
                i++;
            }
        }
        return res;*/

        ArrayList<Integer> ret = new ArrayList<>();
        if (array == null || array.length == 0){
            return ret;
        }
        int i = 0, j = array.length - 1;
        while (i < j){
            int tmp = array[i] + array[j];
            if (tmp > sum){
                j--;
            }
            else if (tmp < sum){
                i++;
            }
            // 相等
            else {
                ret.add(array[i]);
                ret.add(array[j]);
                return ret;
            }
        }
        return ret;
    }

    public static void main(String[] args) {
        Test57_1 test57_1 = new Test57_1();
        int [] a = {1,2,4,7,11,15};
        System.out.println(test57_1.FindNumbersWithSum(a, 15));
    }
}

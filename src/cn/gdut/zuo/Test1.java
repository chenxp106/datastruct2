package cn.gdut.zuo;

/**
 * @Desctiption TODO
 * @Date 2019/12/17/017
 **/
public class Test1 {


    public void sort(int [] nums, int L, int R, int num){
        int less = L - 1;
        int more = R + 1;
        int cur = L;
        while (cur < more){
            // 当前值小
            if (nums[cur] < num){
                swap(nums, ++less, cur++);
            }
            // 当前值更大，则需要与后面那个数交换,并且more往前移动
            else if (nums[cur] >= num){
                swap(nums, cur, --more);
            }
            // 相等情况，与前面的数交换
            else {
                cur++;
            }
        }
    }

    private void swap(int [] nums, int i, int j){
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }

    public static void main(String[] args) {
        Test1 test1 = new Test1();
        int [] a = {5,3,4,6,3,2,4,5,8,2};
        test1.sort(a, 0, a.length -1 , 4);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);

        }
    }
}

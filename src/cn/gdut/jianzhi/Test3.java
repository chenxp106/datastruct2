package cn.gdut.jianzhi;

public class Test3 {
    public boolean duplicate(int [] numbers, int length, int [] duplication){

        for (int i = 0;i< length;i++){
            // 如果不相等，
            while (i != numbers[i]){
                // 如果当前的值和后面的值相等,说明有重复元素
                if (numbers[i] == numbers[numbers[i]]){
                    duplication[0] = numbers[i];
                    return true;
                }
                // 不重复就交换元素
                swap(numbers, i, numbers[i] );
            }
        }
        return false;
    }

    private void swap(int [] nums, int i, int j){
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }

}

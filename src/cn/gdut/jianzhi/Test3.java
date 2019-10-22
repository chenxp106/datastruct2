package cn.gdut.jianzhi;

public class Test3 {
    public boolean duplicate(int [] numbers, int length, int [] dupcation){
        for (int i = 0;i<length;i++){
            while (numbers[i] != i){
                if (numbers[i] == i){
                    dupcation[0] = numbers[i];
                    return true;
                }
                swap(numbers, i, numbers[i]);
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

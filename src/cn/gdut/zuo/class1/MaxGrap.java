package cn.gdut.zuo.class1;

/**
 * 思路：
 * 1.长度为N，建立N+1个长度的桶。多出的一个桶是为了排除最大间隔在桶之间的情况
 * 2.将各个数放入到对应的桶中。并且每个桶中设置三个变量，是否访问，最大值，最小值
 * 3.从第二非空桶开始，计算当前桶的最小值和前一个桶的最大值之差，最为最大间隔。
 * @Desctiption 最大间隔
 * @Date 2019/12/21/021
 **/
public class MaxGrap {

//    private int maxGap(int [] nums){
//        if (nums == null || nums.length < 2){
//            return 0;
//        }
//        int len = nums.length;
//        int min = Integer.MAX_VALUE;
//        int max = Integer.MIN_VALUE;
//        // 遍历数组
//        for (int i = 0;i < nums.length; i++){
//            min = Math.min(min, nums[i]);
//            max = Math.max(max, nums[i]);
//        }
//        if (min == max){
//            return 0;
//        }
//        // 建立三个数组，N+1个桶。每个桶有三个信息，最大最小值和当前桶是否有元素
//        boolean [] hasNum = new boolean[len+1];
//        int [] maxs = new int[len+1];
//        int [] mins = new int[len+1];
//        // 第二趟遍历,将这些数放入到桶中
//        for (int i = 0 ;i < len; i++){
//            int bind = bucket(nums[i], len, max, min);
//            // 更新每个桶中的最大值和最小值
//            maxs[bind] = hasNum[bind] ? Math.max(maxs[bind], nums[i]) : nums[i];
//            mins[bind] = hasNum[bind] ? Math.min(mins[bind], nums[i]) : nums[i];
//            hasNum[bind] = true;
//        }
//        // 第三趟遍历。计算最大间隔数
//        int res = 0;
//        int lastMax = maxs[0];
//        for (int i = 1;i <= len; i++){
//            // 如果桶不为空
//            if (hasNum[i]){
//                // 将当前桶的最小值-最近桶的最大值
//                res = Math.max(mins[i] - lastMax, res);
//                // 更新上一个桶的最大值
//                lastMax = maxs[i];
//            }
//        }
//        return res;
//    }
//
//    /**
//     * 确定当前数属于哪个桶
//     * @param num 当前数
//     * @param len 数组的长度
//     * @param max 最大数
//     * @param min 最小数
//     * @return
//     */
//    private int bucket(int num, int len, int max, int min){
//        return (int)((num - min) * len / (max - min));
//    }

    private int  maxGap(int [] nums){
        if (nums == null || nums.length == 0){
            return 0;
        }
        int len = nums.length;
        // 找出最大值和最小值
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        if (max == min){
            return 0;
        }
        for (int i = 0 ;i < len; i++){
            max = Math.max(nums[i], max);
            min = Math.min(nums[i], min);
        }

        // 创建三个数组
        boolean [] hasNum = new boolean [len+1];
        int [] mins = new int[len+1];
        int [] maxs = new int[len+1];

        // 将数放到对应的桶中
        for (int i = 0; i < len;i++){
            int bind = load(nums[i], len, max, min);
            // 分别更新最大和最小值
            mins[bind] = mins[bind] != 0 ? Math.min(nums[i], mins[bind]) : nums[i];
            maxs[bind] = maxs[bind] != 0 ? Math.max(nums[i], maxs[bind]) : nums[i];
            hasNum[bind] = true;
        }
        // 第三次遍历
        int lastNum  = maxs[0];
        int res = 0;
        for (int i = 1; i <= len;i++){
            if (hasNum[i]){
                // 计算当前的最大值
                res = Math.max(res, mins[i] - lastNum);
                // 更新最大值
                lastNum = mins[i];
            }
        }
        return res;
    }

    private int load(int num, int len, int max , int min){
        return (int) ((num - min) * len /(max - min));
    }

    public static void main(String[] args) {
        MaxGrap maxGrap = new MaxGrap();
        int [] a = {2,4,6,1,4,2,43};
        System.out.println(maxGrap.maxGap(a));
    }

}

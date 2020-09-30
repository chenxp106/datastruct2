package cn.gdut.bishi;

import java.util.ArrayList;
import java.util.List;

public class jiaohang {
    public static void main(String[] args) {

        Integer [] a = {3,5,11,12};
        Integer[] prime = find_prime(a);
        for (int x : prime){
            System.out.println(x);
        }
    }

    public static Integer[] find_prime(Integer [] nums){
        List<Integer> list = new ArrayList<>();
        for (int x : nums){
            if (isPrime(x)){
                list.add(x);
            }
        }
        Integer [] res = new Integer[list.size()];
        int i = 0;
        for (Integer x : list){
            res[i++] = x;
        }
        return res;
    }

    // 判断素数
    private static boolean isPrime(int n){
        if(n < 2) {
            return false;
        }
        for(int i = 2; i < n; ++i){
            if(n%i == 0) {
                return false;
            }
        }
        return true;
    }
}

package cn.gdut.leetcode.sousuo.backtracking;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName RestoreIpAddresses
 * @Desctiption IP地址划分
 * "25525511135"
 * ["255.255.11.135", "255.255.111.35"]
 * @Date 2020/3/14 17:21
 */
public class RestoreIpAddresses {
    public List<String> eestoreIpAddresses(String s){
        List<String> ret = new ArrayList<>();
        if (s == null){
            return ret;
        }
        // 使用StringBuilder来接受字符
        StringBuilder tempAddress = new StringBuilder();
        // 调用回溯
        tracking(0, tempAddress, ret, s);
        return ret;
    }

    /**
     *
     * @param k ip的个数
     * @param tempAddress 临时的ip
     * @param addresses 结果集
     * @param s 输入的ip
     */
    private void tracking(int k, StringBuilder tempAddress, List<String> addresses, String s){
        if (k == 4 || s.length() == 0){
            // 分配完成，需要有四个数字，并且没有数字剩余
            if (k == 4 && s.length() == 0){
                // 将temp添加到集合中
                addresses.add(tempAddress.toString());
            }
            return;
        }
        // 从第一个字符开始遍历。最多可以两位数
        for (int i = 0; i < s.length() &&i <=2; i++){
            if (i != 0 && s.charAt(0) == '0'){
                break;
            }
            String part = s.substring(0, i + 1);
            if (Integer.valueOf(part) <= 255){
                // 从第二个ip开始，需要将中间的点加上
                if (tempAddress.length() != 0){
                    part = "." + part;
                }
                tempAddress.append(part);
                tracking(k+1, tempAddress, addresses, s.substring(i+1));
                tempAddress.delete(tempAddress.length() - part.length(), tempAddress.length());
            }
        }
    }

    public static void main(String[] args) {
        RestoreIpAddresses restoreIpAddresses = new RestoreIpAddresses();
        System.out.println(restoreIpAddresses.eestoreIpAddresses("25525511135"));
    }
}

















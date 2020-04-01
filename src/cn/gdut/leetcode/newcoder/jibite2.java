package cn.gdut.leetcode.newcoder;

import java.util.Scanner;

/**
 * @ClassName jibite2
 * @Desctiption TODO
 * @Date 2020/4/1 19:55
 */
public class jibite2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String [] s = null;
        s = sc.nextLine().split(" ");
        for (int i = 0; i < s.length; i++){
            System.out.println(s[i]);
        }
        int n = Integer.valueOf(s[1]);
        String str = s[0];

        int [] nums = new int[s.length];
        for (int i = )


        public List<List<Integer>> combinationSum(int[] candidates, int target) {
            List<List<Integer>> combinations = new ArrayList<>();
            backtracking(new ArrayList<>(), combinations, 0, target, candidates);
            return combinations;
        }

        private void backtracking(List<Integer> tempCombination, List<List<Integer>> combinations,
        int start, int target, final int[] candidates) {

            if (target == 0) {
                combinations.add(new ArrayList<>(tempCombination));
                return;
            }
            for (int i = start; i < candidates.length; i++) {
                if (candidates[i] <= target) {
                    tempCombination.add(candidates[i]);
                    backtracking(tempCombination, combinations, i, target - candidates[i], candidates);
                    tempCombination.remove(tempCombination.size() - 1);
                }
            }
        }

    }
}

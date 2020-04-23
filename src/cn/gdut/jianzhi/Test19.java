package cn.gdut.jianzhi;

public class Test19 {
    /**
     * 正则匹配
     * @param str
     * @param pattern
     * @return
     */
    public boolean match(char[] str, char [] pattern){
        if (str == null || pattern == null){
            return false;
        }

        return matchCore(str, 0, pattern, 0);
    }

    /**
     * 如果匹配串存在下一个字符，并且是 *
     *     如果字符串当前字符和模式串当前字符匹配，分三种情况
     *          1. 认为 * 前面的字符出现了0次，i不变 ，j + 2
     *          2. 认为 * 前面的字符出现了1次，i+1, j+1
     *          3. 认为 * 前面的字符出现了多次，i+1, j不变
     *      如果字符串当前字符和模式串不匹配，则
     *          认为 * 前面的字符出现了0次，i不变，j+2
     * 如果下一个字符不是 *
     *     如果字符串当前字符和模式串匹配，则
     *         匹配下一个字符，i+1, j+1
     *     如果不匹配
     *         返回false，不匹配
     */
    private boolean matchCore(char [] str, int strIndex, char [] pattern, int patternIndex){
        // 都到了末尾，说明匹配成功
        if (strIndex == str.length && patternIndex == pattern.length){
            return true;
        }
        // 如果模式串先到末尾，说明匹配不成功
        if (strIndex != str.length && patternIndex == pattern.length){
            return false;
        }
        // 如果下一个字符是 *
        if (patternIndex + 1 < pattern.length && pattern[patternIndex+1] == '*'){
            // 如果当前字符是匹配的
            if (strIndex != str.length && (str[strIndex] == pattern[patternIndex] || pattern[patternIndex] == '.')){
                return matchCore(str, strIndex, pattern, patternIndex + 2) ||
                        matchCore(str, strIndex + 1, pattern, patternIndex + 2) ||
                        matchCore(str, strIndex + 1, pattern, patternIndex);
            }
            // 如果当前字符不匹配，认为 * 前的字符出现0次
            else {
                return matchCore(str, strIndex, pattern, patternIndex + 2);

            }

        }

        // 如果下一个字符不是 *
        // 当前字符是匹配的
        if (strIndex != str.length && (str[strIndex] == pattern[patternIndex] || pattern[patternIndex] == '.')) {
            return matchCore(str, strIndex + 1, pattern, patternIndex + 1);
        }
        // 当前字符不匹配，直接返回false；
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        Test19 test19 = new Test19();
        char[] str1 = {'a','a','a'};
        char[] str2 = {'a','.','a'};
        System.out.println(test19.match(str1,str2));
    }
}
















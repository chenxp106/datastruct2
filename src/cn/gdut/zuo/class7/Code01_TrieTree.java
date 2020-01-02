package cn.gdut.zuo.class7;

/**
 * @Desctiption 前缀树
 * @Date 2019/12/30/030
 **/
public class Code01_TrieTree {

    public static class TrieNode{
        public int path;
        public int end;
        public TrieNode [] nexts;
        public TrieNode(){
            path = 0;
            end = 0;
            nexts = new TrieNode[26];
        }

        public static class Trie{
            private TrieNode root;
            public Trie () {
                // 头结点
                root = new TrieNode();
            }
            // 添加一个单词
            public void insert(String word){
                char[] chars = word.toCharArray();
                TrieNode node = root;
                int index = 0;
                for (int i = 0; i < chars.length; i++){
                    // 找到下标
                    index = chars[i] - 'a';
                    // 没有这条路,则新建一条路
                    if (node.nexts[index] == null){
                        node.nexts[index] = new TrieNode();
                    }
                    // node往下移动一格
                    node = node.nexts[index];
                    node.path++;
                }
                // 以这个结尾的单词数加1
                node.end++;
            }

            // 删除一个单词
            public void delete(String word){
                if (search(word) != 0){
                    char[]  chars = word.toCharArray();
                    TrieNode node = root;
                    int index = 0;
                    for (int i = 0; i < chars.length; i++){
                        index = chars[i] - 'a';
                        if (--node.nexts[index].path == 0){
                            node.nexts[index] = null;
                            return;
                        }
                        node = node.nexts[index];
                    }
                    node.end--;
                }

            }

            // 查找单词是否出现
            public int  search(String word){
                if (word == null){
                    return 0;
                }
                char[] chars = word.toCharArray();
                TrieNode node = root;
                int index = 0;
                for (int i = 0; i < chars.length;i++){
                    index = chars[i] - 'a';
                    if (node.nexts[index] == null){
                        return 0;
                    }
                    node = node.nexts[index];
                }
                return node.end;
            }
            // 找公共前缀'
            public int prefixNumber(String pre){
                if (pre == null){
                    return 0;
                }
                char[] chars = pre.toCharArray();
                int index = 0;
                TrieNode node = root;
                for (int i = 0;i < chars.length;i++){
                    index = chars[i] - 'a';
                    if (node.nexts[index] == null){
                        return 0;
                    }
                    node = node.nexts[index];
                }
                return node.path;
            }
        }

        public static void main(String[] args) {
            Trie trie = new Trie();
            System.out.println(trie.search("zuo"));
            trie.insert("zuo");
            System.out.println(trie.search("zuo"));
            trie.delete("zuo");
            System.out.println(trie.search("zuo"));
            trie.insert("zuo");
            trie.insert("zuo");
            trie.delete("zuo");
            System.out.println(trie.search("zuo"));
            trie.delete("zuo");
            System.out.println(trie.search("zuo"));
            trie.insert("zuoa");
            trie.insert("zuoac");
            trie.insert("zuoab");
            trie.insert("zuoad");
            trie.delete("zuoa");
            System.out.println(trie.search("zuoa"));
            System.out.println(trie.prefixNumber("zuo"));

        }
    }


}

package cn.gdut.zuo.class5;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

/**
 * @Desctiption 并查集
 * 时间复杂度：平均下来时间复杂度为O(1)
 * @Date 2019/12/30/030
 **/
public class Code01_UnionFind {

    public static class Data{

    }
    public static class UnionFindSet{
        // (Data_A,Data_B)表示A的父节点是B
        public HashMap<Data, Data> fatherMap;
        // 只有为代表节点才能是有效的
        public HashMap<Data, Integer> sizeMap;

        public UnionFindSet(List<Data> nodes){
            fatherMap = new HashMap<Data, Data>();
            sizeMap = new HashMap<Data, Integer>();
            makeSets(nodes);
        }

        private void makeSets(List<Data> nodes){
            fatherMap.clear();
            sizeMap.clear();
            for (Data node : nodes){
                fatherMap.put(node, node);
                sizeMap.put(node, 1);
            }
        }

        /**
         * 找代表节点
         * @param node
         * @return
         */
        private Data findHead(Data node){
            Data father = fatherMap.get(node);
            if (father != node){
                father = findHead(father);
            }
            // 放平操作
            fatherMap.put(node, father);
            return father;
        }

        /**
         * 找是否在用一个集合里
         * @param a
         * @param b
         * @return
         */
        public boolean isSameSet(Data a, Data b){
            return findHead(a) == findHead(b);
        }

        /**
         * 求集合
         * @param a
         * @param b
         */
        public void union(Data a, Data b){
            if (a == null || b == null){
                return;
            }
            Data aHead = findHead(a);
            Data bHead = findHead(b);
            if (aHead != bHead){
                int aSetSize = sizeMap.get(aHead);
                int bSetSize = sizeMap.get(bHead);
                if (aSetSize <= bSetSize){
                    fatherMap.put(aHead, bHead);
                    sizeMap.put(bHead, aSetSize+bSetSize);
                }
                else {
                    fatherMap.put(bHead,aHead);
                    sizeMap.put(aHead, aSetSize + bSetSize);
                }
            }
        }

    }
}

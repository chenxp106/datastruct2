package cn.gdut.category.hash.myhashmap;

/**
 * @ClassName TestMyHashMap
 * @Desctiption TODO
 * @Date 2020/5/20 8:24
 */
public class TestMyHashMap {
    public static void main(String[] args) {
        MyMap<String, Object> map = new MyHashMap<>();
        map.put("name", "zhangsan");
        map.put("age", 23);
        map.put("weight", 75);
        map.put(null, "zuozhen2");

        System.out.println(map.get("name"));
        System.out.println(map.get("age"));
        System.out.println(map.get("weight"));

        map.put("name", "zuozhen1");
        System.out.println(map.get("name"));

    }
}












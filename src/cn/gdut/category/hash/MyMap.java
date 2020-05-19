package cn.gdut.category.hash;

/**
 * @ClassName MyMap
 * @Desctiption TODO
 * @Date 2020/5/19 21:41
 */
public interface MyMap<K,V> {
    // 插入一个值
    V put(K key, V value);

    // 获取一个值
    V get(K key);

    interface Entry<K,V>{
        K getKey();

        V getValue();
    }
}





















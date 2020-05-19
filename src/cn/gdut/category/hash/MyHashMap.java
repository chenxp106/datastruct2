package cn.gdut.category.hash;

/**
 * @ClassName MyHashMap
 * @Desctiption TODO
 * @Date 2020/5/19 21:45
 */
public class MyHashMap<K, V> implements MyMap<K, V> {
    private static final int DEFAULT_INITIAL_CAPACITY = 16;
    private static final float DEFAULT_LOAD_FACTOR = 0.75f;
    private float loadFactor = 0;
    private int initCapacity = 0;
    private Entry<K, V> [] table = null;

    // 默认构造函数
    public MyHashMap(){
        this.loadFactor = DEFAULT_LOAD_FACTOR;
        this.initCapacity = DEFAULT_INITIAL_CAPACITY;
        table = new Entry[this.initCapacity];
    }

    // 自定义构造函数
    public MyHashMap(int initCapacity, float loadFactor){
        this.loadFactor = loadFactor;
        this.initCapacity = initCapacity;
        table = new Entry[this.initCapacity];
    }

    // 计算hashcode
    private int hash(K key){
        int h;
        return (key == null) ? 0 : Math.abs( (h = key.hashCode() )) ^ (h >>> 16);
    }

    @Override
    public V put(K key, V value) {
        return null;
    }

    @Override
    public V get(K key) {
        return null;
    }
}

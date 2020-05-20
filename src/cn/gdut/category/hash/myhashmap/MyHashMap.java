package cn.gdut.category.hash.myhashmap;

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
        // 确定下标
        int index = hash(key) % initCapacity;
        // table中有元素了。需要遍历
        if (table[index] != null){
            Entry<K, V> e = table[index];
            Entry<K, V> e2 = null;
            while (e != null){
                // 如果hash值相同，并且值也相同，则替换value
                if (hash(e.key) == hash(key) && e.key.equals(key)){
                    e.value = value;
                }
                //  遍历链表判断是否存在相同的key
                e2 = e;
                e = e.next;
            }
            // 如果不存在相同的key，则直接插到尾结点的后面
            e2.next = new Entry<>(key, value, null, index);
        }
        // 否则，没有元素，直接插入
        else {
            Entry<K, V> e = new Entry<>(key, value, null, index);
            table[index] = e;
        }

        return value;
    }

    @Override
    public V get(K key) {
        // 根据key，计算index
        int index = hash(key) % initCapacity;
        Entry<K, V> e = table[index];
        if (e == null){
            return null;
        }
        // 遍历链表，找到key
        while (e != null){
            if (e.key == null && key == null || hash(key) == hash(key) &&e.key.equals(key)){
                return e.value;
            }
            e = e.next;
        }

        return null;
    }

    class Entry<K,V> implements MyMap.Entry<K, V>{
        K key;
        V value;
        Entry<K,V> next;
        int index;

        Entry(K key, V val, Entry<K,V> next, int index){
            this.key = key;
            this.value = val;
            this.next = next;
            this.index = index;
        }

        @Override
        public K getKey() {
            return key;
        }

        @Override
        public V getValue() {
            return value;
        }

        public Entry<K, V> getNext(){
            return next;
        }
    }
}





















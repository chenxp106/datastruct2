package cn.gdut.other;


import java.util.HashMap;
import java.util.Iterator;

/**
 * @ClassName LRU
 * @Desctiption 使用HashMap和双链表实现
 * @Date 2020/3/21 22:10
 */
public class LRU<K, V> implements Iterable<K> {

    private Node head;
    private Node tail;
    private HashMap<K,Node> map;
    private int maxSize;

    private class Node{
        Node pre;
        Node next;
        K k;
        V v;
        public Node(K k, V v){
            this.k = k;
            this.v = v;
        }
    }

    public LRU(int maxSize){
        this.maxSize  = maxSize;
        this.map = new HashMap<>(maxSize * 4 / 3);

        head = new Node(null, null);
        tail = new Node(null, null);

        head.next = tail;
        tail.pre = head;
    }

    /**
     * 获取一个节点，同时将它放到链表的头部中。
     * @param key
     * @return 返回这个节点的V
     */
    private V get(K key){
        if (!map.containsKey(key)){
            return null;
        }
        Node node = map.get(key);
        unlink(node);
        appendHead(node);

        return node.v;
    }

    /**
     * 放入一个节点
     * @param key
     * @param value
     */
    public void put(K key, V value){
        // 如果包含这个key，则先脱离
        if (map.containsKey(key)){
            Node node = map.get(key);
            unlink(node);
        }
        // 新建一个节点放回到头部中
        Node node = new Node(key,value);
        map.put(key, node);
        appendHead(node);

        //如果大于最大长度，则在尾部删除一个节点
        if (map.size() > maxSize){
            // 先返回删除的节点，然后从hashmap中删除这个节点
            Node toRemove = removeTail();
            map.remove(toRemove.k);
        }

    }

    // 从尾部删除一个节点
    private Node removeTail(){
        Node node = tail.pre;

        Node pre = node.pre;
        tail.pre = pre;
        pre.next = tail;

        node.pre = null;
        node.next = null;
        return node;
    }

    /**
     * 从链表中脱离节点
     * @param node
     */
    private void unlink(Node node){
        Node pre = node.pre;
        Node next = node.next;

        pre.next = next;
        next.pre = pre;

        node.pre = null;
        node.next = null;
    }

    /**
     * 连接到头部
     * @param node
     */
    private void appendHead(Node node){
        Node next = head.next;
        node.next = next;
        next.pre = node;
        node.pre = head;
        head.next = node;
    }

    @Override
    public Iterator<K> iterator() {
        return new Iterator<K>() {
            private Node cur = head.next;

            @Override
            public boolean hasNext() {
                return cur != tail;
            }

            @Override
            public K next() {
                Node node = cur;
                cur = node.next;
                return cur.k;
            }
        };
    }

    public static void main(String[] args) {
        LRU<String, String> lru = new LRU<>(5);
        lru.put("1", "1");
        System.out.println(lru.head);
    }
}





























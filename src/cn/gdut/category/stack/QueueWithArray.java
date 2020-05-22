package cn.gdut.category.stack;

/**
 * @ClassName QueueWithArray
 * @Desctiption TODO
 * @Date 2020/5/22 10:06
 */
public class QueueWithArray {
    // 指向队头
    private int start;
    // 指向队尾
    private int end;
    // 队列中元素的个数
    private int size;
    private int [] arr;

    public QueueWithArray(int initialSize){
        if (initialSize < 0){
            throw new IllegalArgumentException("the initialSize is less than 0");
        }
        arr = new int[initialSize];
        start = 0;
        end = 0;
        size = 0;
    }

    // 添加一个元素
    public void push(int obj){
        if (size == arr.length){
            throw new ArrayIndexOutOfBoundsException("the queue is full");
        }
        size++;
        arr[end] = obj;
        // 如果end指向数组中最后一个位置，需要调到原来的位置，从头开始
        end = (end == arr.length - 1) ? 0 : end + 1;
    }

    //队列中出一个元素
    public int poll(){
        if (size == 0){
            throw new ArrayIndexOutOfBoundsException("the queue is empty");
        }
        size--;
        int temp  = start;
        start = (start == arr.length - 1) ? 0 : start + 1;
        return arr[start];
    }
}




















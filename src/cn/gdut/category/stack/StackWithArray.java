package cn.gdut.category.stack;

/**
 * @ClassName StackWithArray
 * @Desctiption 用数组实现栈
 * @Date 2020/5/22 9:59
 */
public class StackWithArray {
    private int [] arr;
    private int index;

    public StackWithArray(int iniitialSize){
        if (iniitialSize < 0){
            throw new IllegalArgumentException("the init size is less than 0");
        }
        arr = new int[iniitialSize];
        index = 0;
    }
    // 入栈
    public void push(int obj){
        if (index == arr.length){
            throw new ArrayIndexOutOfBoundsException(" the stack is full");
        }
        arr[index++] = obj;
    }

    // 出栈
    public int pop(){
        if (index == 0){
            throw new ArrayIndexOutOfBoundsException("the stack is empty");
        }
        return arr[--index];
    }

    // 获取stack顶元素
    public int peek(){
        if (index == 0){
            throw new ArrayIndexOutOfBoundsException(" the stack is empty");
        }
        return arr[index-1];
    }

}

















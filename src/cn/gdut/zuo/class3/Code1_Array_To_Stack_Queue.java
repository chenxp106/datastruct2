package cn.gdut.zuo.class3;

/**
 * @Desctiption TODO
 * @Date 2019/12/21/021
 **/
public class Code1_Array_To_Stack_Queue {
    public class ArrayStack {
        private Integer[] arr;
        private Integer size;

        public ArrayStack(int initSize){
            if (initSize < 0){
                throw new IllegalArgumentException(" The init size is less than 0");
            }
            arr = new Integer[initSize];
            size = 0;
        }

        // 进栈
        public void push(int obj){
            if (size == arr.length){
                throw new ArrayIndexOutOfBoundsException("The Stack is Full");
            }
            arr[size++] = obj;
        }

        public Integer pop (){
            if (size == 0){
                throw new ArrayIndexOutOfBoundsException(" The Stack is Empty");
            }
            return arr[--size];
        }
        public Integer peek(){
            if (size < 0){
                throw new ArrayIndexOutOfBoundsException("The Stack is Empty");
            }
            if (size == 0){
                return null;
            }
            return arr[size - 1];
        }
    }
}

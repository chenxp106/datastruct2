package cn.gdut.bishi;

import java.util.*;

public class xunlei {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.valueOf(sc.nextLine().trim());
        Set<String> set = new HashSet<>();
        Map<String,String> map = new HashMap<>();
        for (int i = 0;  i< n; i++){
            String str = sc.nextLine().trim();
            String[] s = str.split(" ");
            map.put(s[0], s[1]);
            set.add(s[0]);
            set.add(s[1]);
        }
        Deque<String> queue = new LinkedList<>();
        while (!map.isEmpty()){
            for (Iterator<Map.Entry<String, String>> itt = map.entrySet().iterator(); itt.hasNext();){
                Map.Entry<String, String> item = itt.next();
                String key = item.getKey();
                String value = item.getValue();

                if (queue.isEmpty()){
                    queue.add(key);
                    queue.add(value);
                    itt.remove();
                }else {
                    boolean flag = true;
                    String first = queue.getFirst();
                    String last = queue.getLast();
                    if (first != null){
                        if (first.equals(key) ){
                            queue.addFirst(value);
                            flag = false;
                        }
                        if (first.equals(value)){
                            queue.addFirst(key);
                            flag = false;
                        }
                    }
                    if (last!=null){
                        if (last.equals(key)){
                            queue.addLast(value);
                            flag = false;
                        }
                        if (last.equals(value)){
                            queue.addLast(key);
                            flag = false;
                        }
                    }
                    if (!flag){
                        itt.remove();
                    }
                }

            }
        }
        for (Iterator<String> it = queue.iterator(); it.hasNext();) {
            String key = it.next();
            System.out.println(key);
        }
    }
}


package iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(14);
        list.add(5);
        list.add(4);

        Iterator<Integer> it = list.iterator();

        while(it.hasNext()) {
            int value = it.next();
            System.out.println(value);
            if(value == 4) {
                it.remove();
            }
        }
//
//        for(Integer i : list) {
//            if(i == 4) {
//                list.remove(i);
//            }
//        }

        System.out.println(list);
    }
}
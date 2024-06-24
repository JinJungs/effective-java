package me.whiteship.chapter05.item30;

import java.util.Collection;
import java.util.List;
import java.util.Set;

public class recursiveTypeBound {
    public static <E extends Comparable<E>> E max(Collection<E> c) {
        if(c.isEmpty()) {
            throw new IllegalArgumentException("컬렉션이 비어 있습니다.");
        }
        E result = null;
        for(E e : c) {
            if(result == null || e.compareTo(result) > 0) {
                result = e;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Set<Integer> integers = Set.of(1, 2, 3, 4, 5);
        System.out.println(max(integers));

        List<String> strings = List.of("jute", "hemp", "nylon");
        System.out.println(max(strings));

        List<List<String>> lists = List.of(List.of("jute", "hemp", "nylon"));
        // System.out.println(max(lists));
    }
}

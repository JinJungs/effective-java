package me.whiteship.chapter05.item30;

import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ScheduledFuture;

public class recursiveTypeBound {
    // 기존 코드
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

    // 와일드 카드
    public static <E extends Comparable<? super E>> E maxWhildCard(Collection<? extends E> c) {
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
        // System.out.println(max(lists)); // List<String> 타입은 Comparable을 구현하지 않았기 때문에 컴파일 에러가 발생한다.

        // 와일드 카드
        List<ScheduledFuture<?>> scheduledFutures = List.of();
        // System.out.println(max(scheduledFutures)); // ScheduledFuture<?> 타입은 Comparable<ScheduledFuture> 대신 Comparable<Delayed>를 구현하고 있기 때문에 컴파일 에러가 발생한다.
        System.out.println(maxWhildCard(scheduledFutures));
    }
}

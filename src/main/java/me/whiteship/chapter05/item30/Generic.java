package me.whiteship.chapter05.item30;

import java.util.HashSet;
import java.util.Set;

public class Generic {

    public static void main(String[] args) {
        Set<String> guys = Set.of("Tom", "gary", "harry");
        Set<String> stooges = Set.of("larry", "moe", "curly");

        // 로타입
        Set<String> aflCio = union(guys, stooges);
        System.out.println(aflCio);

        // 제너릭
        Set<String> aflCioGeneric = unionGeneric(guys, stooges);
        System.out.println(aflCioGeneric);

        // 와일드카드
        Set<Integer> integers = Set.of(1, 3, 5);
        Set<Double> doubles = Set.of(2.0, 4.0, 6.0);
        Set<Number> numbers = unionWildcard(integers, doubles);
        System.out.println(numbers);
    }

    // 로타입 메서드
    public static Set union(Set s1, Set s2) {
        Set result = new HashSet(s1);
        result.addAll(s2);
        return result;
    }

    // 제너릭 메서드
    public static <E> Set<E> unionGeneric(Set<E> s1, Set<E> s2) {
        Set<E> result = new HashSet<>(s1);
        result.addAll(s2);
        return result;
    }

    // 아이템 31. 와일드카드
     public static <E> Set<E> unionWildcard(Set<? extends E> s1, Set<? extends E> s2) {
        Set<E> result = new HashSet<>(s1);
        result.addAll(s2);
        return result;
     }

}

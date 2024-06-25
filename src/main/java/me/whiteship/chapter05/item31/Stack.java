package me.whiteship.chapter05.item31;

import java.util.Collection;
import java.util.List;

public class Stack<E> {

    private E[] elements;

    public void pushAll(Iterable<? extends E> src) {
        for (E e : src) {
            push(e);
        }
    }

    public void push(E e) {

    }

    public void popAll(Collection<? super E> dst) {
        while (!isEmpty()) {
            dst.add(pop());
        }
    }

    private boolean isEmpty() {
        return elements.length == 0;
    }

    private E pop() {
        return null;
    }

    // 비한정적 타입 매개변수 사용
//    public static <E> void swap(List<E> list, int i, int j) {
//
//    }

    // 비한정적 와일드카드 사용
//    public static void swap(List<?> list, int i, int j) {
//        list.set(i, list.set(j, list.get(i)));
//    }

    // 실제 코드
    public static void swap(List<?> list, int i, int j) {
        swapHelper(list, i, j);
    }

    public static <E> void swapHelper(List<E> list, int i, int j) {
        list.set(i, list.set(j, list.get(i)));
    }

}

package me.whiteship.chapter01.item06;

public class Sum {
    private static long sum() {
        Long sum = 0L;
        for (long i = 0; i < Integer.MAX_VALUE; i++) {
            sum += i; // long -> Long 으로 오토박싱됨
        }
        return sum;
    }

    public static void main(String[] args) {
        long start = System.nanoTime();
        long x = sum();
        long end = System.nanoTime();
        System.out.println(end - start);
        System.out.println(x);
    }
}

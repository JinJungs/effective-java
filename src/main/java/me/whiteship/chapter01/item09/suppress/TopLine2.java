package me.whiteship.chapter01.item09.suppress;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TopLine2 {

    // 코드 9-3 try-with-resources - 자원을 회수하는 최선책!
    static String firstLineOfFile(String path) throws IOException {
        // BufferedReader 가 AutoCloseable 을 구현한다
        try (BufferedReader br = new BadBufferedReader(
                new FileReader(path))) {
            return br.readLine();
        }
    }

    public static void main(String[] args) throws IOException {
        System.out.println(firstLineOfFile("pom.xml"));
    }

//    Exception in thread "main" java.io.CharConversionException
//    at me.whiteship.chapter01.item09.suppress.BadBufferedReader.readLine(BadBufferedReader.java:17) // 첫번째 예외가 발생한 곳
//    at me.whiteship.chapter01.item09.suppress.TopLine2.firstLineOfFile(TopLine2.java:14)
//    at me.whiteship.chapter01.item09.suppress.TopLine2.main(TopLine2.java:19)
//    Suppressed: java.io.StreamCorruptedException
//    at me.whiteship.chapter01.item09.suppress.BadBufferedReader.close(BadBufferedReader.java:23) // 숨겨진 예외
//    at me.whiteship.chapter01.item09.suppress.TopLine2.firstLineOfFile(TopLine2.java:12)
//            ... 1 more
}

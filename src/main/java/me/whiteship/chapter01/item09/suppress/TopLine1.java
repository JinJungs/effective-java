package me.whiteship.chapter01.item09.suppress;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TopLine1 {

    // 코드 9-1 try-finally 더 이상 자원을 회수하는 최선의 방책이 아니다!
    static String firstLineOfFile(String path) throws IOException {
        BufferedReader br = new BadBufferedReader(new FileReader(path));
        try {
            return br.readLine();
        } finally {
            br.close(); // 기기에 물리적인 문제가 생긴다면 여기서도 예외가 발생할 수 있다
        }
    }

    public static void main(String[] args) throws IOException {
        System.out.println(firstLineOfFile("pom.xml"));
    }

//    Exception in thread "main" java.io.StreamCorruptedException
//    at me.whiteship.chapter01.item09.suppress.BadBufferedReader.close(BadBufferedReader.java:23)
//    at me.whiteship.chapter01.item09.suppress.TopLine1.firstLineOfFile(TopLine1.java:15)
//    at me.whiteship.chapter01.item09.suppress.TopLine1.main(TopLine1.java:20)

}

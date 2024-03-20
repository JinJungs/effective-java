package me.whiteship.chapter01.item09.trywithresource;

import java.io.*;

public class TopLine {

    // 코드 9-3 try-with-resources - 자원을 회수하는 최선책!
    static String firstLineOfFile(String path) throws IOException {
        // BufferedReader 가 AutoCloseable 을 구현한다
        try (BufferedReader br = new BufferedReader(
                new FileReader(path))) {
            return br.readLine();
        }
    }

    // 코드 9-5 try-with-resources 를 catch 절과 함께 쓰는 모습
    static String firstLineOfFile2(String path, String defaultVal) throws IOException {
        // BufferedReader 가 AutoCloseable 을 구현한다
        try (BufferedReader br = new BufferedReader(
                        new FileReader(path))) {
            return br.readLine();
        } catch (IOException e) {
            return defaultVal;
        }
    }

}

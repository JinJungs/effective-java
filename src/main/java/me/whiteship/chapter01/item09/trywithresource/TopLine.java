package me.whiteship.chapter01.item09.trywithresource;

import java.io.*;

public class TopLine {

    // 코드 9-3 try-with-resources - 자원을 회수하는 최선책!
    static String firstLineOfFile(String path, String defaultVal) throws IOException {
        // BufferedReader 가 AutoCloseable 을 구현한다
        try (BufferedReader br = new BufferedReader(
                        new FileReader(path))) {
            return br.readLine();
        } catch (IOException e) {
            return defaultVal;
        }
    }

}

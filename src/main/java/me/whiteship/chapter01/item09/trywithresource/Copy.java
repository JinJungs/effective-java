package me.whiteship.chapter01.item09.trywithresource;

import java.io.*;

public class Copy {

    private static final int BUFFER_SIZE = 8 * 1024;

    // 코드 9-4 복수의 자원을 처리하는 try-with-resources - 짧고 매혹적이다!
    static void copy(String src, String dst) throws IOException {
        // FileInputStream 가 AutoCloseable 을 구현한다
        try (InputStream in = new FileInputStream(src);
             OutputStream out = new FileOutputStream(dst)) {
            byte[] buf = new byte[BUFFER_SIZE];
            int n;
            while ((n = in.read(buf)) >= 0)
                out.write(buf, 0 ,n);
        }
    }
}

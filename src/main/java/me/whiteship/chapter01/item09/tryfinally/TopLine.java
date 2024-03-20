package me.whiteship.chapter01.item09.tryfinally;

import java.io.*;

public class TopLine {

    // 코드 9-1 try-finally 더 이상 자원을 회수하는 최선의 방책이 아니다!
    static String firstLineOfFile(String path) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(path));
        try {
            return br.readLine();
        } finally {
            br.close(); // 기기에 물리적인 문제가 생긴다면 여기서도 예외가 발생할 수 있다
        }
    }

}

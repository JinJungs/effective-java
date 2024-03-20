package me.whiteship.chapter01.item08.autocloseable;

import java.io.IOException;

public class App {
    public static void main(String[] args) {
        try(AutoCloseableIsGood good = new AutoCloseableIsGood()) {
            // TODO: 자원 반납 처리됨.
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

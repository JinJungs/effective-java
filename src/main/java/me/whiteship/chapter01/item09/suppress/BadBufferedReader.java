package me.whiteship.chapter01.item09.suppress;

import java.io.*;

public class BadBufferedReader extends BufferedReader {
    public BadBufferedReader(Reader in, int sz) {
        super(in, sz);
    }

    public BadBufferedReader(Reader in) {
        super(in);
    }

    @Override
    public String readLine() throws IOException {
//        return super.readLine();
        throw new CharConversionException();
    }

    @Override
    public void close() throws IOException {
//        super.close();
        throw new StreamCorruptedException();
    }
}
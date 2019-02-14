package com.siwoo.designpattern.decorator.io;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;

public class LowerCaseInputStream extends FilterInputStream {

    public LowerCaseInputStream(InputStream in) {
        super(in);
    }

    @Override
    public int read() throws IOException {
        int c = super.read();
        return c == -1 ? c : Character.toLowerCase((char) c);
    }

    @Override
    public int read(byte[] b, int off, int len) throws IOException {
        int result = super.read(b, off, len);
        for (int i = off; i < off + result; i++)
            b[i] = (byte) Character.toLowerCase((char) b[i]);
        return result;
    }

    public static void main(String[] args) throws IOException {
        int c;
        Path path = Paths.get(".", "test.txt");
        try (LowerCaseInputStream in = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream(path.toFile())))) {
            while ((c = in.read()) >= 0) {
                System.out.print((char) c);
            }
        }
    }
}

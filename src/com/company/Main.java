package com.company;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        String pathname="somthing";//use your path for file
        try(BufferedInputStream in = new BufferedInputStream(new FileInputStream(pathname))) {
            byte[] bbuf = new byte[4096];
            int len;
            while ((len = in.read(bbuf)) != -1) {
                // process data here: bbuf[0]  bbuf[len - 1]
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

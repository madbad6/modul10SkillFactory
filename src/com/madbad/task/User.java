package com.madbad.task;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class User {

    public static void writeForFile(File file, String login, String password) throws IOException {
        FileOutputStream fos = new  FileOutputStream(file);

        fos.write(login.getBytes(StandardCharsets.UTF_8));
        fos.write(":".getBytes(StandardCharsets.UTF_8));
        fos.write(password.getBytes(StandardCharsets.UTF_8));
    }

    public static StringBuilder getStringBuilder(File file) throws IOException {
        FileInputStream fis = new FileInputStream(file);

        int i;
        List list = new ArrayList();
        while ((i = fis.read()) != -1) {
            list.add((char) i);
        }

        StringBuilder builder = new StringBuilder(list.size());
        for(Object ch: list) {
            builder.append(ch);
        }
        builder.toString();
        return builder;
    }

    public static void splitStringForFile(StringBuilder builder) {
        String str = new String(builder);

        String[] sp = str.split(":");

        String sp1 = sp [0];
        String sp2 = sp [1];

        System.out.println(sp1);
        System.out.println(sp2);
    }
}

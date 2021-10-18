package com.madbad.solution;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class User {

    public static void writeForFile(File file, String login, String password) {
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(file);
            try {
                fos.write(login.getBytes(StandardCharsets.UTF_8));
                fos.write(":".getBytes(StandardCharsets.UTF_8));
                fos.write(password.getBytes(StandardCharsets.UTF_8));
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static StringBuilder getStringBuilder(File file) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        int i = 0;
        List list = new ArrayList();
        while (true) {
            try {
                if (!((i = fis.read()) != -1)) break;
            } catch (IOException e) {
                e.printStackTrace();
            }
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

package com.madbad.task;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        String login = scanner.nextLine();
        String pass = scanner.nextLine();

        File file = new File("user.txt");

        User user = new User();

        //сохраняем массив строк в файл
        user.writeForFile(file, login, pass);


        //получаем из файла массив чаров и сохраняем его в массив
        StringBuilder builder = user.getStringBuilder(file);


        //Сплититм полученную строку
        user.splitStringForFile(builder);

    }
}

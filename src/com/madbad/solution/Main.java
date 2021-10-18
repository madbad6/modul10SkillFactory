package com.madbad.solution;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String login = scanner.nextLine();
        String pass = scanner.nextLine();

        File file = new File("user.txt");

        User user = new User();

        //сохраняем массив строк в файл
        user.writeForFile(file, login, pass);


        //получаем из файла массив чаров и сохраняем его в массив
        StringBuilder builder = null;
        builder = user.getStringBuilder(file);


        //Сплититм полученную строку
        user.splitStringForFile(builder);

    }
}

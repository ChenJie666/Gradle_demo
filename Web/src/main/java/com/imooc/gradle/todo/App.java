package com.imooc.gradle.todo;

import java.util.Scanner;

/**
 * @author CJ
 * @date 2021/9/13 15:24
 */
public class App {
    public static void main(String[] args) {
        int i = 0;
        Scanner scanner = new Scanner(System.in);
        while (++i > 0) {
            System.out.println(i + ". please input item name");
            TodoItem item = new TodoItem(scanner.next());
            System.out.println(item);
        }
    }
}

package com.company;

import java.util.Scanner;

public class HomeworkEasy {
    public static void main(String[] args) {
    String message = "я сплю";
    Scanner scanner = new Scanner(System.in);
    String you_in = scanner.nextLine();
    if (you_in.length() != 0)
        System.out.println(message);
    else return;
    }

}

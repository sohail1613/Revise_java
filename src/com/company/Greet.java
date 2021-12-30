package com.company;

import java.util.Scanner;

public class Greet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String message = sc.nextLine();
//        String message = "Sohail is great";

        System.out.println("Hello zaid "+message);
    }
}

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Muhammad Alli
 */
package org.example;

import java.util.Scanner;


class App {
    public static void main(String[] args) {
        Scanner quote = new Scanner(System.in);
        System.out.println("What is the quote?");
        String Quote = quote.nextLine();
        System.out.println("Who said it?");
        Scanner speaker = new Scanner(System.in);
        String speeaker = speaker.nextLine();

        System.out.println(speeaker + " says, " + "\"" + Quote + "\"");
    }
}

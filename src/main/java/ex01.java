/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Chase Cutshall
 */

import java.util.Scanner;

public class ex01 {

        public static void main(String[] args) {
            Scanner user_input = new Scanner(System.in);

            String name;
            System.out.print(" Enter your Name:");

            name = user_input.next();

            System.out.println("Hello," + name +",nice to meet you!");
        }
    }


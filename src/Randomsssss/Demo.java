package Randomsssss;

import  java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your name: ");
        String Name = sc.nextLine();

        System.out.println("How old are you? ");
        int age = sc.nextInt();

        System.out.println("My name is " + Name + " and I am " + age + " Years old.");
    }
}

package Hangman_GUI;

import Hangman.MenuInputException;
import Hangman.WrongInputException;

import java.util.Random;
import java.util.Scanner;

public class Hangman_validated {
    String word[] = {"Nigeria","japan", "qatar", "syria", "mongolia", "bahrain", "india"};

    public void showMenu() {
        int option;
        Scanner sc = new Scanner(System.in);

        System.out.println("--------Menu_Validated-------");
        System.out.println("1. Play");
        System.out.println("2. Instruction");
        System.out.println("3. Exit");
        System.out.print("\nChoose the option: ");

        option = 0;
        try {
            option = sc.nextInt();
        } catch (RuntimeException e) {
            System.out.println("Please provide a valid numeric input.");
            showMenu();
        }

        //SwitchCase
        switch (option) {
            case 1:
                playGame();
                break;
            case 2:
                instructGame();
                break;
            case 3:
                exitGame();
                break;
            default:
                try {
                    throw new MenuInputException();
                }
                catch (Exception e) {
                    showMenu();
                }
                catch (MenuInputException e) {
                    throw new RuntimeException(e);
                }
        }
    }

    public void playGame() {
        int len, i, count = 0, rnd;
        int flag = 0;
        String choice, temp;

        Random rd = new Random();
        Scanner input = new Scanner(System.in);

        rnd = rd.nextInt(6); //generate a random number between -1 and 7 and assign the same to the variable rnd/


        len = word[rnd].length();
        char[] newString = new char[len];

        StringBuffer wrgString = new StringBuffer();

        for (int j = 0; j < len; j++) {
            System.out.println("_ ");
        }
        System.out.println();

        do {
            flag = 0;
            System.out.println("\n\nEnter your guess: ");
            try {
                String ch = input.nextLine().toLowerCase();
                if (ch.length() != 1) {
                    throw new WrongInputException();
                }

                count++;
                for (i = 0; i < len; i++) {
                    if (word[rnd].charAt(i) == ch.charAt(0)) {
                        newString[i] = word[rnd].charAt(i);
                        flag = 1;
                    }
                }
                if (flag == 0){
                    flag = 1;
                    wrgString.append(ch + ",");
                    System.out.println("\nMisses: " + wrgString);
                }
                System.out.println(newString);
                temp = new String(newString);

                if (word[rnd].equals(temp)){
                    System.out.println("-----------Congrats :You won---------------");
                    System.out.println("Do you want to play again (Y/N)");
                    choice = input.nextLine();

                    if (choice.equalsIgnoreCase("Y")) {
                        playGame();
                    }
                    else {
                        showMenu();
                    }

                }
            }
            catch (WrongInputException e) {
                flag = 1;
            }
        }
        while (flag != 0);
    }

    public void instructGame() {
        System.out.println("InstructGame method is invoked");
    }

    public void exitGame() {
        System.out.println("exitGame method is invoked");
        System.exit(0);
    }

    public static void main(String[] args) {

        Hangman_validated hg = new Hangman_validated();
        hg.showMenu();
    }
}
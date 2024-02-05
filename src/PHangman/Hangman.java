package PHangman;

import java.util.Scanner;

public class Hangman {

    public void showMenu() {
        int option;
        Scanner input = new Scanner(System.in);
        System.out.println("--------Menu_Validated-------");
        System.out.println("1. Instruction");
        System.out.println("2. Difficulty");
        System.out.println("3. Play");
        System.out.println("4. Exit");
        System.out.println("5. Scores");


        option = input.nextInt();
//        switch case
        switch (option){
            case 1: instructGame();
                    break;
            case 2: difficultyGame();
                    break;
            case 3: playGame();
                break;
            case 4: exitGame();
                    break;
            case 5: scoreGame();
                break;
            default:
                System.out.println("incorrect menu option");
                showMenu();

            System.out.println("Closing Scanner...");
            input.close();
            System.out.println("Scanner Closed.");
        }
    }

//Methods definition
    public void playGame(){
        System.out.println("playGAme method is invoked");
    }
    public void instructGame(){
        System.out.println("instructGame method is invoked");
    }
    public void difficultyGame(){
        System.out.println("difficultyGame method is invoked");
    }
    public void exitGame(){
        System.out.println("exitGame method is invoked");
    }
    public void scoreGame(){
        System.out.println("scoreGame method is invoked");
        System.exit(4);
    }
    public static void main(String[] args) {
        Hangman hg = new Hangman();
        hg.showMenu();
    }
}


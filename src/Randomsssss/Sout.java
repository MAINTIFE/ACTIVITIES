package Randomsssss;

import java.util.Scanner;

public class Sout {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Username: ");
        String UserName = sc.nextLine();

        System.out.println("Enter Password: ");
        String pass = sc.nextLine();

        if(UserName.equals("Student") && pass.equals("@12345")){
            System.out.println("Login Successful");
        }else{
            System.out.println("Invalid Login");
        }

    }
}

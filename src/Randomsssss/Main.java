package Randomsssss;

public class Main {
    public static void main(String[] args) {
        System.out.println("First line");
        System.out.println("Second line");
        System.out.println("Third line");
//

        try {
            int[] myIntArray = new int[]{1, 2, 3};
            print4thItemInArray(myIntArray);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("The array doesn't have four items!");
        }

        System.out.println("Fourth line");
        System.out.println("Fifth line");
    }
    private static void print4thItemInArray ( int[] arr){
        System.out.println(arr[3]);
    }
}
package es2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a integer between 0 and 3:");
        int n = Integer.parseInt(scanner.nextLine());
        writeNumber(n);
    }
    public static void writeNumber(int n){
        switch (n){
            case 0 -> System.out.println("Z E R O");
            case 1 -> System.out.println("O N E");
            case 2 -> System.out.println("T W O");
            case 3 -> System.out.println("T H R E E");
            default -> System.out.println("You chose an invalid number!");
        }
    }
}

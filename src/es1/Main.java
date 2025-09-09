package es1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
//        primo punto
        Scanner scanner= new Scanner(System.in);
        System.out.println("Type a word:");
        String word = scanner.nextLine();
        checkChars(word);
//        secondo punto
        System.out.println("Type a year:");
        int year = Integer.parseInt(scanner.nextLine());
        checkLeapYear(year);
        scanner.close();
    }

    public static void checkChars(String word){
        if (word.length()%2==0){
            System.out.println("The char number is even");
        } else {
            System.out.println("The char number is odd");
        }
    }

    public static void checkLeapYear(int year){
        if (year%100==0 && year%400==0){
            System.out.println("Is it a leap year");
        } else if (!(year%100==0) && year%4==0){
            System.out.println("Is it a leap year");
        } else {
            System.out.println("It is not a leap year");
        }
    }
}

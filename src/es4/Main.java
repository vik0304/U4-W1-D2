package es4;

import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to start the countdown:");
        int n = Integer.parseInt(scanner.nextLine());
        int nCount = n;
        for (int i=0; i<=n; i++){
            System.out.println(nCount);
            nCount--;
        }
    }
}

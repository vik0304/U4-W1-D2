package es3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Please insert a word/phrase:");
            String string = scanner.nextLine();
            if (string.equals(":q")){
                break;
            } else {
                int i=0;
                while(i<string.length()){
                    System.out.println(string.charAt(i));
                    i++;
                }
            }
        }
    }
}

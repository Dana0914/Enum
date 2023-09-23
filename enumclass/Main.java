package enumclass;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        do {
            System.out.print("Enter the season name: ");
            String userInput = scan.next();
            if (Seasons.SPRING.getNames().equalsIgnoreCase(userInput)) {
                System.out.println("You guessed it");
                break;
            } else if ("End".equalsIgnoreCase(userInput)) {
                System.out.println("Exit");
                break;
            } else {
                System.out.println("Please, try again");
            }
        } while (true);
    }
}

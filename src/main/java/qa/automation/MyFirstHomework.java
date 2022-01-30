package qa.automation;

import java.util.Scanner;

public class MyFirstHomework {

    public static void main(String[] args) {
        System.out.println("PLEASE ENTER YOUR FIRST NAME:");

        Scanner scanner = new Scanner(System.in);

        String firstName = scanner.next();

        System.out.println("PLEASE ENTER YOUR FAVOURITE HOBBY:");

        Scanner scanner1 = new Scanner(System.in);

        String yourHobby = scanner1.next();

        System.out.println("Your name is " + firstName +
                ". Your favourite hobby is " + yourHobby);

    }

}

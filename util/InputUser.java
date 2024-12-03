package util;

import java.util.Scanner;

public class InputUser {
    static Scanner scanner = new Scanner(System.in);

    public static String inputFromUser(String info) {
        System.out.print(info + " : ");
        return scanner.nextLine();
    }
}

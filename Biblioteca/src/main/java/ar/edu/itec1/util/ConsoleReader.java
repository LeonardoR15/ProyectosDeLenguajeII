package ar.edu.itec1.util;

import java.util.Scanner;

public class ConsoleReader {

    private static final Scanner scanner= new Scanner(System.in);
    public static String readString(){
        return scanner.nextLine();
    }

    public static Integer readInteger() { return scanner.nextInt(); }

}

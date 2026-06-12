package ar.edu.itec1.util;

import java.util.Scanner;

public class ConsoleReader {

    private static final Scanner scanner= new Scanner(System.in);
    // Lee una linea completa de texto desde consola.
    public static String readString(){
        return scanner.nextLine();
    }

    // Lee un numero entero y limpia el salto de linea pendiente.
    public static Integer readInteger() {
        Integer value = scanner.nextInt();
        scanner.nextLine();
        return value;
    }

}

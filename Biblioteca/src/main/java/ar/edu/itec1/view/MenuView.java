package ar.edu.itec1.view;

import ar.edu.itec1.util.ConsoleReader;

import java.awt.*;

public class MenuView {
 private Libro1View libro;
 private int opcion;

    public MenuView() {
        init();                 //constructor
    }

    private void init(){
     System.out.println("Iniciando MenuView");
     System.out.println("seleccione opcion");
     System.out.println("1. Crear ");
     System.out.println("2. Eliminar ");     //funcion init()
     System.out.println("3. Buscar ");
     System.out.println("4. Salir ");

     this.opcion = ConsoleReader.readInteger();
     seleccionarOpcion(opcion);
 }
    private void seleccionarOpcion(int opcion) {
        switch(opcion) {
            case 1:
                System.out.println("Opción 1");
                this.libro = new Libro1View();
                break;
                                                    //funcion init()
            case 2:
                System.out.println("Opción 2");
                MenuView menu = new MenuView();

                break;

            default:
                System.out.println("Opción inválida");
        }
    }


}
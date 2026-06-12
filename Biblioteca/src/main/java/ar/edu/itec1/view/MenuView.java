package ar.edu.itec1.view;

import ar.edu.itec1.repository.LibroRepository;
import ar.edu.itec1.service.LibroService;
import ar.edu.itec1.util.ConsoleReader;

public class MenuView {
 private final Libro1View libro;
 private final Libro2View eliminarLibroView;
 private final Libro3View buscarLibroView;
 private int opcion;

    public MenuView() {
        // Se crean una sola vez para compartir el mismo repositorio en todo el menu.
        LibroRepository libroRepository = new LibroRepository();
        LibroService libroService = new LibroService(libroRepository);
        this.libro = new Libro1View(libroService);
        this.eliminarLibroView = new Libro2View(libroService);
        this.buscarLibroView = new Libro3View(libroService);
        init();                 //constructor
    }

    private void init(){
     // El menu sigue ejecutandose hasta que el usuario elige salir.
     boolean seguir = true;

     while (seguir) {
         System.out.println(""); //simplemente un espacio para organizar la ejecución
         System.out.println("Iniciando MenuView");
         System.out.println("seleccione opcion");
         System.out.println("1. Crear ");
         System.out.println("2. Eliminar ");     //funcion init()
         System.out.println("3. Buscar ");
         System.out.println("4. Salir ");

         this.opcion = ConsoleReader.readInteger();
         seguir = seleccionarOpcion(opcion);
     }
 }
    private boolean seleccionarOpcion(int opcion) {
        switch (opcion) {
            case 1:
                System.out.println("Opción 1");
                this.libro.agregarLibro();
                return true;
                                                    //funcion init()
            case 2:
                System.out.println("Opción 2");
                this.eliminarLibroView.eliminarLibro();
                return true;
            case 3:
                System.out.println("Opción 3");
                this.buscarLibroView.buscarLibro();
                return true;
            case 4:
                System.out.println("Saliendo...");
                return false;

            default:
                System.out.println("Opción inválida");
                return true;
        }
    }
}

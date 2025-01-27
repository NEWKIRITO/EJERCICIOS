package Menus;

import Contacto.Contacto;
import java.util.Scanner;

public class Menu {

    Scanner scanner = new Scanner(System.in);
    int opcion = 0;

    Contacto contacto = new Contacto();

    public void menuPrincipal() {

        do {
            System.out.println("==================");
            System.out.println("1. Agregar tarea. ");
            System.out.println("2. Modificar tarea. ");
            System.out.println("3. Eliminar tarea. ");
            System.out.println("4. Mostrar tarea. ");
            System.out.println("==================");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1 -> {
                    contacto.agregar();
                }
                case 2 ->
                    System.out.println("2. Modificar tarea. ");
                case 3 ->
                    System.out.println("3. Eliminar tarea. ");
                case 4 -> {
                    System.out.println("4. Mostrar tarea. ");
                    contacto.mostrar();
                }
            }

        } while (opcion != 5);

    }

}

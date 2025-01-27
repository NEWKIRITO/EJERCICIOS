package Contacto;

import java.util.ArrayList;
import java.util.Scanner;

public class Contacto {

    Scanner scanner = new Scanner(System.in);

    public static ArrayList<String> contacto = new ArrayList<>();

    public void agregar() {
        System.out.println("Cuantas tareas desea ingresar. ");
        int cantidad = scanner.nextInt();

        for (int i = 0; i <= cantidad; i++) {

            System.out.println("Ingresa una tarea: ");
            Scanner agregarTarea = new Scanner(System.in);
            String tarea = agregarTarea.nextLine();

            contacto.add(tarea);
            System.out.println("La tarea se agregó correctamente");
        }
    }

    //El mostrar aun no funciona correctamente.
    public void mostrar() {
        System.out.println("La lista de tareas es: ");
        for (int i = 0; i <= contacto.size(); i++) {
            System.out.println(i + ". " + contacto.get(i));
        }
    }

}

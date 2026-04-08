import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        ListaEstatica misContactos = new ListaEstatica(5);

        int cantidadAInsertar = 3; // Llenamos 4 espacios para dejar 1 libre de prueba

        for (int i = 0; i < cantidadAInsertar; i++) {
            System.out.println("\n--- Registro " + (i + 1) + " ---");

            System.out.print("Nombre: ");
            String name = lector.next();

            System.out.print("Edad: ");
            int edad = lector.nextInt();

            Persona nueva = new Persona(name, edad);

            System.out.print("¿En qué posición deseas insertar? [0-" + misContactos.getTamActual() + "]: ");
            int p = lector.nextInt();

            if (misContactos.meterValorPosicion(nueva, p)) {
                System.out.println("Persona insertada correctamente.");
            } else {
                System.out.println("Error: No se pudo insertar (Lista llena o posición inválida).");
            }

            misContactos.mostrar();
        }

        System.out.println("\nELIMINACION");
        System.out.println("La lista actual tiene " + misContactos.getTamActual() + " elementos.");

        System.out.print("¿Qué posición deseas eliminar? [0-" + (misContactos.getTamActual() - 1) + "]: ");
        int posEliminar = lector.nextInt();

        if (misContactos.eliminaValorPosicion(posEliminar)) {
            System.out.println("Registro eliminado. Recorriendo elementos...");
        } else {
            System.out.println("Error: No se pudo eliminar (Posición inválida o lista vacía).");
        }

        System.out.println("\n--- Lista Final ---");
        misContactos.mostrar();
    }
}
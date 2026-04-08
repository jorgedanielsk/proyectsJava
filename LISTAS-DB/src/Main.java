import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        // Creamos una lista para 5 números
        ListaEstaticaBasica misNumeros = new ListaEstaticaBasica(5);

        int cantidadAInsertar = 3;

        System.out.println("===== FASE DE INSERCIÓN (Dato Básico) =====");
        for (int i = 0; i < cantidadAInsertar; i++) {
            System.out.println("\n--- Ingreso " + (i + 1) + " ---");

            System.out.print("Ingresa un número entero: ");
            int num = lector.nextInt();

            System.out.print("¿En qué posición deseas insertar? [0-" + misNumeros.getTamActual() + "]: ");
            int p = lector.nextInt();

            if (misNumeros.meterValorPosicion(num, p)) {
                System.out.println("¡Éxito! Número insertado.");
            } else {
                System.out.println("Error: No se pudo insertar.");
            }

            misNumeros.mostrar();
        }

        System.out.println("\n===== FASE DE ELIMINACIÓN =====");
        System.out.print("¿Qué posición deseas eliminar? [0-" + (misNumeros.getTamActual() - 1) + "]: ");
        int posEliminar = lector.nextInt();

        if (misNumeros.eliminaValorPosicion(posEliminar)) {
            System.out.println("¡Éxito! Número eliminado. Recorriendo elementos...");
        } else {
            System.out.println("Error: No se pudo eliminar.");
        }

        System.out.println("\n--- Lista Final ---");
        misNumeros.mostrar();
    }
}
import java.util.Scanner;

public class Ejercicio2QuitarEspacios {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("ELIMINAR ESPACIOS EN BLANCO ");
        System.out.print("Ingrese una cadena de texto: ");
        String cadena = scanner.nextLine();


        String resultado = cadena.replaceAll("\\s", "");

        System.out.println("Cadena original: [" + cadena + "]");
        System.out.println("Cadena sin espacios: [" + resultado + "]");

        scanner.close();
    }
}
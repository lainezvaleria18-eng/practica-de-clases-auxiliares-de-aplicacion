import java.util.Scanner;

public class Ejercicio4EliminarPalabra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" FORMATO: ELIMINAR ÚLTIMA PALABRA ");
        System.out.print("Ingrese una frase: ");
        String cadena = scanner.nextLine();

        if (cadena.trim().isEmpty()) {
            System.out.println("La cadena está vacía.");
        } else {
            String resultado = eliminarUltimaPalabra(cadena);
            System.out.println("Resultado: " + resultado);
        }

        scanner.close();
    }

    public static String eliminarUltimaPalabra(String texto) {
        texto = texto.trim();
        int ultimoEspacio = texto.lastIndexOf(' ');

        if (ultimoEspacio == -1) {
            return "";
        }

        return texto.substring(0, ultimoEspacio);
    }
}
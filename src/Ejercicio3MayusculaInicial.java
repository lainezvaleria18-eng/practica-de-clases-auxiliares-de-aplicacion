import java.util.Scanner;

public class Ejercicio3MayusculaInicial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" FORMATO CAPITULAR / TÍTULO ");
        System.out.print("Ingrese una cadena: ");
        String cadena = scanner.nextLine();

        if (cadena.trim().isEmpty()) {
            System.out.println("La cadena está vacía.");
        } else {
            String resultado = convertirFormatoTitulo(cadena);
            System.out.println("Resultado: " + resultado);
        }

        scanner.close();
    }


    public static String convertirFormatoTitulo(String texto) {

        String[] palabras = texto.split(" ");
        StringBuilder sb = new StringBuilder();

        for (String palabra : palabras) {
            if (!palabra.isEmpty()) {

                sb.append(Character.toUpperCase(palabra.charAt(0)))
                        .append(palabra.substring(1))
                        .append(" ");
            } else {

                sb.append(" ");
            }
        }

        return sb.toString().trim();
    }
}

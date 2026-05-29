import java.util.Scanner;

public class Ejercicio6Palindromo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" VALIDADOR DE PALÍNDROMOS ");
        System.out.print("Ingrese una palabra o frase: ");
        String cadena = scanner.nextLine();

        if (cadena.trim().isEmpty()) {
            System.out.println("La cadena está vacía.");
        } else {
            boolean esPalindromo = verificarPalindromo(cadena);
            if (esPalindromo) {
                System.out.println("Resultado: ¡Sí es palíndroma!");
            } else {
                System.out.println("Resultado: No es palíndroma.");
            }
        }

        scanner.close();
    }

    public static boolean verificarPalindromo(String texto) {

        String limpio = texto.replaceAll("\\s+", "").toLowerCase();

        StringBuilder invertido = new StringBuilder(limpio);
        invertido.reverse();

        return limpio.equals(invertido.toString());
    }
}
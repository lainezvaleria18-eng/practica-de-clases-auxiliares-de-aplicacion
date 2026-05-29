import java.util.Scanner;

public class Ejercicio5ContarA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" CONTADOR DE VOCALES 'A' ");
        System.out.print("Ingrese una cadena: ");
        String cadena = scanner.nextLine();

        if (cadena.trim().isEmpty()) {
            System.out.println("La cadena está vacía.");
        } else {
            int resultado = contarVocalA(cadena);
            System.out.println("Resultado: La vocal 'A' aparece " + resultado + " veces.");
        }

        scanner.close();
    }

    // Método estático dentro del mismo archivo
    public static int contarVocalA(String texto) {
        int contador = 0;
        String textoMinuscula = texto.toLowerCase();

        for (int i = 0; i < textoMinuscula.length(); i++) {
            char letra = textoMinuscula.charAt(i);
            // Contamos 'a' normales y con tilde por si acaso
            if (letra == 'a' || letra == 'á') {
                contador++;
            }
        }
        return contador;
    }
}
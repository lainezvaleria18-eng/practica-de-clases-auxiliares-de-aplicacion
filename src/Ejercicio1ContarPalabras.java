import java.util.Scanner;

public class Ejercicio1ContarPalabras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" CONTADOR DE PALABRAS ");
        System.out.print("Ingrese una frase: ");
        String frase = scanner.nextLine().trim();


        if (frase.isEmpty()) {
            System.out.println("La cantidad de palabras es: 0");
        } else {

            String[] palabras = frase.split("\\s+");
            System.out.println("La cantidad de palabras es: " + palabras.length);
        }

        scanner.close();
    }
}
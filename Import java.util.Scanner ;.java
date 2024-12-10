import java.util.Scanner;

public class Exercise1 {
    public static void printNumbers(int numero) {
        if (numero % 2 == 0) {
            for (int i = numero; i >= 0; i -= 2) {
                System.out.println(i);
            }
        } else {
            for (int i = numero; i >= 1; i -= 2) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Escribe el numero: ");
        int numero = scanner.nextInt();
        printNumbers(numero);
        scanner.close();
    }
}
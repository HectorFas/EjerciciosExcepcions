import java.util.Scanner;


class HolaException extends Exception {}


public class Main {
    static void imprimePositivo(int p) throws HolaException {
        if (p < 0) {
            throw new HolaException();
        }

        System.out.println(p);
    }

    static void imprimeNegativo(int n) throws Exception {
        if (n >= 0) {
            throw new Exception();
        }

        System.out.println(n);
    }



    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        for (;;) {
            System.out.println("Escriba dos números");
            int p = scanner.nextInt();
            int n = scanner.nextInt();

            try {
                imprimePositivo(p);

                imprimeNegativo(n);
                break;
            } catch (Exception e) {
                System.out.println("Pon un número correcto");
                System.out.println(" (El primer número debe ser positio, el segundo negativo) ");
                System.out.println();
            }
        }

        System.out.println("WELL DONE");


    }
}
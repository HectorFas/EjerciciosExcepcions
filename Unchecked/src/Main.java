import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
class Uncheked {
    Scanner scanner = new Scanner(System.in);

    void Punto1() {
        try {
            int a = scanner.nextInt();
            System.out.println("Valor introducido " + a);
        } catch (InputMismatchException e) {
            System.out.println("Valor introducido incorrecto");
        }
    }

    void Punto2() {
        try {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            System.out.println(a/b);
        } catch (InputMismatchException e) {
            System.out.println("Se ha introducido un tipo de valor incorrecto");
        } catch (ArithmeticException e){
            System.out.println("Número o valor no valido");
        }
    }

    void Punto3() {
        double[] a = new double[5];
        for (int i = 0; i < a.length ; i++) {
            try {
                a[i] = scanner.nextInt();
            }  catch (InputMismatchException e) {
                System.out.println("Se ha introducido un tipo de valor incorrecto");
            } catch (ArithmeticException e){
                System.out.println("Número o valor no valido");
            }
        }
    }

    void Punto4() {
        Random random = new Random();

        int[] a = new int[random.nextInt(100)+1];
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(10)+1;
        }

        System.out.println("Que posicion?");
        while(true) {
            try {
                int pos = scanner.nextInt();
                if (pos < 0) break;

                System.out.println(a[pos]);
            }  catch (InputMismatchException e) {
                scanner.next();
                System.out.println("Se ha introducido un tipo de valor incorrecto");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Introduce una posicion valida ( 1 a 10)");
            }
        }
    }

}


public class Main {
    public static void main(String[] args) {
        Uncheked uncheked = new Uncheked();

        uncheked.Punto4();


    }
}
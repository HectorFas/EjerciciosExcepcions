import java.util.Scanner;
class Dividir0Exception extends Exception {}
class ContertirException extends Exception {}


class Main {
    public static void checkTheCode(String input) throws Dividir0Exception, ContertirException {

            try {
                int divResult, multResult;

                int number = Integer.parseInt(input);
                divResult = 22 / number;

                multResult = 0 * number;

                System.out.println("Estos son los resultados: " + multResult + divResult);

            } catch (ArithmeticException e) {
                throw new Dividir0Exception();
            } catch (NumberFormatException e) {
                throw  new ContertirException();
            }
    }


    public static void main(String[] args) {

        try {
            checkTheCode(new Scanner(System.in).next());
        } catch (Dividir0Exception e) {
            throw new RuntimeException(e);
        } catch (ContertirException e) {
            throw new RuntimeException(e);
        }

    }
}

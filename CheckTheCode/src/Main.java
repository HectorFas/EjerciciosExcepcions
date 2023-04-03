import java.util.Scanner;
class Dividir0Exception extends RuntimeException {
    Dividir0Exception (String message){
        super(message);
    }
}


class Main {
    public static void checkTheCode(String input) {
        int divResult, multResult;
        int number = Integer.parseInt(input);
        if (number == 0) {
            divResult = 0;
            throw new Dividir0Exception("No se puede divir un número por 0");
        } else {
            divResult = 22 / number;
        }
        multResult = 0 * number;
        System.out.println("Estos son los resultados: " + multResult + divResult);
    }


    public static void main(String[] args) {
        checkTheCode(new Scanner(System.in).next());
    }
}

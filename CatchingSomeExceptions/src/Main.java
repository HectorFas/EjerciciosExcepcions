import java.util.Arrays;

public class Main {


    private static String array = null;


    public static void methodCatchingSomeExceptions() {
        try {
            methodThrowingExceptions();
        } catch (NullPointerException errorNull) {
            System.out.println("Error: NullPointerException");
            System.out.println();
        } catch (ArrayIndexOutOfBoundsException errorBounds) {
            System.out.println("Error: ArrayIndexOutOfBounds");
            System.out.println();
        } catch (NumberFormatException errorFormat) {
            System.out.println("Error: NumberFormatException");
            System.out.println("Ni idea de lo que hace la verdad...");
            System.out.println();
        }

    }


    public static void methodThrowingExceptions() {
        int[] integers = Arrays.stream(array.split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        if (integers[0] + integers[1] == integers[2]) {
            integers = null;
        } else if (integers[1] + integers[2] == integers[3]) {
            integers = new int[]{};
        }
        int sum = 0;
        for (int i : integers) {
            sum += i;
        }
        int meanValue = sum / integers.length;
        if (integers[2] == integers[3]) {
            String string = (String) (Object) integers[3];
            System.out.print("Some value is " + string);
        }
        System.out.print("Mean is " + meanValue);
    }




    public static void main(String[] args) {
        array = "1 2";
        try {
            methodCatchingSomeExceptions();
        } catch (Exception e) {
            System.out.println("Esto NO se deberia imprimir: " + e.getClass().getName());
        }


        array = "5 3 ?? 6 5";
        try {
            methodCatchingSomeExceptions();
        } catch (Exception e) {
            System.out.println("Esto NO se deberia imprimir: " + e.getClass().getName());
        }


        array = "1 2 3 6 1 4";
        try {
            methodCatchingSomeExceptions();
        } catch (Exception e) {
            System.out.println("Esto NO se deberia imprimir: " + e.getClass().getName());
        }


        array = "0 3 4 7 1 4";
        try {
            methodCatchingSomeExceptions();
        } catch (Exception e) {
            System.out.println("Esto SI se deberia imprimir: " + e.getClass().getName());
        }


        array = "0 3 7 7 1 4";
        try {
            methodCatchingSomeExceptions();
        } catch (Exception e) {
            System.out.println("Esto SI se deberia imprimir: " + e.getClass().getName());
        }


        array = "3 10 2 45 13 24";
        try {
            methodCatchingSomeExceptions();
        } catch (Exception e) {
            System.out.println("Esto NO se deberia imprimir: " + e.getClass().getName());
        }
    }
}

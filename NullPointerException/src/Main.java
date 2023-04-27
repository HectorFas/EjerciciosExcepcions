import java.util.Scanner;

class Student {
    String name;
}

class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student student = new Student();

        student.name = scanner.nextLine();
            try {
                System.out.println(student.name.length());

            } catch (NullPointerException e ) {
                System.out.println("Students name is null");
            }
    }
}
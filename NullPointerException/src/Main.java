import java.util.Scanner;

class Student {
    String name;

    public Student(String name) {
        this.name = name;
    }
}

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student estudiante = new Student(scanner.next());
        System.out.println(estudiante.name.length());
    }
}

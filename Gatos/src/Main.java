import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Gato {
    String nombre;
    int edad;

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }
    public void setNombre(String nombre) throws Exception {
        if (nombre.length() < 3) {
            throw new Exception();
        }
        this.nombre = nombre;
    }

    public void setEdad(int edad) throws Exception{
        if (edad < 0) {
            throw new Exception();
        }
        this.edad = edad;
    }

    public Gato(String nombre, int edad) throws Exception {
        if (nombre.length() < 3) {
            throw new Exception();
        }
        this.nombre = nombre;
        if (edad < 0) {
            throw new Exception();
        }
        this.edad = edad;
    }

    public void imprimir() {
        System.out.println("El nombre es:  " + getNombre());
        System.out.println("El edad es:  " + getEdad());
    }


    void parteUnoEjercicio() {
        Scanner scanner = new Scanner(System.in);
        try {

            Gato gato = new Gato("Bartolo", 3);

            System.out.println("El nombre del gato es: " + gato.nombre);
            System.out.println("La edad del gato es: " + gato.edad);

            for (;;) {
                System.out.println("Cambia el nombre y edad del gato: ");

                String nuevoNombre = scanner.next();
                int nuevaEdad = scanner.nextInt();
                gato.setNombre(nuevoNombre);
                gato.setEdad(nuevaEdad);

                System.out.println("El nombre del gato ahora es es: " + gato.nombre);
                System.out.println("La edad del gato ahora es: " + gato.edad);
            }
        } catch (Exception e) {
            System.out.println("Alguno de los valores introducidos era incorrecto");
            System.out.println("(El nombre debe contener más de 2 letras y la edad positiva)");
        }
    }


}

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        List<Gato> gatos = new ArrayList<>();
        System.out.println("Escribe el nombre y edad de 5 gantos");
        for(;;) {
            try {
                for (int i = 0; i < 5; i++) {
                    System.out.println("Ponle nombre al gato número " + (i+1) + ": ");
                    String nombre = scanner.next();
                    int edad = scanner.nextInt();
                    gatos.add(new Gato(nombre, edad));
                }
                System.out.println("Los gatos son los siguientes: ");
                for (int i = 0; i < 5; i++) {
                    System.out.println("El nombre del gato número " + (i+1) + " es " + gatos.get(i).nombre + " y tiene " + gatos.get(i).edad + " años");
                }
                break;
            } catch (Exception e) {
                System.out.println("Alguno de los valores introducidos era incorrecto");
                System.out.println("(El nombre debe contener más de 2 letras y la edad deber ser positiva )");
                System.out.println();
            }

        }




    }
}
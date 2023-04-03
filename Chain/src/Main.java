import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class Fichero {
    void abrir() throws FileNotFoundException {

            new Scanner(new File("dfs"));

    }
}


class Leer {
    void leer() throws FileNotFoundException {
            new Fichero().abrir();
    }
}

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        new Leer().leer();

    }
}
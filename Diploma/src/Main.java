import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class ErrorMediaException extends Exception {
    ErrorMediaException(String message) {
        super(message);
    }
}

class FalloArrayException extends  Exception {
    FalloArrayException(String message) {
        super(message);
    }
}

class ErrorNegativoException extends Exception {
    ErrorNegativoException(String message) {
        super(message);
    }
}

class Diploma {
    static String generar() throws ErrorMediaException, FalloArrayException , ErrorNegativoException{
        float media = Calificador.calcularMedia();


        if (media < 5) {
            throw new ErrorMediaException("Media insuficiente");
        }
        return "DIPLOMA DE PROGRAMADOR. Nota media: " + media;
    }
}


class Calificador {
    static float calcularMedia() throws FalloArrayException , ErrorNegativoException{

        List<Float> notas = Notas.leer();


        if (notas.size() == 0) {
            throw new FalloArrayException("No hay notas");
        }
        float suma = 0;
        for(Float nota : notas) {
            suma += nota;
        }
        return suma / notas.size();
    }
}


class Notas {
    static List<Float> leer() throws ErrorNegativoException {
        Scanner scanner = new Scanner("");
        List<Float> notas = new ArrayList<>();
        while(scanner.hasNext()) {
            float nota = scanner.nextFloat();
            if (nota < 0) {
                throw new ErrorNegativoException("Error: Hay un número negativo");
            }
            notas.add(nota);
        }
        return notas;
    }
}

class Main {
    public static void main(String[] args) {

        try {
            String diploma = Diploma.generar();
            System.out.println(diploma);
        } catch (ErrorNegativoException e) {
            System.out.println("Fallo al culacular la media" + e);
        } catch (ErrorMediaException e) {
            System.out.println("No se ha imprimido el diploma: ");
            System.out.println(e);
        } catch (FalloArrayException e) {
            System.out.println("Error ª ocurrido un herror al calcular la media: " + e);
        }
    }
}






//
//
//class Diploma {
//    static String generar(float media) {
//        if (media < 5f){
//            throw new ErrorMediaException("Media insuficiente");
//        } else {
//            return "DIPLOMA DE PROGRAMADOR. Nota media: " + media;
//        }
//    }
//}
//
//class Calificador {
//    static float calcularMedia(List<Float> notas) {
//        float suma = 0;
//        if (notas.size() != 0) {
//            for(Float nota : notas) {
//                suma += nota;
//            }
//            return suma / notas.size();
//        } else {
//            throw new FalloArrayException("No se encuentran las notas");
//        }
//    }
//}
//
//class Notas {
//    static List<Float> leer(){
//        Scanner scanner = new Scanner("3,5 7,2 -9,4"); // System.in, new File("notas.txt"), ...
//
//        List<Float> notas = new ArrayList<>();
//        while(scanner.hasNext()) {
//            float nota = scanner.nextFloat();
//            if (nota >= 0) {
//                notas.add(nota);
//            } else {
//                throw new ErroNegativoException("Error: Una de las notas es negativa");
//            }
//        }
//        return notas;
//    }
//}
//
//
//class Main {
//    public static void main(String[] args) {
//        try {
//            List<Float> notas = Notas.leer();
//
//            float media = Calificador.calcularMedia(notas);
//
//            String diploma = Diploma.generar(media);
//
//            System.out.println(diploma);
//
//        } catch (ErrorMediaException | ErroNegativoException | FalloArrayException e) {
//            System.out.println(e);
//        }
//    }
//}


class NoEsUnNumeroException extends Exception {}
class NumeroException extends Exception {}

class Ejercicio3 {

}

class Main {
    public static void main(String[] args)  {
        try {

        } catch (NoEsUnNumeroException e){
            throw new RuntimeException();
        }
    }
}




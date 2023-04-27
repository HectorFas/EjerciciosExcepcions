class PositivoNegativo {

    void imprimePositivo(int p){
        if (p >= 0) {
            System.out.println(p);
        } else {
            throw new RuntimeException();
        }
    }
    void imprimeNegativo(int n){
        if (n < 0) {
            System.out.println(n);
        } else {
            throw new RuntimeException();
        }
    }

}

public class Main {
    public static void main(String[] args) {


    }
}





public class Main {

    public static String concatStrings(String str1, String str2) {
        try {
            if (str1 == null && str2 == null) {
                return "";
            } else if (str1 == null) {
                return str2;
            } else if (str2 == null) {
                return str1;
            }
        } catch (NullPointerException errorNull) {

        }
        return str1.concat(str2);
    }



    public static void main(String[] args) {
        System.out.println("1:" + concatStrings("hola", "adios"));
        System.out.println("2:" + concatStrings("hola", "null"));
        System.out.println("3:" + concatStrings("null", "adios"));
        System.out.println("4:" + concatStrings("null", "null"));
        System.out.println("5:" + concatStrings("hola", null));
        System.out.println("6:" + concatStrings(null, "adios"));
        System.out.println("7:" + concatStrings(null, null));
    }
}

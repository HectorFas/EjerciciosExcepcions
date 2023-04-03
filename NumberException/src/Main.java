


class Main {
    public static void main(String[] args)  {
        try {
            String s = "ten";
            int n = Integer.parseInt(s);
            System.out.println(n);
            n += 20;
            System.out.println(n);
        } catch (NumberFormatException e){
            System.out.println("No se ha podido convertir el número");
        }
    }
}




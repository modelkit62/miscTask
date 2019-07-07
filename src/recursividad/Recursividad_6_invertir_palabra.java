package recursividad;

public class Recursividad_6_invertir_palabra {


    public static String invierte(String palabra, int longitud) {
        if (longitud == 0) {
            return palabra.charAt(longitud) + "";
        } else {

            return palabra.charAt(longitud) + invierte(palabra, longitud - 1);
        }
    }

    public static void main(String[] args) {
        String palabra = "Hola";
        int longitud = palabra.length() - 1;
        System.out.println(invierte(palabra, longitud));


    }


}

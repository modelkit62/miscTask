package recursividad;

public class Recursividad_5_numero_invertir {

    public static int invierte(int numero, int posicion) {
        if (numero < 10) {
            return numero;
        } else {
            System.out.println((numero % 10) * (int) Math.pow(10, posicion));
            return (numero % 10) * (int) Math.pow(10, posicion) + (invierte(numero / 10, posicion - 1));
        }
    }

    public static void main(String[] args) {
        int invierte = invierte(678, 2);
        System.out.println(invierte);
        System.out.println("---");
        System.out.println(678 % 10);
        System.out.println(678 / 10);
        System.out.println(Math.pow(10, 2));
    }


}

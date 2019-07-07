package recursividad;

public class Recursividad_1 {


    private static int sumarecursiva(int numero) {

        int resultado;

        if (numero == 1) {
            return 1;
        } else {
            resultado = numero + sumarecursiva(numero - 1);
        }
        return resultado;
    }


    public static void main(String[] args) {
        int numero = 5;
        int resultado = sumarecursiva(numero);
        System.out.println(resultado);
    }
}

package recursividad;

public class Recursividad_4_elem_buscar {


    public static void buscar(int[] array, int indice) {

        int buscarElemento = 7;

        if (array[indice] == buscarElemento) {
            System.out.println(array[indice]);
            System.out.println(indice);
        } else {
            buscar(array, indice + 1);
        }

    }

    public static void main(String[] args) {
        int[] array = {4, 5, 6, 3, 7, 5};
        int indice = 0;
        buscar(array, indice);
    }

}

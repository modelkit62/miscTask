package recursividad;

public class recursividad_3_array_unidimensional {


    public static void itera(int[] array, int indice) {

        if (indice != array.length) {
            System.out.println(array[indice]);
            itera(array, indice + 1);
        }


    }

    public static void main(String[] args) {
        int[] array = {0, 1, 2, 3, 4, 5};
        int indice = 0;
        itera(array,indice);

    }


}

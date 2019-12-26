import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        Integer[] array={0,1,3,4,5,64,33,4,5,6};
        Double[] arrayDouble={2.1,1.45,0.78,78.0};
        sort(array);
        sort(arrayDouble);

        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(arrayDouble));

    }
    private static <T extends Comparable<T>> void sort(T[] array){
        Arrays.sort(array);
    }

}

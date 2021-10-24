package HW3;

import static java.lang.System.out;

public class PrinceVassago<i> {

    public static void main(String[] args) {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 1};
        int arrll = arr.length;
        for (int i = 0; i < arrll; i++) {
            if (arr[i] == 1) arr[i] = 0;
            else arr[i] = 1;
        }
        out.println("work first:");
        for (int i = 0; i < arrll; i++) {
            out.println(i + "-" + arr[i]);
        }

        int[] array = new int[100];
        int j = 0;
        int fill = array.length;
       System.out.println(" ");
        System.out.println("work second:");

        for (int i = 0; i < fill; ++i, j = j + 1) {
            array[i] = j;
            System.out.print(+array[i] + " ");
            System.out.println(" ");
        }
        }

    public static void setEmptyInteger(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
            System.out.print(arr[i] + " ");
        }
    }

}







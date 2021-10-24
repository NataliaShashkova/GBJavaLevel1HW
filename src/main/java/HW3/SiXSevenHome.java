package HW3;



public class SiXSevenHome {

    public static void main(String[] args) {

        int[] mas = {10, 23, 24, 15, 18};
        int min = mas[0], max = mas[0], i, imin = 0, imax = 0;
        for (i = 0; i != mas.length; i++) {
            if (mas[i] < min) {
                min = mas[i];
                imin = i;
            }
            if (mas[i] > max) {
                max = mas[i];
                imax = i;
            }
            System.out.println("max = " + max + " min = " + min);
            System.out.println("imax = " + imax + " imin = " + imin);
        }
    }

}






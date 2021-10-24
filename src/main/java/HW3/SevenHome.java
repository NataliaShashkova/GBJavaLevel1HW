package HW3;

public class SevenHome {
    public static void main(String[] args) {
        int[] mass = new int [6];

        for (int i=0; i <6; i ++) {

            if (i == 0) {

                mass[0] = 1;

            }

            if (i == 1) {

                mass[1] = 3;

            }

            if (i == 2) {

                mass[2] = 2;

            }

            if (i == 3) {

                mass[3] = 1;

            }

            if (i == 4)

            {

                mass[4] = 2;

            }

            if (i == 5) {

                mass[5] = 4;

            }

            int p;

            int q;

            p = mass [0] + mass[1] + mass [2];

            q = mass [3] + mass [4] + mass [5];

            switch (p-q) {

                case 0:

                    System.out.println("true");

                    break;

                case 1:

                    System.out.println("false");

                    break;

                case -1:

                    System.out.println("OMG - false");

                    break;

            }

        }

    }

}







package HW3;

public class LeninitialValue<i> {

    public static void main(String[] args) {
        System.out.println("\nTask 5: ");
        doTask5(5, 1);

    }

    public static void doTask5() {
        int initialValue = 0;
        int len = 15;
        doTask5(len, initialValue);
    }

    public static void doTask5(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
            System.out.print("[" + i + "]" + arr[i] + " ");
        }
    }
}







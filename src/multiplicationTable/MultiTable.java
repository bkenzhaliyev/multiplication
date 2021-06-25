package multiplicationTable;

public class MultiTable {
    public static void main(String[] args) {
    multiTable({1, 2, 3, 4, 5, 6, 7, 8, 9, 0});
    }
    public static void multiTable(){
        //int[][] arr = new int[10][10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] += 1;
        }
        printArray(arr[0]);
    }


    /**
     * Метод печати элементов массива
     */
    public static void printArray(int[] arr) {
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%4d", arr[i]);
        }
        System.out.println();
    }

}

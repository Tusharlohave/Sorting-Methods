// Java program to implement the Bubble Sort

public class Bubble_Sort {

    public static void main(String args[]) {
        int arr[] = { 12, 40, 39, 54, 24 };

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                int temp = 0;

                if (arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                }

            }

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}

package codes.sorting;
/**
 * selection
 */
public class selection {

    public static void sort(int arr[]) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                // swap
                if (arr[j] < arr[i]) {
                    min = j;
                    // swap
                    int temp = arr[min];
                    arr[min] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 64, 25, 12, 22, 11 };
        sort(arr);

        System.out.println("sorted array");

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }

    }
}